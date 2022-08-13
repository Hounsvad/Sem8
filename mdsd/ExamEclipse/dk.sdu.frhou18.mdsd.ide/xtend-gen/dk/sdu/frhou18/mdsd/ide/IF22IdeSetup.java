/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.frhou18.mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.frhou18.mdsd.IF22RuntimeModule;
import dk.sdu.frhou18.mdsd.IF22StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class IF22IdeSetup extends IF22StandaloneSetup {
  @Override
  public Injector createInjector() {
    IF22RuntimeModule _iF22RuntimeModule = new IF22RuntimeModule();
    IF22IdeModule _iF22IdeModule = new IF22IdeModule();
    return Guice.createInjector(Modules2.mixin(_iF22RuntimeModule, _iF22IdeModule));
  }
}
