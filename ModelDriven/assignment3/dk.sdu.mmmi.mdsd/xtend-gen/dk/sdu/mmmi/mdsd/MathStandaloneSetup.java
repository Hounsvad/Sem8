/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MathStandaloneSetup extends MathStandaloneSetupGenerated {
  public static void doSetup() {
    new MathStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}