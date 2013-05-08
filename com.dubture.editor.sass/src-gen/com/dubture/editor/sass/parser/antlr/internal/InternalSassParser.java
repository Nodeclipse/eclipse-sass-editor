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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_COLON", "RULE_WORD", "RULE_SEMI_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_SELECTOR", "RULE_COMMA", "RULE_HEX_COLOR", "RULE_CHARSET_ID", "RULE_STRING", "RULE_INCLUDE_ID", "RULE_MIXIN_ID", "RULE_PAREN_LEFT", "RULE_PAREN_RIGHT", "RULE_DOT", "RULE_HASH", "RULE_DOLLAR", "RULE_AMP", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=22;
    public static final int RULE_ID=24;
    public static final int RULE_BRACE_RIGHT=9;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_HEX_COLOR=12;
    public static final int RULE_HASH=20;
    public static final int RULE_COMMA=11;
    public static final int RULE_INCLUDE_ID=15;
    public static final int RULE_MIXIN_ID=16;
    public static final int RULE_SL_COMMENT=26;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_PAREN_LEFT=17;
    public static final int RULE_BRACE_LEFT=8;
    public static final int RULE_DOLLAR=21;
    public static final int RULE_COLON=5;
    public static final int RULE_STRING=14;
    public static final int RULE_DOT=19;
    public static final int RULE_CHARSET_ID=13;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_PAREN_RIGHT=18;
    public static final int RULE_SEMI_COLON=7;
    public static final int RULE_INT=23;
    public static final int RULE_WS=27;
    public static final int RULE_WORD=6;
    public static final int RULE_SELECTOR=10;

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

                if ( (LA3_0==RULE_SELECTOR||LA3_0==RULE_MIXIN_ID) ) {
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:128:1: entryRuleVariableDeclaration returns [String current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final String entryRuleVariableDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:129:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:130:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration214);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration225); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:137:1: ruleVariableDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleVariableDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_SEMI_COLON_3=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:140:28: ( (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:6: this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration265); 

            		current.merge(this_VARIABLE_0);
                
             
                newLeafNode(this_VARIABLE_0, grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleVariableDeclaration285); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleVariableDeclaration305); 

            		current.merge(this_WORD_2);
                
             
                newLeafNode(this_WORD_2, grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
                
            this_SEMI_COLON_3=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration325); 

            		current.merge(this_SEMI_COLON_3);
                
             
                newLeafNode(this_SEMI_COLON_3, grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); 
                

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:177:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:178:2: (iv_ruleRule= ruleRule EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:179:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule371);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule382); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:186:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACE_LEFT_2=null;
        Token this_BRACE_RIGHT_4=null;
        AntlrDatatypeRuleToken this_RuleHead_0 = null;

        AntlrDatatypeRuleToken this_Mixin_1 = null;

        AntlrDatatypeRuleToken this_RuleBody_3 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:189:28: ( ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:190:1: ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:190:1: ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:190:2: (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:190:2: (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SELECTOR) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_MIXIN_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:191:5: this_RuleHead_0= ruleRuleHead
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleHead_in_ruleRule430);
                    this_RuleHead_0=ruleRuleHead();

                    state._fsp--;


                    		current.merge(this_RuleHead_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:203:5: this_Mixin_1= ruleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleMixin_in_ruleRule463);
                    this_Mixin_1=ruleMixin();

                    state._fsp--;


                    		current.merge(this_Mixin_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_BRACE_LEFT_2=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_ruleRule484); 

            		current.merge(this_BRACE_LEFT_2);
                
             
                newLeafNode(this_BRACE_LEFT_2, grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleRuleBody_in_ruleRule511);
            this_RuleBody_3=ruleRuleBody();

            state._fsp--;


            		current.merge(this_RuleBody_3);
                
             
                    afterParserOrEnumRuleCall();
                
            this_BRACE_RIGHT_4=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_ruleRule531); 

            		current.merge(this_BRACE_RIGHT_4);
                
             
                newLeafNode(this_BRACE_RIGHT_4, grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 
                

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:246:1: entryRuleRuleHead returns [String current=null] : iv_ruleRuleHead= ruleRuleHead EOF ;
    public final String entryRuleRuleHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleHead = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:247:2: (iv_ruleRuleHead= ruleRuleHead EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:248:2: iv_ruleRuleHead= ruleRuleHead EOF
            {
             newCompositeNode(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead577);
            iv_ruleRuleHead=ruleRuleHead();

            state._fsp--;

             current =iv_ruleRuleHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead588); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:255:1: ruleRuleHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SELECTOR_0=null;
        Token this_COMMA_1=null;
        Token this_SELECTOR_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:258:28: ( (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:259:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:259:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:259:6: this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            {
            this_SELECTOR_0=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead628); 

            		current.merge(this_SELECTOR_0);
                
             
                newLeafNode(this_SELECTOR_0, grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:266:1: (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:266:6: this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRuleHead649); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    this_SELECTOR_2=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead669); 

            	    		current.merge(this_SELECTOR_2);
            	        
            	     
            	        newLeafNode(this_SELECTOR_2, grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:288:1: entryRuleRuleBody returns [String current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final String entryRuleRuleBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleBody = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:289:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:290:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody717);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody728); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:297:1: ruleRuleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* ;
    public final AntlrDatatypeRuleToken ruleRuleBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyDeclaration_0 = null;

        AntlrDatatypeRuleToken this_Include_1 = null;

        AntlrDatatypeRuleToken this_Rule_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:300:28: ( (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:301:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:301:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt6=1;
                    }
                    break;
                case RULE_INCLUDE_ID:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_SELECTOR:
                case RULE_MIXIN_ID:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:302:5: this_PropertyDeclaration_0= rulePropertyDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleBody775);
            	    this_PropertyDeclaration_0=rulePropertyDeclaration();

            	    state._fsp--;


            	    		current.merge(this_PropertyDeclaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:314:5: this_Include_1= ruleInclude
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInclude_in_ruleRuleBody808);
            	    this_Include_1=ruleInclude();

            	    state._fsp--;


            	    		current.merge(this_Include_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:326:5: this_Rule_2= ruleRule
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleBody841);
            	    this_Rule_2=ruleRule();

            	    state._fsp--;


            	    		current.merge(this_Rule_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:344:1: entryRulePropertyDeclaration returns [String current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final String entryRulePropertyDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:345:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:346:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration888);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration899); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:353:1: rulePropertyDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_VARIABLE_3=null;
        Token this_HEX_COLOR_4=null;
        Token this_SEMI_COLON_5=null;
        Token this_BRACE_LEFT_6=null;
        Token this_BRACE_RIGHT_8=null;
        AntlrDatatypeRuleToken this_PropertyDeclaration_7 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:356:28: ( (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:357:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:357:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:357:6: this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) )
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration939); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyDeclaration959); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:1: ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_VARIABLE||LA9_0==RULE_WORD||LA9_0==RULE_HEX_COLOR) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_BRACE_LEFT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:2: ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:2: ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:3: (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+ this_SEMI_COLON_5= RULE_SEMI_COLON
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:3: (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE | this_HEX_COLOR_4= RULE_HEX_COLOR )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=4;
                        switch ( input.LA(1) ) {
                        case RULE_WORD:
                            {
                            alt7=1;
                            }
                            break;
                        case RULE_VARIABLE:
                            {
                            alt7=2;
                            }
                            break;
                        case RULE_HEX_COLOR:
                            {
                            alt7=3;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:371:8: this_WORD_2= RULE_WORD
                    	    {
                    	    this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration982); 

                    	    		current.merge(this_WORD_2);
                    	        
                    	     
                    	        newLeafNode(this_WORD_2, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:379:10: this_VARIABLE_3= RULE_VARIABLE
                    	    {
                    	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rulePropertyDeclaration1008); 

                    	    		current.merge(this_VARIABLE_3);
                    	        
                    	     
                    	        newLeafNode(this_VARIABLE_3, grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:387:10: this_HEX_COLOR_4= RULE_HEX_COLOR
                    	    {
                    	    this_HEX_COLOR_4=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_rulePropertyDeclaration1034); 

                    	    		current.merge(this_HEX_COLOR_4);
                    	        
                    	     
                    	        newLeafNode(this_HEX_COLOR_4, grammarAccess.getPropertyDeclarationAccess().getHEX_COLORTerminalRuleCall_2_0_0_2()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1056); 

                    		current.merge(this_SEMI_COLON_5);
                        
                     
                        newLeafNode(this_SEMI_COLON_5, grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:402:6: (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:402:6: (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:402:11: this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT
                    {
                    this_BRACE_LEFT_6=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1084); 

                    		current.merge(this_BRACE_LEFT_6);
                        
                     
                        newLeafNode(this_BRACE_LEFT_6, grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
                        
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:409:1: (this_PropertyDeclaration_7= rulePropertyDeclaration )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_WORD) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:410:5: this_PropertyDeclaration_7= rulePropertyDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1112);
                    	    this_PropertyDeclaration_7=rulePropertyDeclaration();

                    	    state._fsp--;


                    	    		current.merge(this_PropertyDeclaration_7);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_BRACE_RIGHT_8=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1134); 

                    		current.merge(this_BRACE_RIGHT_8);
                        
                     
                        newLeafNode(this_BRACE_RIGHT_8, grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 
                        

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


    // $ANTLR start "entryRuleCharset"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:435:1: entryRuleCharset returns [String current=null] : iv_ruleCharset= ruleCharset EOF ;
    public final String entryRuleCharset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCharset = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:436:2: (iv_ruleCharset= ruleCharset EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:437:2: iv_ruleCharset= ruleCharset EOF
            {
             newCompositeNode(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_ruleCharset_in_entryRuleCharset1182);
            iv_ruleCharset=ruleCharset();

            state._fsp--;

             current =iv_ruleCharset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharset1193); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:444:1: ruleCharset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleCharset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHARSET_ID_0=null;
        Token this_STRING_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:447:28: ( (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:448:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:448:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:448:6: this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_CHARSET_ID_0=(Token)match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_ruleCharset1233); 

            		current.merge(this_CHARSET_ID_0);
                
             
                newLeafNode(this_CHARSET_ID_0, grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharset1253); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleCharset1273); 

            		current.merge(this_SEMI_COLON_2);
                
             
                newLeafNode(this_SEMI_COLON_2, grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); 
                

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


    // $ANTLR start "entryRuleInclude"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:477:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:478:2: (iv_ruleInclude= ruleInclude EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:479:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1319);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1330); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:486:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INCLUDE_ID_0=null;
        Token this_WORD_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:489:28: ( (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:490:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:490:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:490:6: this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_INCLUDE_ID_0=(Token)match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_ruleInclude1370); 

            		current.merge(this_INCLUDE_ID_0);
                
             
                newLeafNode(this_INCLUDE_ID_0, grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleInclude1390); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleInclude1410); 

            		current.merge(this_SEMI_COLON_2);
                
             
                newLeafNode(this_SEMI_COLON_2, grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleMixin"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:519:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:520:2: (iv_ruleMixin= ruleMixin EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:521:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin1456);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin1467); 

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
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIXIN_ID_0=null;
        Token this_WORD_1=null;
        Token this_PAREN_LEFT_2=null;
        Token this_VARIABLE_3=null;
        Token this_PAREN_RIGHT_4=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:531:28: ( (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:1: (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:1: (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:6: this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )?
            {
            this_MIXIN_ID_0=(Token)match(input,RULE_MIXIN_ID,FOLLOW_RULE_MIXIN_ID_in_ruleMixin1507); 

            		current.merge(this_MIXIN_ID_0);
                
             
                newLeafNode(this_MIXIN_ID_0, grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleMixin1527); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:546:1: (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PAREN_LEFT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:546:6: this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT
                    {
                    this_PAREN_LEFT_2=(Token)match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_ruleMixin1548); 

                    		current.merge(this_PAREN_LEFT_2);
                        
                     
                        newLeafNode(this_PAREN_LEFT_2, grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
                        
                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleMixin1568); 

                    		current.merge(this_VARIABLE_3);
                        
                     
                        newLeafNode(this_VARIABLE_3, grammarAccess.getMixinAccess().getVARIABLETerminalRuleCall_2_1()); 
                        
                    this_PAREN_RIGHT_4=(Token)match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_ruleMixin1588); 

                    		current.merge(this_PAREN_RIGHT_4);
                        
                     
                        newLeafNode(this_PAREN_RIGHT_4, grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); 
                        

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
    // $ANTLR end "ruleMixin"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSass_in_entryRuleSass75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSass85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_ruleSass136 = new BitSet(new long[]{0x0000000000010412L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSass154 = new BitSet(new long[]{0x0000000000010412L});
    public static final BitSet FOLLOW_ruleRule_in_ruleSass176 = new BitSet(new long[]{0x0000000000010402L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleVariableDeclaration285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleVariableDeclaration305 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_ruleRule430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleRule463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_ruleRule484 = new BitSet(new long[]{0x0000000000018640L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleRule511 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_ruleRule531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead628 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRuleHead649 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead669 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleBody775 = new BitSet(new long[]{0x0000000000018442L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleRuleBody808 = new BitSet(new long[]{0x0000000000018442L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleBody841 = new BitSet(new long[]{0x0000000000018442L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyDeclaration959 = new BitSet(new long[]{0x0000000000001150L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration982 = new BitSet(new long[]{0x00000000000010D0L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rulePropertyDeclaration1008 = new BitSet(new long[]{0x00000000000010D0L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_rulePropertyDeclaration1034 = new BitSet(new long[]{0x00000000000010D0L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1084 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1112 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_ruleCharset1233 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharset1253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleCharset1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_ruleInclude1370 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleInclude1390 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleInclude1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin1456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MIXIN_ID_in_ruleMixin1507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleMixin1527 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_ruleMixin1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleMixin1568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_ruleMixin1588 = new BitSet(new long[]{0x0000000000000002L});

}