package dk.sdu.frhou18.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.frhou18.mdsd.services.IF22GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIF22Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "'('", "','", "')'", "':'", "'story'", "'scenario'", "'{'", "'}'", "'end'", "'announce'", "'question'", "'as'", "'in'", "'var'", "'to'", "'if'", "'this'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'&'", "'boolean'", "'text'", "'number'", "'true'", "'false'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIF22Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIF22Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIF22Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalIF22.g"; }



     	private IF22GrammarAccess grammarAccess;

        public InternalIF22Parser(TokenStream input, IF22GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected IF22GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalIF22.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalIF22.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalIF22.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalIF22.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_storyName_0_0= ruleStory ) ) ( (lv_functions_1_0= ruleFunction ) )* ( (lv_scenarios_2_0= ruleScenario ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_storyName_0_0 = null;

        EObject lv_functions_1_0 = null;

        EObject lv_scenarios_2_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:78:2: ( ( ( (lv_storyName_0_0= ruleStory ) ) ( (lv_functions_1_0= ruleFunction ) )* ( (lv_scenarios_2_0= ruleScenario ) )+ ) )
            // InternalIF22.g:79:2: ( ( (lv_storyName_0_0= ruleStory ) ) ( (lv_functions_1_0= ruleFunction ) )* ( (lv_scenarios_2_0= ruleScenario ) )+ )
            {
            // InternalIF22.g:79:2: ( ( (lv_storyName_0_0= ruleStory ) ) ( (lv_functions_1_0= ruleFunction ) )* ( (lv_scenarios_2_0= ruleScenario ) )+ )
            // InternalIF22.g:80:3: ( (lv_storyName_0_0= ruleStory ) ) ( (lv_functions_1_0= ruleFunction ) )* ( (lv_scenarios_2_0= ruleScenario ) )+
            {
            // InternalIF22.g:80:3: ( (lv_storyName_0_0= ruleStory ) )
            // InternalIF22.g:81:4: (lv_storyName_0_0= ruleStory )
            {
            // InternalIF22.g:81:4: (lv_storyName_0_0= ruleStory )
            // InternalIF22.g:82:5: lv_storyName_0_0= ruleStory
            {

            					newCompositeNode(grammarAccess.getModelAccess().getStoryNameStoryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_storyName_0_0=ruleStory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"storyName",
            						lv_storyName_0_0,
            						"dk.sdu.frhou18.mdsd.IF22.Story");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIF22.g:99:3: ( (lv_functions_1_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIF22.g:100:4: (lv_functions_1_0= ruleFunction )
            	    {
            	    // InternalIF22.g:100:4: (lv_functions_1_0= ruleFunction )
            	    // InternalIF22.g:101:5: lv_functions_1_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_1_0,
            	    						"dk.sdu.frhou18.mdsd.IF22.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIF22.g:118:3: ( (lv_scenarios_2_0= ruleScenario ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIF22.g:119:4: (lv_scenarios_2_0= ruleScenario )
            	    {
            	    // InternalIF22.g:119:4: (lv_scenarios_2_0= ruleScenario )
            	    // InternalIF22.g:120:5: lv_scenarios_2_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_scenarios_2_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_2_0,
            	    						"dk.sdu.frhou18.mdsd.IF22.Scenario");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunction"
    // InternalIF22.g:141:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalIF22.g:141:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalIF22.g:142:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalIF22.g:148:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:154:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) ) )
            // InternalIF22.g:155:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) )
            {
            // InternalIF22.g:155:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) )
            // InternalIF22.g:156:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalIF22.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIF22.g:182:3: ( ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=43 && LA4_0<=45)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIF22.g:183:4: ( (lv_parameters_3_0= ruleTypeUsage ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )*
                    {
                    // InternalIF22.g:183:4: ( (lv_parameters_3_0= ruleTypeUsage ) )
                    // InternalIF22.g:184:5: (lv_parameters_3_0= ruleTypeUsage )
                    {
                    // InternalIF22.g:184:5: (lv_parameters_3_0= ruleTypeUsage )
                    // InternalIF22.g:185:6: lv_parameters_3_0= ruleTypeUsage
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getParametersTypeUsageParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleTypeUsage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"dk.sdu.frhou18.mdsd.IF22.TypeUsage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIF22.g:202:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIF22.g:203:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleTypeUsage ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalIF22.g:207:5: ( (lv_parameters_5_0= ruleTypeUsage ) )
                    	    // InternalIF22.g:208:6: (lv_parameters_5_0= ruleTypeUsage )
                    	    {
                    	    // InternalIF22.g:208:6: (lv_parameters_5_0= ruleTypeUsage )
                    	    // InternalIF22.g:209:7: lv_parameters_5_0= ruleTypeUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParametersTypeUsageParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleTypeUsage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"dk.sdu.frhou18.mdsd.IF22.TypeUsage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_5());
            		
            // InternalIF22.g:236:3: ( (lv_type_8_0= ruleType ) )
            // InternalIF22.g:237:4: (lv_type_8_0= ruleType )
            {
            // InternalIF22.g:237:4: (lv_type_8_0= ruleType )
            // InternalIF22.g:238:5: lv_type_8_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getTypeTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"dk.sdu.frhou18.mdsd.IF22.Type");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleStory"
    // InternalIF22.g:259:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalIF22.g:259:46: (iv_ruleStory= ruleStory EOF )
            // InternalIF22.g:260:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
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
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalIF22.g:266:1: ruleStory returns [EObject current=null] : (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIF22.g:272:2: ( (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIF22.g:273:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIF22.g:273:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIF22.g:274:3: otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getStoryKeyword_0());
            		
            // InternalIF22.g:278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:279:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryRule());
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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleScenario"
    // InternalIF22.g:300:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalIF22.g:300:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalIF22.g:301:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalIF22.g:307:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariableDef ) )* ( (lv_statemens_4_0= ruleStatement ) )* otherlv_5= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_variables_3_0 = null;

        EObject lv_statemens_4_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:313:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariableDef ) )* ( (lv_statemens_4_0= ruleStatement ) )* otherlv_5= '}' ) )
            // InternalIF22.g:314:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariableDef ) )* ( (lv_statemens_4_0= ruleStatement ) )* otherlv_5= '}' )
            {
            // InternalIF22.g:314:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariableDef ) )* ( (lv_statemens_4_0= ruleStatement ) )* otherlv_5= '}' )
            // InternalIF22.g:315:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariableDef ) )* ( (lv_statemens_4_0= ruleStatement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalIF22.g:319:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:320:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:320:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:321:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIF22.g:341:3: ( (lv_variables_3_0= ruleVariableDef ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIF22.g:342:4: (lv_variables_3_0= ruleVariableDef )
            	    {
            	    // InternalIF22.g:342:4: (lv_variables_3_0= ruleVariableDef )
            	    // InternalIF22.g:343:5: lv_variables_3_0= ruleVariableDef
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getVariablesVariableDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_variables_3_0=ruleVariableDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"dk.sdu.frhou18.mdsd.IF22.VariableDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalIF22.g:360:3: ( (lv_statemens_4_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIF22.g:361:4: (lv_statemens_4_0= ruleStatement )
            	    {
            	    // InternalIF22.g:361:4: (lv_statemens_4_0= ruleStatement )
            	    // InternalIF22.g:362:5: lv_statemens_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatemensStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statemens_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statemens",
            	    						lv_statemens_4_0,
            	    						"dk.sdu.frhou18.mdsd.IF22.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStatement"
    // InternalIF22.g:387:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalIF22.g:387:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalIF22.g:388:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalIF22.g:394:1: ruleStatement returns [EObject current=null] : (this_End_0= ruleEnd | this_Announce_1= ruleAnnounce | this_Question_2= ruleQuestion ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_End_0 = null;

        EObject this_Announce_1 = null;

        EObject this_Question_2 = null;



        	enterRule();

        try {
            // InternalIF22.g:400:2: ( (this_End_0= ruleEnd | this_Announce_1= ruleAnnounce | this_Question_2= ruleQuestion ) )
            // InternalIF22.g:401:2: (this_End_0= ruleEnd | this_Announce_1= ruleAnnounce | this_Question_2= ruleQuestion )
            {
            // InternalIF22.g:401:2: (this_End_0= ruleEnd | this_Announce_1= ruleAnnounce | this_Question_2= ruleQuestion )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIF22.g:402:3: this_End_0= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_0=ruleEnd();

                    state._fsp--;


                    			current = this_End_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIF22.g:411:3: this_Announce_1= ruleAnnounce
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAnnounceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Announce_1=ruleAnnounce();

                    state._fsp--;


                    			current = this_Announce_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIF22.g:420:3: this_Question_2= ruleQuestion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getQuestionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Question_2=ruleQuestion();

                    state._fsp--;


                    			current = this_Question_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEnd"
    // InternalIF22.g:432:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalIF22.g:432:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalIF22.g:433:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalIF22.g:439:1: ruleEnd returns [EObject current=null] : (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_endMessage_2_0= ruleLogicExp ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_endMessage_2_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:445:2: ( (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_endMessage_2_0= ruleLogicExp ) ) ) )
            // InternalIF22.g:446:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_endMessage_2_0= ruleLogicExp ) ) )
            {
            // InternalIF22.g:446:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_endMessage_2_0= ruleLogicExp ) ) )
            // InternalIF22.g:447:3: otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_endMessage_2_0= ruleLogicExp ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
            		
            // InternalIF22.g:451:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:452:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:452:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:453:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIF22.g:469:3: ( (lv_endMessage_2_0= ruleLogicExp ) )
            // InternalIF22.g:470:4: (lv_endMessage_2_0= ruleLogicExp )
            {
            // InternalIF22.g:470:4: (lv_endMessage_2_0= ruleLogicExp )
            // InternalIF22.g:471:5: lv_endMessage_2_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getEndAccess().getEndMessageLogicExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_endMessage_2_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"endMessage",
            						lv_endMessage_2_0,
            						"dk.sdu.frhou18.mdsd.IF22.LogicExp");
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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleAnnounce"
    // InternalIF22.g:492:1: entryRuleAnnounce returns [EObject current=null] : iv_ruleAnnounce= ruleAnnounce EOF ;
    public final EObject entryRuleAnnounce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnounce = null;


        try {
            // InternalIF22.g:492:49: (iv_ruleAnnounce= ruleAnnounce EOF )
            // InternalIF22.g:493:2: iv_ruleAnnounce= ruleAnnounce EOF
            {
             newCompositeNode(grammarAccess.getAnnounceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnounce=ruleAnnounce();

            state._fsp--;

             current =iv_ruleAnnounce; 
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
    // $ANTLR end "entryRuleAnnounce"


    // $ANTLR start "ruleAnnounce"
    // InternalIF22.g:499:1: ruleAnnounce returns [EObject current=null] : (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) ( (lv_target_3_0= ruleTarget ) ) ) ;
    public final EObject ruleAnnounce() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_text_2_0 = null;

        EObject lv_target_3_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:505:2: ( (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) ( (lv_target_3_0= ruleTarget ) ) ) )
            // InternalIF22.g:506:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) ( (lv_target_3_0= ruleTarget ) ) )
            {
            // InternalIF22.g:506:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) ( (lv_target_3_0= ruleTarget ) ) )
            // InternalIF22.g:507:3: otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) ( (lv_target_3_0= ruleTarget ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnounceAccess().getAnnounceKeyword_0());
            		
            // InternalIF22.g:511:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:512:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:512:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:513:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnounceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnounceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIF22.g:529:3: ( (lv_text_2_0= ruleLogicExp ) )
            // InternalIF22.g:530:4: (lv_text_2_0= ruleLogicExp )
            {
            // InternalIF22.g:530:4: (lv_text_2_0= ruleLogicExp )
            // InternalIF22.g:531:5: lv_text_2_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getAnnounceAccess().getTextLogicExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_text_2_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnounceRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"dk.sdu.frhou18.mdsd.IF22.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIF22.g:548:3: ( (lv_target_3_0= ruleTarget ) )
            // InternalIF22.g:549:4: (lv_target_3_0= ruleTarget )
            {
            // InternalIF22.g:549:4: (lv_target_3_0= ruleTarget )
            // InternalIF22.g:550:5: lv_target_3_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getAnnounceAccess().getTargetTargetParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_3_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnounceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_3_0,
            						"dk.sdu.frhou18.mdsd.IF22.Target");
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
    // $ANTLR end "ruleAnnounce"


    // $ANTLR start "entryRuleQuestion"
    // InternalIF22.g:571:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalIF22.g:571:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalIF22.g:572:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalIF22.g:578:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) otherlv_3= 'as' ( (lv_asValue_4_0= ruleLogicExp ) ) (otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_text_2_0 = null;

        EObject lv_asValue_4_0 = null;

        EObject lv_inVar_6_0 = null;

        EObject lv_targets_7_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:584:2: ( (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) otherlv_3= 'as' ( (lv_asValue_4_0= ruleLogicExp ) ) (otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ ) )
            // InternalIF22.g:585:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) otherlv_3= 'as' ( (lv_asValue_4_0= ruleLogicExp ) ) (otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ )
            {
            // InternalIF22.g:585:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) otherlv_3= 'as' ( (lv_asValue_4_0= ruleLogicExp ) ) (otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ )
            // InternalIF22.g:586:3: otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleLogicExp ) ) otherlv_3= 'as' ( (lv_asValue_4_0= ruleLogicExp ) ) (otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) ) )? ( (lv_targets_7_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalIF22.g:590:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:591:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:591:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:592:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIF22.g:608:3: ( (lv_text_2_0= ruleLogicExp ) )
            // InternalIF22.g:609:4: (lv_text_2_0= ruleLogicExp )
            {
            // InternalIF22.g:609:4: (lv_text_2_0= ruleLogicExp )
            // InternalIF22.g:610:5: lv_text_2_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getTextLogicExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_text_2_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"dk.sdu.frhou18.mdsd.IF22.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getAsKeyword_3());
            		
            // InternalIF22.g:631:3: ( (lv_asValue_4_0= ruleLogicExp ) )
            // InternalIF22.g:632:4: (lv_asValue_4_0= ruleLogicExp )
            {
            // InternalIF22.g:632:4: (lv_asValue_4_0= ruleLogicExp )
            // InternalIF22.g:633:5: lv_asValue_4_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getAsValueLogicExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_asValue_4_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"asValue",
            						lv_asValue_4_0,
            						"dk.sdu.frhou18.mdsd.IF22.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIF22.g:650:3: (otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIF22.g:651:4: otherlv_5= 'in' ( (lv_inVar_6_0= ruleVarUse ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getInKeyword_5_0());
                    			
                    // InternalIF22.g:655:4: ( (lv_inVar_6_0= ruleVarUse ) )
                    // InternalIF22.g:656:5: (lv_inVar_6_0= ruleVarUse )
                    {
                    // InternalIF22.g:656:5: (lv_inVar_6_0= ruleVarUse )
                    // InternalIF22.g:657:6: lv_inVar_6_0= ruleVarUse
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getInVarVarUseParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_inVar_6_0=ruleVarUse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"inVar",
                    							lv_inVar_6_0,
                    							"dk.sdu.frhou18.mdsd.IF22.VarUse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIF22.g:675:3: ( (lv_targets_7_0= ruleTarget ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIF22.g:676:4: (lv_targets_7_0= ruleTarget )
            	    {
            	    // InternalIF22.g:676:4: (lv_targets_7_0= ruleTarget )
            	    // InternalIF22.g:677:5: lv_targets_7_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getTargetsTargetParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_targets_7_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_7_0,
            	    						"dk.sdu.frhou18.mdsd.IF22.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleVariableDef"
    // InternalIF22.g:698:1: entryRuleVariableDef returns [EObject current=null] : iv_ruleVariableDef= ruleVariableDef EOF ;
    public final EObject entryRuleVariableDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDef = null;


        try {
            // InternalIF22.g:698:52: (iv_ruleVariableDef= ruleVariableDef EOF )
            // InternalIF22.g:699:2: iv_ruleVariableDef= ruleVariableDef EOF
            {
             newCompositeNode(grammarAccess.getVariableDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDef=ruleVariableDef();

            state._fsp--;

             current =iv_ruleVariableDef; 
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
    // $ANTLR end "entryRuleVariableDef"


    // $ANTLR start "ruleVariableDef"
    // InternalIF22.g:705:1: ruleVariableDef returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleVariableDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:711:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalIF22.g:712:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalIF22.g:712:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalIF22.g:713:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDefAccess().getVarKeyword_0());
            		
            // InternalIF22.g:717:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIF22.g:718:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIF22.g:718:4: (lv_name_1_0= RULE_ID )
            // InternalIF22.g:719:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDefAccess().getColonKeyword_2());
            		
            // InternalIF22.g:739:3: ( (lv_type_3_0= ruleType ) )
            // InternalIF22.g:740:4: (lv_type_3_0= ruleType )
            {
            // InternalIF22.g:740:4: (lv_type_3_0= ruleType )
            // InternalIF22.g:741:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableDefAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"dk.sdu.frhou18.mdsd.IF22.Type");
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
    // $ANTLR end "ruleVariableDef"


    // $ANTLR start "entryRuleTarget"
    // InternalIF22.g:762:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalIF22.g:762:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalIF22.g:763:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalIF22.g:769:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) ) )? ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_logic_3_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:775:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) ) )? ) )
            // InternalIF22.g:776:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) ) )? )
            {
            // InternalIF22.g:776:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) ) )? )
            // InternalIF22.g:777:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
            		
            // InternalIF22.g:781:3: ( (otherlv_1= RULE_ID ) )
            // InternalIF22.g:782:4: (otherlv_1= RULE_ID )
            {
            // InternalIF22.g:782:4: (otherlv_1= RULE_ID )
            // InternalIF22.g:783:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getTargetTargetTargetCrossReference_1_0());
            				

            }


            }

            // InternalIF22.g:794:3: (otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIF22.g:795:4: otherlv_2= 'if' ( (lv_logic_3_0= ruleLogicExp ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getIfKeyword_2_0());
                    			
                    // InternalIF22.g:799:4: ( (lv_logic_3_0= ruleLogicExp ) )
                    // InternalIF22.g:800:5: (lv_logic_3_0= ruleLogicExp )
                    {
                    // InternalIF22.g:800:5: (lv_logic_3_0= ruleLogicExp )
                    // InternalIF22.g:801:6: lv_logic_3_0= ruleLogicExp
                    {

                    						newCompositeNode(grammarAccess.getTargetAccess().getLogicLogicExpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_logic_3_0=ruleLogicExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTargetRule());
                    						}
                    						set(
                    							current,
                    							"logic",
                    							lv_logic_3_0,
                    							"dk.sdu.frhou18.mdsd.IF22.LogicExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleThis"
    // InternalIF22.g:823:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // InternalIF22.g:823:45: (iv_ruleThis= ruleThis EOF )
            // InternalIF22.g:824:2: iv_ruleThis= ruleThis EOF
            {
             newCompositeNode(grammarAccess.getThisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThis=ruleThis();

            state._fsp--;

             current =iv_ruleThis; 
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
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // InternalIF22.g:830:1: ruleThis returns [EObject current=null] : ( () otherlv_1= 'this' ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalIF22.g:836:2: ( ( () otherlv_1= 'this' ) )
            // InternalIF22.g:837:2: ( () otherlv_1= 'this' )
            {
            // InternalIF22.g:837:2: ( () otherlv_1= 'this' )
            // InternalIF22.g:838:3: () otherlv_1= 'this'
            {
            // InternalIF22.g:838:3: ()
            // InternalIF22.g:839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThisAccess().getThisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getThisAccess().getThisKeyword_1());
            		

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
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleLogicExp"
    // InternalIF22.g:853:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalIF22.g:853:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalIF22.g:854:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
             newCompositeNode(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;

             current =iv_ruleLogicExp; 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalIF22.g:860:1: ruleLogicExp returns [EObject current=null] : (this_LogicAndOR_0= ruleLogicAndOR ( ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) ) )* ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_LogicAndOR_0 = null;

        EObject lv_right_13_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:866:2: ( (this_LogicAndOR_0= ruleLogicAndOR ( ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) ) )* ) )
            // InternalIF22.g:867:2: (this_LogicAndOR_0= ruleLogicAndOR ( ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) ) )* )
            {
            // InternalIF22.g:867:2: (this_LogicAndOR_0= ruleLogicAndOR ( ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) ) )* )
            // InternalIF22.g:868:3: this_LogicAndOR_0= ruleLogicAndOR ( ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicExpAccess().getLogicAndORParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_LogicAndOR_0=ruleLogicAndOR();

            state._fsp--;


            			current = this_LogicAndOR_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIF22.g:876:3: ( ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=29 && LA12_0<=34)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIF22.g:877:4: ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) ) ( (lv_right_13_0= ruleLogicAndOR ) )
            	    {
            	    // InternalIF22.g:877:4: ( (otherlv_1= '==' () ) | (otherlv_3= '!=' () ) | (otherlv_5= '<' () ) | (otherlv_7= '>' () ) | (otherlv_9= '<=' () ) | (otherlv_11= '>=' () ) )
            	    int alt11=6;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt11=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalIF22.g:878:5: (otherlv_1= '==' () )
            	            {
            	            // InternalIF22.g:878:5: (otherlv_1= '==' () )
            	            // InternalIF22.g:879:6: otherlv_1= '==' ()
            	            {
            	            otherlv_1=(Token)match(input,29,FOLLOW_14); 

            	            						newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getEqualsSignEqualsSignKeyword_1_0_0_0());
            	            					
            	            // InternalIF22.g:883:6: ()
            	            // InternalIF22.g:884:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicExpAccess().getEqualsLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIF22.g:892:5: (otherlv_3= '!=' () )
            	            {
            	            // InternalIF22.g:892:5: (otherlv_3= '!=' () )
            	            // InternalIF22.g:893:6: otherlv_3= '!=' ()
            	            {
            	            otherlv_3=(Token)match(input,30,FOLLOW_14); 

            	            						newLeafNode(otherlv_3, grammarAccess.getLogicExpAccess().getExclamationMarkEqualsSignKeyword_1_0_1_0());
            	            					
            	            // InternalIF22.g:897:6: ()
            	            // InternalIF22.g:898:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicExpAccess().getNotEqualsLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalIF22.g:906:5: (otherlv_5= '<' () )
            	            {
            	            // InternalIF22.g:906:5: (otherlv_5= '<' () )
            	            // InternalIF22.g:907:6: otherlv_5= '<' ()
            	            {
            	            otherlv_5=(Token)match(input,31,FOLLOW_14); 

            	            						newLeafNode(otherlv_5, grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_0_2_0());
            	            					
            	            // InternalIF22.g:911:6: ()
            	            // InternalIF22.g:912:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicExpAccess().getLessLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalIF22.g:920:5: (otherlv_7= '>' () )
            	            {
            	            // InternalIF22.g:920:5: (otherlv_7= '>' () )
            	            // InternalIF22.g:921:6: otherlv_7= '>' ()
            	            {
            	            otherlv_7=(Token)match(input,32,FOLLOW_14); 

            	            						newLeafNode(otherlv_7, grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_0_3_0());
            	            					
            	            // InternalIF22.g:925:6: ()
            	            // InternalIF22.g:926:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicExpAccess().getGreaterLeftAction_1_0_3_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalIF22.g:934:5: (otherlv_9= '<=' () )
            	            {
            	            // InternalIF22.g:934:5: (otherlv_9= '<=' () )
            	            // InternalIF22.g:935:6: otherlv_9= '<=' ()
            	            {
            	            otherlv_9=(Token)match(input,33,FOLLOW_14); 

            	            						newLeafNode(otherlv_9, grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_0_4_0());
            	            					
            	            // InternalIF22.g:939:6: ()
            	            // InternalIF22.g:940:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicExpAccess().getLessOrEqualsLeftAction_1_0_4_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalIF22.g:948:5: (otherlv_11= '>=' () )
            	            {
            	            // InternalIF22.g:948:5: (otherlv_11= '>=' () )
            	            // InternalIF22.g:949:6: otherlv_11= '>=' ()
            	            {
            	            otherlv_11=(Token)match(input,34,FOLLOW_14); 

            	            						newLeafNode(otherlv_11, grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_0_5_0());
            	            					
            	            // InternalIF22.g:953:6: ()
            	            // InternalIF22.g:954:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicExpAccess().getGreaterOrEqualsLeftAction_1_0_5_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalIF22.g:962:4: ( (lv_right_13_0= ruleLogicAndOR ) )
            	    // InternalIF22.g:963:5: (lv_right_13_0= ruleLogicAndOR )
            	    {
            	    // InternalIF22.g:963:5: (lv_right_13_0= ruleLogicAndOR )
            	    // InternalIF22.g:964:6: lv_right_13_0= ruleLogicAndOR
            	    {

            	    						newCompositeNode(grammarAccess.getLogicExpAccess().getRightLogicAndORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_13_0=ruleLogicAndOR();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_13_0,
            	    							"dk.sdu.frhou18.mdsd.IF22.LogicAndOR");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleLogicAndOR"
    // InternalIF22.g:986:1: entryRuleLogicAndOR returns [EObject current=null] : iv_ruleLogicAndOR= ruleLogicAndOR EOF ;
    public final EObject entryRuleLogicAndOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicAndOR = null;


        try {
            // InternalIF22.g:986:51: (iv_ruleLogicAndOR= ruleLogicAndOR EOF )
            // InternalIF22.g:987:2: iv_ruleLogicAndOR= ruleLogicAndOR EOF
            {
             newCompositeNode(grammarAccess.getLogicAndORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicAndOR=ruleLogicAndOR();

            state._fsp--;

             current =iv_ruleLogicAndOR; 
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
    // $ANTLR end "entryRuleLogicAndOR"


    // $ANTLR start "ruleLogicAndOR"
    // InternalIF22.g:993:1: ruleLogicAndOR returns [EObject current=null] : (this_MathExp_0= ruleMathExp ( ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) ) )* ) ;
    public final EObject ruleLogicAndOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MathExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:999:2: ( (this_MathExp_0= ruleMathExp ( ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) ) )* ) )
            // InternalIF22.g:1000:2: (this_MathExp_0= ruleMathExp ( ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) ) )* )
            {
            // InternalIF22.g:1000:2: (this_MathExp_0= ruleMathExp ( ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) ) )* )
            // InternalIF22.g:1001:3: this_MathExp_0= ruleMathExp ( ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicAndORAccess().getMathExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MathExp_0=ruleMathExp();

            state._fsp--;


            			current = this_MathExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIF22.g:1009:3: ( ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIF22.g:1010:4: ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) ) ( (lv_right_5_0= ruleMathExp ) )
            	    {
            	    // InternalIF22.g:1010:4: ( (otherlv_1= '&&' () ) | (otherlv_3= '||' () ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==35) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==36) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalIF22.g:1011:5: (otherlv_1= '&&' () )
            	            {
            	            // InternalIF22.g:1011:5: (otherlv_1= '&&' () )
            	            // InternalIF22.g:1012:6: otherlv_1= '&&' ()
            	            {
            	            otherlv_1=(Token)match(input,35,FOLLOW_14); 

            	            						newLeafNode(otherlv_1, grammarAccess.getLogicAndORAccess().getAmpersandAmpersandKeyword_1_0_0_0());
            	            					
            	            // InternalIF22.g:1016:6: ()
            	            // InternalIF22.g:1017:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicAndORAccess().getAndLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIF22.g:1025:5: (otherlv_3= '||' () )
            	            {
            	            // InternalIF22.g:1025:5: (otherlv_3= '||' () )
            	            // InternalIF22.g:1026:6: otherlv_3= '||' ()
            	            {
            	            otherlv_3=(Token)match(input,36,FOLLOW_14); 

            	            						newLeafNode(otherlv_3, grammarAccess.getLogicAndORAccess().getVerticalLineVerticalLineKeyword_1_0_1_0());
            	            					
            	            // InternalIF22.g:1030:6: ()
            	            // InternalIF22.g:1031:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogicAndORAccess().getOrLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalIF22.g:1039:4: ( (lv_right_5_0= ruleMathExp ) )
            	    // InternalIF22.g:1040:5: (lv_right_5_0= ruleMathExp )
            	    {
            	    // InternalIF22.g:1040:5: (lv_right_5_0= ruleMathExp )
            	    // InternalIF22.g:1041:6: lv_right_5_0= ruleMathExp
            	    {

            	    						newCompositeNode(grammarAccess.getLogicAndORAccess().getRightMathExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_5_0=ruleMathExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicAndORRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.frhou18.mdsd.IF22.MathExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleLogicAndOR"


    // $ANTLR start "entryRuleLogicNot"
    // InternalIF22.g:1063:1: entryRuleLogicNot returns [EObject current=null] : iv_ruleLogicNot= ruleLogicNot EOF ;
    public final EObject entryRuleLogicNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicNot = null;


        try {
            // InternalIF22.g:1063:49: (iv_ruleLogicNot= ruleLogicNot EOF )
            // InternalIF22.g:1064:2: iv_ruleLogicNot= ruleLogicNot EOF
            {
             newCompositeNode(grammarAccess.getLogicNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicNot=ruleLogicNot();

            state._fsp--;

             current =iv_ruleLogicNot; 
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
    // $ANTLR end "entryRuleLogicNot"


    // $ANTLR start "ruleLogicNot"
    // InternalIF22.g:1070:1: ruleLogicNot returns [EObject current=null] : ( () otherlv_1= '!' ( (lv_ref_2_0= rulePrimary ) ) ) ;
    public final EObject ruleLogicNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1076:2: ( ( () otherlv_1= '!' ( (lv_ref_2_0= rulePrimary ) ) ) )
            // InternalIF22.g:1077:2: ( () otherlv_1= '!' ( (lv_ref_2_0= rulePrimary ) ) )
            {
            // InternalIF22.g:1077:2: ( () otherlv_1= '!' ( (lv_ref_2_0= rulePrimary ) ) )
            // InternalIF22.g:1078:3: () otherlv_1= '!' ( (lv_ref_2_0= rulePrimary ) )
            {
            // InternalIF22.g:1078:3: ()
            // InternalIF22.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogicNotAccess().getLogicNotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicNotAccess().getExclamationMarkKeyword_1());
            		
            // InternalIF22.g:1089:3: ( (lv_ref_2_0= rulePrimary ) )
            // InternalIF22.g:1090:4: (lv_ref_2_0= rulePrimary )
            {
            // InternalIF22.g:1090:4: (lv_ref_2_0= rulePrimary )
            // InternalIF22.g:1091:5: lv_ref_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLogicNotAccess().getRefPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicNotRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_2_0,
            						"dk.sdu.frhou18.mdsd.IF22.Primary");
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
    // $ANTLR end "ruleLogicNot"


    // $ANTLR start "entryRuleParentheses"
    // InternalIF22.g:1112:1: entryRuleParentheses returns [EObject current=null] : iv_ruleParentheses= ruleParentheses EOF ;
    public final EObject entryRuleParentheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentheses = null;


        try {
            // InternalIF22.g:1112:52: (iv_ruleParentheses= ruleParentheses EOF )
            // InternalIF22.g:1113:2: iv_ruleParentheses= ruleParentheses EOF
            {
             newCompositeNode(grammarAccess.getParenthesesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParentheses=ruleParentheses();

            state._fsp--;

             current =iv_ruleParentheses; 
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
    // $ANTLR end "entryRuleParentheses"


    // $ANTLR start "ruleParentheses"
    // InternalIF22.g:1119:1: ruleParentheses returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_ref_2_0= ruleLogicExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParentheses() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1125:2: ( ( () otherlv_1= '(' ( (lv_ref_2_0= ruleLogicExp ) ) otherlv_3= ')' ) )
            // InternalIF22.g:1126:2: ( () otherlv_1= '(' ( (lv_ref_2_0= ruleLogicExp ) ) otherlv_3= ')' )
            {
            // InternalIF22.g:1126:2: ( () otherlv_1= '(' ( (lv_ref_2_0= ruleLogicExp ) ) otherlv_3= ')' )
            // InternalIF22.g:1127:3: () otherlv_1= '(' ( (lv_ref_2_0= ruleLogicExp ) ) otherlv_3= ')'
            {
            // InternalIF22.g:1127:3: ()
            // InternalIF22.g:1128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesesAccess().getParenthesesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIF22.g:1138:3: ( (lv_ref_2_0= ruleLogicExp ) )
            // InternalIF22.g:1139:4: (lv_ref_2_0= ruleLogicExp )
            {
            // InternalIF22.g:1139:4: (lv_ref_2_0= ruleLogicExp )
            // InternalIF22.g:1140:5: lv_ref_2_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getParenthesesAccess().getRefLogicExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_ref_2_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesesRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_2_0,
            						"dk.sdu.frhou18.mdsd.IF22.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesesAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParentheses"


    // $ANTLR start "entryRuleBoolean"
    // InternalIF22.g:1165:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalIF22.g:1165:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalIF22.g:1166:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalIF22.g:1172:1: ruleBoolean returns [EObject current=null] : ( () ( (lv_val_1_0= ruleBooleanValue ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Enumerator lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1178:2: ( ( () ( (lv_val_1_0= ruleBooleanValue ) ) ) )
            // InternalIF22.g:1179:2: ( () ( (lv_val_1_0= ruleBooleanValue ) ) )
            {
            // InternalIF22.g:1179:2: ( () ( (lv_val_1_0= ruleBooleanValue ) ) )
            // InternalIF22.g:1180:3: () ( (lv_val_1_0= ruleBooleanValue ) )
            {
            // InternalIF22.g:1180:3: ()
            // InternalIF22.g:1181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalIF22.g:1187:3: ( (lv_val_1_0= ruleBooleanValue ) )
            // InternalIF22.g:1188:4: (lv_val_1_0= ruleBooleanValue )
            {
            // InternalIF22.g:1188:4: (lv_val_1_0= ruleBooleanValue )
            // InternalIF22.g:1189:5: lv_val_1_0= ruleBooleanValue
            {

            					newCompositeNode(grammarAccess.getBooleanAccess().getValBooleanValueEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleBooleanValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"dk.sdu.frhou18.mdsd.IF22.BooleanValue");
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleMathExp"
    // InternalIF22.g:1210:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalIF22.g:1210:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalIF22.g:1211:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalIF22.g:1217:1: ruleMathExp returns [EObject current=null] : (this_MultDivMathExp_0= ruleMultDivMathExp ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MultDivMathExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1223:2: ( (this_MultDivMathExp_0= ruleMultDivMathExp ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) ) )* ) )
            // InternalIF22.g:1224:2: (this_MultDivMathExp_0= ruleMultDivMathExp ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) ) )* )
            {
            // InternalIF22.g:1224:2: (this_MultDivMathExp_0= ruleMultDivMathExp ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) ) )* )
            // InternalIF22.g:1225:3: this_MultDivMathExp_0= ruleMultDivMathExp ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMathExpAccess().getMultDivMathExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_MultDivMathExp_0=ruleMultDivMathExp();

            state._fsp--;


            			current = this_MultDivMathExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIF22.g:1233:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=38 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIF22.g:1234:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultDivMathExp ) )
            	    {
            	    // InternalIF22.g:1234:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==38) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==39) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalIF22.g:1235:5: (otherlv_1= '+' () )
            	            {
            	            // InternalIF22.g:1235:5: (otherlv_1= '+' () )
            	            // InternalIF22.g:1236:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,38,FOLLOW_14); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalIF22.g:1240:6: ()
            	            // InternalIF22.g:1241:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMathExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIF22.g:1249:5: (otherlv_3= '-' () )
            	            {
            	            // InternalIF22.g:1249:5: (otherlv_3= '-' () )
            	            // InternalIF22.g:1250:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,39,FOLLOW_14); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMathExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalIF22.g:1254:6: ()
            	            // InternalIF22.g:1255:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMathExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalIF22.g:1263:4: ( (lv_right_5_0= ruleMultDivMathExp ) )
            	    // InternalIF22.g:1264:5: (lv_right_5_0= ruleMultDivMathExp )
            	    {
            	    // InternalIF22.g:1264:5: (lv_right_5_0= ruleMultDivMathExp )
            	    // InternalIF22.g:1265:6: lv_right_5_0= ruleMultDivMathExp
            	    {

            	    						newCompositeNode(grammarAccess.getMathExpAccess().getRightMultDivMathExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_5_0=ruleMultDivMathExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.frhou18.mdsd.IF22.MultDivMathExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleMultDivMathExp"
    // InternalIF22.g:1287:1: entryRuleMultDivMathExp returns [EObject current=null] : iv_ruleMultDivMathExp= ruleMultDivMathExp EOF ;
    public final EObject entryRuleMultDivMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDivMathExp = null;


        try {
            // InternalIF22.g:1287:55: (iv_ruleMultDivMathExp= ruleMultDivMathExp EOF )
            // InternalIF22.g:1288:2: iv_ruleMultDivMathExp= ruleMultDivMathExp EOF
            {
             newCompositeNode(grammarAccess.getMultDivMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultDivMathExp=ruleMultDivMathExp();

            state._fsp--;

             current =iv_ruleMultDivMathExp; 
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
    // $ANTLR end "entryRuleMultDivMathExp"


    // $ANTLR start "ruleMultDivMathExp"
    // InternalIF22.g:1294:1: ruleMultDivMathExp returns [EObject current=null] : (this_TextExp_0= ruleTextExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) ) )* ) ;
    public final EObject ruleMultDivMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TextExp_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1300:2: ( (this_TextExp_0= ruleTextExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) ) )* ) )
            // InternalIF22.g:1301:2: (this_TextExp_0= ruleTextExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) ) )* )
            {
            // InternalIF22.g:1301:2: (this_TextExp_0= ruleTextExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) ) )* )
            // InternalIF22.g:1302:3: this_TextExp_0= ruleTextExp ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultDivMathExpAccess().getTextExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_TextExp_0=ruleTextExp();

            state._fsp--;


            			current = this_TextExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIF22.g:1310:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=40 && LA18_0<=41)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIF22.g:1311:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleTextExp ) )
            	    {
            	    // InternalIF22.g:1311:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==40) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==41) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalIF22.g:1312:5: (otherlv_1= '*' () )
            	            {
            	            // InternalIF22.g:1312:5: (otherlv_1= '*' () )
            	            // InternalIF22.g:1313:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,40,FOLLOW_14); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultDivMathExpAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalIF22.g:1317:6: ()
            	            // InternalIF22.g:1318:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultDivMathExpAccess().getMultiplicationLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIF22.g:1326:5: (otherlv_3= '/' () )
            	            {
            	            // InternalIF22.g:1326:5: (otherlv_3= '/' () )
            	            // InternalIF22.g:1327:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,41,FOLLOW_14); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultDivMathExpAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalIF22.g:1331:6: ()
            	            // InternalIF22.g:1332:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultDivMathExpAccess().getDivisionLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalIF22.g:1340:4: ( (lv_right_5_0= ruleTextExp ) )
            	    // InternalIF22.g:1341:5: (lv_right_5_0= ruleTextExp )
            	    {
            	    // InternalIF22.g:1341:5: (lv_right_5_0= ruleTextExp )
            	    // InternalIF22.g:1342:6: lv_right_5_0= ruleTextExp
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivMathExpAccess().getRightTextExpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_5_0=ruleTextExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivMathExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.frhou18.mdsd.IF22.TextExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleMultDivMathExp"


    // $ANTLR start "entryRuleMathNumberExp"
    // InternalIF22.g:1364:1: entryRuleMathNumberExp returns [EObject current=null] : iv_ruleMathNumberExp= ruleMathNumberExp EOF ;
    public final EObject entryRuleMathNumberExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathNumberExp = null;


        try {
            // InternalIF22.g:1364:54: (iv_ruleMathNumberExp= ruleMathNumberExp EOF )
            // InternalIF22.g:1365:2: iv_ruleMathNumberExp= ruleMathNumberExp EOF
            {
             newCompositeNode(grammarAccess.getMathNumberExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathNumberExp=ruleMathNumberExp();

            state._fsp--;

             current =iv_ruleMathNumberExp; 
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
    // $ANTLR end "entryRuleMathNumberExp"


    // $ANTLR start "ruleMathNumberExp"
    // InternalIF22.g:1371:1: ruleMathNumberExp returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMathNumberExp() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalIF22.g:1377:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalIF22.g:1378:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalIF22.g:1378:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalIF22.g:1379:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalIF22.g:1379:3: ()
            // InternalIF22.g:1380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMathNumberExpAccess().getMathNumberExpAction_0(),
            					current);
            			

            }

            // InternalIF22.g:1386:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalIF22.g:1387:4: (lv_value_1_0= RULE_INT )
            {
            // InternalIF22.g:1387:4: (lv_value_1_0= RULE_INT )
            // InternalIF22.g:1388:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getMathNumberExpAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathNumberExpRule());
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
    // $ANTLR end "ruleMathNumberExp"


    // $ANTLR start "entryRuleTextExp"
    // InternalIF22.g:1408:1: entryRuleTextExp returns [EObject current=null] : iv_ruleTextExp= ruleTextExp EOF ;
    public final EObject entryRuleTextExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExp = null;


        try {
            // InternalIF22.g:1408:48: (iv_ruleTextExp= ruleTextExp EOF )
            // InternalIF22.g:1409:2: iv_ruleTextExp= ruleTextExp EOF
            {
             newCompositeNode(grammarAccess.getTextExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextExp=ruleTextExp();

            state._fsp--;

             current =iv_ruleTextExp; 
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
    // $ANTLR end "entryRuleTextExp"


    // $ANTLR start "ruleTextExp"
    // InternalIF22.g:1415:1: ruleTextExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleTextExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1421:2: ( (this_Primary_0= rulePrimary ( (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalIF22.g:1422:2: (this_Primary_0= rulePrimary ( (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalIF22.g:1422:2: (this_Primary_0= rulePrimary ( (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalIF22.g:1423:3: this_Primary_0= rulePrimary ( (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getTextExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIF22.g:1431:3: ( (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIF22.g:1432:4: (otherlv_1= '&' () ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalIF22.g:1432:4: (otherlv_1= '&' () )
            	    // InternalIF22.g:1433:5: otherlv_1= '&' ()
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_14); 

            	    					newLeafNode(otherlv_1, grammarAccess.getTextExpAccess().getAmpersandKeyword_1_0_0());
            	    				
            	    // InternalIF22.g:1437:5: ()
            	    // InternalIF22.g:1438:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTextExpAccess().getTextExpLeftAction_1_0_1(),
            	    							current);
            	    					

            	    }


            	    }

            	    // InternalIF22.g:1445:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalIF22.g:1446:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalIF22.g:1446:5: (lv_right_3_0= rulePrimary )
            	    // InternalIF22.g:1447:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getTextExpAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTextExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.frhou18.mdsd.IF22.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleTextExp"


    // $ANTLR start "entryRulePrimary"
    // InternalIF22.g:1469:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIF22.g:1469:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIF22.g:1470:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalIF22.g:1476:1: rulePrimary returns [EObject current=null] : (this_FunctionUsage_0= ruleFunctionUsage | this_LogicNot_1= ruleLogicNot | this_Boolean_2= ruleBoolean | this_Parentheses_3= ruleParentheses | this_This_4= ruleThis | this_MathNumberExp_5= ruleMathNumberExp | this_TextLiteral_6= ruleTextLiteral | this_VarUse_7= ruleVarUse | this_TypeUsage_8= ruleTypeUsage ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionUsage_0 = null;

        EObject this_LogicNot_1 = null;

        EObject this_Boolean_2 = null;

        EObject this_Parentheses_3 = null;

        EObject this_This_4 = null;

        EObject this_MathNumberExp_5 = null;

        EObject this_TextLiteral_6 = null;

        EObject this_VarUse_7 = null;

        EObject this_TypeUsage_8 = null;



        	enterRule();

        try {
            // InternalIF22.g:1482:2: ( (this_FunctionUsage_0= ruleFunctionUsage | this_LogicNot_1= ruleLogicNot | this_Boolean_2= ruleBoolean | this_Parentheses_3= ruleParentheses | this_This_4= ruleThis | this_MathNumberExp_5= ruleMathNumberExp | this_TextLiteral_6= ruleTextLiteral | this_VarUse_7= ruleVarUse | this_TypeUsage_8= ruleTypeUsage ) )
            // InternalIF22.g:1483:2: (this_FunctionUsage_0= ruleFunctionUsage | this_LogicNot_1= ruleLogicNot | this_Boolean_2= ruleBoolean | this_Parentheses_3= ruleParentheses | this_This_4= ruleThis | this_MathNumberExp_5= ruleMathNumberExp | this_TextLiteral_6= ruleTextLiteral | this_VarUse_7= ruleVarUse | this_TypeUsage_8= ruleTypeUsage )
            {
            // InternalIF22.g:1483:2: (this_FunctionUsage_0= ruleFunctionUsage | this_LogicNot_1= ruleLogicNot | this_Boolean_2= ruleBoolean | this_Parentheses_3= ruleParentheses | this_This_4= ruleThis | this_MathNumberExp_5= ruleMathNumberExp | this_TextLiteral_6= ruleTextLiteral | this_VarUse_7= ruleVarUse | this_TypeUsage_8= ruleTypeUsage )
            int alt20=9;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalIF22.g:1484:3: this_FunctionUsage_0= ruleFunctionUsage
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getFunctionUsageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionUsage_0=ruleFunctionUsage();

                    state._fsp--;


                    			current = this_FunctionUsage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIF22.g:1493:3: this_LogicNot_1= ruleLogicNot
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLogicNotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicNot_1=ruleLogicNot();

                    state._fsp--;


                    			current = this_LogicNot_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIF22.g:1502:3: this_Boolean_2= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_2=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalIF22.g:1511:3: this_Parentheses_3= ruleParentheses
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parentheses_3=ruleParentheses();

                    state._fsp--;


                    			current = this_Parentheses_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalIF22.g:1520:3: this_This_4= ruleThis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getThisParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_This_4=ruleThis();

                    state._fsp--;


                    			current = this_This_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalIF22.g:1529:3: this_MathNumberExp_5= ruleMathNumberExp
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getMathNumberExpParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathNumberExp_5=ruleMathNumberExp();

                    state._fsp--;


                    			current = this_MathNumberExp_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalIF22.g:1538:3: this_TextLiteral_6= ruleTextLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getTextLiteralParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextLiteral_6=ruleTextLiteral();

                    state._fsp--;


                    			current = this_TextLiteral_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalIF22.g:1547:3: this_VarUse_7= ruleVarUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVarUseParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarUse_7=ruleVarUse();

                    state._fsp--;


                    			current = this_VarUse_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalIF22.g:1556:3: this_TypeUsage_8= ruleTypeUsage
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getTypeUsageParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeUsage_8=ruleTypeUsage();

                    state._fsp--;


                    			current = this_TypeUsage_8;
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


    // $ANTLR start "entryRuleFunctionUsage"
    // InternalIF22.g:1568:1: entryRuleFunctionUsage returns [EObject current=null] : iv_ruleFunctionUsage= ruleFunctionUsage EOF ;
    public final EObject entryRuleFunctionUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUsage = null;


        try {
            // InternalIF22.g:1568:54: (iv_ruleFunctionUsage= ruleFunctionUsage EOF )
            // InternalIF22.g:1569:2: iv_ruleFunctionUsage= ruleFunctionUsage EOF
            {
             newCompositeNode(grammarAccess.getFunctionUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionUsage=ruleFunctionUsage();

            state._fsp--;

             current =iv_ruleFunctionUsage; 
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
    // $ANTLR end "entryRuleFunctionUsage"


    // $ANTLR start "ruleFunctionUsage"
    // InternalIF22.g:1575:1: ruleFunctionUsage returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exps_3_0= ruleLogicExp ) ) (otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleFunctionUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_exps_3_0 = null;

        EObject lv_exps_5_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1581:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exps_3_0= ruleLogicExp ) ) (otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) ) )* otherlv_6= ')' ) )
            // InternalIF22.g:1582:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exps_3_0= ruleLogicExp ) ) (otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) ) )* otherlv_6= ')' )
            {
            // InternalIF22.g:1582:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exps_3_0= ruleLogicExp ) ) (otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) ) )* otherlv_6= ')' )
            // InternalIF22.g:1583:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_exps_3_0= ruleLogicExp ) ) (otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) ) )* otherlv_6= ')'
            {
            // InternalIF22.g:1583:3: ()
            // InternalIF22.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionUsageAccess().getFunctionUsageAction_0(),
            					current);
            			

            }

            // InternalIF22.g:1590:3: ( (otherlv_1= RULE_ID ) )
            // InternalIF22.g:1591:4: (otherlv_1= RULE_ID )
            {
            // InternalIF22.g:1591:4: (otherlv_1= RULE_ID )
            // InternalIF22.g:1592:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionUsageRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getFunctionUsageAccess().getNameFunctionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionUsageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIF22.g:1607:3: ( (lv_exps_3_0= ruleLogicExp ) )
            // InternalIF22.g:1608:4: (lv_exps_3_0= ruleLogicExp )
            {
            // InternalIF22.g:1608:4: (lv_exps_3_0= ruleLogicExp )
            // InternalIF22.g:1609:5: lv_exps_3_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getFunctionUsageAccess().getExpsLogicExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_exps_3_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionUsageRule());
            					}
            					add(
            						current,
            						"exps",
            						lv_exps_3_0,
            						"dk.sdu.frhou18.mdsd.IF22.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIF22.g:1626:3: (otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIF22.g:1627:4: otherlv_4= ',' ( (lv_exps_5_0= ruleLogicExp ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFunctionUsageAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIF22.g:1631:4: ( (lv_exps_5_0= ruleLogicExp ) )
            	    // InternalIF22.g:1632:5: (lv_exps_5_0= ruleLogicExp )
            	    {
            	    // InternalIF22.g:1632:5: (lv_exps_5_0= ruleLogicExp )
            	    // InternalIF22.g:1633:6: lv_exps_5_0= ruleLogicExp
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionUsageAccess().getExpsLogicExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_exps_5_0=ruleLogicExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionUsageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exps",
            	    							lv_exps_5_0,
            	    							"dk.sdu.frhou18.mdsd.IF22.LogicExp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionUsageAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleFunctionUsage"


    // $ANTLR start "entryRuleTextLiteral"
    // InternalIF22.g:1659:1: entryRuleTextLiteral returns [EObject current=null] : iv_ruleTextLiteral= ruleTextLiteral EOF ;
    public final EObject entryRuleTextLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLiteral = null;


        try {
            // InternalIF22.g:1659:52: (iv_ruleTextLiteral= ruleTextLiteral EOF )
            // InternalIF22.g:1660:2: iv_ruleTextLiteral= ruleTextLiteral EOF
            {
             newCompositeNode(grammarAccess.getTextLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextLiteral=ruleTextLiteral();

            state._fsp--;

             current =iv_ruleTextLiteral; 
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
    // $ANTLR end "entryRuleTextLiteral"


    // $ANTLR start "ruleTextLiteral"
    // InternalIF22.g:1666:1: ruleTextLiteral returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalIF22.g:1672:2: ( ( () ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalIF22.g:1673:2: ( () ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalIF22.g:1673:2: ( () ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalIF22.g:1674:3: () ( (lv_text_1_0= RULE_STRING ) )
            {
            // InternalIF22.g:1674:3: ()
            // InternalIF22.g:1675:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextLiteralAccess().getTextLiteralAction_0(),
            					current);
            			

            }

            // InternalIF22.g:1681:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalIF22.g:1682:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalIF22.g:1682:4: (lv_text_1_0= RULE_STRING )
            // InternalIF22.g:1683:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextLiteralAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTextLiteral"


    // $ANTLR start "entryRuleVarUse"
    // InternalIF22.g:1703:1: entryRuleVarUse returns [EObject current=null] : iv_ruleVarUse= ruleVarUse EOF ;
    public final EObject entryRuleVarUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarUse = null;


        try {
            // InternalIF22.g:1703:47: (iv_ruleVarUse= ruleVarUse EOF )
            // InternalIF22.g:1704:2: iv_ruleVarUse= ruleVarUse EOF
            {
             newCompositeNode(grammarAccess.getVarUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarUse=ruleVarUse();

            state._fsp--;

             current =iv_ruleVarUse; 
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
    // $ANTLR end "entryRuleVarUse"


    // $ANTLR start "ruleVarUse"
    // InternalIF22.g:1710:1: ruleVarUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVarUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalIF22.g:1716:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalIF22.g:1717:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalIF22.g:1717:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalIF22.g:1718:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalIF22.g:1718:3: ()
            // InternalIF22.g:1719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarUseAccess().getVarUseAction_0(),
            					current);
            			

            }

            // InternalIF22.g:1725:3: ( (otherlv_1= RULE_ID ) )
            // InternalIF22.g:1726:4: (otherlv_1= RULE_ID )
            {
            // InternalIF22.g:1726:4: (otherlv_1= RULE_ID )
            // InternalIF22.g:1727:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVarUseAccess().getRefVariableDefCrossReference_1_0());
            				

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
    // $ANTLR end "ruleVarUse"


    // $ANTLR start "entryRuleTypeUsage"
    // InternalIF22.g:1742:1: entryRuleTypeUsage returns [EObject current=null] : iv_ruleTypeUsage= ruleTypeUsage EOF ;
    public final EObject entryRuleTypeUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeUsage = null;


        try {
            // InternalIF22.g:1742:50: (iv_ruleTypeUsage= ruleTypeUsage EOF )
            // InternalIF22.g:1743:2: iv_ruleTypeUsage= ruleTypeUsage EOF
            {
             newCompositeNode(grammarAccess.getTypeUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeUsage=ruleTypeUsage();

            state._fsp--;

             current =iv_ruleTypeUsage; 
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
    // $ANTLR end "entryRuleTypeUsage"


    // $ANTLR start "ruleTypeUsage"
    // InternalIF22.g:1749:1: ruleTypeUsage returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeUsage() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalIF22.g:1755:2: ( ( () ( (lv_type_1_0= ruleType ) ) ) )
            // InternalIF22.g:1756:2: ( () ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalIF22.g:1756:2: ( () ( (lv_type_1_0= ruleType ) ) )
            // InternalIF22.g:1757:3: () ( (lv_type_1_0= ruleType ) )
            {
            // InternalIF22.g:1757:3: ()
            // InternalIF22.g:1758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeUsageAccess().getTypeUsageAction_0(),
            					current);
            			

            }

            // InternalIF22.g:1764:3: ( (lv_type_1_0= ruleType ) )
            // InternalIF22.g:1765:4: (lv_type_1_0= ruleType )
            {
            // InternalIF22.g:1765:4: (lv_type_1_0= ruleType )
            // InternalIF22.g:1766:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypeUsageAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeUsageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"dk.sdu.frhou18.mdsd.IF22.Type");
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
    // $ANTLR end "ruleTypeUsage"


    // $ANTLR start "ruleType"
    // InternalIF22.g:1787:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'text' ) | (enumLiteral_2= 'number' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIF22.g:1793:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'text' ) | (enumLiteral_2= 'number' ) ) )
            // InternalIF22.g:1794:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'text' ) | (enumLiteral_2= 'number' ) )
            {
            // InternalIF22.g:1794:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'text' ) | (enumLiteral_2= 'number' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalIF22.g:1795:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalIF22.g:1795:3: (enumLiteral_0= 'boolean' )
                    // InternalIF22.g:1796:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIF22.g:1803:3: (enumLiteral_1= 'text' )
                    {
                    // InternalIF22.g:1803:3: (enumLiteral_1= 'text' )
                    // InternalIF22.g:1804:4: enumLiteral_1= 'text'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getTextEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTextEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIF22.g:1811:3: (enumLiteral_2= 'number' )
                    {
                    // InternalIF22.g:1811:3: (enumLiteral_2= 'number' )
                    // InternalIF22.g:1812:4: enumLiteral_2= 'number'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNumberEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getNumberEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleBooleanValue"
    // InternalIF22.g:1822:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIF22.g:1828:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalIF22.g:1829:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalIF22.g:1829:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            else if ( (LA23_0==47) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalIF22.g:1830:3: (enumLiteral_0= 'true' )
                    {
                    // InternalIF22.g:1830:3: (enumLiteral_0= 'true' )
                    // InternalIF22.g:1831:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBooleanValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIF22.g:1838:3: (enumLiteral_1= 'false' )
                    {
                    // InternalIF22.g:1838:3: (enumLiteral_1= 'false' )
                    // InternalIF22.g:1839:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBooleanValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleBooleanValue"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\11\11\uffff";
    static final String dfa_3s = "\1\4\1\14\11\uffff";
    static final String dfa_4s = "\1\57\1\52\11\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\10\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\6\1\7\5\uffff\1\4\17\uffff\1\5\10\uffff\1\2\5\uffff\3\10\2\3",
            "\1\12\2\11\4\uffff\6\11\1\uffff\1\11\2\uffff\10\11\1\uffff\5\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1483:2: (this_FunctionUsage_0= ruleFunctionUsage | this_LogicNot_1= ruleLogicNot | this_Boolean_2= ruleBoolean | this_Parentheses_3= ruleParentheses | this_This_4= ruleThis | this_MathNumberExp_5= ruleMathNumberExp | this_TextLiteral_6= ruleTextLiteral | this_VarUse_7= ruleVarUse | this_TypeUsage_8= ruleTypeUsage )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000380000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002780000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000F82010001070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});

}