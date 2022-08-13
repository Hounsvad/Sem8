package dk.sdu.frhou18.mdsd.generator.subgenerators;

import dk.sdu.frhou18.mdsd.generator.IF22Generator;
import dk.sdu.frhou18.mdsd.iF22.And;
import dk.sdu.frhou18.mdsd.iF22.Announce;
import dk.sdu.frhou18.mdsd.iF22.Division;
import dk.sdu.frhou18.mdsd.iF22.End;
import dk.sdu.frhou18.mdsd.iF22.Equals;
import dk.sdu.frhou18.mdsd.iF22.Expression;
import dk.sdu.frhou18.mdsd.iF22.FunctionUsage;
import dk.sdu.frhou18.mdsd.iF22.Greater;
import dk.sdu.frhou18.mdsd.iF22.GreaterOrEquals;
import dk.sdu.frhou18.mdsd.iF22.Less;
import dk.sdu.frhou18.mdsd.iF22.LessOrEquals;
import dk.sdu.frhou18.mdsd.iF22.LogicNot;
import dk.sdu.frhou18.mdsd.iF22.MathNumberExp;
import dk.sdu.frhou18.mdsd.iF22.Minus;
import dk.sdu.frhou18.mdsd.iF22.Model;
import dk.sdu.frhou18.mdsd.iF22.Multiplication;
import dk.sdu.frhou18.mdsd.iF22.NotEquals;
import dk.sdu.frhou18.mdsd.iF22.Or;
import dk.sdu.frhou18.mdsd.iF22.Parentheses;
import dk.sdu.frhou18.mdsd.iF22.Plus;
import dk.sdu.frhou18.mdsd.iF22.Question;
import dk.sdu.frhou18.mdsd.iF22.Scenario;
import dk.sdu.frhou18.mdsd.iF22.Statement;
import dk.sdu.frhou18.mdsd.iF22.Target;
import dk.sdu.frhou18.mdsd.iF22.TextExp;
import dk.sdu.frhou18.mdsd.iF22.TextLiteral;
import dk.sdu.frhou18.mdsd.iF22.This;
import dk.sdu.frhou18.mdsd.iF22.Type;
import dk.sdu.frhou18.mdsd.iF22.TypeUsage;
import dk.sdu.frhou18.mdsd.iF22.VarUse;
import dk.sdu.frhou18.mdsd.iF22.VariableDef;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ScenarioGenerator {
  public static void doGenerate(final IFileSystemAccess2 fsa, final String pkg, final Model model, final String storyName, final Scenario scenario) {
    int _length = ((Object[])Conversions.unwrapArray(model.getFunctions(), Object.class)).length;
    boolean hasFunc = (_length > 0);
    int _length_1 = ((Object[])Conversions.unwrapArray(scenario.getStatemens(), Object.class)).length;
    boolean _equals = (_length_1 == 0);
    if (_equals) {
      return;
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(pkg);
    _builder.append(".");
    String _snakeCase = IF22Generator.snakeCase(storyName);
    _builder.append(_snakeCase);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import interactive_fiction.common.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class Scenario");
    String _name = scenario.getName();
    _builder.append(_name);
    _builder.append(" extends Scenario {");
    _builder.newLineIfNotEmpty();
    {
      EList<VariableDef> _variables = scenario.getVariables();
      for(final VariableDef variable : _variables) {
        _builder.append("\t");
        String _correspondingJavaType = ScenarioGenerator.getCorrespondingJavaType(variable.getType());
        _builder.append(_correspondingJavaType, "\t");
        _builder.append(" ");
        String _name_1 = variable.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if (hasFunc) {
        _builder.append("\t");
        _builder.append("External external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public Scenario");
        String _name_2 = scenario.getName();
        _builder.append(_name_2, "\t");
        _builder.append("(External external){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String interact() throws IOException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("nextInteraction = \"");
    String _name_3 = scenario.getStatemens().get(0).getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("while(true){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("switch(nextInteraction){");
    _builder.newLine();
    _builder.newLine();
    String fileContents = _builder.toString();
    EList<Statement> _statemens = scenario.getStatemens();
    for (final Statement statement : _statemens) {
      if ((statement instanceof End)) {
        String _fileContents = fileContents;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("case \"");
        String _name_4 = ((End)statement).getName();
        _builder_1.append(_name_4, "\t\t\t");
        _builder_1.append("\":");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("System.out.println(");
        String _computeExpr = ScenarioGenerator.computeExpr(((End) statement).getEndMessage());
        _builder_1.append(_computeExpr, "\t\t\t\t");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("return \"");
        String _name_5 = ((End) statement).getName();
        _builder_1.append(_name_5, "\t\t\t\t");
        _builder_1.append("\";");
        _builder_1.newLineIfNotEmpty();
        fileContents = (_fileContents + _builder_1);
      } else {
        if ((statement instanceof Announce)) {
          final Announce announce = ((Announce) statement);
          String _fileContents_1 = fileContents;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.newLine();
          _builder_2.append("\t\t\t");
          _builder_2.append("case \"");
          String _name_6 = ((Announce)statement).getName();
          _builder_2.append(_name_6, "\t\t\t");
          _builder_2.append("\":");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t\t\t");
          _builder_2.append("System.out.println(");
          String _computeExpr_1 = ScenarioGenerator.computeExpr(announce.getText());
          _builder_2.append(_computeExpr_1, "\t\t\t\t");
          _builder_2.append(");");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t\t\t");
          _builder_2.append("nextInteraction=\"");
          String _name_7 = announce.getTarget().getTarget().getName();
          _builder_2.append(_name_7, "\t\t\t\t");
          _builder_2.append("\";");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t\t\t");
          _builder_2.append("break;");
          _builder_2.newLine();
          fileContents = (_fileContents_1 + _builder_2);
        } else {
          if ((statement instanceof Question)) {
            fileContents = ScenarioGenerator.handleQuestion(fileContents, ((Question) statement));
          }
        }
      }
    }
    String _fileContents_2 = fileContents;
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\t\t");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("}");
    _builder_3.newLine();
    fileContents = (_fileContents_2 + _builder_3);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append(pkg);
    _builder_4.append("/");
    String _snakeCase_1 = IF22Generator.snakeCase(storyName);
    _builder_4.append(_snakeCase_1);
    _builder_4.append("/Scenario");
    String _name_8 = scenario.getName();
    _builder_4.append(_name_8);
    _builder_4.append(".java");
    fsa.generateFile(_builder_4.toString(), fileContents);
  }
  
  public static String handleQuestion(final String fc, final Question question) {
    String fileContents = fc;
    String _fileContents = fileContents;
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("case \"");
    String _name = question.getName();
    _builder.append(_name, "\t\t\t");
    _builder.append("\":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(");
    String _computeExpr = ScenarioGenerator.computeExpr(question.getText());
    _builder.append(_computeExpr, "\t\t\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    fileContents = (_fileContents + _builder);
    boolean hasTryCatch = false;
    if (((question.getInVar() == null) && (question.getAsValue() instanceof TypeUsage))) {
      Expression _asValue = question.getAsValue();
      Type _type = ((TypeUsage) _asValue).getType();
      if (_type != null) {
        switch (_type) {
          case BOOLEAN:
            hasTryCatch = true;
            String _fileContents_1 = fileContents;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.newLine();
            _builder_1.append("\t\t\t\t\t");
            _builder_1.append("try{");
            _builder_1.newLine();
            _builder_1.append("\t\t\t\t\t\t");
            _builder_1.append("boolean __");
            String _name_1 = question.getName();
            _builder_1.append(_name_1, "\t\t\t\t\t\t");
            _builder_1.append(" = Boolean.parseBoolean(br.readLine());");
            _builder_1.newLineIfNotEmpty();
            fileContents = (_fileContents_1 + _builder_1);
            break;
          case NUMBER:
            hasTryCatch = true;
            String _fileContents_2 = fileContents;
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.newLine();
            _builder_2.append("\t\t\t\t\t");
            _builder_2.append("try{\t\t");
            _builder_2.newLine();
            _builder_2.append("\t\t\t\t\t\t");
            _builder_2.append("int __");
            String _name_2 = question.getName();
            _builder_2.append(_name_2, "\t\t\t\t\t\t");
            _builder_2.append(" = Integer.parseInt(br.readLine());");
            _builder_2.newLineIfNotEmpty();
            fileContents = (_fileContents_2 + _builder_2);
            break;
          case TEXT:
            String _fileContents_3 = fileContents;
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.newLine();
            _builder_3.append("\t\t\t\t\t");
            _builder_3.append("String __");
            String _name_3 = question.getName();
            _builder_3.append(_name_3, "\t\t\t\t\t");
            _builder_3.append(" = br.readLine();");
            _builder_3.newLineIfNotEmpty();
            fileContents = (_fileContents_3 + _builder_3);
            break;
          default:
            break;
        }
      }
    } else {
      if ((((question.getInVar() == null) && (!(question.getAsValue() instanceof TypeUsage))) && (!(question.getAsValue() instanceof FunctionUsage)))) {
        final TypeUsage gottenType = EcoreUtil2.<TypeUsage>getAllContentsOfType(question.getAsValue(), TypeUsage.class).get(0);
        Type _type_1 = gottenType.getType();
        if (_type_1 != null) {
          switch (_type_1) {
            case BOOLEAN:
              hasTryCatch = true;
              String _fileContents_4 = fileContents;
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.newLine();
              _builder_4.append("\t\t\t\t\t");
              _builder_4.append("try{");
              _builder_4.newLine();
              _builder_4.append("\t\t\t\t\t\t");
              _builder_4.append("boolean __");
              String _name_4 = question.getName();
              _builder_4.append(_name_4, "\t\t\t\t\t\t");
              _builder_4.append(" = Boolean.parseBoolean(br.readLine());");
              _builder_4.newLineIfNotEmpty();
              fileContents = (_fileContents_4 + _builder_4);
              break;
            case NUMBER:
              hasTryCatch = true;
              String _fileContents_5 = fileContents;
              StringConcatenation _builder_5 = new StringConcatenation();
              _builder_5.newLine();
              _builder_5.append("\t\t\t\t\t");
              _builder_5.append("try{\t\t");
              _builder_5.newLine();
              _builder_5.append("\t\t\t\t\t\t");
              _builder_5.append("int __");
              String _name_5 = question.getName();
              _builder_5.append(_name_5, "\t\t\t\t\t\t");
              _builder_5.append(" = Integer.parseInt(br.readLine());");
              _builder_5.newLineIfNotEmpty();
              fileContents = (_fileContents_5 + _builder_5);
              break;
            case TEXT:
              String _fileContents_6 = fileContents;
              StringConcatenation _builder_6 = new StringConcatenation();
              _builder_6.newLine();
              _builder_6.append("\t\t\t\t\t");
              _builder_6.append("String __");
              String _name_6 = question.getName();
              _builder_6.append(_name_6, "\t\t\t\t\t");
              _builder_6.append(" = br.readLine();");
              _builder_6.newLineIfNotEmpty();
              fileContents = (_fileContents_6 + _builder_6);
              break;
            default:
              break;
          }
        }
      } else {
        if ((((question.getInVar() == null) && (!(question.getAsValue() instanceof TypeUsage))) && (question.getAsValue() instanceof FunctionUsage))) {
          Expression _asValue_1 = question.getAsValue();
          Expression _get = ((FunctionUsage) _asValue_1).getExps().get(0);
          final TypeUsage gottenType_1 = ((TypeUsage) _get);
          Expression _asValue_2 = question.getAsValue();
          final String funcName = ((FunctionUsage) _asValue_2).getName().getName();
          Type _type_2 = gottenType_1.getType();
          if (_type_2 != null) {
            switch (_type_2) {
              case BOOLEAN:
                hasTryCatch = true;
                String _fileContents_7 = fileContents;
                StringConcatenation _builder_7 = new StringConcatenation();
                _builder_7.newLine();
                _builder_7.append("\t\t\t\t\t");
                _builder_7.append("try{");
                _builder_7.newLine();
                _builder_7.append("\t\t\t\t\t\t");
                _builder_7.append("boolean __");
                String _name_7 = question.getName();
                _builder_7.append(_name_7, "\t\t\t\t\t\t");
                _builder_7.append(" = Boolean.parseBoolean(br.readLine());");
                _builder_7.newLineIfNotEmpty();
                fileContents = (_fileContents_7 + _builder_7);
                break;
              case NUMBER:
                hasTryCatch = true;
                String _fileContents_8 = fileContents;
                StringConcatenation _builder_8 = new StringConcatenation();
                _builder_8.newLine();
                _builder_8.append("\t\t\t\t\t");
                _builder_8.append("try{\t\t");
                _builder_8.newLine();
                _builder_8.append("\t\t\t\t\t\t");
                _builder_8.append("int __");
                String _name_8 = question.getName();
                _builder_8.append(_name_8, "\t\t\t\t\t\t");
                _builder_8.append(" = Integer.parseInt(br.readLine());");
                _builder_8.newLineIfNotEmpty();
                fileContents = (_fileContents_8 + _builder_8);
                break;
              case TEXT:
                String _fileContents_9 = fileContents;
                StringConcatenation _builder_9 = new StringConcatenation();
                _builder_9.newLine();
                _builder_9.append("\t\t\t\t\t");
                _builder_9.append("String __");
                String _name_9 = question.getName();
                _builder_9.append(_name_9, "\t\t\t\t\t");
                _builder_9.append(" = br.readLine();");
                _builder_9.newLineIfNotEmpty();
                fileContents = (_fileContents_9 + _builder_9);
                break;
              default:
                break;
            }
          }
        } else {
          if (((question.getInVar() != null) && (!(question.getAsValue() instanceof FunctionUsage)))) {
            InputOutput.<String>println("Invar not null");
            Expression _asValue_3 = question.getAsValue();
            Type _type_3 = ((TypeUsage) _asValue_3).getType();
            if (_type_3 != null) {
              switch (_type_3) {
                case BOOLEAN:
                  hasTryCatch = true;
                  String _fileContents_10 = fileContents;
                  StringConcatenation _builder_10 = new StringConcatenation();
                  _builder_10.newLine();
                  _builder_10.append("\t\t\t\t\t");
                  _builder_10.append("try{");
                  _builder_10.newLine();
                  _builder_10.append("\t\t\t\t\t\t");
                  String _computeExpr_1 = ScenarioGenerator.computeExpr(question.getInVar());
                  _builder_10.append(_computeExpr_1, "\t\t\t\t\t\t");
                  _builder_10.append(" = br.readLine();");
                  _builder_10.newLineIfNotEmpty();
                  fileContents = (_fileContents_10 + _builder_10);
                  break;
                case NUMBER:
                  hasTryCatch = true;
                  String _fileContents_11 = fileContents;
                  StringConcatenation _builder_11 = new StringConcatenation();
                  _builder_11.newLine();
                  _builder_11.append("\t\t\t\t\t");
                  _builder_11.append("try{\t\t");
                  _builder_11.newLine();
                  _builder_11.append("\t\t\t\t\t\t");
                  String _computeExpr_2 = ScenarioGenerator.computeExpr(question.getInVar());
                  _builder_11.append(_computeExpr_2, "\t\t\t\t\t\t");
                  _builder_11.append(" = Integer.parseInt(br.readLine();");
                  _builder_11.newLineIfNotEmpty();
                  fileContents = (_fileContents_11 + _builder_11);
                  break;
                case TEXT:
                  String _fileContents_12 = fileContents;
                  StringConcatenation _builder_12 = new StringConcatenation();
                  _builder_12.newLine();
                  _builder_12.append("\t\t\t\t\t");
                  String _computeExpr_3 = ScenarioGenerator.computeExpr(question.getInVar());
                  _builder_12.append(_computeExpr_3, "\t\t\t\t\t");
                  _builder_12.append(" = br.readLine();");
                  _builder_12.newLineIfNotEmpty();
                  fileContents = (_fileContents_12 + _builder_12);
                  break;
                default:
                  break;
              }
            }
          } else {
            if (((question.getInVar() != null) && (question.getAsValue() instanceof FunctionUsage))) {
              Expression _asValue_4 = question.getAsValue();
              Expression _get_1 = ((FunctionUsage) _asValue_4).getExps().get(0);
              final TypeUsage gottenType_2 = ((TypeUsage) _get_1);
              Expression _asValue_5 = question.getAsValue();
              final String funcName_1 = ((FunctionUsage) _asValue_5).getName().getName();
              Type _type_4 = gottenType_2.getType();
              if (_type_4 != null) {
                switch (_type_4) {
                  case BOOLEAN:
                    hasTryCatch = true;
                    String _fileContents_13 = fileContents;
                    StringConcatenation _builder_13 = new StringConcatenation();
                    _builder_13.newLine();
                    _builder_13.append("\t\t\t\t\t");
                    _builder_13.append("try{");
                    _builder_13.newLine();
                    _builder_13.append("\t\t\t\t\t\t");
                    String _computeExpr_4 = ScenarioGenerator.computeExpr(question.getInVar());
                    _builder_13.append(_computeExpr_4, "\t\t\t\t\t\t");
                    _builder_13.append(" = Boolean.parseBoolean(br.readLine());");
                    _builder_13.newLineIfNotEmpty();
                    fileContents = (_fileContents_13 + _builder_13);
                    break;
                  case NUMBER:
                    hasTryCatch = true;
                    String _fileContents_14 = fileContents;
                    StringConcatenation _builder_14 = new StringConcatenation();
                    _builder_14.newLine();
                    _builder_14.append("\t\t\t\t\t");
                    _builder_14.append("try{\t\t");
                    _builder_14.newLine();
                    _builder_14.append("\t\t\t\t\t\t");
                    String _computeExpr_5 = ScenarioGenerator.computeExpr(question.getInVar());
                    _builder_14.append(_computeExpr_5, "\t\t\t\t\t\t");
                    _builder_14.append(" = Integer.parseInt(br.readLine());");
                    _builder_14.newLineIfNotEmpty();
                    fileContents = (_fileContents_14 + _builder_14);
                    break;
                  case TEXT:
                    String _fileContents_15 = fileContents;
                    StringConcatenation _builder_15 = new StringConcatenation();
                    _builder_15.newLine();
                    _builder_15.append("\t\t\t\t\t");
                    String _computeExpr_6 = ScenarioGenerator.computeExpr(question.getInVar());
                    _builder_15.append(_computeExpr_6, "\t\t\t\t\t");
                    _builder_15.append(" = br.readLine();");
                    _builder_15.newLineIfNotEmpty();
                    fileContents = (_fileContents_15 + _builder_15);
                    break;
                  default:
                    break;
                }
              }
            }
          }
        }
      }
    }
    if (((!(question.getAsValue() instanceof TypeUsage)) && (question.getInVar() == null))) {
      final Target target = question.getTargets().get(0);
      String _fileContents_16 = fileContents;
      StringConcatenation _builder_16 = new StringConcatenation();
      _builder_16.newLine();
      _builder_16.append("\t\t\t\t\t\t");
      _builder_16.append("if(");
      String _computeExpr_7 = ScenarioGenerator.computeExpr(question.getAsValue());
      _builder_16.append(_computeExpr_7, "\t\t\t\t\t\t");
      _builder_16.append("){");
      _builder_16.newLineIfNotEmpty();
      _builder_16.append("\t\t\t\t\t\t\t");
      _builder_16.newLine();
      _builder_16.append("\t\t\t\t\t\t\t");
      _builder_16.append("nextInteraction=\"");
      String _name_10 = target.getTarget().getName();
      _builder_16.append(_name_10, "\t\t\t\t\t\t\t");
      _builder_16.append("\";");
      _builder_16.newLineIfNotEmpty();
      _builder_16.append("\t\t\t\t\t\t\t");
      _builder_16.append("break ;");
      _builder_16.newLine();
      _builder_16.append("\t\t\t\t\t\t");
      _builder_16.append("}");
      _builder_16.newLine();
      fileContents = (_fileContents_16 + _builder_16);
    } else {
      if (((!(question.getAsValue() instanceof TypeUsage)) && (question.getInVar() != null))) {
        final Target target_1 = question.getTargets().get(0);
        Expression _asValue_6 = question.getAsValue();
        final String funcName_2 = ((FunctionUsage) _asValue_6).getName().getName();
        String _fileContents_17 = fileContents;
        StringConcatenation _builder_17 = new StringConcatenation();
        _builder_17.newLine();
        _builder_17.append("\t\t\t\t\t\t");
        _builder_17.append("if(external.");
        _builder_17.append(funcName_2, "\t\t\t\t\t\t");
        _builder_17.append("(");
        String _computeExpr_8 = ScenarioGenerator.computeExpr(question.getInVar());
        _builder_17.append(_computeExpr_8, "\t\t\t\t\t\t");
        _builder_17.append(")){");
        _builder_17.newLineIfNotEmpty();
        _builder_17.append("\t\t\t\t\t\t\t");
        _builder_17.newLine();
        _builder_17.append("\t\t\t\t\t\t\t");
        _builder_17.append("nextInteraction=\"");
        String _name_11 = target_1.getTarget().getName();
        _builder_17.append(_name_11, "\t\t\t\t\t\t\t");
        _builder_17.append("\";");
        _builder_17.newLineIfNotEmpty();
        _builder_17.append("\t\t\t\t\t\t\t");
        _builder_17.append("break ;");
        _builder_17.newLine();
        _builder_17.append("\t\t\t\t\t\t");
        _builder_17.append("}");
        _builder_17.newLine();
        fileContents = (_fileContents_17 + _builder_17);
      }
    }
    EList<Target> _targets = question.getTargets();
    for (final Target target_2 : _targets) {
      Expression _logic = target_2.getLogic();
      boolean _tripleEquals = (_logic == null);
      if (_tripleEquals) {
        String _fileContents_18 = fileContents;
        StringConcatenation _builder_18 = new StringConcatenation();
        _builder_18.newLine();
        _builder_18.append("\t\t\t\t\t\t");
        _builder_18.append("nextInteraction=\"");
        String _name_12 = question.getTargets().get(0).getTarget().getName();
        _builder_18.append(_name_12, "\t\t\t\t\t\t");
        _builder_18.append("\";");
        _builder_18.newLineIfNotEmpty();
        _builder_18.append("\t\t\t\t\t\t");
        _builder_18.append("break;");
        _builder_18.newLine();
        fileContents = (_fileContents_18 + _builder_18);
      } else {
        String _fileContents_19 = fileContents;
        StringConcatenation _builder_19 = new StringConcatenation();
        _builder_19.newLine();
        _builder_19.append("\t\t\t\t\t\t");
        _builder_19.append("if(");
        String _computeExpr_9 = ScenarioGenerator.computeExpr(target_2.getLogic());
        _builder_19.append(_computeExpr_9, "\t\t\t\t\t\t");
        _builder_19.append("){");
        _builder_19.newLineIfNotEmpty();
        _builder_19.append("\t\t\t\t\t\t\t");
        _builder_19.append("nextInteraction=\"");
        String _name_13 = target_2.getTarget().getName();
        _builder_19.append(_name_13, "\t\t\t\t\t\t\t");
        _builder_19.append("\";");
        _builder_19.newLineIfNotEmpty();
        _builder_19.append("\t\t\t\t\t\t\t");
        _builder_19.append("break ;");
        _builder_19.newLine();
        _builder_19.append("\t\t\t\t\t\t");
        _builder_19.append("}");
        _builder_19.newLine();
        fileContents = (_fileContents_19 + _builder_19);
      }
    }
    if (hasTryCatch) {
      String _fileContents_20 = fileContents;
      StringConcatenation _builder_20 = new StringConcatenation();
      _builder_20.append("\t\t");
      _builder_20.newLine();
      _builder_20.append("}catch(Exception ex){");
      _builder_20.newLine();
      _builder_20.append("\t");
      _builder_20.append("break;");
      _builder_20.newLine();
      _builder_20.append("}");
      _builder_20.newLine();
      fileContents = (_fileContents_20 + _builder_20);
    }
    return fileContents;
  }
  
  protected static String _computeExpr(final Equals exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" == ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final NotEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" != ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Less exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" < ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Greater exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" > ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final LessOrEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" <= ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final GreaterOrEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" >= ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final And exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" && ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Or exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" || ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final LogicNot exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(!");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getRef());
    _builder.append(_computeExpr);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Parentheses exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getRef());
    _builder.append(_computeExpr);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final dk.sdu.frhou18.mdsd.iF22.Boolean exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _literal = exp.getVal().getLiteral();
    _builder.append(_literal);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Plus exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" + ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Minus exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" - ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Multiplication exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" * ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final Division exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append(" / ");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final MathNumberExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    int _value = exp.getValue();
    _builder.append(_value);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final TextExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _computeExpr = ScenarioGenerator.computeExpr(exp.getLeft());
    _builder.append(_computeExpr);
    _builder.append("+");
    String _computeExpr_1 = ScenarioGenerator.computeExpr(exp.getRight());
    _builder.append(_computeExpr_1);
    return _builder.toString();
  }
  
  protected static String _computeExpr(final TextLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _text = exp.getText();
    _builder.append(_text);
    _builder.append("\"");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final This exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(__");
    String _name = EcoreUtil2.<Question>getContainerOfType(exp, Question.class).getName();
    _builder.append(_name);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _computeExpr(final VarUse exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = exp.getRef().getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  protected static String _computeExpr(final TypeUsage exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__");
    String _name = EcoreUtil2.<Question>getContainerOfType(exp, Question.class).getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  protected static String _computeExpr(final FunctionUsage exp) {
    final Function1<Expression, String> _function = (Expression param) -> {
      return ScenarioGenerator.computeExpr(param);
    };
    final String params = IterableExtensions.join(ListExtensions.<Expression, String>map(exp.getExps(), _function), ",");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("external.");
    String _name = exp.getName().getName();
    _builder.append(_name);
    _builder.append("(");
    _builder.append(params);
    _builder.append(")");
    return _builder.toString();
  }
  
  public static String getCorrespondingJavaType(final Type type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case BOOLEAN:
          _switchResult = "boolean";
          break;
        case NUMBER:
          _switchResult = "int";
          break;
        case TEXT:
          _switchResult = "String";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static String computeExpr(final Expression exp) {
    if (exp instanceof And) {
      return _computeExpr((And)exp);
    } else if (exp instanceof dk.sdu.frhou18.mdsd.iF22.Boolean) {
      return _computeExpr((dk.sdu.frhou18.mdsd.iF22.Boolean)exp);
    } else if (exp instanceof Division) {
      return _computeExpr((Division)exp);
    } else if (exp instanceof Equals) {
      return _computeExpr((Equals)exp);
    } else if (exp instanceof FunctionUsage) {
      return _computeExpr((FunctionUsage)exp);
    } else if (exp instanceof Greater) {
      return _computeExpr((Greater)exp);
    } else if (exp instanceof GreaterOrEquals) {
      return _computeExpr((GreaterOrEquals)exp);
    } else if (exp instanceof Less) {
      return _computeExpr((Less)exp);
    } else if (exp instanceof LessOrEquals) {
      return _computeExpr((LessOrEquals)exp);
    } else if (exp instanceof LogicNot) {
      return _computeExpr((LogicNot)exp);
    } else if (exp instanceof MathNumberExp) {
      return _computeExpr((MathNumberExp)exp);
    } else if (exp instanceof Minus) {
      return _computeExpr((Minus)exp);
    } else if (exp instanceof Multiplication) {
      return _computeExpr((Multiplication)exp);
    } else if (exp instanceof NotEquals) {
      return _computeExpr((NotEquals)exp);
    } else if (exp instanceof Or) {
      return _computeExpr((Or)exp);
    } else if (exp instanceof Parentheses) {
      return _computeExpr((Parentheses)exp);
    } else if (exp instanceof Plus) {
      return _computeExpr((Plus)exp);
    } else if (exp instanceof TextExp) {
      return _computeExpr((TextExp)exp);
    } else if (exp instanceof TextLiteral) {
      return _computeExpr((TextLiteral)exp);
    } else if (exp instanceof This) {
      return _computeExpr((This)exp);
    } else if (exp instanceof TypeUsage) {
      return _computeExpr((TypeUsage)exp);
    } else if (exp instanceof VarUse) {
      return _computeExpr((VarUse)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
