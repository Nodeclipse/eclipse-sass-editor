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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CHARSET_ID", "RULE_STRING", "RULE_SEMI_COLON", "RULE_INCLUDE_ID", "RULE_WORD", "RULE_VARIABLE", "RULE_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_SELECTOR", "RULE_COMMA", "RULE_DOT", "RULE_SHARP", "RULE_DOLLAR", "RULE_AMP", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=18;
    public static final int RULE_ID=20;
    public static final int RULE_BRACE_RIGHT=12;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_COMMA=14;
    public static final int RULE_INCLUDE_ID=7;
    public static final int RULE_SL_COMMENT=22;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=21;
    public static final int RULE_BRACE_LEFT=11;
    public static final int RULE_DOLLAR=17;
    public static final int RULE_COLON=10;
    public static final int RULE_STRING=5;
    public static final int RULE_CHARSET_ID=4;
    public static final int RULE_DOT=15;
    public static final int RULE_VARIABLE=9;
    public static final int RULE_SEMI_COLON=6;
    public static final int RULE_INT=19;
    public static final int RULE_WS=23;
    public static final int RULE_WORD=8;
    public static final int RULE_SELECTOR=13;
    public static final int RULE_SHARP=16;

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:137:1: ruleCharset returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleCharset() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHARSET_ID_0=null;
        Token this_STRING_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:140:28: ( (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:1: (this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:141:6: this_CHARSET_ID_0= RULE_CHARSET_ID this_STRING_1= RULE_STRING this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_CHARSET_ID_0=(Token)match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_ruleCharset265); 

            		current.merge(this_CHARSET_ID_0);
                
             
                newLeafNode(this_CHARSET_ID_0, grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCharset285); 

            		current.merge(this_STRING_1);
                
             
                newLeafNode(this_STRING_1, grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleCharset305); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:170:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:171:2: (iv_ruleInclude= ruleInclude EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:172:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude351);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude362); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:179:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INCLUDE_ID_0=null;
        Token this_WORD_1=null;
        Token this_SEMI_COLON_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:182:28: ( (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:1: (this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:183:6: this_INCLUDE_ID_0= RULE_INCLUDE_ID this_WORD_1= RULE_WORD this_SEMI_COLON_2= RULE_SEMI_COLON
            {
            this_INCLUDE_ID_0=(Token)match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_ruleInclude402); 

            		current.merge(this_INCLUDE_ID_0);
                
             
                newLeafNode(this_INCLUDE_ID_0, grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
                
            this_WORD_1=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleInclude422); 

            		current.merge(this_WORD_1);
                
             
                newLeafNode(this_WORD_1, grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
                
            this_SEMI_COLON_2=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleInclude442); 

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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:212:1: entryRuleVariableDeclaration returns [String current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final String entryRuleVariableDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:213:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:214:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration488);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration499); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:221:1: ruleVariableDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON ) ;
    public final AntlrDatatypeRuleToken ruleVariableDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_SEMI_COLON_3=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:224:28: ( (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:225:1: (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:225:1: (this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:225:6: this_VARIABLE_0= RULE_VARIABLE this_COLON_1= RULE_COLON this_WORD_2= RULE_WORD this_SEMI_COLON_3= RULE_SEMI_COLON
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration539); 

            		current.merge(this_VARIABLE_0);
                
             
                newLeafNode(this_VARIABLE_0, grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleVariableDeclaration559); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleVariableDeclaration579); 

            		current.merge(this_WORD_2);
                
             
                newLeafNode(this_WORD_2, grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
                
            this_SEMI_COLON_3=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration599); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:261:1: entryRuleRule returns [String current=null] : iv_ruleRule= ruleRule EOF ;
    public final String entryRuleRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRule = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:262:2: (iv_ruleRule= ruleRule EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:263:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule645);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule656); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:270:1: ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RuleHead_0= ruleRuleHead this_BRACE_LEFT_1= RULE_BRACE_LEFT this_RuleBody_2= ruleRuleBody this_BRACE_RIGHT_3= RULE_BRACE_RIGHT ) ;
    public final AntlrDatatypeRuleToken ruleRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACE_LEFT_1=null;
        Token this_BRACE_RIGHT_3=null;
        AntlrDatatypeRuleToken this_RuleHead_0 = null;

        AntlrDatatypeRuleToken this_RuleBody_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:273:28: ( (this_RuleHead_0= ruleRuleHead this_BRACE_LEFT_1= RULE_BRACE_LEFT this_RuleBody_2= ruleRuleBody this_BRACE_RIGHT_3= RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:274:1: (this_RuleHead_0= ruleRuleHead this_BRACE_LEFT_1= RULE_BRACE_LEFT this_RuleBody_2= ruleRuleBody this_BRACE_RIGHT_3= RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:274:1: (this_RuleHead_0= ruleRuleHead this_BRACE_LEFT_1= RULE_BRACE_LEFT this_RuleBody_2= ruleRuleBody this_BRACE_RIGHT_3= RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:275:5: this_RuleHead_0= ruleRuleHead this_BRACE_LEFT_1= RULE_BRACE_LEFT this_RuleBody_2= ruleRuleBody this_BRACE_RIGHT_3= RULE_BRACE_RIGHT
            {
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleRuleHead_in_ruleRule703);
            this_RuleHead_0=ruleRuleHead();

            state._fsp--;


            		current.merge(this_RuleHead_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_BRACE_LEFT_1=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_ruleRule723); 

            		current.merge(this_BRACE_LEFT_1);
                
             
                newLeafNode(this_BRACE_LEFT_1, grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
                
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleRuleBody_in_ruleRule750);
            this_RuleBody_2=ruleRuleBody();

            state._fsp--;


            		current.merge(this_RuleBody_2);
                
             
                    afterParserOrEnumRuleCall();
                
            this_BRACE_RIGHT_3=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_ruleRule770); 

            		current.merge(this_BRACE_RIGHT_3);
                
             
                newLeafNode(this_BRACE_RIGHT_3, grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 
                

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:318:1: entryRuleRuleHead returns [String current=null] : iv_ruleRuleHead= ruleRuleHead EOF ;
    public final String entryRuleRuleHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleHead = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:319:2: (iv_ruleRuleHead= ruleRuleHead EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:320:2: iv_ruleRuleHead= ruleRuleHead EOF
            {
             newCompositeNode(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead816);
            iv_ruleRuleHead=ruleRuleHead();

            state._fsp--;

             current =iv_ruleRuleHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead827); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:327:1: ruleRuleHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) ;
    public final AntlrDatatypeRuleToken ruleRuleHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SELECTOR_0=null;
        Token this_COMMA_1=null;
        Token this_SELECTOR_2=null;

         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:330:28: ( (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:331:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:331:1: (this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:331:6: this_SELECTOR_0= RULE_SELECTOR (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            {
            this_SELECTOR_0=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead867); 

            		current.merge(this_SELECTOR_0);
                
             
                newLeafNode(this_SELECTOR_0, grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:338:1: (this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:338:6: this_COMMA_1= RULE_COMMA this_SELECTOR_2= RULE_SELECTOR
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleRuleHead888); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    this_SELECTOR_2=(Token)match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_ruleRuleHead908); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:360:1: entryRuleRuleBody returns [String current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final String entryRuleRuleBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleBody = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:361:2: (iv_ruleRuleBody= ruleRuleBody EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:362:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody956);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody967); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:369:1: ruleRuleBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* ;
    public final AntlrDatatypeRuleToken ruleRuleBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyDeclaration_0 = null;

        AntlrDatatypeRuleToken this_Include_1 = null;

        AntlrDatatypeRuleToken this_Rule_2 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:372:28: ( (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:373:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:373:1: (this_PropertyDeclaration_0= rulePropertyDeclaration | this_Include_1= ruleInclude | this_Rule_2= ruleRule )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case RULE_WORD:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_INCLUDE_ID:
                    {
                    alt5=2;
                    }
                    break;
                case RULE_SELECTOR:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:374:5: this_PropertyDeclaration_0= rulePropertyDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleRuleBody1014);
            	    this_PropertyDeclaration_0=rulePropertyDeclaration();

            	    state._fsp--;


            	    		current.merge(this_PropertyDeclaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:386:5: this_Include_1= ruleInclude
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInclude_in_ruleRuleBody1047);
            	    this_Include_1=ruleInclude();

            	    state._fsp--;


            	    		current.merge(this_Include_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:398:5: this_Rule_2= ruleRule
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleRule_in_ruleRuleBody1080);
            	    this_Rule_2=ruleRule();

            	    state._fsp--;


            	    		current.merge(this_Rule_2);
            	        
            	     
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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:416:1: entryRulePropertyDeclaration returns [String current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final String entryRulePropertyDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyDeclaration = null;


        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:417:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:418:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration1127);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;

             current =iv_rulePropertyDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration1138); 

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
    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:425:1: rulePropertyDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_0=null;
        Token this_COLON_1=null;
        Token this_WORD_2=null;
        Token this_VARIABLE_3=null;
        Token this_SEMI_COLON_4=null;
        Token this_BRACE_LEFT_5=null;
        Token this_BRACE_RIGHT_7=null;
        AntlrDatatypeRuleToken this_PropertyDeclaration_6 = null;


         enterRule(); 
            
        try {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:428:28: ( (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:429:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:429:1: (this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:429:6: this_WORD_0= RULE_WORD this_COLON_1= RULE_COLON ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) )
            {
            this_WORD_0=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration1178); 

            		current.merge(this_WORD_0);
                
             
                newLeafNode(this_WORD_0, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
                
            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyDeclaration1198); 

            		current.merge(this_COLON_1);
                
             
                newLeafNode(this_COLON_1, grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
                
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:1: ( ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON ) | (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_WORD && LA8_0<=RULE_VARIABLE)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BRACE_LEFT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:2: ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:2: ( (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:3: (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+ this_SEMI_COLON_4= RULE_SEMI_COLON
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:3: (this_WORD_2= RULE_WORD | this_VARIABLE_3= RULE_VARIABLE )+
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
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:443:8: this_WORD_2= RULE_WORD
                    	    {
                    	    this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rulePropertyDeclaration1221); 

                    	    		current.merge(this_WORD_2);
                    	        
                    	     
                    	        newLeafNode(this_WORD_2, grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:451:10: this_VARIABLE_3= RULE_VARIABLE
                    	    {
                    	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rulePropertyDeclaration1247); 

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

                    this_SEMI_COLON_4=(Token)match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1269); 

                    		current.merge(this_SEMI_COLON_4);
                        
                     
                        newLeafNode(this_SEMI_COLON_4, grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:466:6: (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT )
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:466:6: (this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT )
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:466:11: this_BRACE_LEFT_5= RULE_BRACE_LEFT (this_PropertyDeclaration_6= rulePropertyDeclaration )* this_BRACE_RIGHT_7= RULE_BRACE_RIGHT
                    {
                    this_BRACE_LEFT_5=(Token)match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1297); 

                    		current.merge(this_BRACE_LEFT_5);
                        
                     
                        newLeafNode(this_BRACE_LEFT_5, grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
                        
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:473:1: (this_PropertyDeclaration_6= rulePropertyDeclaration )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_WORD) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:474:5: this_PropertyDeclaration_6= rulePropertyDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1325);
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

                    this_BRACE_RIGHT_7=(Token)match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1347); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSass_in_entryRuleSass75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSass85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_ruleSass136 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSass154 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_ruleRule_in_ruleSass176 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_ruleCharset265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCharset285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleCharset305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_ruleInclude402 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleInclude422 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleInclude442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVariableDeclaration539 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleVariableDeclaration559 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleVariableDeclaration579 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_ruleVariableDeclaration599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_ruleRule703 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_ruleRule723 = new BitSet(new long[]{0x0000000000003180L});
    public static final BitSet FOLLOW_ruleRuleBody_in_ruleRule750 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_ruleRule770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead867 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleRuleHead888 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_ruleRuleHead908 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleRuleBody1014 = new BitSet(new long[]{0x0000000000002182L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleRuleBody1047 = new BitSet(new long[]{0x0000000000002182L});
    public static final BitSet FOLLOW_ruleRule_in_ruleRuleBody1080 = new BitSet(new long[]{0x0000000000002182L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration1178 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyDeclaration1198 = new BitSet(new long[]{0x0000000000000B00L});
    public static final BitSet FOLLOW_RULE_WORD_in_rulePropertyDeclaration1221 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rulePropertyDeclaration1247 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rulePropertyDeclaration1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rulePropertyDeclaration1297 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rulePropertyDeclaration1325 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rulePropertyDeclaration1347 = new BitSet(new long[]{0x0000000000000002L});

}