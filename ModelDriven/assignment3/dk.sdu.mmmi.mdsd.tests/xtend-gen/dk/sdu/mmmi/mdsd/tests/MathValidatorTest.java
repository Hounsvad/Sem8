package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathValidatorTest {
  @Inject
  @Extension
  private /* ParseHelper<Variables> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void noRepeatedGlobalVarDeclaration() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field MathValidatorTest._parseHelper refers to the missing type Variables"
      + "\neResource cannot be resolved"
      + "\nvalidate cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved");
  }
}
