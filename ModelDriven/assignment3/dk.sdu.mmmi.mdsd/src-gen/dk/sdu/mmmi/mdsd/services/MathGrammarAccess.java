/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProgramNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProgramNameProgramNameParserRuleCall_0_0 = (RuleCall)cProgramNameAssignment_0.eContents().get(0);
		private final Assignment cExternalsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExternalsExternalParserRuleCall_1_0 = (RuleCall)cExternalsAssignment_1.eContents().get(0);
		private final Assignment cVariableAssignmentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVariableAssignmentsVariableAssignmentParserRuleCall_2_0 = (RuleCall)cVariableAssignmentsAssignment_2.eContents().get(0);
		
		//Program:
		//    programName=ProgramName externals+=External* variableAssignments+=VariableAssignment+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//programName=ProgramName externals+=External* variableAssignments+=VariableAssignment+
		public Group getGroup() { return cGroup; }
		
		//programName=ProgramName
		public Assignment getProgramNameAssignment_0() { return cProgramNameAssignment_0; }
		
		//ProgramName
		public RuleCall getProgramNameProgramNameParserRuleCall_0_0() { return cProgramNameProgramNameParserRuleCall_0_0; }
		
		//externals+=External*
		public Assignment getExternalsAssignment_1() { return cExternalsAssignment_1; }
		
		//External
		public RuleCall getExternalsExternalParserRuleCall_1_0() { return cExternalsExternalParserRuleCall_1_0; }
		
		//variableAssignments+=VariableAssignment+
		public Assignment getVariableAssignmentsAssignment_2() { return cVariableAssignmentsAssignment_2; }
		
		//VariableAssignment
		public RuleCall getVariableAssignmentsVariableAssignmentParserRuleCall_2_0() { return cVariableAssignmentsVariableAssignmentParserRuleCall_2_0; }
	}
	public class ProgramNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.ProgramName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ProgramName returns ProgramName:
		//    'program' name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'program' name=ID
		public Group getGroup() { return cGroup; }
		
		//'program'
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ExternalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.External");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersIDTerminalRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cParametersAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cParametersIDTerminalRuleCall_5_1_0 = (RuleCall)cParametersAssignment_5_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//External:
		//    {External} 'external' name=ID '(' parameters+=ID? (',' parameters+=ID)* ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{External} 'external' name=ID '(' parameters+=ID? (',' parameters+=ID)* ')'
		public Group getGroup() { return cGroup; }
		
		//{External}
		public Action getExternalAction_0() { return cExternalAction_0; }
		
		//'external'
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//parameters+=ID?
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }
		
		//ID
		public RuleCall getParametersIDTerminalRuleCall_4_0() { return cParametersIDTerminalRuleCall_4_0; }
		
		//(',' parameters+=ID)*
		public Group getGroup_5() { return cGroup_5; }
		
		//','
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//parameters+=ID
		public Assignment getParametersAssignment_5_1() { return cParametersAssignment_5_1; }
		
		//ID
		public RuleCall getParametersIDTerminalRuleCall_5_1_0() { return cParametersIDTerminalRuleCall_5_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	public class ExternalUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.ExternalUse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalUseAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefExternalCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefExternalIDTerminalRuleCall_1_0_1 = (RuleCall)cRefExternalCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cExpAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_4_1_0 = (RuleCall)cExpAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ExternalUse returns Expression:
		//    {ExternalUse} ref=[External] '(' exp+=Exp? (',' exp+=Exp)* ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ExternalUse} ref=[External] '(' exp+=Exp? (',' exp+=Exp)* ')'
		public Group getGroup() { return cGroup; }
		
		//{ExternalUse}
		public Action getExternalUseAction_0() { return cExternalUseAction_0; }
		
		//ref=[External]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[External]
		public CrossReference getRefExternalCrossReference_1_0() { return cRefExternalCrossReference_1_0; }
		
		//ID
		public RuleCall getRefExternalIDTerminalRuleCall_1_0_1() { return cRefExternalIDTerminalRuleCall_1_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//exp+=Exp?
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
		
		//(',' exp+=Exp)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//exp+=Exp
		public Assignment getExpAssignment_4_1() { return cExpAssignment_4_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_4_1_0() { return cExpExpParserRuleCall_4_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class VariableAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAssignmentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExpAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExpExpParserRuleCall_4_0 = (RuleCall)cExpAssignment_4.eContents().get(0);
		
		////Variables:
		////    variableAssignments+=VariableAssignment+
		////;
		//VariableAssignment returns Variable: //Serves as a basis to retain results and to be the basis for lines in the dsl
		//    {VariableAssignment} 'var' name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////Serves as a basis to retain results and to be the basis for lines in the dsl
		//   {VariableAssignment} 'var' name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		////Serves as a basis to retain results and to be the basis for lines in the dsl
		//   {VariableAssignment}
		public Action getVariableAssignmentAction_0() { return cVariableAssignmentAction_0; }
		
		//'var'
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//exp=Exp
		public Assignment getExpAssignment_4() { return cExpAssignment_4; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_4_0() { return cExpExpParserRuleCall_4_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultDivParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_0 = (Keyword)cGroup_1_0_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_1 = (Action)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Action cMinusLeftAction_1_0_1_1 = (Action)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMultDivParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp returns Expression: //Addition and subtraction - Can boil down to MultDiv
		//    MultDiv (('+' {Plus.left=current}| '-' {Minus.left=current}) right=MultDiv)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////Addition and subtraction - Can boil down to MultDiv
		//   MultDiv (('+' {Plus.left=current}| '-' {Minus.left=current}) right=MultDiv)*
		public Group getGroup() { return cGroup; }
		
		////Addition and subtraction - Can boil down to MultDiv
		//   MultDiv
		public RuleCall getMultDivParserRuleCall_0() { return cMultDivParserRuleCall_0; }
		
		//(('+' {Plus.left=current}| '-' {Minus.left=current}) right=MultDiv)*
		public Group getGroup_1() { return cGroup_1; }
		
		//('+' {Plus.left=current}| '-' {Minus.left=current})
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'+' {Plus.left=current}
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_0() { return cPlusSignKeyword_1_0_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_1() { return cPlusLeftAction_1_0_0_1; }
		
		//'-' {Minus.left=current}
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_0() { return cHyphenMinusKeyword_1_0_1_0; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_1() { return cMinusLeftAction_1_0_1_1; }
		
		//right=MultDiv
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//MultDiv
		public RuleCall getRightMultDivParserRuleCall_1_1_0() { return cRightMultDivParserRuleCall_1_1_0; }
	}
	public class MultDivElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MultDiv");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_0 = (Keyword)cGroup_1_0_0.eContents().get(0);
		private final Action cMultiplicationLeftAction_1_0_0_1 = (Action)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Action cDivisionLeftAction_1_0_1_1 = (Action)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//MultDiv returns Expression: //Multiplication and devision - Can boil down to MultDiv
		//    Primary (('*' {Multiplication.left=current}| '/' {Division.left=current}) right=Primary)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////Multiplication and devision - Can boil down to MultDiv
		//   Primary (('*' {Multiplication.left=current}| '/' {Division.left=current}) right=Primary)*
		public Group getGroup() { return cGroup; }
		
		////Multiplication and devision - Can boil down to MultDiv
		//   Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(('*' {Multiplication.left=current}| '/' {Division.left=current}) right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//('*' {Multiplication.left=current}| '/' {Division.left=current})
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'*' {Multiplication.left=current}
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_0() { return cAsteriskKeyword_1_0_0_0; }
		
		//{Multiplication.left=current}
		public Action getMultiplicationLeftAction_1_0_0_1() { return cMultiplicationLeftAction_1_0_0_1; }
		
		//'/' {Division.left=current}
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_0() { return cSolidusKeyword_1_0_1_0; }
		
		//{Division.left=current}
		public Action getDivisionLeftAction_1_0_1_1() { return cDivisionLeftAction_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLocalAssignmentParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cExternalUseParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Primary returns Expression: //Numbers and things that should be computed down to numbers before use
		//    Number | Parenthesis | VariableUse | LocalAssignment | ExternalUse
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////Numbers and things that should be computed down to numbers before use
		//   Number | Parenthesis | VariableUse | LocalAssignment | ExternalUse
		public Alternatives getAlternatives() { return cAlternatives; }
		
		////Numbers and things that should be computed down to numbers before use
		//   Number
		public RuleCall getNumberParserRuleCall_0() { return cNumberParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LocalAssignment
		public RuleCall getLocalAssignmentParserRuleCall_3() { return cLocalAssignmentParserRuleCall_3; }
		
		//ExternalUse
		public RuleCall getExternalUseParserRuleCall_4() { return cExternalUseParserRuleCall_4; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParenthesisAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Parenthesis returns Expression: //Serves to support the use of parentheses as a base
		//    {Parenthesis} '(' exp=Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////Serves to support the use of parentheses as a base
		//   {Parenthesis} '(' exp=Exp ')'
		public Group getGroup() { return cGroup; }
		
		////Serves to support the use of parentheses as a base
		//   {Parenthesis}
		public Action getParenthesisAction_0() { return cParenthesisAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//exp=Exp
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExplicitNumberAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Number returns Expression: //A basic number
		//    {ExplicitNumber} value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////A basic number
		//   {ExplicitNumber} value=INT
		public Group getGroup() { return cGroup; }
		
		////A basic number
		//   {ExplicitNumber}
		public Action getExplicitNumberAction_0() { return cExplicitNumberAction_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVarUseAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefVariableCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cRefVariableCrossReference_1_0.eContents().get(1);
		
		//VariableUse: //Using a previously defined variable
		//    {VarUse} ref=[Variable]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////Using a previously defined variable
		//   {VarUse} ref=[Variable]
		public Group getGroup() { return cGroup; }
		
		////Using a previously defined variable
		//   {VarUse}
		public Action getVarUseAction_0() { return cVarUseAction_0; }
		
		//ref=[Variable]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[Variable]
		public CrossReference getRefVariableCrossReference_1_0() { return cRefVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getRefVariableIDTerminalRuleCall_1_0_1() { return cRefVariableIDTerminalRuleCall_1_0_1; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAssignmentAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		
		//Assignment returns Variable:
		//    {Assignment} name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Assignment} name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//{Assignment}
		public Action getAssignmentAction_0() { return cAssignmentAction_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
	}
	public class LocalAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LocalAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAssignmentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAssignmentAssignmentParserRuleCall_2_0 = (RuleCall)cAssignmentAssignment_2.eContents().get(0);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExpAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExpExpParserRuleCall_4_0 = (RuleCall)cExpAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//LocalAssignment: //This is kind of like a using statement, where an alias is made for an expression or simmilar that only exists in the body of the let statement
		//    {Local} 'let' assignment=Assignment 'in' exp=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		////This is kind of like a using statement, where an alias is made for an expression or simmilar that only exists in the body of the let statement
		//   {Local} 'let' assignment=Assignment 'in' exp=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		////This is kind of like a using statement, where an alias is made for an expression or simmilar that only exists in the body of the let statement
		//   {Local}
		public Action getLocalAction_0() { return cLocalAction_0; }
		
		//'let'
		public Keyword getLetKeyword_1() { return cLetKeyword_1; }
		
		//assignment=Assignment
		public Assignment getAssignmentAssignment_2() { return cAssignmentAssignment_2; }
		
		//Assignment
		public RuleCall getAssignmentAssignmentParserRuleCall_2_0() { return cAssignmentAssignmentParserRuleCall_2_0; }
		
		//'in'
		public Keyword getInKeyword_3() { return cInKeyword_3; }
		
		//exp=Exp
		public Assignment getExpAssignment_4() { return cExpAssignment_4; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_4_0() { return cExpExpParserRuleCall_4_0; }
		
		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}
	
	
	private final ProgramElements pProgram;
	private final ProgramNameElements pProgramName;
	private final ExternalElements pExternal;
	private final ExternalUseElements pExternalUse;
	private final VariableAssignmentElements pVariableAssignment;
	private final ExpElements pExp;
	private final MultDivElements pMultDiv;
	private final PrimaryElements pPrimary;
	private final ParenthesisElements pParenthesis;
	private final NumberElements pNumber;
	private final VariableUseElements pVariableUse;
	private final AssignmentElements pAssignment;
	private final LocalAssignmentElements pLocalAssignment;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pProgramName = new ProgramNameElements();
		this.pExternal = new ExternalElements();
		this.pExternalUse = new ExternalUseElements();
		this.pVariableAssignment = new VariableAssignmentElements();
		this.pExp = new ExpElements();
		this.pMultDiv = new MultDivElements();
		this.pPrimary = new PrimaryElements();
		this.pParenthesis = new ParenthesisElements();
		this.pNumber = new NumberElements();
		this.pVariableUse = new VariableUseElements();
		this.pAssignment = new AssignmentElements();
		this.pLocalAssignment = new LocalAssignmentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//    programName=ProgramName externals+=External* variableAssignments+=VariableAssignment+
	//;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//ProgramName returns ProgramName:
	//    'program' name=ID
	//;
	public ProgramNameElements getProgramNameAccess() {
		return pProgramName;
	}
	
	public ParserRule getProgramNameRule() {
		return getProgramNameAccess().getRule();
	}
	
	//External:
	//    {External} 'external' name=ID '(' parameters+=ID? (',' parameters+=ID)* ')'
	//;
	public ExternalElements getExternalAccess() {
		return pExternal;
	}
	
	public ParserRule getExternalRule() {
		return getExternalAccess().getRule();
	}
	
	//ExternalUse returns Expression:
	//    {ExternalUse} ref=[External] '(' exp+=Exp? (',' exp+=Exp)* ')'
	//;
	public ExternalUseElements getExternalUseAccess() {
		return pExternalUse;
	}
	
	public ParserRule getExternalUseRule() {
		return getExternalUseAccess().getRule();
	}
	
	////Variables:
	////    variableAssignments+=VariableAssignment+
	////;
	//VariableAssignment returns Variable: //Serves as a basis to retain results and to be the basis for lines in the dsl
	//    {VariableAssignment} 'var' name=ID '=' exp=Exp
	//;
	public VariableAssignmentElements getVariableAssignmentAccess() {
		return pVariableAssignment;
	}
	
	public ParserRule getVariableAssignmentRule() {
		return getVariableAssignmentAccess().getRule();
	}
	
	//Exp returns Expression: //Addition and subtraction - Can boil down to MultDiv
	//    MultDiv (('+' {Plus.left=current}| '-' {Minus.left=current}) right=MultDiv)*
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//MultDiv returns Expression: //Multiplication and devision - Can boil down to MultDiv
	//    Primary (('*' {Multiplication.left=current}| '/' {Division.left=current}) right=Primary)*
	//;
	public MultDivElements getMultDivAccess() {
		return pMultDiv;
	}
	
	public ParserRule getMultDivRule() {
		return getMultDivAccess().getRule();
	}
	
	//Primary returns Expression: //Numbers and things that should be computed down to numbers before use
	//    Number | Parenthesis | VariableUse | LocalAssignment | ExternalUse
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parenthesis returns Expression: //Serves to support the use of parentheses as a base
	//    {Parenthesis} '(' exp=Exp ')'
	//;
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Number returns Expression: //A basic number
	//    {ExplicitNumber} value=INT
	//;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//VariableUse: //Using a previously defined variable
	//    {VarUse} ref=[Variable]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//Assignment returns Variable:
	//    {Assignment} name=ID '=' exp=Exp
	//;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//LocalAssignment: //This is kind of like a using statement, where an alias is made for an expression or simmilar that only exists in the body of the let statement
	//    {Local} 'let' assignment=Assignment 'in' exp=Exp 'end'
	//;
	public LocalAssignmentElements getLocalAssignmentAccess() {
		return pLocalAssignment;
	}
	
	public ParserRule getLocalAssignmentRule() {
		return getLocalAssignmentAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
