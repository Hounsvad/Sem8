/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class IF22StandaloneSetup extends IF22StandaloneSetupGenerated {

	def static void doSetup() {
		new IF22StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}