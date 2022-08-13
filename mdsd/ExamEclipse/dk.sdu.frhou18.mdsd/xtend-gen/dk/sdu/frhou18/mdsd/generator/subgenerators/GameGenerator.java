package dk.sdu.frhou18.mdsd.generator.subgenerators;

import dk.sdu.frhou18.mdsd.generator.IF22Generator;
import dk.sdu.frhou18.mdsd.iF22.Model;
import dk.sdu.frhou18.mdsd.iF22.Scenario;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class GameGenerator {
  public static void doGenerate(final IFileSystemAccess2 fsa, final String pkg, final Model model, final String storyName, final EList<Scenario> scenarios) {
    int _length = ((Object[])Conversions.unwrapArray(model.getFunctions(), Object.class)).length;
    boolean hasFunc = (_length > 0);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(pkg);
    _builder.append("/");
    String _snakeCase = IF22Generator.snakeCase(storyName);
    _builder.append(_snakeCase);
    _builder.append("/Game.java");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    _builder_1.append(pkg);
    _builder_1.append(".");
    String _snakeCase_1 = IF22Generator.snakeCase(storyName);
    _builder_1.append(_snakeCase_1);
    _builder_1.append(";");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import java.io.IOException;");
    _builder_1.newLine();
    _builder_1.append("import interactive_fiction.common.*;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class Game{");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public Scenario start;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    {
      if (hasFunc) {
        _builder_1.append("External external");
      }
    }
    _builder_1.append(";");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("public Game(");
    {
      if (hasFunc) {
        _builder_1.append("External external");
      }
    }
    _builder_1.append("){");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t\t");
    _builder_1.append("this.start = new Scenario");
    String _name = scenarios.get(0).getName();
    _builder_1.append(_name, "\t\t");
    _builder_1.append("(");
    {
      if (hasFunc) {
        _builder_1.append("external");
      }
    }
    _builder_1.append(");");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public void play() throws IOException {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("start.interact();\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
  }
}
