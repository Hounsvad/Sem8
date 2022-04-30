/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Division;
import dk.sdu.mmmi.mdsd.math.ExplicitNumber;
import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.ExternalUse;
import dk.sdu.mmmi.mdsd.math.Local;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Multiplication;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.VarUse;
import dk.sdu.mmmi.mdsd.math.Variable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, Integer> variables = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program program = Iterators.<Program>filter(resource.getAllContents(), Program.class).next();
    final String className = program.getProgramName().getName();
    final String math_expressionClass = this.getMathClass(program, className);
    fsa.generateFile((className + ".java"), math_expressionClass);
  }
  
  public String getMathClass(final Program program, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    String _header = this.getHeader();
    _builder.append(_header);
    _builder.newLineIfNotEmpty();
    _builder.append("package math_expression;");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _variableDeclarations = this.getVariableDeclarations(program.getVariableAssignments());
    _builder.append(_variableDeclarations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      int _length = ((Object[])Conversions.unwrapArray(program.getExternals(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("private External external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        _builder.append(className, "\t");
        _builder.append("(External external){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        String _externalInterface = this.getExternalInterface(program);
        _builder.append(_externalInterface, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void compute(){");
    _builder.newLine();
    {
      List<String> _variableInstantiations = this.getVariableInstantiations(program);
      for(final String instantiation : _variableInstantiations) {
        _builder.append("\t\t");
        _builder.append(instantiation, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String contents = _builder.toString();
    return contents;
  }
  
  public List<String> getVariableInstantiations(final Program program) {
    EList<Variable> vars = program.getVariableAssignments();
    return this.compute(vars);
  }
  
  public String getExternalInterface(final Program program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface External{");
    _builder.newLine();
    {
      EList<External> _externals = program.getExternals();
      for(final External external : _externals) {
        _builder.append("\t");
        _builder.append("public int ");
        String _externalSignature = this.getExternalSignature(external);
        _builder.append(_externalSignature, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getExternalSignature(final External external) {
    String _name = external.getName();
    String returnValue = (_name + "(");
    int _length = ((Object[])Conversions.unwrapArray(external.getParameters(), Object.class)).length;
    boolean _equals = (_length == 1);
    if (_equals) {
      String _returnValue = returnValue;
      returnValue = (_returnValue + "int n");
    } else {
      int _length_1 = ((Object[])Conversions.unwrapArray(external.getParameters(), Object.class)).length;
      boolean _equals_1 = (_length_1 == 2);
      if (_equals_1) {
        String _returnValue_1 = returnValue;
        returnValue = (_returnValue_1 + "int n, int m");
      }
    }
    String _returnValue_2 = returnValue;
    returnValue = (_returnValue_2 + ")");
    return returnValue;
  }
  
  public String getHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by xtend by the generator made by \'Frederik Alexander Hounsvad\' \'frhou18@student.sdu.dk\'");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All Rights reserved");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getVariableDeclarations(final EList<Variable> list) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Variable variable : list) {
        _builder.append("public int ");
        String _name = variable.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public List<String> compute(final EList<Variable> variables) {
    ArrayList<String> values = new ArrayList<String>();
    for (final Variable varass : variables) {
      String _name = varass.getName();
      String _plus = (_name + " = ");
      String _ComputeExp = MathGenerator.ComputeExp(varass);
      String _plus_1 = (_plus + _ComputeExp);
      values.add(_plus_1);
    }
    return values;
  }
  
  protected static String _ComputeExp(final Plus exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getLeft());
    _builder.append(_ComputeExp);
    _builder.append(" + ");
    String _ComputeExp_1 = MathGenerator.ComputeExp(exp.getRight());
    _builder.append(_ComputeExp_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final Minus exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getLeft());
    _builder.append(_ComputeExp);
    _builder.append(" - ");
    String _ComputeExp_1 = MathGenerator.ComputeExp(exp.getRight());
    _builder.append(_ComputeExp_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final Multiplication exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getLeft());
    _builder.append(_ComputeExp);
    _builder.append(" * ");
    String _ComputeExp_1 = MathGenerator.ComputeExp(exp.getRight());
    _builder.append(_ComputeExp_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final Division exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getLeft());
    _builder.append(_ComputeExp);
    _builder.append(" / ");
    String _ComputeExp_1 = MathGenerator.ComputeExp(exp.getRight());
    _builder.append(_ComputeExp_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final ExplicitNumber exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = exp.getValue();
    _builder.append(_value);
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final Parenthesis exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getExp());
    _builder.append(_ComputeExp);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final VarUse exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getRef());
    _builder.append(_ComputeExp);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final Local exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getExp());
    _builder.append(_ComputeExp);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final Variable exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _ComputeExp = MathGenerator.ComputeExp(exp.getExp());
    _builder.append(_ComputeExp);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected static String _ComputeExp(final ExternalUse exp) {
    StringBuilder sb = new StringBuilder();
    sb.append("(external.").append(exp.getRef().getName()).append("(");
    int _length = ((Object[])Conversions.unwrapArray(exp.getRef().getParameters(), Object.class)).length;
    switch (_length) {
      case 1:
        sb.append(MathGenerator.ComputeExp(exp.getExp().get(0)));
        break;
      case 2:
        sb.append(MathGenerator.ComputeExp(exp.getExp().get(0))).append(",").append(MathGenerator.ComputeExp(exp.getExp().get(1)));
        break;
    }
    sb.append("))");
    return sb.toString();
  }
  
  public static String ComputeExp(final EObject exp) {
    if (exp instanceof Local) {
      return _ComputeExp((Local)exp);
    } else if (exp instanceof VarUse) {
      return _ComputeExp((VarUse)exp);
    } else if (exp instanceof Division) {
      return _ComputeExp((Division)exp);
    } else if (exp instanceof ExplicitNumber) {
      return _ComputeExp((ExplicitNumber)exp);
    } else if (exp instanceof ExternalUse) {
      return _ComputeExp((ExternalUse)exp);
    } else if (exp instanceof Minus) {
      return _ComputeExp((Minus)exp);
    } else if (exp instanceof Multiplication) {
      return _ComputeExp((Multiplication)exp);
    } else if (exp instanceof Parenthesis) {
      return _ComputeExp((Parenthesis)exp);
    } else if (exp instanceof Plus) {
      return _ComputeExp((Plus)exp);
    } else if (exp instanceof Variable) {
      return _ComputeExp((Variable)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
