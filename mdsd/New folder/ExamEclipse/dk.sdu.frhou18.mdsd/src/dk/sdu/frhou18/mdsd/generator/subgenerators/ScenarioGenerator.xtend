package dk.sdu.frhou18.mdsd.generator.subgenerators

import org.eclipse.xtext.generator.IFileSystemAccess2
import dk.sdu.frhou18.mdsd.iF22.Model
import dk.sdu.frhou18.mdsd.iF22.Scenario
import dk.sdu.frhou18.mdsd.iF22.End
import dk.sdu.frhou18.mdsd.generator.IF22Generator;
import dk.sdu.frhou18.mdsd.iF22.TextExp
import dk.sdu.frhou18.mdsd.iF22.Announce
import dk.sdu.frhou18.mdsd.iF22.Question
import dk.sdu.frhou18.mdsd.iF22.TextLiteral
import dk.sdu.frhou18.mdsd.iF22.Type
import dk.sdu.frhou18.mdsd.iF22.Equals
import dk.sdu.frhou18.mdsd.iF22.Less
import dk.sdu.frhou18.mdsd.iF22.NotEquals
import dk.sdu.frhou18.mdsd.iF22.Greater
import dk.sdu.frhou18.mdsd.iF22.LessOrEquals
import dk.sdu.frhou18.mdsd.iF22.GreaterOrEquals
import dk.sdu.frhou18.mdsd.iF22.And
import dk.sdu.frhou18.mdsd.iF22.Or
import dk.sdu.frhou18.mdsd.iF22.LogicNot
import dk.sdu.frhou18.mdsd.iF22.Parentheses
import dk.sdu.frhou18.mdsd.iF22.Plus
import dk.sdu.frhou18.mdsd.iF22.Minus
import dk.sdu.frhou18.mdsd.iF22.Multiplication
import dk.sdu.frhou18.mdsd.iF22.Division
import dk.sdu.frhou18.mdsd.iF22.MathNumberExp
import dk.sdu.frhou18.mdsd.iF22.This
import org.eclipse.xtext.EcoreUtil2
import dk.sdu.frhou18.mdsd.iF22.VarUse
import dk.sdu.frhou18.mdsd.iF22.TypeUsage
import dk.sdu.frhou18.mdsd.iF22.VariableDef
import dk.sdu.frhou18.mdsd.iF22.Function
import dk.sdu.frhou18.mdsd.iF22.FunctionUsage

class ScenarioGenerator {

	def static void doGenerate(IFileSystemAccess2 fsa, String pkg, Model model, String storyName, Scenario scenario) {
		var hasFunc = model.functions.length > 0;
		if(scenario.statemens.length == 0) return
		var fileContents = 
		'''
			package «pkg».«IF22Generator.snakeCase(storyName)»;
			
			import java.io.IOException;
			import interactive_fiction.common.*;
			
			class Scenario«scenario.name» extends Scenario {
				«FOR variable : scenario.getVariables»
					«variable.type.correspondingJavaType» «variable.name»;
				«ENDFOR»
				«IF hasFunc»
				External external;
				public Scenario«scenario.name»(External external){
					this.external = external;
				}
				«ENDIF»
				
				public String interact() throws IOException {
					nextInteraction = "«scenario.statemens.get(0).name»";
					while(true){
						switch(nextInteraction){
			
		'''
		for (statement : scenario.statemens) {
			if (statement instanceof End) {
				fileContents += 
		'''
		
					case "«statement.name»":
						System.out.println(«(statement as End).endMessage.computeExpr»);
						return "«(statement as End).name»";
		'''
			} else if (statement instanceof Announce) {
				val announce = (statement as Announce)
				fileContents += 
		'''
		
					case "«statement.name»":
						System.out.println(«announce.text.computeExpr»);
						nextInteraction="«announce.target.target.name»";
						break;
		'''
			} else if (statement instanceof Question) {
				fileContents = fileContents.handleQuestion(statement as Question);
			}
		}
		fileContents += 
		'''
		
						}
					}
				}
			}
		'''

		fsa.generateFile('''«pkg»/«IF22Generator.snakeCase(storyName)»/Scenario«scenario.name».java''', fileContents)
	}
	
	def static String handleQuestion(String fc, Question question) {
		var fileContents = fc;
		fileContents += 
		'''
		
					case "«question.name»":
						System.out.println(«question.text.computeExpr»);
		'''
		var hasTryCatch = false;
		if(question.inVar === null && question.asValue instanceof TypeUsage){
			switch ((question.asValue as TypeUsage).type) {
				case Type.BOOLEAN: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{
								boolean __«question.name» = Boolean.parseBoolean(br.readLine());
		'''
				}
				case Type.NUMBER: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{		
								int __«question.name» = Integer.parseInt(br.readLine());
		'''
				}
				case Type.TEXT: {
					fileContents += 
		'''
		
							String __«question.name» = br.readLine();
		'''
				}
			}
		}else if(question.inVar === null && !( question.asValue instanceof TypeUsage ) && !(question.asValue instanceof FunctionUsage)){
			val gottenType = EcoreUtil2.getAllContentsOfType(question.asValue, TypeUsage).get(0)
			switch (gottenType.type) {
				case Type.BOOLEAN: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{
								boolean __«question.name» = Boolean.parseBoolean(br.readLine());
		'''
				}
				case Type.NUMBER: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{		
								int __«question.name» = Integer.parseInt(br.readLine());
		'''
				}
				case Type.TEXT: {
					fileContents += 
		'''
		
							String __«question.name» = br.readLine();
		'''
				}
			}
		}else if(question.inVar === null && !( question.asValue instanceof TypeUsage ) && (question.asValue instanceof FunctionUsage)){
			val gottenType = ((question.asValue as FunctionUsage).exps.get(0) as TypeUsage)
			val funcName = (question.asValue as FunctionUsage).name.name
			switch (gottenType.type) {
				case Type.BOOLEAN: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{
								boolean __«question.name» = Boolean.parseBoolean(br.readLine());
		'''
				}
				case Type.NUMBER: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{		
								int __«question.name» = Integer.parseInt(br.readLine());
		'''
				}
				case Type.TEXT: {
					fileContents += 
		'''
		
							String __«question.name» = br.readLine();
		'''
				}
			}
		}else if(question.inVar !== null && !(question.asValue instanceof FunctionUsage)){
			println("Invar not null")
			switch ((question.asValue as TypeUsage).type) {
				case Type.BOOLEAN: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{
								«question.inVar.computeExpr» = br.readLine();
		'''
				}
				case Type.NUMBER: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{		
								«question.inVar.computeExpr» = Integer.parseInt(br.readLine();
		'''
				}
				case Type.TEXT: {
					fileContents += 
		'''
		
							«question.inVar.computeExpr» = br.readLine();
		'''
				}
			}
		}else if(question.inVar !== null && (question.asValue instanceof FunctionUsage)){
			val gottenType = ((question.asValue as FunctionUsage).exps.get(0) as TypeUsage)
			val funcName = (question.asValue as FunctionUsage).name.name
			switch (gottenType.type) {
				case Type.BOOLEAN: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{
								«question.inVar.computeExpr» = Boolean.parseBoolean(br.readLine());
		'''
				}
				case Type.NUMBER: {
					hasTryCatch = true
					fileContents += 
		'''
		
							try{		
								«question.inVar.computeExpr» = Integer.parseInt(br.readLine());
		'''
				}
				case Type.TEXT: {
					fileContents += 
		'''
		
							«question.inVar.computeExpr» = br.readLine();
		'''
				}
			}
		}
		if(!(question.asValue instanceof TypeUsage) && question.inVar === null){
			val target = question.targets.get(0)
			fileContents += 
		'''
		
								if(«computeExpr(question.asValue)»){
									
									nextInteraction="«target.target.name»";
									break ;
								}
		'''
		}else if(!(question.asValue instanceof TypeUsage) && question.inVar !== null){
			val target = question.targets.get(0)
			val funcName = (question.asValue as FunctionUsage).name.name
			fileContents += 
		'''
		
								if(external.«funcName»(«question.inVar.computeExpr»)){
									
									nextInteraction="«target.target.name»";
									break ;
								}
		'''
		}
		for (target : question.targets) {
			if (target.logic === null) {
				fileContents += 
		''' 
		
								nextInteraction="«question.targets.get(0).target.name»";
								break;
		'''
			} else {
				fileContents += 
		'''
		
								if(«computeExpr(target.logic)»){
									nextInteraction="«target.target.name»";
									break ;
								}
		'''
	
			}
		}
		

		if (hasTryCatch) {
			fileContents += 
		'''
		
							}catch(Exception ex){
								break;
							}
		'''
		}
		return fileContents
	}

	def static dispatch String computeExpr(Equals exp) {
		return '''(«exp.left.computeExpr» == «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(NotEquals exp) {
		return '''(«exp.left.computeExpr» != «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(Less exp) {
		return '''(«exp.left.computeExpr» < «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(Greater exp) {
		return '''(«exp.left.computeExpr» > «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(LessOrEquals exp) {
		return '''(«exp.left.computeExpr» <= «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(GreaterOrEquals exp) {
		return '''(«exp.left.computeExpr» >= «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(And exp) {
		return '''(«exp.left.computeExpr» && «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(Or exp) {
		return '''(«exp.left.computeExpr» || «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(LogicNot exp) {
		return '''(!«exp.ref.computeExpr»)'''
	}

	def static dispatch String computeExpr(Parentheses exp) {
		return '''(«exp.ref.computeExpr»)'''
	}

	def static dispatch String computeExpr(dk.sdu.frhou18.mdsd.iF22.Boolean exp) {
		return '''(«exp.^val.literal»)'''
	}

	def static dispatch String computeExpr(Plus exp) {
		return '''(«exp.left.computeExpr» + «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(Minus exp) {
		return '''(«exp.left.computeExpr» - «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(Multiplication exp) {
		return '''(«exp.left.computeExpr» * «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(Division exp) {
		return '''(«exp.left.computeExpr» / «exp.right.computeExpr»)'''
	}

	def static dispatch String computeExpr(MathNumberExp exp) {
		return '''(«exp.value»)'''
	}

	def static dispatch String computeExpr(TextExp exp) {
		return '''«exp.left.computeExpr»+«exp.right.computeExpr»'''
	}

	def static dispatch String computeExpr(TextLiteral exp) {
		return '''"«exp.text»"'''
	}

	def static dispatch String computeExpr(This exp) {
		return '''(__«EcoreUtil2.getContainerOfType(exp, Question).name»)'''
	}
	
	def static dispatch String computeExpr(VarUse exp) {
		return '''«exp.ref.name»'''
	}
	
	def static dispatch String computeExpr(TypeUsage exp){
		return '''__«EcoreUtil2.getContainerOfType(exp, Question).name»'''
	}
	
	def static dispatch String computeExpr(FunctionUsage exp){
		val params = exp.exps.map[param | param.computeExpr].join(',')
		return '''external.«exp.name.name»(«params»)'''
	}
	
//	def static dispatch String computeFunction(Function function, EList<Type){
//		
//	}
	
	def public static getCorrespondingJavaType(Type type){
		switch(type){
			case BOOLEAN: "boolean"
			case NUMBER: "int"
			case TEXT: "String"
		}
	}
}
