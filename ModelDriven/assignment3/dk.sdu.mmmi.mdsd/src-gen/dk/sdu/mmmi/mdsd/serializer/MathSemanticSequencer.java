/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.Assignment;
import dk.sdu.mmmi.mdsd.math.Division;
import dk.sdu.mmmi.mdsd.math.ExplicitNumber;
import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.ExternalUse;
import dk.sdu.mmmi.mdsd.math.Local;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Multiplication;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.ProgramName;
import dk.sdu.mmmi.mdsd.math.VarUse;
import dk.sdu.mmmi.mdsd.math.VariableAssignment;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case MathPackage.DIVISION:
				sequence_MultDiv(context, (Division) semanticObject); 
				return; 
			case MathPackage.EXPLICIT_NUMBER:
				sequence_Number(context, (ExplicitNumber) semanticObject); 
				return; 
			case MathPackage.EXTERNAL:
				sequence_External(context, (External) semanticObject); 
				return; 
			case MathPackage.EXTERNAL_USE:
				sequence_ExternalUse(context, (ExternalUse) semanticObject); 
				return; 
			case MathPackage.LOCAL:
				sequence_LocalAssignment(context, (Local) semanticObject); 
				return; 
			case MathPackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case MathPackage.MULTIPLICATION:
				sequence_MultDiv(context, (Multiplication) semanticObject); 
				return; 
			case MathPackage.PARENTHESIS:
				sequence_Parenthesis(context, (Parenthesis) semanticObject); 
				return; 
			case MathPackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case MathPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MathPackage.PROGRAM_NAME:
				sequence_ProgramName(context, (ProgramName) semanticObject); 
				return; 
			case MathPackage.VAR_USE:
				sequence_VariableUse(context, (VarUse) semanticObject); 
				return; 
			case MathPackage.VARIABLE_ASSIGNMENT:
				sequence_VariableAssignment(context, (VariableAssignment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (name=ID exp=Exp)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0_1 returns Minus
	 *     Exp.Minus_1_0_1_1 returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_0_1_1 right=MultDiv)
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightMultDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0_1 returns Plus
	 *     Exp.Minus_1_0_1_1 returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0_1 right=MultDiv)
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightMultDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExternalUse returns ExternalUse
	 *     Exp returns ExternalUse
	 *     Exp.Plus_1_0_0_1 returns ExternalUse
	 *     Exp.Minus_1_0_1_1 returns ExternalUse
	 *     MultDiv returns ExternalUse
	 *     MultDiv.Multiplication_1_0_0_1 returns ExternalUse
	 *     MultDiv.Division_1_0_1_1 returns ExternalUse
	 *     Primary returns ExternalUse
	 *
	 * Constraint:
	 *     (ref=[External|ID] exp+=Exp? exp+=Exp*)
	 */
	protected void sequence_ExternalUse(ISerializationContext context, ExternalUse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     External returns External
	 *
	 * Constraint:
	 *     (name=ID parameters+=ID? parameters+=ID*)
	 */
	protected void sequence_External(ISerializationContext context, External semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Local
	 *     Exp.Plus_1_0_0_1 returns Local
	 *     Exp.Minus_1_0_1_1 returns Local
	 *     MultDiv returns Local
	 *     MultDiv.Multiplication_1_0_0_1 returns Local
	 *     MultDiv.Division_1_0_1_1 returns Local
	 *     Primary returns Local
	 *     LocalAssignment returns Local
	 *
	 * Constraint:
	 *     (assignment=Assignment exp=Exp)
	 */
	protected void sequence_LocalAssignment(ISerializationContext context, Local semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LOCAL__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LOCAL__ASSIGNMENT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LOCAL__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LOCAL__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalAssignmentAccess().getAssignmentAssignmentParserRuleCall_2_0(), semanticObject.getAssignment());
		feeder.accept(grammarAccess.getLocalAssignmentAccess().getExpExpParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Division
	 *     Exp.Plus_1_0_0_1 returns Division
	 *     Exp.Minus_1_0_1_1 returns Division
	 *     MultDiv returns Division
	 *     MultDiv.Multiplication_1_0_0_1 returns Division
	 *     MultDiv.Division_1_0_1_1 returns Division
	 *
	 * Constraint:
	 *     (left=MultDiv_Division_1_0_1_1 right=Primary)
	 */
	protected void sequence_MultDiv(ISerializationContext context, Division semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DIVISION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DIVISION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultDivAccess().getDivisionLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Multiplication
	 *     Exp.Plus_1_0_0_1 returns Multiplication
	 *     Exp.Minus_1_0_1_1 returns Multiplication
	 *     MultDiv returns Multiplication
	 *     MultDiv.Multiplication_1_0_0_1 returns Multiplication
	 *     MultDiv.Division_1_0_1_1 returns Multiplication
	 *
	 * Constraint:
	 *     (left=MultDiv_Multiplication_1_0_0_1 right=Primary)
	 */
	protected void sequence_MultDiv(ISerializationContext context, Multiplication semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULTIPLICATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULTIPLICATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultDivAccess().getMultiplicationLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns ExplicitNumber
	 *     Exp.Plus_1_0_0_1 returns ExplicitNumber
	 *     Exp.Minus_1_0_1_1 returns ExplicitNumber
	 *     MultDiv returns ExplicitNumber
	 *     MultDiv.Multiplication_1_0_0_1 returns ExplicitNumber
	 *     MultDiv.Division_1_0_1_1 returns ExplicitNumber
	 *     Primary returns ExplicitNumber
	 *     Number returns ExplicitNumber
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, ExplicitNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.EXPLICIT_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.EXPLICIT_NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Parenthesis
	 *     Exp.Plus_1_0_0_1 returns Parenthesis
	 *     Exp.Minus_1_0_1_1 returns Parenthesis
	 *     MultDiv returns Parenthesis
	 *     MultDiv.Multiplication_1_0_0_1 returns Parenthesis
	 *     MultDiv.Division_1_0_1_1 returns Parenthesis
	 *     Primary returns Parenthesis
	 *     Parenthesis returns Parenthesis
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_Parenthesis(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProgramName returns ProgramName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ProgramName(ISerializationContext context, ProgramName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PROGRAM_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PROGRAM_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (programName=ProgramName externals+=External* variableAssignments+=VariableAssignment+)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableAssignment returns VariableAssignment
	 *
	 * Constraint:
	 *     (name=ID exp=Exp)
	 */
	protected void sequence_VariableAssignment(ISerializationContext context, VariableAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getExpExpParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns VarUse
	 *     Exp.Plus_1_0_0_1 returns VarUse
	 *     Exp.Minus_1_0_1_1 returns VarUse
	 *     MultDiv returns VarUse
	 *     MultDiv.Multiplication_1_0_0_1 returns VarUse
	 *     MultDiv.Division_1_0_1_1 returns VarUse
	 *     Primary returns VarUse
	 *     VariableUse returns VarUse
	 *
	 * Constraint:
	 *     ref=[Variable|ID]
	 */
	protected void sequence_VariableUse(ISerializationContext context, VarUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VAR_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VAR_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableUseAccess().getRefVariableIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MathPackage.Literals.VAR_USE__REF, false));
		feeder.finish();
	}
	
	
}
