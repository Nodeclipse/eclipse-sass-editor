package com.dubture.editor.sass.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dubture.editor.sass.services.SassGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSassParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CHARSET_ID", "RULE_STRING", "RULE_SC", "RULE_VARIABLE", "RULE_CL", "RULE_WORD", "RULE_BL", "RULE_BR", "RULE_SELECTOR", "RULE_COMMA", "RULE_DOT", "RULE_SHARP", "RULE_DOLLAR", "RULE_AMP", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=17;
    public static final int RULE_ID=18;
    public static final int RULE_BL=10;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_COMMA=13;
    public static final int RULE_SL_COMMENT=21;
    public static final int EOF=-1;
    public static final int RULE_BR=11;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_DOLLAR=16;
    public static final int RULE_STRING=5;
    public static final int RULE_CHARSET_ID=4;
    public static final int RULE_DOT=14;
    public static final int RULE_VARIABLE=7;
    public static final int RULE_CL=8;
    public static final int RULE_INT=19;
    public static final int RULE_WS=22;
    public static final int RULE_WORD=9;
    public static final int RULE_SELECTOR=12;
    public static final int RULE_SHARP=15;
    public static final int RULE_SC=6;

    // delegates
    // delegators


        public InternalSassParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSassParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSassParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g"; }



     	private SassGrammarAccess grammarAccess;
     	
        public InternalSassParser(TokenStream input, SassGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Sass";	
       	}
       	
       	@Override
       	protected SassGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSass"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:67:1: entryRuleSass returns [EObject current=null] : iv_ruleSass= ruleSass EOF ;
    public final EObject entryRuleSass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSass = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:68:2: (iv_ruleSass= ruleSass EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:69:2: iv_ruleSass= ruleSass EOF
            {
             newCompositeNode(grammarAccess.getSassRule()); 
            pushFollow(FOLLOW_ruleSass_in_entryRuleSass75);
            iv_ruleSass=ruleSass();

            state._fsp--;

             current =iv_ruleSass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSass85); 

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
    // $ANTLR end "entryRuleSass"


    // $ANTLR start "ruleSass"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:76:1: ruleSass returns [EObject current=null] : ( () ( ruleCharset )? ( ruleVariableDeclaration )* ( (lv_statements_3_0= ruleRule ) )* ) ;
    public final EObject ruleSass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:79:28: ( ( () ( ruleCharset )? ( ruleVariableDeclaration )* ( (lv_statements_3_0= ruleRule ) )* ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:80:1: ( () ( ruleCharset )? ( ruleVariableDeclaration )* ( (lv_statements_3_0= ruleRule ) )* )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:80:1: ( () ( ruleCharset )? ( ruleVariableDeclaration )* ( (lv_statements_3_0= ruleRule ) )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:80:2: () ( ruleCharset )? ( ruleVariableDeclaration )* ( (lv_statements_3_0= ruleRule ) )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:80:2: ()
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSassAccess().getSassAction_0(),
                        current);
                

            }

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:86:2: ( ruleCharset )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CHARSET_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:87:5: ruleCharset
                    {
                     
                            newCompositeNode(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCharset_in_ruleSass136);
                    ruleCharset();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:94:3: ( ruleVariableDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_VARIABLE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:95:5: ruleVariableDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleSass154);
            	    ruleVariableDeclaration();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:102:3: ( (lv_statements_3_0= ruleRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SELECTOR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:103:1: (lv_statements_3_0= ruleRule )
            	    {
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:103:1: (lv_statements_3_0= ruleRule )
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:104:3: lv_statements_3_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleSass176);
            	    lv_statements_3_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_3_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleSass"


    // $ANTLR start "entryRuleCharset"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:128:1: entryRuleCharset returns [String current=null] : iv_ruleCharset= ruleCharset EOF ;
    public final String entryRuleCharset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCharset = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:129:2: (iv_ruleCharset= ruleCharset EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:130:2: iv_ruleCharset= ruleCharset EOF
            {
             newCompositeNode(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_ruleCharset_in_entryRuleCharset214);
            iv_ruleCharset=ruleCharset();

            state._fsp--;

             current =iv_ruleCharset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharset225); 

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
    // $ANTLR end "entryRuleCharset"


    // $ANTLR start "ruleCharset"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:137:1: ruleCharset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SC_2= RULE_SC ) ;
    public final AntlrDatatypeRuleToken ruleCharset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHARSET_ID_0=null;
        Token this_STRING_1=null;
        Token this_SC_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:140:28: ( (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SC_2= RULE_SC ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SC_2= RULE_SC )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SC_2= RULE_SC )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:6: this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SC_2= RULE_SC
            {
            this_CHARSET_ID_0=(Token)match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_ruleCharset265); 

            		current.merge(this_CHARSET_ID_0);
                
             
                newLeafNode(this_CHARSET_ID_0, grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharset285); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
                
            this_SC_2=(Token)match(input,RULE_SC,FOLLOW_RULE_SC_in_ruleCharset305); 

            		current.merge(this_SC_2);
                
             
                newLeafNode(this_SC_2, grammarAccess.getCharsetAccess().getSCTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleCharset"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:170:1: entryRuleVariableDeclaration returns [String current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final String entryRuleVariableDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:171:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:172:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration351);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration362); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:179:1: ruleVariableDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE this_CL_1= RULE_CL this_WORD_2= RULE_WORD this_SC_3= RULE_SC ) ;
    public final AntlrDatatypeRuleToken ruleVariableDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_CL_1=null;
        Token this_WORD_2=null;
        Token this_SC_3=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:182:28: ( (this_VARIABLE_0= RULE_VARIABLE this_CL_1= RULE_CL this_WORD_2= RULE_WORD this_SC_3= RULE_SC ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:1: (this_VARIABLE_0= RULE_VARIABLE this_CL_1= RULE_CL this_WORD_2= RULE_WORD this_SC_3= RULE_SC )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:1: (this_VARIABLE_0= RULE_VARIABLE this_CL_1= RULE_CL this_WORD_2= RULE_WORD this_SC_3= RULE_SC )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:6: this_VARIABLE_0= RULE_VARIABLE this_CL_1= RULE_CL this_WORD_2= RULE_WORD this_SC_3= RULE_SC
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration402); 

            		current.merge(this_VARIABLE_0);
                
             
                newLeafNode(this_VARIABLE_0, grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
                
            this_CL_1=(Token)match(input,RULE_CL,FOLLOW_RULE_CL_in_ruleVariableDeclaration422); 

            		current.merge(this_CL_1);
                
             
                newLeafNode(this_CL_1, grammarAccess.getVariableDeclarationAccess().getCLTerminalRuleCall_1()); 
                
            this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleVariableDeclaration442); 

            		current.merge(this_WORD_2);
                
             
                newLeafNode(this_WORD_2, grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
                
            this_SC_3=(Token)match(input,RULE_SC,FOLLOW_RULE_SC_in_ruleVariableDeclaration462); 

            		current.merge(this_SC_3);
                
             
                newLeafNode(this_SC_3, grammarAccess.getVariableDeclarationAccess().getSCTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleRule"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:219:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:220:2: (iv_ruleRule= ruleRule EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:221:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule508);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule519); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:228:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RuleHead_0= ruleRuleHead this_BL_1= RULE_BL this_RuleBody_2= ruleRuleBody this_BR_3= RULE_BR ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BL_1=null;
        Token this_BR_3=null;
        AntlrDatatypeRuleToken this_RuleHead_0 = null;

        AntlrDatatypeRuleToken this_RuleBody_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:231:28: ( (this_RuleHead_0= ruleRuleHead this_BL_1= RULE_BL this_RuleBody_2= ruleRuleBody this_BR_3= RULE_BR ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:232:1: (this_RuleHead_0= ruleRuleHead this_BL_1= RULE_BL this_RuleBody_2= ruleRuleBody this_BR_3= RULE_BR )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:232:1: (this_RuleHead_0= ruleRuleHead this_BL_1= RULE_BL this_RuleBody_2= ruleRuleBody this_BR_3= RULE_BR )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:233:5: this_RuleHead_0= ruleRuleHead this_BL_1= RULE_BL this_RuleBody_2= ruleRuleBody this_BR_3= RULE_BR
            {
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRuleHead_in_ruleRule566);
            this_RuleHead_0=ruleRuleHead();

            state._fsp--;


            		current.merge(this_RuleHead_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_BL_1=(Token)match(input,RULE_BL,FOLLOW_RULE_BL_in_ruleRule586); 

            		current.merge(this_BL_1);
                
             
                newLeafNode(this_BL_1, grammarAccess.getRuleAccess().getBLTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleRuleBody_in_ruleRule613);
            this_RuleBody_2=ruleRuleBody();

            state._fsp--;


            		current.merge(this_RuleBody_2);
                
             
                    afterParserOrEnumRuleCall();
                
            this_BR_3=(Token)match(input,RULE_BR,FOLLOW_RULE_BR_in_ruleRule633); 

            		current.merge(this_BR_3);
                
             
                newLeafNode(this_BR_3, grammarAccess.getRuleAccess().getBRTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleHead"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:276:1: entryRuleRuleHead returns [String current=null] : iv_ruleRuleHead= ruleRuleHead EOF ;
    public final String entryRuleRuleHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleHead = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:277:2: (iv_ruleRuleHead= ruleRuleHead EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:278:2: iv_ruleRuleHead= ruleRuleHead EOF
            {
             newCompositeNode(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead679);
            iv_ruleRuleHead=ruleRuleHead();

            state._fsp--;

             current =iv_ruleRuleHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead690); 

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
    // $ANTLR end "entryRuleRuleHead"


    // $ANTLR start "ruleRuleHead"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:285:1: ruleRuleHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SELECTOR_0=null;
        Token this_COMMA_1=null;
        Token this_SELECTOR_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:288:28: ( (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:289:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:289:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:289:6: this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            {
            this_SELECTOR_0=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead730); 

            		current.merge(this_SELECTOR_0);
                
             
                newLeafNode(this_SELECTOR_0, grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:296:1: (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:296:6: this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRuleHead751); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    this_SELECTOR_2=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead771); 

            	    		current.merge(this_SELECTOR_2);
            	        
            	     
            	        newLeafNode(this_SELECTOR_2, grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleRuleHead"


    // $ANTLR start "entryRuleRuleBody"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:318:1: entryRuleRuleBody returns [String current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final String entryRuleRuleBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleBody = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:319:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:320:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody819);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody830); 

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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:327:1: ruleRuleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Rule_1= ruleRule )* ;
    public final AntlrDatatypeRuleToken ruleRuleBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyDeclaration_0 = null;

        AntlrDatatypeRuleToken this_Rule_1 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:330:28: ( (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Rule_1= ruleRule )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:331:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Rule_1= ruleRule )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:331:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Rule_1= ruleRule )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WORD) ) {
                    alt5=1;
                }
                else if ( (LA5_0==RULE_SELECTOR) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:332:5: this_PropertyDeclaration_0= rulePropertyDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleBody877);
            	    this_PropertyDeclaration_0=rulePropertyDeclaration();

            	    state._fsp--;


            	    		current.merge(this_PropertyDeclaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:344:5: this_Rule_1= ruleRule
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleBody910);
            	    this_Rule_1=ruleRule();

            	    state._fsp--;


            	    		current.merge(this_Rule_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:362:1: entryRulePropertyDeclaration returns [String current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final String entryRulePropertyDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:363:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:364:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration957);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration968); 

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
    // $ANTLR end "entryRulePropertyDeclaration"


    // $ANTLR start "rulePropertyDeclaration"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:1: rulePropertyDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD this_CL_1= RULE_CL ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC ) | (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR ) ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_CL_1=null;
        Token this_WORD_2=null;
        Token this_VARIABLE_3=null;
        Token this_SC_4=null;
        Token this_BL_5=null;
        Token this_BR_7=null;
        AntlrDatatypeRuleToken this_PropertyDeclaration_6 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:374:28: ( (this_WORD_0= RULE_WORD this_CL_1= RULE_CL ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC ) | (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR ) ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:1: (this_WORD_0= RULE_WORD this_CL_1= RULE_CL ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC ) | (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR ) ) )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:1: (this_WORD_0= RULE_WORD this_CL_1= RULE_CL ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC ) | (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:6: this_WORD_0= RULE_WORD this_CL_1= RULE_CL ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC ) | (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR ) )
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration1008); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
                
            this_CL_1=(Token)match(input,RULE_CL,FOLLOW_RULE_CL_in_rulePropertyDeclaration1028); 

            		current.merge(this_CL_1);
                
             
                newLeafNode(this_CL_1, grammarAccess.getPropertyDeclarationAccess().getCLTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:389:1: ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC ) | (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_VARIABLE||LA8_0==RULE_WORD) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:389:2: ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:389:2: ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:389:3: (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SC_4= RULE_SC
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:389:3: (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_WORD) ) {
                            alt6=1;
                        }
                        else if ( (LA6_0==RULE_VARIABLE) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:389:8: this_WORD_2= RULE_WORD
                    	    {
                    	    this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration1051); 

                    	    		current.merge(this_WORD_2);
                    	        
                    	     
                    	        newLeafNode(this_WORD_2, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:397:10: this_VARIABLE_3= RULE_VARIABLE
                    	    {
                    	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rulePropertyDeclaration1077); 

                    	    		current.merge(this_VARIABLE_3);
                    	        
                    	     
                    	        newLeafNode(this_VARIABLE_3, grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    this_SC_4=(Token)match(input,RULE_SC,FOLLOW_RULE_SC_in_rulePropertyDeclaration1099); 

                    		current.merge(this_SC_4);
                        
                     
                        newLeafNode(this_SC_4, grammarAccess.getPropertyDeclarationAccess().getSCTerminalRuleCall_2_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:412:6: (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:412:6: (this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:412:11: this_BL_5= RULE_BL (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BR_7= RULE_BR
                    {
                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_RULE_BL_in_rulePropertyDeclaration1127); 

                    		current.merge(this_BL_5);
                        
                     
                        newLeafNode(this_BL_5, grammarAccess.getPropertyDeclarationAccess().getBLTerminalRuleCall_2_1_0()); 
                        
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:419:1: (this_PropertyDeclaration_6= rulePropertyDeclaration )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_WORD) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:420:5: this_PropertyDeclaration_6= rulePropertyDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1155);
                    	    this_PropertyDeclaration_6=rulePropertyDeclaration();

                    	    state._fsp--;


                    	    		current.merge(this_PropertyDeclaration_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_BR_7=(Token)match(input,RULE_BR,FOLLOW_RULE_BR_in_rulePropertyDeclaration1177); 

                    		current.merge(this_BR_7);
                        
                     
                        newLeafNode(this_BR_7, grammarAccess.getPropertyDeclarationAccess().getBRTerminalRuleCall_2_1_2()); 
                        

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
    // $ANTLR end "rulePropertyDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSass_in_entryRuleSass75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSass85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_ruleSass136 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSass154 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_ruleRule_in_ruleSass176 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_ruleCharset265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharset285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SC_in_ruleCharset305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration402 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CL_in_ruleVariableDeclaration422 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleVariableDeclaration442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SC_in_ruleVariableDeclaration462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_ruleRule566 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_BL_in_ruleRule586 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleRule613 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_BR_in_ruleRule633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead730 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRuleHead751 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead771 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleBody877 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleBody910 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration1008 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CL_in_rulePropertyDeclaration1028 = new BitSet(new long[]{0x0000000000000680L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration1051 = new BitSet(new long[]{0x00000000000002C0L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rulePropertyDeclaration1077 = new BitSet(new long[]{0x00000000000002C0L});
    public static final BitSet FOLLOW_RULE_SC_in_rulePropertyDeclaration1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BL_in_rulePropertyDeclaration1127 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1155 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RULE_BR_in_rulePropertyDeclaration1177 = new BitSet(new long[]{0x0000000000000002L});

}