package dk.sdu.frhou18.mdsd.generator.subgenerators

import org.eclipse.xtext.generator.IFileSystemAccess2
import dk.sdu.frhou18.mdsd.iF22.Model
import org.eclipse.emf.common.util.EList
import dk.sdu.frhou18.mdsd.iF22.Scenario
import dk.sdu.frhou18.mdsd.generator.IF22Generator

class GameGenerator {
	def static void doGenerate(IFileSystemAccess2 fsa, String pkg, Model model, String storyName, EList<Scenario> scenarios){
		var hasFunc = model.functions.length > 0;
				
		fsa.generateFile('''«pkg»/«IF22Generator.snakeCase(storyName)»/Game.java''',
			'''
				package «pkg».«IF22Generator.snakeCase(storyName)»;
				
				import java.io.IOException;
				import interactive_fiction.common.*;
				
				public class Game{
					public Scenario start;
					
					«IF hasFunc»External external«ENDIF»;
					public Game(«IF hasFunc»External external«ENDIF»){
						this.start = new Scenario«scenarios.get(0).name»(«IF hasFunc»external«ENDIF»);
					}
					
					public void play() throws IOException {
						start.interact();	
					}
				}
			'''
		)
	}
}