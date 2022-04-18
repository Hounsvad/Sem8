package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "','", "')'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMath.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMath.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_programName_0_0= ruleProgramName ) ) ( (lv_externals_1_0= ruleExternal ) )* ( (lv_variableAssignments_2_0= ruleVariableAssignment ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_programName_0_0 = null;

        EObject lv_externals_1_0 = null;

        EObject lv_variableAssignments_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( ( (lv_programName_0_0= ruleProgramName ) ) ( (lv_externals_1_0= ruleExternal ) )* ( (lv_variableAssignments_2_0= ruleVariableAssignment ) )+ ) )
            // InternalMath.g:78:2: ( ( (lv_programName_0_0= ruleProgramName ) ) ( (lv_externals_1_0= ruleExternal ) )* ( (lv_variableAssignments_2_0= ruleVariableAssignment ) )+ )
            {
            // InternalMath.g:78:2: ( ( (lv_programName_0_0= ruleProgramName ) ) ( (lv_externals_1_0= ruleExternal ) )* ( (lv_variableAssignments_2_0= ruleVariableAssignment ) )+ )
            // InternalMath.g:79:3: ( (lv_programName_0_0= ruleProgramName ) ) ( (lv_externals_1_0= ruleExternal ) )* ( (lv_variableAssignments_2_0= ruleVariableAssignment ) )+
            {
            // InternalMath.g:79:3: ( (lv_programName_0_0= ruleProgramName ) )
            // InternalMath.g:80:4: (lv_programName_0_0= ruleProgramName )
            {
            // InternalMath.g:80:4: (lv_programName_0_0= ruleProgramName )
            // InternalMath.g:81:5: lv_programName_0_0= ruleProgramName
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getProgramNameProgramNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_programName_0_0=ruleProgramName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"programName",
            						lv_programName_0_0,
            						"dk.sdu.mmmi.mdsd.Math.ProgramName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMath.g:98:3: ( (lv_externals_1_0= ruleExternal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:99:4: (lv_externals_1_0= ruleExternal )
            	    {
            	    // InternalMath.g:99:4: (lv_externals_1_0= ruleExternal )
            	    // InternalMath.g:100:5: lv_externals_1_0= ruleExternal
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExternalsExternalParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_externals_1_0=ruleExternal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_1_0,
            	    						"dk.sdu.mmmi.mdsd.Math.External");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:117:3: ( (lv_variableAssignments_2_0= ruleVariableAssignment ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:118:4: (lv_variableAssignments_2_0= ruleVariableAssignment )
            	    {
            	    // InternalMath.g:118:4: (lv_variableAssignments_2_0= ruleVariableAssignment )
            	    // InternalMath.g:119:5: lv_variableAssignments_2_0= ruleVariableAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getVariableAssignmentsVariableAssignmentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_variableAssignments_2_0=ruleVariableAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variableAssignments",
            	    						lv_variableAssignments_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VariableAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProgramName"
    // InternalMath.g:140:1: entryRuleProgramName returns [EObject current=null] : iv_ruleProgramName= ruleProgramName EOF ;
    public final EObject entryRuleProgramName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramName = null;


        try {
            // InternalMath.g:140:52: (iv_ruleProgramName= ruleProgramName EOF )
            // InternalMath.g:141:2: iv_ruleProgramName= ruleProgramName EOF
            {
             newCompositeNode(grammarAccess.getProgramNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramName=ruleProgramName();

            state._fsp--;

             current =iv_ruleProgramName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramName"


    // $ANTLR start "ruleProgramName"
    // InternalMath.g:147:1: ruleProgramName returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProgramName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:153:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMath.g:154:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMath.g:154:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMath.g:155:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramNameAccess().getProgramKeyword_0());
            		
            // InternalMath.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:161:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramName"


    // $ANTLR start "entryRuleExternal"
    // InternalMath.g:181:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMath.g:181:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMath.g:182:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMath.g:188:1: ruleExternal returns [EObject current=null] : ( () otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        Token lv_parameters_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMath.g:194:2: ( ( () otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            // InternalMath.g:195:2: ( () otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // InternalMath.g:195:2: ( () otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* otherlv_7= ')' )
            // InternalMath.g:196:3: () otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= RULE_ID ) )? (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )* otherlv_7= ')'
            {
            // InternalMath.g:196:3: ()
            // InternalMath.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalAccess().getExternalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalAccess().getExternalKeyword_1());
            		
            // InternalMath.g:207:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMath.g:208:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMath.g:208:4: (lv_name_2_0= RULE_ID )
            // InternalMath.g:209:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMath.g:229:3: ( (lv_parameters_4_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:230:4: (lv_parameters_4_0= RULE_ID )
                    {
                    // InternalMath.g:230:4: (lv_parameters_4_0= RULE_ID )
                    // InternalMath.g:231:5: lv_parameters_4_0= RULE_ID
                    {
                    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    					newLeafNode(lv_parameters_4_0, grammarAccess.getExternalAccess().getParametersIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"parameters",
                    						lv_parameters_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:247:3: (otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:248:4: otherlv_5= ',' ( (lv_parameters_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getExternalAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMath.g:252:4: ( (lv_parameters_6_0= RULE_ID ) )
            	    // InternalMath.g:253:5: (lv_parameters_6_0= RULE_ID )
            	    {
            	    // InternalMath.g:253:5: (lv_parameters_6_0= RULE_ID )
            	    // InternalMath.g:254:6: lv_parameters_6_0= RULE_ID
            	    {
            	    lv_parameters_6_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(lv_parameters_6_0, grammarAccess.getExternalAccess().getParametersIDTerminalRuleCall_5_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExternalRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleExternalUse"
    // InternalMath.g:279:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalMath.g:279:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalMath.g:280:2: iv_ruleExternalUse= ruleExternalUse EOF
            {
             newCompositeNode(grammarAccess.getExternalUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalUse=ruleExternalUse();

            state._fsp--;

             current =iv_ruleExternalUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalUse"


    // $ANTLR start "ruleExternalUse"
    // InternalMath.g:286:1: ruleExternalUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_exp_3_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:292:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalMath.g:293:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalMath.g:293:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalMath.g:294:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exp_3_0= ruleExp ) )? (otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            // InternalMath.g:294:3: ()
            // InternalMath.g:295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalUseAccess().getExternalUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:301:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:302:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:302:4: (otherlv_1= RULE_ID )
            // InternalMath.g:303:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getExternalUseAccess().getRefExternalCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:318:3: ( (lv_exp_3_0= ruleExp ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==13||LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:319:4: (lv_exp_3_0= ruleExp )
                    {
                    // InternalMath.g:319:4: (lv_exp_3_0= ruleExp )
                    // InternalMath.g:320:5: lv_exp_3_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getExternalUseAccess().getExpExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_exp_3_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalUseRule());
                    					}
                    					add(
                    						current,
                    						"exp",
                    						lv_exp_3_0,
                    						"dk.sdu.mmmi.mdsd.Math.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:337:3: (otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:338:4: otherlv_4= ',' ( (lv_exp_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalUseAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMath.g:342:4: ( (lv_exp_5_0= ruleExp ) )
            	    // InternalMath.g:343:5: (lv_exp_5_0= ruleExp )
            	    {
            	    // InternalMath.g:343:5: (lv_exp_5_0= ruleExp )
            	    // InternalMath.g:344:6: lv_exp_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalUseAccess().getExpExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_exp_5_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalUseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exp",
            	    							lv_exp_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalUse"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalMath.g:370:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalMath.g:370:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalMath.g:371:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalMath.g:377:1: ruleVariableAssignment returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_exp_4_0= ruleExp ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:383:2: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_exp_4_0= ruleExp ) ) ) )
            // InternalMath.g:384:2: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_exp_4_0= ruleExp ) ) )
            {
            // InternalMath.g:384:2: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_exp_4_0= ruleExp ) ) )
            // InternalMath.g:385:3: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_exp_4_0= ruleExp ) )
            {
            // InternalMath.g:385:3: ()
            // InternalMath.g:386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAssignmentAccess().getVariableAssignmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getVarKeyword_1());
            		
            // InternalMath.g:396:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMath.g:397:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMath.g:397:4: (lv_name_2_0= RULE_ID )
            // InternalMath.g:398:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariableAssignmentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_3());
            		
            // InternalMath.g:418:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalMath.g:419:4: (lv_exp_4_0= ruleExp )
            {
            // InternalMath.g:419:4: (lv_exp_4_0= ruleExp )
            // InternalMath.g:420:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:441:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:441:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:442:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:448:1: ruleExp returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MultDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:454:2: ( (this_MultDiv_0= ruleMultDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* ) )
            // InternalMath.g:455:2: (this_MultDiv_0= ruleMultDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* )
            {
            // InternalMath.g:455:2: (this_MultDiv_0= ruleMultDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* )
            // InternalMath.g:456:3: this_MultDiv_0= ruleMultDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;


            			current = this_MultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:464:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:465:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDiv ) )
            	    {
            	    // InternalMath.g:465:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==18) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==19) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMath.g:466:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMath.g:466:5: (otherlv_1= '+' () )
            	            // InternalMath.g:467:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:471:6: ()
            	            // InternalMath.g:472:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:480:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMath.g:480:5: (otherlv_3= '-' () )
            	            // InternalMath.g:481:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,19,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:485:6: ()
            	            // InternalMath.g:486:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:494:4: ( (lv_right_5_0= ruleMultDiv ) )
            	    // InternalMath.g:495:5: (lv_right_5_0= ruleMultDiv )
            	    {
            	    // InternalMath.g:495:5: (lv_right_5_0= ruleMultDiv )
            	    // InternalMath.g:496:6: lv_right_5_0= ruleMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightMultDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_5_0=ruleMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.MultDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleMultDiv"
    // InternalMath.g:518:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalMath.g:518:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalMath.g:519:2: iv_ruleMultDiv= ruleMultDiv EOF
            {
             newCompositeNode(grammarAccess.getMultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultDiv=ruleMultDiv();

            state._fsp--;

             current =iv_ruleMultDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalMath.g:525:1: ruleMultDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:531:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:532:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:532:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:533:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:541:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=20 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMath.g:542:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:542:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==20) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==21) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMath.g:543:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMath.g:543:5: (otherlv_1= '*' () )
            	            // InternalMath.g:544:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:548:6: ()
            	            // InternalMath.g:549:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultDivAccess().getMultiplicationLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:557:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMath.g:557:5: (otherlv_3= '/' () )
            	            // InternalMath.g:558:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultDivAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:562:6: ()
            	            // InternalMath.g:563:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultDivAccess().getDivisionLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:571:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:572:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:572:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:573:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:595:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:595:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:596:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:602:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LocalAssignment_3= ruleLocalAssignment | this_ExternalUse_4= ruleExternalUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_LocalAssignment_3 = null;

        EObject this_ExternalUse_4 = null;



        	enterRule();

        try {
            // InternalMath.g:608:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LocalAssignment_3= ruleLocalAssignment | this_ExternalUse_4= ruleExternalUse ) )
            // InternalMath.g:609:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LocalAssignment_3= ruleLocalAssignment | this_ExternalUse_4= ruleExternalUse )
            {
            // InternalMath.g:609:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_LocalAssignment_3= ruleLocalAssignment | this_ExternalUse_4= ruleExternalUse )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case 13:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||(LA11_3>=14 && LA11_3<=16)||(LA11_3>=18 && LA11_3<=21)||(LA11_3>=23 && LA11_3<=24)) ) {
                    alt11=3;
                }
                else if ( (LA11_3==13) ) {
                    alt11=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMath.g:610:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:619:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:628:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:637:3: this_LocalAssignment_3= ruleLocalAssignment
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLocalAssignmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalAssignment_3=ruleLocalAssignment();

                    state._fsp--;


                    			current = this_LocalAssignment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:646:3: this_ExternalUse_4= ruleExternalUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalUse_4=ruleExternalUse();

                    state._fsp--;


                    			current = this_ExternalUse_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:658:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:658:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:659:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:665:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:671:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalMath.g:672:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalMath.g:672:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalMath.g:673:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalMath.g:673:3: ()
            // InternalMath.g:674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:684:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMath.g:685:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMath.g:685:4: (lv_exp_2_0= ruleExp )
            // InternalMath.g:686:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:711:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:711:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:712:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:718:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:724:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:725:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:725:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:726:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:726:3: ()
            // InternalMath.g:727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getExplicitNumberAction_0(),
            					current);
            			

            }

            // InternalMath.g:733:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:734:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:734:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:735:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:755:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:755:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:756:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:762:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMath.g:768:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMath.g:769:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMath.g:769:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMath.g:770:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMath.g:770:3: ()
            // InternalMath.g:771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:777:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:778:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:778:4: (otherlv_1= RULE_ID )
            // InternalMath.g:779:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefVariableCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleAssignment"
    // InternalMath.g:794:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMath.g:794:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMath.g:795:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMath.g:801:1: ruleAssignment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:807:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:808:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:808:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:809:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            // InternalMath.g:809:3: ()
            // InternalMath.g:810:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
            					current);
            			

            }

            // InternalMath.g:816:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:817:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:817:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:818:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:838:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:839:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:839:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:840:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleLocalAssignment"
    // InternalMath.g:861:1: entryRuleLocalAssignment returns [EObject current=null] : iv_ruleLocalAssignment= ruleLocalAssignment EOF ;
    public final EObject entryRuleLocalAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAssignment = null;


        try {
            // InternalMath.g:861:56: (iv_ruleLocalAssignment= ruleLocalAssignment EOF )
            // InternalMath.g:862:2: iv_ruleLocalAssignment= ruleLocalAssignment EOF
            {
             newCompositeNode(grammarAccess.getLocalAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalAssignment=ruleLocalAssignment();

            state._fsp--;

             current =iv_ruleLocalAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalAssignment"


    // $ANTLR start "ruleLocalAssignment"
    // InternalMath.g:868:1: ruleLocalAssignment returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_assignment_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' ) ;
    public final EObject ruleLocalAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:874:2: ( ( () otherlv_1= 'let' ( (lv_assignment_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' ) )
            // InternalMath.g:875:2: ( () otherlv_1= 'let' ( (lv_assignment_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' )
            {
            // InternalMath.g:875:2: ( () otherlv_1= 'let' ( (lv_assignment_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end' )
            // InternalMath.g:876:3: () otherlv_1= 'let' ( (lv_assignment_2_0= ruleAssignment ) ) otherlv_3= 'in' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= 'end'
            {
            // InternalMath.g:876:3: ()
            // InternalMath.g:877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalAssignmentAccess().getLocalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAssignmentAccess().getLetKeyword_1());
            		
            // InternalMath.g:887:3: ( (lv_assignment_2_0= ruleAssignment ) )
            // InternalMath.g:888:4: (lv_assignment_2_0= ruleAssignment )
            {
            // InternalMath.g:888:4: (lv_assignment_2_0= ruleAssignment )
            // InternalMath.g:889:5: lv_assignment_2_0= ruleAssignment
            {

            					newCompositeNode(grammarAccess.getLocalAssignmentAccess().getAssignmentAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_assignment_2_0=ruleAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalAssignmentRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Assignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalAssignmentAccess().getInKeyword_3());
            		
            // InternalMath.g:910:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalMath.g:911:4: (lv_exp_4_0= ruleExp )
            {
            // InternalMath.g:911:4: (lv_exp_4_0= ruleExp )
            // InternalMath.g:912:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLocalAssignmentAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_exp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalAssignmentRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalAssignmentAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000040E030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000402030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}