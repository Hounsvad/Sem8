/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.validation

import dk.sdu.mmmi.mdsd.math.*
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MathValidator extends AbstractMathValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MathPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static val DUPLICATE_NAME = 'duplicateName'
	
	@Check
	def GlobalVarDuplicate(VariableAssignment varAss){
		var base = EcoreUtil2.getContainerOfType(varAss, Variables)
		if(base.variableAssignments.filter[it !== varAss && it.name == varAss.name ].toList.size > 0){
			println("Should have err")
			error('Global variables cannot be assigned with the same name', MathPackage.Literals.VARIABLE__NAME, DUPLICATE_NAME)
		}
	}
	
}
