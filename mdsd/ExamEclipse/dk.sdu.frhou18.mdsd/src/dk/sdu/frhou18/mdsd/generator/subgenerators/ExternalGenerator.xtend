package dk.sdu.frhou18.mdsd.generator.subgenerators

import org.eclipse.xtext.generator.IFileSystemAccess2
import dk.sdu.frhou18.mdsd.iF22.Model
import org.eclipse.emf.common.util.EList
import dk.sdu.frhou18.mdsd.iF22.Scenario
import dk.sdu.frhou18.mdsd.generator.IF22Generator
import dk.sdu.frhou18.mdsd.iF22.Function
import dk.sdu.frhou18.mdsd.iF22.TypeUsage

class ExternalGenerator {
	def static void doGenerate(IFileSystemAccess2 fsa, String pkg, Model model, String storyName, EList<Scenario> scenarios){
		fsa.generateFile('''«pkg»/«IF22Generator.snakeCase(storyName)»/External.java''',
			'''
				package «pkg».«IF22Generator.snakeCase(storyName)»;
				
				public interface External {
				«FOR func : model.functions»
					public «ScenarioGenerator.getCorrespondingJavaType(func.type)» «func.name»(«paramsString(func)»);
				«ENDFOR»
				}
			'''
		)
	}
	def static String paramsString(Function func){
		var StringBuilder sb = new StringBuilder()
		var counter= 0;
		for(param : func.parameters.map[p|p as TypeUsage]){
			sb.append(ScenarioGenerator.getCorrespondingJavaType(param.type)).append(" ").append("param").append(counter++)
		}
		
		return sb.toString()
	}
}