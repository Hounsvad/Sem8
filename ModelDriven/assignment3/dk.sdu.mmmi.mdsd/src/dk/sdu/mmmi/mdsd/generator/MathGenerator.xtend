/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Division
import dk.sdu.mmmi.mdsd.math.ExplicitNumber
import dk.sdu.mmmi.mdsd.math.Expression
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Multiplication
import dk.sdu.mmmi.mdsd.math.Parenthesis
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarUse
import dk.sdu.mmmi.mdsd.math.Variable
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.VariableAssignment
import dk.sdu.mmmi.mdsd.math.Local
import dk.sdu.mmmi.mdsd.math.Program
import org.eclipse.emf.common.util.EList
import dk.sdu.mmmi.mdsd.math.External
import dk.sdu.mmmi.mdsd.math.ExternalUse
import java.util.ArrayList
import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {

	static Map<String, Integer> variables = new HashMap();

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val program = resource.allContents.filter(Program).next
		val className = program.programName.name
		// Append Header to class
		val math_expressionClass = getMathClass(program, className)
		fsa.generateFile(className + ".java", math_expressionClass)
	}

	def getMathClass(Program program, String className) {
		val contents = '''
			«getHeader()»
			package math_expression;
			public class «className»{
				«getVariableDeclarations(program.variableAssignments)»
				
				«IF program.externals.length() > 0»
					private External external;
					
					public «className»(External external){
						this.external = external;
					}
						
					«getExternalInterface(program)»
				«ENDIF»
				
				public void compute(){
					«FOR instantiation : getVariableInstantiations(program)»
						«instantiation»;
					«ENDFOR»
				}
				
			}
		'''
		//println(contents)
		return contents
	}
	
	def getVariableInstantiations(Program program){
		var vars = program.variableAssignments
		return vars.compute()
	}
	
	def getExternalInterface(Program program) {
		return '''
			public interface External{
				«FOR external : program.externals»
					public int «getExternalSignature(external)»;
				«ENDFOR»
			}
		'''
	}

	def getExternalSignature(External external) {
		var returnValue = external.name + "("
		if (external.parameters.length == 1) {
			returnValue += "int n"
		} else if (external.parameters.length == 2) {

			returnValue += "int n, int m"
		}

		returnValue += ")"
		return returnValue
	}

	def getHeader() {
		return '''
			/* 
			 * Generated by xtend by the generator made by 'Frederik Alexander Hounsvad' 'frhou18@student.sdu.dk'
			 * All Rights reserved
			*/
		'''
	}

	def getVariableDeclarations(EList<Variable> list) {
		return '''
			«FOR variable : list»
				public int «variable.name»;
			«ENDFOR»
		'''
	}

	def List<String> compute(EList<Variable> variables) {
		var values = new ArrayList<String>();
		
		for (varass : variables) {
			values.add(varass.name + " = " + ComputeExp(varass))
		}
		return values
	}

	// Plus
	def static dispatch String ComputeExp(Plus exp) {
		return '''(«exp.left.ComputeExp()» + «exp.right.ComputeExp()»)'''
	}

	// Minus
	def static dispatch String ComputeExp(Minus exp) {
		return '''(«exp.left.ComputeExp()» - «exp.right.ComputeExp()»)'''
	}

	// Multiplication
	def static dispatch String ComputeExp(Multiplication exp) {
		return '''(«exp.left.ComputeExp()» * «exp.right.ComputeExp()»)'''
	}

	// Division
	def static dispatch String ComputeExp(Division exp) {
		return '''(«exp.left.ComputeExp()» / «exp.right.ComputeExp()»)'''
	}

	// ExplicitNumber
	def static dispatch String ComputeExp(ExplicitNumber exp) {
		return '''«exp.value»'''
	}

	// Parenthesis
	def static dispatch String ComputeExp(Parenthesis exp) {
		return '''(«exp.getExp.ComputeExp()»)'''
	}

	// VarUse
	def static dispatch String ComputeExp(VarUse exp) {
		return '''(«exp.ref.ComputeExp()»)'''
	}

	// Let
	def static dispatch String ComputeExp(Local exp) { // Let
		return '''(«exp.exp.ComputeExp()»)'''
	}

	// Variable
	def static dispatch String ComputeExp(Variable exp) {
		return '''(«exp.exp.ComputeExp()»)'''
	}
	
	def static dispatch String ComputeExp(ExternalUse exp) {
		var sb = new StringBuilder()
		sb.append("(external.").append(exp.ref.name).append("(")
		switch exp.ref.parameters.length(){
			case 1: sb.append(ComputeExp(exp.exp.get(0)))
			case 2: sb.append(ComputeExp(exp.exp.get(0))).append(",").append(ComputeExp(exp.exp.get(1)))
		}
		sb.append("))")
		return sb.toString()
	}
}
