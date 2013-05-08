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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_COLON", "RULE_SEMI_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_SELECTOR", "RULE_COMMA", "RULE_WORD", "RULE_PAREN_LEFT", "RULE_PAREN_RIGHT", "RULE_HEX_DIGIT", "RULE_HEX_COLOR", "RULE_PLUS", "RULE_MINUS", "RULE_DIVIDE", "RULE_MULTIPLY", "RULE_CHARSET_ID", "RULE_STRING", "RULE_INCLUDE_ID", "RULE_MIXIN_ID", "RULE_DOT", "RULE_HASH", "RULE_DOLLAR", "RULE_AMP", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=27;
    public static final int RULE_ID=29;
    public static final int RULE_BRACE_RIGHT=8;
    public static final int RULE_ANY_OTHER=33;
    public static final int RULE_PLUS=16;
    public static final int RULE_HEX_COLOR=15;
    public static final int RULE_HEX_DIGIT=14;
    public static final int RULE_HASH=25;
    public static final int RULE_COMMA=10;
    public static final int RULE_INCLUDE_ID=22;
    public static final int RULE_MIXIN_ID=23;
    public static final int RULE_DIVIDE=18;
    public static final int RULE_SL_COMMENT=31;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=30;
    public static final int RULE_PAREN_LEFT=12;
    public static final int RULE_BRACE_LEFT=7;
    public static final int RULE_DOLLAR=26;
    public static final int RULE_COLON=5;
    public static final int RULE_MINUS=17;
    public static final int RULE_STRING=21;
    public static final int RULE_DOT=24;
    public static final int RULE_CHARSET_ID=20;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_MULTIPLY=19;
    public static final int RULE_PAREN_RIGHT=13;
    public static final int RULE_SEMI_COLON=6;
    public static final int RULE_INT=28;
    public static final int RULE_WS=32;
    public static final int RULE_SELECTOR=9;
    public static final int RULE_WORD=11;

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:137:1: ruleVariableDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_Property_2= ruleProperty this_SEMI_COLON_3= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleVariableDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_COLON_1=null;
        Token this_SEMI_COLON_3=null;
        AntlrDatatypeRuleToken this_Property_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:140:28: ( (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_Property_2= ruleProperty this_SEMI_COLON_3= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_Property_2= ruleProperty this_SEMI_COLON_3= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_Property_2= ruleProperty this_SEMI_COLON_3= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:6: this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_Property_2= ruleProperty this_SEMI_COLON_3= RULE_SEMI_COLON
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration265); 

            		current.merge(this_VARIABLE_0);
                
             
                newLeafNode(this_VARIABLE_0, grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleVariableDeclaration285); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getVariableDeclarationAccess().getPropertyParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleProperty_in_ruleVariableDeclaration312);
            this_Property_2=ruleProperty();

            state._fsp--;


            		current.merge(this_Property_2);
                
             
                    afterParserOrEnumRuleCall();
                
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:259:1: ruleRuleHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SELECTOR_0=null;
        Token this_COMMA_1=null;
        Token this_SELECTOR_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:262:28: ( (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:263:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:263:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:263:6: this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            {
            this_SELECTOR_0=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead635); 

            		current.merge(this_SELECTOR_0);
                
             
                newLeafNode(this_SELECTOR_0, grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:270:1: (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:270:6: this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRuleHead656); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    this_SELECTOR_2=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead676); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:292:1: entryRuleRuleBody returns [String current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final String entryRuleRuleBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleBody = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:293:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:294:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody724);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody735); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:301:1: ruleRuleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* ;
    public final AntlrDatatypeRuleToken ruleRuleBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyDeclaration_0 = null;

        AntlrDatatypeRuleToken this_Include_1 = null;

        AntlrDatatypeRuleToken this_Rule_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:304:28: ( (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:305:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:305:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
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
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:306:5: this_PropertyDeclaration_0= rulePropertyDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleBody782);
            	    this_PropertyDeclaration_0=rulePropertyDeclaration();

            	    state._fsp--;


            	    		current.merge(this_PropertyDeclaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:318:5: this_Include_1= ruleInclude
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInclude_in_ruleRuleBody815);
            	    this_Include_1=ruleInclude();

            	    state._fsp--;


            	    		current.merge(this_Include_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:330:5: this_Rule_2= ruleRule
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleBody848);
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:348:1: entryRulePropertyDeclaration returns [String current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final String entryRulePropertyDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:349:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:350:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration895);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration906); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:357:1: rulePropertyDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_COLON_1=null;
        Token this_SEMI_COLON_5=null;
        Token this_BRACE_LEFT_6=null;
        Token this_BRACE_RIGHT_8=null;
        AntlrDatatypeRuleToken this_Property_2 = null;

        AntlrDatatypeRuleToken this_Operator_3 = null;

        AntlrDatatypeRuleToken this_Property_4 = null;

        AntlrDatatypeRuleToken this_PropertyDeclaration_7 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:360:28: ( (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:361:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:361:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:361:6: this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) )
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration946); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyDeclaration966); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:1: ( ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON ) | (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_VARIABLE||LA11_0==RULE_WORD||(LA11_0>=RULE_HEX_DIGIT && LA11_0<=RULE_HEX_COLOR)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_BRACE_LEFT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:2: ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:2: ( (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:3: (this_Property_2= ruleProperty )+ (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )? this_SEMI_COLON_5= RULE_SEMI_COLON
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:375:3: (this_Property_2= ruleProperty )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_VARIABLE||LA7_0==RULE_WORD||(LA7_0>=RULE_HEX_DIGIT && LA7_0<=RULE_HEX_COLOR)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:376:5: this_Property_2= ruleProperty
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyParserRuleCall_2_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleProperty_in_rulePropertyDeclaration996);
                    	    this_Property_2=ruleProperty();

                    	    state._fsp--;


                    	    		current.merge(this_Property_2);
                    	        
                    	     
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

                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:386:3: (this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=RULE_PLUS && LA9_0<=RULE_MULTIPLY)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:387:5: this_Operator_3= ruleOperator (this_Property_4= ruleProperty )+
                            {
                             
                                    newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getOperatorParserRuleCall_2_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleOperator_in_rulePropertyDeclaration1026);
                            this_Operator_3=ruleOperator();

                            state._fsp--;


                            		current.merge(this_Operator_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:397:1: (this_Property_4= ruleProperty )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==RULE_VARIABLE||LA8_0==RULE_WORD||(LA8_0>=RULE_HEX_DIGIT && LA8_0<=RULE_HEX_COLOR)) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:398:5: this_Property_4= ruleProperty
                            	    {
                            	     
                            	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyParserRuleCall_2_0_1_1()); 
                            	        
                            	    pushFollow(FOLLOW_ruleProperty_in_rulePropertyDeclaration1054);
                            	    this_Property_4=ruleProperty();

                            	    state._fsp--;


                            	    		current.merge(this_Property_4);
                            	        
                            	     
                            	            afterParserOrEnumRuleCall();
                            	        

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);


                            }
                            break;

                    }

                    this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1078); 

                    		current.merge(this_SEMI_COLON_5);
                        
                     
                        newLeafNode(this_SEMI_COLON_5, grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:416:6: (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:416:6: (this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:416:11: this_BRACE_LEFT_6= RULE_BRACE_LEFT (this_PropertyDeclaration_7= rulePropertyDeclaration )* this_BRACE_RIGHT_8= RULE_BRACE_RIGHT
                    {
                    this_BRACE_LEFT_6=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1106); 

                    		current.merge(this_BRACE_LEFT_6);
                        
                     
                        newLeafNode(this_BRACE_LEFT_6, grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
                        
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:423:1: (this_PropertyDeclaration_7= rulePropertyDeclaration )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WORD) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:424:5: this_PropertyDeclaration_7= rulePropertyDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1134);
                    	    this_PropertyDeclaration_7=rulePropertyDeclaration();

                    	    state._fsp--;


                    	    		current.merge(this_PropertyDeclaration_7);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    this_BRACE_RIGHT_8=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1156); 

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


    // $ANTLR start "entryRuleFunction"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:449:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:450:2: (iv_ruleFunction= ruleFunction EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:451:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction1204);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction1215); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:458:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD this_PAREN_LEFT_1= RULE_PAREN_LEFT this_Property_2= ruleProperty (this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty )* this_PAREN_RIGHT_5= RULE_PAREN_RIGHT ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_PAREN_LEFT_1=null;
        Token this_COMMA_3=null;
        Token this_PAREN_RIGHT_5=null;
        AntlrDatatypeRuleToken this_Property_2 = null;

        AntlrDatatypeRuleToken this_Property_4 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:461:28: ( (this_WORD_0= RULE_WORD this_PAREN_LEFT_1= RULE_PAREN_LEFT this_Property_2= ruleProperty (this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty )* this_PAREN_RIGHT_5= RULE_PAREN_RIGHT ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:462:1: (this_WORD_0= RULE_WORD this_PAREN_LEFT_1= RULE_PAREN_LEFT this_Property_2= ruleProperty (this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty )* this_PAREN_RIGHT_5= RULE_PAREN_RIGHT )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:462:1: (this_WORD_0= RULE_WORD this_PAREN_LEFT_1= RULE_PAREN_LEFT this_Property_2= ruleProperty (this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty )* this_PAREN_RIGHT_5= RULE_PAREN_RIGHT )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:462:6: this_WORD_0= RULE_WORD this_PAREN_LEFT_1= RULE_PAREN_LEFT this_Property_2= ruleProperty (this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty )* this_PAREN_RIGHT_5= RULE_PAREN_RIGHT
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleFunction1255); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getFunctionAccess().getWORDTerminalRuleCall_0()); 
                
            this_PAREN_LEFT_1=(Token)match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_ruleFunction1275); 

            		current.merge(this_PAREN_LEFT_1);
                
             
                newLeafNode(this_PAREN_LEFT_1, grammarAccess.getFunctionAccess().getPAREN_LEFTTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getFunctionAccess().getPropertyParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleProperty_in_ruleFunction1302);
            this_Property_2=ruleProperty();

            state._fsp--;


            		current.merge(this_Property_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:487:1: (this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:487:6: this_COMMA_3= RULE_COMMA this_Property_4= ruleProperty
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFunction1323); 

            	    		current.merge(this_COMMA_3);
            	        
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getFunctionAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFunctionAccess().getPropertyParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleProperty_in_ruleFunction1350);
            	    this_Property_4=ruleProperty();

            	    state._fsp--;


            	    		current.merge(this_Property_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_PAREN_RIGHT_5=(Token)match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_ruleFunction1372); 

            		current.merge(this_PAREN_RIGHT_5);
                
             
                newLeafNode(this_PAREN_RIGHT_5, grammarAccess.getFunctionAccess().getPAREN_RIGHTTerminalRuleCall_4()); 
                

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


    // $ANTLR start "entryRuleProperty"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:520:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:521:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:522:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1418);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1429); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:529:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD | this_HEX_DIGIT_1= RULE_HEX_DIGIT | this_HEX_COLOR_2= RULE_HEX_COLOR | this_VARIABLE_3= RULE_VARIABLE | this_Function_4= ruleFunction ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_HEX_DIGIT_1=null;
        Token this_HEX_COLOR_2=null;
        Token this_VARIABLE_3=null;
        AntlrDatatypeRuleToken this_Function_4 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:28: ( (this_WORD_0= RULE_WORD | this_HEX_DIGIT_1= RULE_HEX_DIGIT | this_HEX_COLOR_2= RULE_HEX_COLOR | this_VARIABLE_3= RULE_VARIABLE | this_Function_4= ruleFunction ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:533:1: (this_WORD_0= RULE_WORD | this_HEX_DIGIT_1= RULE_HEX_DIGIT | this_HEX_COLOR_2= RULE_HEX_COLOR | this_VARIABLE_3= RULE_VARIABLE | this_Function_4= ruleFunction )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:533:1: (this_WORD_0= RULE_WORD | this_HEX_DIGIT_1= RULE_HEX_DIGIT | this_HEX_COLOR_2= RULE_HEX_COLOR | this_VARIABLE_3= RULE_VARIABLE | this_Function_4= ruleFunction )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_PAREN_LEFT) ) {
                    alt13=5;
                }
                else if ( (LA13_1==EOF||LA13_1==RULE_VARIABLE||LA13_1==RULE_SEMI_COLON||(LA13_1>=RULE_COMMA && LA13_1<=RULE_WORD)||(LA13_1>=RULE_PAREN_RIGHT && LA13_1<=RULE_MULTIPLY)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEX_DIGIT:
                {
                alt13=2;
                }
                break;
            case RULE_HEX_COLOR:
                {
                alt13=3;
                }
                break;
            case RULE_VARIABLE:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:533:6: this_WORD_0= RULE_WORD
                    {
                    this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleProperty1469); 

                    		current.merge(this_WORD_0);
                        
                     
                        newLeafNode(this_WORD_0, grammarAccess.getPropertyAccess().getWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:541:10: this_HEX_DIGIT_1= RULE_HEX_DIGIT
                    {
                    this_HEX_DIGIT_1=(Token)match(input,RULE_HEX_DIGIT,FOLLOW_RULE_HEX_DIGIT_in_ruleProperty1495); 

                    		current.merge(this_HEX_DIGIT_1);
                        
                     
                        newLeafNode(this_HEX_DIGIT_1, grammarAccess.getPropertyAccess().getHEX_DIGITTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:549:10: this_HEX_COLOR_2= RULE_HEX_COLOR
                    {
                    this_HEX_COLOR_2=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleProperty1521); 

                    		current.merge(this_HEX_COLOR_2);
                        
                     
                        newLeafNode(this_HEX_COLOR_2, grammarAccess.getPropertyAccess().getHEX_COLORTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:557:10: this_VARIABLE_3= RULE_VARIABLE
                    {
                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleProperty1547); 

                    		current.merge(this_VARIABLE_3);
                        
                     
                        newLeafNode(this_VARIABLE_3, grammarAccess.getPropertyAccess().getVARIABLETerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:566:5: this_Function_4= ruleFunction
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFunctionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFunction_in_ruleProperty1580);
                    this_Function_4=ruleFunction();

                    state._fsp--;


                    		current.merge(this_Function_4);
                        
                     
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleOperator"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:584:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:585:2: (iv_ruleOperator= ruleOperator EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:586:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1626);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1637); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:593:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_DIVIDE_2= RULE_DIVIDE | this_MULTIPLY_3= RULE_MULTIPLY ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_MINUS_1=null;
        Token this_DIVIDE_2=null;
        Token this_MULTIPLY_3=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:596:28: ( (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_DIVIDE_2= RULE_DIVIDE | this_MULTIPLY_3= RULE_MULTIPLY ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:597:1: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_DIVIDE_2= RULE_DIVIDE | this_MULTIPLY_3= RULE_MULTIPLY )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:597:1: (this_PLUS_0= RULE_PLUS | this_MINUS_1= RULE_MINUS | this_DIVIDE_2= RULE_DIVIDE | this_MULTIPLY_3= RULE_MULTIPLY )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt14=1;
                }
                break;
            case RULE_MINUS:
                {
                alt14=2;
                }
                break;
            case RULE_DIVIDE:
                {
                alt14=3;
                }
                break;
            case RULE_MULTIPLY:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:597:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOperator1677); 

                    		current.merge(this_PLUS_0);
                        
                     
                        newLeafNode(this_PLUS_0, grammarAccess.getOperatorAccess().getPLUSTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:605:10: this_MINUS_1= RULE_MINUS
                    {
                    this_MINUS_1=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOperator1703); 

                    		current.merge(this_MINUS_1);
                        
                     
                        newLeafNode(this_MINUS_1, grammarAccess.getOperatorAccess().getMINUSTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:613:10: this_DIVIDE_2= RULE_DIVIDE
                    {
                    this_DIVIDE_2=(Token)match(input,RULE_DIVIDE,FOLLOW_RULE_DIVIDE_in_ruleOperator1729); 

                    		current.merge(this_DIVIDE_2);
                        
                     
                        newLeafNode(this_DIVIDE_2, grammarAccess.getOperatorAccess().getDIVIDETerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:621:10: this_MULTIPLY_3= RULE_MULTIPLY
                    {
                    this_MULTIPLY_3=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_ruleOperator1755); 

                    		current.merge(this_MULTIPLY_3);
                        
                     
                        newLeafNode(this_MULTIPLY_3, grammarAccess.getOperatorAccess().getMULTIPLYTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleCharset"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:636:1: entryRuleCharset returns [String current=null] : iv_ruleCharset= ruleCharset EOF ;
    public final String entryRuleCharset() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCharset = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:637:2: (iv_ruleCharset= ruleCharset EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:638:2: iv_ruleCharset= ruleCharset EOF
            {
             newCompositeNode(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_ruleCharset_in_entryRuleCharset1801);
            iv_ruleCharset=ruleCharset();

            state._fsp--;

             current =iv_ruleCharset.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharset1812); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:645:1: ruleCharset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleCharset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHARSET_ID_0=null;
        Token this_STRING_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:648:28: ( (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:649:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:649:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:649:6: this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_CHARSET_ID_0=(Token)match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_ruleCharset1852); 

            		current.merge(this_CHARSET_ID_0);
                
             
                newLeafNode(this_CHARSET_ID_0, grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharset1872); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleCharset1892); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:678:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:679:2: (iv_ruleInclude= ruleInclude EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:680:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1938);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1949); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:687:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT )? this_SEMI_COLON_7= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INCLUDE_ID_0=null;
        Token this_WORD_1=null;
        Token this_PAREN_LEFT_2=null;
        Token this_COMMA_4=null;
        Token this_PAREN_RIGHT_6=null;
        Token this_SEMI_COLON_7=null;
        AntlrDatatypeRuleToken this_Property_3 = null;

        AntlrDatatypeRuleToken this_Property_5 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:690:28: ( (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT )? this_SEMI_COLON_7= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:691:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT )? this_SEMI_COLON_7= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:691:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT )? this_SEMI_COLON_7= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:691:6: this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT )? this_SEMI_COLON_7= RULE_SEMI_COLON
            {
            this_INCLUDE_ID_0=(Token)match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_ruleInclude1989); 

            		current.merge(this_INCLUDE_ID_0);
                
             
                newLeafNode(this_INCLUDE_ID_0, grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleInclude2009); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:705:1: (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PAREN_LEFT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:705:6: this_PAREN_LEFT_2= RULE_PAREN_LEFT this_Property_3= ruleProperty (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )* this_PAREN_RIGHT_6= RULE_PAREN_RIGHT
                    {
                    this_PAREN_LEFT_2=(Token)match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_ruleInclude2030); 

                    		current.merge(this_PAREN_LEFT_2);
                        
                     
                        newLeafNode(this_PAREN_LEFT_2, grammarAccess.getIncludeAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIncludeAccess().getPropertyParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleProperty_in_ruleInclude2057);
                    this_Property_3=ruleProperty();

                    state._fsp--;


                    		current.merge(this_Property_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:723:1: (this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:723:6: this_COMMA_4= RULE_COMMA this_Property_5= ruleProperty
                    	    {
                    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInclude2078); 

                    	    		current.merge(this_COMMA_4);
                    	        
                    	     
                    	        newLeafNode(this_COMMA_4, grammarAccess.getIncludeAccess().getCOMMATerminalRuleCall_2_2_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getIncludeAccess().getPropertyParserRuleCall_2_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleInclude2105);
                    	    this_Property_5=ruleProperty();

                    	    state._fsp--;


                    	    		current.merge(this_Property_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    this_PAREN_RIGHT_6=(Token)match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_ruleInclude2127); 

                    		current.merge(this_PAREN_RIGHT_6);
                        
                     
                        newLeafNode(this_PAREN_RIGHT_6, grammarAccess.getIncludeAccess().getPAREN_RIGHTTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }

            this_SEMI_COLON_7=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleInclude2149); 

            		current.merge(this_SEMI_COLON_7);
                
             
                newLeafNode(this_SEMI_COLON_7, grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_3()); 
                

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:763:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:764:2: (iv_ruleMixin= ruleMixin EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:765:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin2195);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin2206); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:772:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIXIN_ID_0=null;
        Token this_WORD_1=null;
        Token this_PAREN_LEFT_2=null;
        Token this_VARIABLE_3=null;
        Token this_PAREN_RIGHT_4=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:775:28: ( (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:776:1: (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:776:1: (this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )? )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:776:6: this_MIXIN_ID_0= RULE_MIXIN_ID this_WORD_1= RULE_WORD (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )?
            {
            this_MIXIN_ID_0=(Token)match(input,RULE_MIXIN_ID,FOLLOW_RULE_MIXIN_ID_in_ruleMixin2246); 

            		current.merge(this_MIXIN_ID_0);
                
             
                newLeafNode(this_MIXIN_ID_0, grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleMixin2266); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:790:1: (this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_PAREN_LEFT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:790:6: this_PAREN_LEFT_2= RULE_PAREN_LEFT this_VARIABLE_3= RULE_VARIABLE this_PAREN_RIGHT_4= RULE_PAREN_RIGHT
                    {
                    this_PAREN_LEFT_2=(Token)match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_ruleMixin2287); 

                    		current.merge(this_PAREN_LEFT_2);
                        
                     
                        newLeafNode(this_PAREN_LEFT_2, grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
                        
                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleMixin2307); 

                    		current.merge(this_VARIABLE_3);
                        
                     
                        newLeafNode(this_VARIABLE_3, grammarAccess.getMixinAccess().getVARIABLETerminalRuleCall_2_1()); 
                        
                    this_PAREN_RIGHT_4=(Token)match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_ruleMixin2327); 

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
    public static final BitSet FOLLOW_ruleCharset_in_ruleSass136 = new BitSet(new long[]{0x0000000000800212L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSass154 = new BitSet(new long[]{0x0000000000800212L});
    public static final BitSet FOLLOW_ruleRule_in_ruleSass176 = new BitSet(new long[]{0x0000000000800202L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleVariableDeclaration285 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleVariableDeclaration312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_ruleRule437 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleRule470 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_ruleRule491 = new BitSet(new long[]{0x0000000000C00B00L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleRule518 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_ruleRule538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead635 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRuleHead656 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead676 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleBody782 = new BitSet(new long[]{0x0000000000C00A02L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleRuleBody815 = new BitSet(new long[]{0x0000000000C00A02L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleBody848 = new BitSet(new long[]{0x0000000000C00A02L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration946 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyDeclaration966 = new BitSet(new long[]{0x000000000000C890L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyDeclaration996 = new BitSet(new long[]{0x00000000000FC850L});
    public static final BitSet FOLLOW_ruleOperator_in_rulePropertyDeclaration1026 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePropertyDeclaration1054 = new BitSet(new long[]{0x000000000000C850L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1106 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1134 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleFunction1255 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_ruleFunction1275 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFunction1302 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFunction1323 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleFunction1350 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_ruleFunction1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleProperty1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_DIGIT_in_ruleProperty1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleProperty1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleProperty1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProperty1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOperator1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOperator1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIVIDE_in_ruleOperator1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_ruleOperator1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_ruleCharset1852 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharset1872 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleCharset1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_ruleInclude1989 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleInclude2009 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_ruleInclude2030 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleInclude2057 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInclude2078 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleInclude2105 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_ruleInclude2127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleInclude2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin2195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MIXIN_ID_in_ruleMixin2246 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleMixin2266 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_ruleMixin2287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleMixin2307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_ruleMixin2327 = new BitSet(new long[]{0x0000000000000002L});

}