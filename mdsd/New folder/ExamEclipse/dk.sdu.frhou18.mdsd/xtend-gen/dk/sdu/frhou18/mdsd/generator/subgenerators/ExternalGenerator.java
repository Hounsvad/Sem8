package dk.sdu.frhou18.mdsd.generator.subgenerators;

import dk.sdu.frhou18.mdsd.generator.IF22Generator;
import dk.sdu.frhou18.mdsd.iF22.Expression;
import dk.sdu.frhou18.mdsd.iF22.Function;
import dk.sdu.frhou18.mdsd.iF22.Model;
import dk.sdu.frhou18.mdsd.iF22.Scenario;
import dk.sdu.frhou18.mdsd.iF22.TypeUsage;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ExternalGenerator {
  public static void doGenerate(final IFileSystemAccess2 fsa, final String pkg, final Model model, final String storyName, final EList<Scenario> scenarios) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(pkg);
    _builder.append("/");
    String _snakeCase = IF22Generator.snakeCase(storyName);
    _builder.append(_snakeCase);
    _builder.append("/External.java");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    _builder_1.append(pkg);
    _builder_1.append(".");
    String _snakeCase_1 = IF22Generator.snakeCase(storyName);
    _builder_1.append(_snakeCase_1);
    _builder_1.append(";");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("public interface External {");
    _builder_1.newLine();
    {
      EList<Function> _functions = model.getFunctions();
      for(final Function func : _functions) {
        _builder_1.append("public ");
        String _correspondingJavaType = ScenarioGenerator.getCorrespondingJavaType(func.getType());
        _builder_1.append(_correspondingJavaType);
        _builder_1.append(" ");
        String _name = func.getName();
        _builder_1.append(_name);
        _builder_1.append("(");
        String _paramsString = ExternalGenerator.paramsString(func);
        _builder_1.append(_paramsString);
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
  
  public static String paramsString(final Function func) {
    StringBuilder sb = new StringBuilder();
    int counter = 0;
    final Function1<Expression, TypeUsage> _function = (Expression p) -> {
      return ((TypeUsage) p);
    };
    List<TypeUsage> _map = ListExtensions.<Expression, TypeUsage>map(func.getParameters(), _function);
    for (final TypeUsage param : _map) {
      StringBuilder _append = sb.append(ScenarioGenerator.getCorrespondingJavaType(param.getType())).append(" ").append("param");
      int _plusPlus = counter++;
      _append.append(_plusPlus);
    }
    return sb.toString();
  }
}
