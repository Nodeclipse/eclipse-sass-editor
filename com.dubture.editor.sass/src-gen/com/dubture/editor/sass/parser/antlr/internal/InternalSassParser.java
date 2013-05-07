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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COLON", "RULE_WORD", "RULE_SEMI_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_COMMA", "RULE_CHARSET_ID", "RULE_STRING", "RULE_INCLUDE_ID", "RULE_MIXIN_ID", "RULE_PAREN_LEFT", "RULE_PAREN_RIGHT", "RULE_AMP", "RULE_SHARP", "RULE_DOT", "RULE_DOLLAR", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=16;
    public static final int RULE_ID=21;
    public static final int RULE_BRACE_RIGHT=8;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_COMMA=9;
    public static final int RULE_INCLUDE_ID=12;
    public static final int RULE_MIXIN_ID=13;
    public static final int RULE_SL_COMMENT=23;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_PAREN_LEFT=14;
    public static final int RULE_BRACE_LEFT=7;
    public static final int RULE_DOLLAR=19;
    public static final int RULE_COLON=4;
    public static final int RULE_STRING=11;
    public static final int RULE_CHARSET_ID=10;
    public static final int RULE_DOT=18;
    public static final int RULE_PAREN_RIGHT=15;
    public static final int RULE_SEMI_COLON=6;
    public static final int RULE_INT=20;
    public static final int RULE_WS=24;
    public static final int RULE_WORD=5;
    public static final int RULE_SHARP=17;

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

                if ( (LA2_0==RULE_DOLLAR) ) {
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

                if ( (LA3_0==RULE_WORD||LA3_0==RULE_MIXIN_ID||(LA3_0>=RULE_AMP && LA3_0<=RULE_DOT)) ) {
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:137:1: ruleVariableDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Variable_0= ruleVariable this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleVariableDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_SEMI_COLON_3=null;
        AntlrDatatypeRuleToken this_Variable_0 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:140:28: ( (this_Variable_0= ruleVariable this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_Variable_0= ruleVariable this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_Variable_0= ruleVariable this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:142:5: this_Variable_0= ruleVariable this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON
            {
             
                    newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleVariable_in_ruleVariableDeclaration272);
            this_Variable_0=ruleVariable();

            state._fsp--;


            		current.merge(this_Variable_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleVariableDeclaration292); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleVariableDeclaration312); 

            		current.merge(this_WORD_2);
                
             
                newLeafNode(this_WORD_2, grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
                
            this_SEMI_COLON_3=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration332); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:181:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:182:2: (iv_ruleRule= ruleRule EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule378);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule389); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:190:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACE_LEFT_2=null;
        Token this_BRACE_RIGHT_4=null;
        AntlrDatatypeRuleToken this_RuleHead_0 = null;

        AntlrDatatypeRuleToken this_Mixin_1 = null;

        AntlrDatatypeRuleToken this_RuleBody_3 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:193:28: ( ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:194:1: ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:194:1: ( (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:194:2: (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin ) this_BRACE_LEFT_2= RULE_BRACE_LEFT this_RuleBody_3= ruleRuleBody this_BRACE_RIGHT_4= RULE_BRACE_RIGHT
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:194:2: (this_RuleHead_0= ruleRuleHead | this_Mixin_1= ruleMixin )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WORD||(LA4_0>=RULE_AMP && LA4_0<=RULE_DOT)) ) {
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
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:195:5: this_RuleHead_0= ruleRuleHead
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleHead_in_ruleRule437);
                    this_RuleHead_0=ruleRuleHead();

                    state._fsp--;


                    		current.merge(this_RuleHead_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:207:5: this_Mixin_1= ruleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleMixin_in_ruleRule470);
                    this_Mixin_1=ruleMixin();

                    state._fsp--;


                    		current.merge(this_Mixin_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_BRACE_LEFT_2=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_ruleRule491); 

            		current.merge(this_BRACE_LEFT_2);
                
             
                newLeafNode(this_BRACE_LEFT_2, grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleRuleBody_in_ruleRule518);
            this_RuleBody_3=ruleRuleBody();

            state._fsp--;


            		current.merge(this_RuleBody_3);
                
             
                    afterParserOrEnumRuleCall();
                
            this_BRACE_RIGHT_4=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_ruleRule538); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:250:1: entryRuleRuleHead returns [String current=null] : iv_ruleRuleHead= ruleRuleHead EOF ;
    public final String entryRuleRuleHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleHead = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:251:2: (iv_ruleRuleHead= ruleRuleHead EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:252:2: iv_ruleRuleHead= ruleRuleHead EOF
            {
             newCompositeNode(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead584);
            iv_ruleRuleHead=ruleRuleHead();

            state._fsp--;

             current =iv_ruleRuleHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead595); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:259:1: ruleRuleHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Selector_0= ruleSelector (this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_Selector_0 = null;

        AntlrDatatypeRuleToken this_Selector_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:262:28: ( (this_Selector_0= ruleSelector (this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector )* ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:263:1: (this_Selector_0= ruleSelector (this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector )* )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:263:1: (this_Selector_0= ruleSelector (this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:264:5: this_Selector_0= ruleSelector (this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector )*
            {
             
                    newCompositeNode(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSelector_in_ruleRuleHead642);
            this_Selector_0=ruleSelector();

            state._fsp--;


            		current.merge(this_Selector_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:274:1: (this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:274:6: this_COMMA_1= RULE_COMMA this_Selector_2= ruleSelector
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRuleHead663); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSelector_in_ruleRuleHead690);
            	    this_Selector_2=ruleSelector();

            	    state._fsp--;


            	    		current.merge(this_Selector_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:300:1: entryRuleRuleBody returns [String current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final String entryRuleRuleBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleBody = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:301:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:302:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody738);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody749); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:309:1: ruleRuleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* ;
    public final AntlrDatatypeRuleToken ruleRuleBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyDeclaration_0 = null;

        AntlrDatatypeRuleToken this_Include_1 = null;

        AntlrDatatypeRuleToken this_Rule_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:312:28: ( (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:313:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:313:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_WORD||LA6_2==RULE_BRACE_LEFT||LA6_2==RULE_COMMA||(LA6_2>=RULE_SHARP && LA6_2<=RULE_DOT)) ) {
                        alt6=3;
                    }
                    else if ( (LA6_2==RULE_COLON) ) {
                        alt6=1;
                    }


                    }
                    break;
                case RULE_INCLUDE_ID:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_MIXIN_ID:
                case RULE_AMP:
                case RULE_SHARP:
                case RULE_DOT:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:314:5: this_PropertyDeclaration_0= rulePropertyDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleBody796);
            	    this_PropertyDeclaration_0=rulePropertyDeclaration();

            	    state._fsp--;


            	    		current.merge(this_PropertyDeclaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:326:5: this_Include_1= ruleInclude
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInclude_in_ruleRuleBody829);
            	    this_Include_1=ruleInclude();

            	    state._fsp--;


            	    		current.merge(this_Include_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:338:5: this_Rule_2= ruleRule
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleBody862);
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:356:1: entryRulePropertyDeclaration returns [String current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final String entryRulePropertyDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:357:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:358:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration909);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration920); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:365:1: rulePropertyDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_SEMI_COLON_4=null;
        Token this_BRACE_LEFT_5=null;
        Token this_BRACE_RIGHT_7=null;
        AntlrDatatypeRuleToken this_Variable_3 = null;

        AntlrDatatypeRuleToken this_PropertyDeclaration_6 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:368:28: ( (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:369:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:369:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:369:6: this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) )
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration960); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyDeclaration980); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:383:1: ( ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WORD||LA9_0==RULE_DOLLAR) ) {
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
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:383:2: ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:383:2: ( (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:383:3: (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+ this_SEMI_COLON_4= RULE_SEMI_COLON
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:383:3: (this_WORD_2= RULE_WORD | this_Variable_3= ruleVariable )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_WORD) ) {
                            alt7=1;
                        }
                        else if ( (LA7_0==RULE_DOLLAR) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:383:8: this_WORD_2= RULE_WORD
                    	    {
                    	    this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration1003); 

                    	    		current.merge(this_WORD_2);
                    	        
                    	     
                    	        newLeafNode(this_WORD_2, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:392:5: this_Variable_3= ruleVariable
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getVariableParserRuleCall_2_0_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleVariable_in_rulePropertyDeclaration1036);
                    	    this_Variable_3=ruleVariable();

                    	    state._fsp--;


                    	    		current.merge(this_Variable_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

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

                    this_SEMI_COLON_4=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1058); 

                    		current.merge(this_SEMI_COLON_4);
                        
                     
                        newLeafNode(this_SEMI_COLON_4, grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:410:6: (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:410:6: (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:410:11: this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT
                    {
                    this_BRACE_LEFT_5=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1086); 

                    		current.merge(this_BRACE_LEFT_5);
                        
                     
                        newLeafNode(this_BRACE_LEFT_5, grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
                        
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:417:1: (this_PropertyDeclaration_6= rulePropertyDeclaration )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_WORD) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:418:5: this_PropertyDeclaration_6= rulePropertyDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1114);
                    	    this_PropertyDeclaration_6=rulePropertyDeclaration();

                    	    state._fsp--;


                    	    		current.merge(this_PropertyDeclaration_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_BRACE_RIGHT_7=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1136); 

                    		current.merge(this_BRACE_RIGHT_7);
                        
                     
                        newLeafNode(this_BRACE_RIGHT_7, grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 
                        

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:1: entryRuleCharset returns [String current=null] : iv_ruleCharset= ruleCharset EOF ;
    public final String entryRuleCharset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCharset = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:444:2: (iv_ruleCharset= ruleCharset EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:445:2: iv_ruleCharset= ruleCharset EOF
            {
             newCompositeNode(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_ruleCharset_in_entryRuleCharset1184);
            iv_ruleCharset=ruleCharset();

            state._fsp--;

             current =iv_ruleCharset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharset1195); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:452:1: ruleCharset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleCharset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHARSET_ID_0=null;
        Token this_STRING_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:455:28: ( (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:456:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:456:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:456:6: this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_CHARSET_ID_0=(Token)match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_ruleCharset1235); 

            		current.merge(this_CHARSET_ID_0);
                
             
                newLeafNode(this_CHARSET_ID_0, grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharset1255); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleCharset1275); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:485:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:486:2: (iv_ruleInclude= ruleInclude EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:487:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1321);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1332); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:494:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INCLUDE_ID_0=null;
        Token this_WORD_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:497:28: ( (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:498:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:498:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:498:6: this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_INCLUDE_ID_0=(Token)match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_ruleInclude1372); 

            		current.merge(this_INCLUDE_ID_0);
                
             
                newLeafNode(this_INCLUDE_ID_0, grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleInclude1392); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleInclude1412); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:527:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:2: (iv_ruleMixin= ruleMixin EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:529:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin1458);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin1469); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:536:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIXIN_ID_0=null;
        Token this_WORD_1=null;
        Token this_PAREN_LEFT_2=null;
        Token this_PAREN_RIGHT_4=null;
        AntlrDatatypeRuleToken this_Variable_3 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:539:28: ( (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:540:1: (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:540:1: (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:540:6: this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )?
            {
            this_MIXIN_ID_0=(Token)match(input,RULE_MIXIN_ID,FOLLOW_RULE_MIXIN_ID_in_ruleMixin1509); 

            		current.merge(this_MIXIN_ID_0);
                
             
                newLeafNode(this_MIXIN_ID_0, grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleMixin1529); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:554:1: (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PAREN_LEFT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:554:6: this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Variable_3= ruleVariable this_PAREN_RIGHT_4= RULE_PAREN_RIGHT
                    {
                    this_PAREN_LEFT_2=(Token)match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_ruleMixin1550); 

                    		current.merge(this_PAREN_LEFT_2);
                        
                     
                        newLeafNode(this_PAREN_LEFT_2, grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getMixinAccess().getVariableParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleMixin1577);
                    this_Variable_3=ruleVariable();

                    state._fsp--;


                    		current.merge(this_Variable_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    this_PAREN_RIGHT_4=(Token)match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_ruleMixin1597); 

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


    // $ANTLR start "entryRuleSelector"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:587:1: entryRuleSelector returns [String current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final String entryRuleSelector() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelector = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:588:2: (iv_ruleSelector= ruleSelector EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:589:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector1645);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector1656); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:596:1: ruleSelector returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD ) | ( (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD )+ ) ;
    public final AntlrDatatypeRuleToken ruleSelector() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AMP_0=null;
        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_SHARP_3=null;
        Token this_DOT_4=null;
        Token this_WORD_5=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:599:28: ( ( (this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD ) | ( (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD )+ ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:1: ( (this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD ) | ( (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD )+ )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:1: ( (this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD ) | ( (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD )+ )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_AMP) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_WORD||(LA13_0>=RULE_SHARP && LA13_0<=RULE_DOT)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:2: (this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:2: (this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:7: this_AMP_0= RULE_AMP this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD
                    {
                    this_AMP_0=(Token)match(input,RULE_AMP,FOLLOW_RULE_AMP_in_ruleSelector1697); 

                    		current.merge(this_AMP_0);
                        
                     
                        newLeafNode(this_AMP_0, grammarAccess.getSelectorAccess().getAMPTerminalRuleCall_0_0()); 
                        
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSelector1717); 

                    		current.merge(this_COLON_1);
                        
                     
                        newLeafNode(this_COLON_1, grammarAccess.getSelectorAccess().getCOLONTerminalRuleCall_0_1()); 
                        
                    this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleSelector1737); 

                    		current.merge(this_WORD_2);
                        
                     
                        newLeafNode(this_WORD_2, grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:6: ( (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD )+
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:6: ( (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_WORD||(LA12_0>=RULE_SHARP && LA12_0<=RULE_DOT)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:7: (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )? this_WORD_5= RULE_WORD
                    	    {
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:7: (this_SHARP_3= RULE_SHARP | this_DOT_4= RULE_DOT )?
                    	    int alt11=3;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==RULE_SHARP) ) {
                    	        alt11=1;
                    	    }
                    	    else if ( (LA11_0==RULE_DOT) ) {
                    	        alt11=2;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:12: this_SHARP_3= RULE_SHARP
                    	            {
                    	            this_SHARP_3=(Token)match(input,RULE_SHARP,FOLLOW_RULE_SHARP_in_ruleSelector1766); 

                    	            		current.merge(this_SHARP_3);
                    	                
                    	             
                    	                newLeafNode(this_SHARP_3, grammarAccess.getSelectorAccess().getSHARPTerminalRuleCall_1_0_0()); 
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:630:10: this_DOT_4= RULE_DOT
                    	            {
                    	            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleSelector1792); 

                    	            		current.merge(this_DOT_4);
                    	                
                    	             
                    	                newLeafNode(this_DOT_4, grammarAccess.getSelectorAccess().getDOTTerminalRuleCall_1_0_1()); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    this_WORD_5=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleSelector1814); 

                    	    		current.merge(this_WORD_5);
                    	        
                    	     
                    	        newLeafNode(this_WORD_5, grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleVariable"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:652:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:653:2: (iv_ruleVariable= ruleVariable EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:654:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1862);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1873); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:661:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOLLAR_0= RULE_DOLLAR this_WORD_1= RULE_WORD ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOLLAR_0=null;
        Token this_WORD_1=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:664:28: ( (this_DOLLAR_0= RULE_DOLLAR this_WORD_1= RULE_WORD ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:665:1: (this_DOLLAR_0= RULE_DOLLAR this_WORD_1= RULE_WORD )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:665:1: (this_DOLLAR_0= RULE_DOLLAR this_WORD_1= RULE_WORD )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:665:6: this_DOLLAR_0= RULE_DOLLAR this_WORD_1= RULE_WORD
            {
            this_DOLLAR_0=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleVariable1913); 

            		current.merge(this_DOLLAR_0);
                
             
                newLeafNode(this_DOLLAR_0, grammarAccess.getVariableAccess().getDOLLARTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleVariable1933); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getVariableAccess().getWORDTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSass_in_entryRuleSass75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSass85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_ruleSass136 = new BitSet(new long[]{0x00000000000F2022L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSass154 = new BitSet(new long[]{0x00000000000F2022L});
    public static final BitSet FOLLOW_ruleRule_in_ruleSass176 = new BitSet(new long[]{0x0000000000072022L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariableDeclaration272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleVariableDeclaration292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleVariableDeclaration312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_ruleRule437 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleRule470 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_ruleRule491 = new BitSet(new long[]{0x0000000000073120L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleRule518 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_ruleRule538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleRuleHead642 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRuleHead663 = new BitSet(new long[]{0x0000000000070020L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleRuleHead690 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleBody796 = new BitSet(new long[]{0x0000000000073022L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleRuleBody829 = new BitSet(new long[]{0x0000000000073022L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleBody862 = new BitSet(new long[]{0x0000000000073022L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyDeclaration980 = new BitSet(new long[]{0x00000000000800A0L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration1003 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_ruleVariable_in_rulePropertyDeclaration1036 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1086 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1114 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset1184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_ruleCharset1235 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharset1255 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleCharset1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_ruleInclude1372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleInclude1392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleInclude1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MIXIN_ID_in_ruleMixin1509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleMixin1529 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_ruleMixin1550 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleMixin1577 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_ruleMixin1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AMP_in_ruleSelector1697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSelector1717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleSelector1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SHARP_in_ruleSelector1766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleSelector1792 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleSelector1814 = new BitSet(new long[]{0x0000000000060022L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleVariable1913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleVariable1933 = new BitSet(new long[]{0x0000000000000002L});

}