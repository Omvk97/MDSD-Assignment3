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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'external'", "','", "'let'", "'in'", "'end'"
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
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalMethods_2_0= ruleExternalMethod ) )* ( (lv_math_3_0= ruleMathExp ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externalMethods_2_0 = null;

        EObject lv_math_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalMethods_2_0= ruleExternalMethod ) )* ( (lv_math_3_0= ruleMathExp ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalMethods_2_0= ruleExternalMethod ) )* ( (lv_math_3_0= ruleMathExp ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalMethods_2_0= ruleExternalMethod ) )* ( (lv_math_3_0= ruleMathExp ) ) )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externalMethods_2_0= ruleExternalMethod ) )* ( (lv_math_3_0= ruleMathExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externalMethods_2_0= ruleExternalMethod ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externalMethods_2_0= ruleExternalMethod )
            	    {
            	    // InternalMath.g:102:4: (lv_externalMethods_2_0= ruleExternalMethod )
            	    // InternalMath.g:103:5: lv_externalMethods_2_0= ruleExternalMethod
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExternalMethodsExternalMethodParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externalMethods_2_0=ruleExternalMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externalMethods",
            	    						lv_externalMethods_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.ExternalMethod");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_math_3_0= ruleMathExp ) )
            // InternalMath.g:121:4: (lv_math_3_0= ruleMathExp )
            {
            // InternalMath.g:121:4: (lv_math_3_0= ruleMathExp )
            // InternalMath.g:122:5: lv_math_3_0= ruleMathExp
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getMathMathExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_math_3_0=ruleMathExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"math",
            						lv_math_3_0,
            						"dk.sdu.mmmi.mdsd.Math.MathExp");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:143:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:143:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:144:2: iv_ruleMathExp= ruleMathExp EOF
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
    // InternalMath.g:150:1: ruleMathExp returns [EObject current=null] : ( (lv_variables_0_0= ruleVarBinding ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:156:2: ( ( (lv_variables_0_0= ruleVarBinding ) )* )
            // InternalMath.g:157:2: ( (lv_variables_0_0= ruleVarBinding ) )*
            {
            // InternalMath.g:157:2: ( (lv_variables_0_0= ruleVarBinding ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:158:3: (lv_variables_0_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:158:3: (lv_variables_0_0= ruleVarBinding )
            	    // InternalMath.g:159:4: lv_variables_0_0= ruleVarBinding
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_5);
            	    lv_variables_0_0=ruleVarBinding();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:179:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:179:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:180:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
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
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:186:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:192:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:193:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:193:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:194:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:198:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:199:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:199:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:200:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:220:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:221:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:221:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:222:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
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
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:243:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:243:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:244:2: iv_ruleExp= ruleExp EOF
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
    // InternalMath.g:250:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:256:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:257:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:257:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:258:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:266:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:267:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:267:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==15) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMath.g:268:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:268:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:269:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:269:6: ()
            	            // InternalMath.g:270:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:282:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:282:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:283:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:283:6: ()
            	            // InternalMath.g:284:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:296:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:297:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:297:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:298:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:320:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:320:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:321:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:327:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:333:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:334:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:334:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:335:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:343:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:344:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:344:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==16) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==17) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:345:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:345:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:346:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:346:6: ()
            	            // InternalMath.g:347:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:359:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:359:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:360:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:360:6: ()
            	            // InternalMath.g:361:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,17,FOLLOW_7); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:373:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:374:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:374:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:375:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
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
            	    break loop6;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:397:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:397:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:398:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMath.g:404:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalMethodCall_5= ruleExternalMethodCall ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesis_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_LetBinding_4 = null;

        EObject this_ExternalMethodCall_5 = null;



        	enterRule();

        try {
            // InternalMath.g:410:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalMethodCall_5= ruleExternalMethodCall ) )
            // InternalMath.g:411:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalMethodCall_5= ruleExternalMethodCall )
            {
            // InternalMath.g:411:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_LetBinding_4= ruleLetBinding | this_ExternalMethodCall_5= ruleExternalMethodCall )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==18) ) {
                    alt7=5;
                }
                else if ( (LA7_3==EOF||LA7_3==12||(LA7_3>=14 && LA7_3<=17)||LA7_3==19||LA7_3==21||(LA7_3>=23 && LA7_3<=24)) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMath.g:412:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:412:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:413:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:413:4: ()
                    // InternalMath.g:414:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:420:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:421:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:421:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:422:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
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
                    break;
                case 2 :
                    // InternalMath.g:440:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:449:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:458:3: this_LetBinding_4= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_4=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:467:3: this_ExternalMethodCall_5= ruleExternalMethodCall
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalMethodCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalMethodCall_5=ruleExternalMethodCall();

                    state._fsp--;


                    			current = this_ExternalMethodCall_5;
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
    // InternalMath.g:479:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:479:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:480:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalMath.g:486:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:492:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalMath.g:493:2: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalMath.g:493:2: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalMath.g:494:3: () otherlv_1= '(' ( (lv_expression_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalMath.g:494:3: ()
            // InternalMath.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:505:3: ( (lv_expression_2_0= ruleExp ) )
            // InternalMath.g:506:4: (lv_expression_2_0= ruleExp )
            {
            // InternalMath.g:506:4: (lv_expression_2_0= ruleExp )
            // InternalMath.g:507:5: lv_expression_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpressionExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_expression_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExternalMethod"
    // InternalMath.g:532:1: entryRuleExternalMethod returns [EObject current=null] : iv_ruleExternalMethod= ruleExternalMethod EOF ;
    public final EObject entryRuleExternalMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMethod = null;


        try {
            // InternalMath.g:532:55: (iv_ruleExternalMethod= ruleExternalMethod EOF )
            // InternalMath.g:533:2: iv_ruleExternalMethod= ruleExternalMethod EOF
            {
             newCompositeNode(grammarAccess.getExternalMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalMethod=ruleExternalMethod();

            state._fsp--;

             current =iv_ruleExternalMethod; 
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
    // $ANTLR end "entryRuleExternalMethod"


    // $ANTLR start "ruleExternalMethod"
    // InternalMath.g:539:1: ruleExternalMethod returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_types_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_types_3_0=null;
        Token otherlv_4=null;
        Token lv_types_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMath.g:545:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_types_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) ) )* otherlv_6= ')' ) )
            // InternalMath.g:546:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_types_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) ) )* otherlv_6= ')' )
            {
            // InternalMath.g:546:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_types_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) ) )* otherlv_6= ')' )
            // InternalMath.g:547:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_types_3_0= RULE_ID ) )? (otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalMethodAccess().getExternalKeyword_0());
            		
            // InternalMath.g:551:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:552:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:552:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:553:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:573:3: ( (lv_types_3_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMath.g:574:4: (lv_types_3_0= RULE_ID )
                    {
                    // InternalMath.g:574:4: (lv_types_3_0= RULE_ID )
                    // InternalMath.g:575:5: lv_types_3_0= RULE_ID
                    {
                    lv_types_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    					newLeafNode(lv_types_3_0, grammarAccess.getExternalMethodAccess().getTypesIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalMethodRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"types",
                    						lv_types_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMath.g:591:3: (otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMath.g:592:4: otherlv_4= ',' ( (lv_types_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalMethodAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMath.g:596:4: ( (lv_types_5_0= RULE_ID ) )
            	    // InternalMath.g:597:5: (lv_types_5_0= RULE_ID )
            	    {
            	    // InternalMath.g:597:5: (lv_types_5_0= RULE_ID )
            	    // InternalMath.g:598:6: lv_types_5_0= RULE_ID
            	    {
            	    lv_types_5_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(lv_types_5_0, grammarAccess.getExternalMethodAccess().getTypesIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExternalMethodRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"types",
            	    							lv_types_5_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalMethodAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleExternalMethod"


    // $ANTLR start "entryRuleExternalMethodCall"
    // InternalMath.g:623:1: entryRuleExternalMethodCall returns [EObject current=null] : iv_ruleExternalMethodCall= ruleExternalMethodCall EOF ;
    public final EObject entryRuleExternalMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalMethodCall = null;


        try {
            // InternalMath.g:623:59: (iv_ruleExternalMethodCall= ruleExternalMethodCall EOF )
            // InternalMath.g:624:2: iv_ruleExternalMethodCall= ruleExternalMethodCall EOF
            {
             newCompositeNode(grammarAccess.getExternalMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalMethodCall=ruleExternalMethodCall();

            state._fsp--;

             current =iv_ruleExternalMethodCall; 
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
    // $ANTLR end "entryRuleExternalMethodCall"


    // $ANTLR start "ruleExternalMethodCall"
    // InternalMath.g:630:1: ruleExternalMethodCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleExternalMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:636:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* )? otherlv_6= ')' ) )
            // InternalMath.g:637:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* )? otherlv_6= ')' )
            {
            // InternalMath.g:637:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* )? otherlv_6= ')' )
            // InternalMath.g:638:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* )? otherlv_6= ')'
            {
            // InternalMath.g:638:3: ()
            // InternalMath.g:639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalMethodCallAccess().getExternalMethodCallAction_0(),
            					current);
            			

            }

            // InternalMath.g:645:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:646:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:646:4: (otherlv_1= RULE_ID )
            // InternalMath.g:647:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalMethodCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getExternalMethodCallAccess().getMethodExternalMethodCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalMethodCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:662:3: ( ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==18||LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMath.g:663:4: ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )*
                    {
                    // InternalMath.g:663:4: ( (lv_arguments_3_0= ruleExp ) )
                    // InternalMath.g:664:5: (lv_arguments_3_0= ruleExp )
                    {
                    // InternalMath.g:664:5: (lv_arguments_3_0= ruleExp )
                    // InternalMath.g:665:6: lv_arguments_3_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExternalMethodCallAccess().getArgumentsExpParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_arguments_3_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalMethodCallRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:682:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMath.g:683:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalMethodCallAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMath.g:687:5: ( (lv_arguments_5_0= ruleExp ) )
                    	    // InternalMath.g:688:6: (lv_arguments_5_0= ruleExp )
                    	    {
                    	    // InternalMath.g:688:6: (lv_arguments_5_0= ruleExp )
                    	    // InternalMath.g:689:7: lv_arguments_5_0= ruleExp
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalMethodCallAccess().getArgumentsExpParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_arguments_5_0=ruleExp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalMethodCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.Exp");
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
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalMethodCallAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternalMethodCall"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:716:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:716:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:717:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:723:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:729:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:730:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:730:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:731:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:735:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:736:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:736:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:737:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:757:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:758:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:758:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:759:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:780:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:781:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:781:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:782:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:807:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:807:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:808:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalMath.g:814:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:820:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:821:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:821:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:822:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:822:3: (otherlv_0= RULE_ID )
            // InternalMath.g:823:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000440030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000004C0030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}