package com.dubture.editor.sass.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.dubture.editor.sass.services.SassGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSassParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_VARIABLE", "RULE_HEX_COLOR", "RULE_COLON", "RULE_SEMI_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_SELECTOR", "RULE_COMMA", "RULE_CHARSET_ID", "RULE_STRING", "RULE_INCLUDE_ID", "RULE_MIXIN_ID", "RULE_PAREN_LEFT", "RULE_PAREN_RIGHT", "RULE_DOT", "RULE_HASH", "RULE_DOLLAR", "RULE_AMP", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=22;
    public static final int RULE_ID=24;
    public static final int RULE_BRACE_RIGHT=10;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_HEX_COLOR=6;
    public static final int RULE_HASH=20;
    public static final int RULE_COMMA=12;
    public static final int RULE_INCLUDE_ID=15;
    public static final int RULE_MIXIN_ID=16;
    public static final int RULE_SL_COMMENT=26;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_PAREN_LEFT=17;
    public static final int RULE_BRACE_LEFT=9;
    public static final int RULE_DOLLAR=21;
    public static final int RULE_COLON=7;
    public static final int RULE_STRING=14;
    public static final int RULE_DOT=19;
    public static final int RULE_CHARSET_ID=13;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_PAREN_RIGHT=18;
    public static final int RULE_SEMI_COLON=8;
    public static final int RULE_INT=23;
    public static final int RULE_WS=27;
    public static final int RULE_WORD=4;
    public static final int RULE_SELECTOR=11;

    // delegates
    // delegators


        public InternalSassParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSassParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSassParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g"; }


     
     	private SassGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SassGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSass"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:60:1: entryRuleSass : ruleSass EOF ;
    public final void entryRuleSass() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:61:1: ( ruleSass EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:62:1: ruleSass EOF
            {
             before(grammarAccess.getSassRule()); 
            pushFollow(FOLLOW_ruleSass_in_entryRuleSass61);
            ruleSass();

            state._fsp--;

             after(grammarAccess.getSassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSass68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSass"


    // $ANTLR start "ruleSass"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:69:1: ruleSass : ( ( rule__Sass__Group__0 ) ) ;
    public final void ruleSass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:73:2: ( ( ( rule__Sass__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:74:1: ( ( rule__Sass__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:74:1: ( ( rule__Sass__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:75:1: ( rule__Sass__Group__0 )
            {
             before(grammarAccess.getSassAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:76:1: ( rule__Sass__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:76:2: rule__Sass__Group__0
            {
            pushFollow(FOLLOW_rule__Sass__Group__0_in_ruleSass94);
            rule__Sass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSass"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:88:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:89:1: ( ruleVariableDeclaration EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:90:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration121);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:97:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:101:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:102:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:102:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:103:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:104:1: ( rule__VariableDeclaration__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:104:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration154);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleRule"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:116:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:117:1: ( ruleRule EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:118:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule181);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:125:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:129:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:130:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:130:1: ( ( rule__Rule__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:131:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:132:1: ( rule__Rule__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:132:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule214);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleHead"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:144:1: entryRuleRuleHead : ruleRuleHead EOF ;
    public final void entryRuleRuleHead() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:145:1: ( ruleRuleHead EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:146:1: ruleRuleHead EOF
            {
             before(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead241);
            ruleRuleHead();

            state._fsp--;

             after(grammarAccess.getRuleHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleHead"


    // $ANTLR start "ruleRuleHead"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:153:1: ruleRuleHead : ( ( rule__RuleHead__Group__0 ) ) ;
    public final void ruleRuleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:157:2: ( ( ( rule__RuleHead__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:158:1: ( ( rule__RuleHead__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:158:1: ( ( rule__RuleHead__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:159:1: ( rule__RuleHead__Group__0 )
            {
             before(grammarAccess.getRuleHeadAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:160:1: ( rule__RuleHead__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:160:2: rule__RuleHead__Group__0
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0_in_ruleRuleHead274);
            rule__RuleHead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleHeadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleHead"


    // $ANTLR start "entryRuleRuleBody"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:172:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:173:1: ( ruleRuleBody EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:174:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody301);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:181:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives )* ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:185:2: ( ( ( rule__RuleBody__Alternatives )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:186:1: ( ( rule__RuleBody__Alternatives )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:186:1: ( ( rule__RuleBody__Alternatives )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:187:1: ( rule__RuleBody__Alternatives )*
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:188:1: ( rule__RuleBody__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORD||LA1_0==RULE_SELECTOR||(LA1_0>=RULE_INCLUDE_ID && LA1_0<=RULE_MIXIN_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:188:2: rule__RuleBody__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody334);
            	    rule__RuleBody__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRuleBodyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:200:1: entryRulePropertyDeclaration : rulePropertyDeclaration EOF ;
    public final void entryRulePropertyDeclaration() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:201:1: ( rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:202:1: rulePropertyDeclaration EOF
            {
             before(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration362);
            rulePropertyDeclaration();

            state._fsp--;

             after(grammarAccess.getPropertyDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyDeclaration"


    // $ANTLR start "rulePropertyDeclaration"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:209:1: rulePropertyDeclaration : ( ( rule__PropertyDeclaration__Group__0 ) ) ;
    public final void rulePropertyDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:213:2: ( ( ( rule__PropertyDeclaration__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:214:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:214:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:215:1: ( rule__PropertyDeclaration__Group__0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:216:1: ( rule__PropertyDeclaration__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:216:2: rule__PropertyDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration395);
            rule__PropertyDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDeclaration"


    // $ANTLR start "entryRuleCharset"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:228:1: entryRuleCharset : ruleCharset EOF ;
    public final void entryRuleCharset() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:229:1: ( ruleCharset EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:230:1: ruleCharset EOF
            {
             before(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_ruleCharset_in_entryRuleCharset422);
            ruleCharset();

            state._fsp--;

             after(grammarAccess.getCharsetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharset429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharset"


    // $ANTLR start "ruleCharset"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:237:1: ruleCharset : ( ( rule__Charset__Group__0 ) ) ;
    public final void ruleCharset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:241:2: ( ( ( rule__Charset__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:242:1: ( ( rule__Charset__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:242:1: ( ( rule__Charset__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:243:1: ( rule__Charset__Group__0 )
            {
             before(grammarAccess.getCharsetAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:244:1: ( rule__Charset__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:244:2: rule__Charset__Group__0
            {
            pushFollow(FOLLOW_rule__Charset__Group__0_in_ruleCharset455);
            rule__Charset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharset"


    // $ANTLR start "entryRuleInclude"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:256:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:257:1: ( ruleInclude EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:258:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude482);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:265:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:269:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:270:1: ( ( rule__Include__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:270:1: ( ( rule__Include__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:271:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:272:1: ( rule__Include__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:272:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude515);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleMixin"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:284:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:285:1: ( ruleMixin EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:286:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin542);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:293:1: ruleMixin : ( ( rule__Mixin__Group__0 ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:297:2: ( ( ( rule__Mixin__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:298:1: ( ( rule__Mixin__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:298:1: ( ( rule__Mixin__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:299:1: ( rule__Mixin__Group__0 )
            {
             before(grammarAccess.getMixinAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:300:1: ( rule__Mixin__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:300:2: rule__Mixin__Group__0
            {
            pushFollow(FOLLOW_rule__Mixin__Group__0_in_ruleMixin575);
            rule__Mixin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "rule__Rule__Alternatives_0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:312:1: rule__Rule__Alternatives_0 : ( ( ruleRuleHead ) | ( ruleMixin ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:316:1: ( ( ruleRuleHead ) | ( ruleMixin ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SELECTOR) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MIXIN_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:317:1: ( ruleRuleHead )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:317:1: ( ruleRuleHead )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:318:1: ruleRuleHead
                    {
                     before(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleRuleHead_in_rule__Rule__Alternatives_0611);
                    ruleRuleHead();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:323:6: ( ruleMixin )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:323:6: ( ruleMixin )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:324:1: ruleMixin
                    {
                     before(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleMixin_in_rule__Rule__Alternatives_0628);
                    ruleMixin();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_0"


    // $ANTLR start "rule__RuleBody__Alternatives"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:334:1: rule__RuleBody__Alternatives : ( ( rulePropertyDeclaration ) | ( ruleInclude ) | ( ruleRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:338:1: ( ( rulePropertyDeclaration ) | ( ruleInclude ) | ( ruleRule ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt3=1;
                }
                break;
            case RULE_INCLUDE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_SELECTOR:
            case RULE_MIXIN_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:339:1: ( rulePropertyDeclaration )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:339:1: ( rulePropertyDeclaration )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:340:1: rulePropertyDeclaration
                    {
                     before(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives660);
                    rulePropertyDeclaration();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:345:6: ( ruleInclude )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:345:6: ( ruleInclude )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:346:1: ruleInclude
                    {
                     before(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__RuleBody__Alternatives677);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:351:6: ( ruleRule )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:351:6: ( ruleRule )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:352:1: ruleRule
                    {
                     before(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__RuleBody__Alternatives694);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Alternatives"


    // $ANTLR start "rule__PropertyDeclaration__Alternatives_2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:362:1: rule__PropertyDeclaration__Alternatives_2 : ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) );
    public final void rule__PropertyDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:366:1: ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_HEX_COLOR)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_BRACE_LEFT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:367:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:367:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:368:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:369:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:369:2: rule__PropertyDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2726);
                    rule__PropertyDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:373:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:373:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:374:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:375:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:375:2: rule__PropertyDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2744);
                    rule__PropertyDeclaration__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Alternatives_2"


    // $ANTLR start "rule__PropertyDeclaration__Alternatives_2_0_0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:384:1: rule__PropertyDeclaration__Alternatives_2_0_0 : ( ( RULE_WORD ) | ( RULE_VARIABLE ) | ( RULE_HEX_COLOR ) );
    public final void rule__PropertyDeclaration__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:388:1: ( ( RULE_WORD ) | ( RULE_VARIABLE ) | ( RULE_HEX_COLOR ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case RULE_HEX_COLOR:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:389:1: ( RULE_WORD )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:389:1: ( RULE_WORD )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:390:1: RULE_WORD
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0777); 
                     after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:395:6: ( RULE_VARIABLE )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:395:6: ( RULE_VARIABLE )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:396:1: RULE_VARIABLE
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__PropertyDeclaration__Alternatives_2_0_0794); 
                     after(grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:6: ( RULE_HEX_COLOR )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:6: ( RULE_HEX_COLOR )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:402:1: RULE_HEX_COLOR
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getHEX_COLORTerminalRuleCall_2_0_0_2()); 
                    match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_rule__PropertyDeclaration__Alternatives_2_0_0811); 
                     after(grammarAccess.getPropertyDeclarationAccess().getHEX_COLORTerminalRuleCall_2_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Alternatives_2_0_0"


    // $ANTLR start "rule__Sass__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:414:1: rule__Sass__Group__0 : rule__Sass__Group__0__Impl rule__Sass__Group__1 ;
    public final void rule__Sass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:418:1: ( rule__Sass__Group__0__Impl rule__Sass__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:419:2: rule__Sass__Group__0__Impl rule__Sass__Group__1
            {
            pushFollow(FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0841);
            rule__Sass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0844);
            rule__Sass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__0"


    // $ANTLR start "rule__Sass__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:426:1: rule__Sass__Group__0__Impl : ( () ) ;
    public final void rule__Sass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:430:1: ( ( () ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:431:1: ( () )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:431:1: ( () )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:432:1: ()
            {
             before(grammarAccess.getSassAccess().getSassAction_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:433:1: ()
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:435:1: 
            {
            }

             after(grammarAccess.getSassAccess().getSassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__0__Impl"


    // $ANTLR start "rule__Sass__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:445:1: rule__Sass__Group__1 : rule__Sass__Group__1__Impl rule__Sass__Group__2 ;
    public final void rule__Sass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:449:1: ( rule__Sass__Group__1__Impl rule__Sass__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:450:2: rule__Sass__Group__1__Impl rule__Sass__Group__2
            {
            pushFollow(FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1902);
            rule__Sass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1905);
            rule__Sass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__1"


    // $ANTLR start "rule__Sass__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:457:1: rule__Sass__Group__1__Impl : ( ( ruleCharset )? ) ;
    public final void rule__Sass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:461:1: ( ( ( ruleCharset )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:462:1: ( ( ruleCharset )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:462:1: ( ( ruleCharset )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:463:1: ( ruleCharset )?
            {
             before(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:464:1: ( ruleCharset )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CHARSET_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:464:3: ruleCharset
                    {
                    pushFollow(FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl933);
                    ruleCharset();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__1__Impl"


    // $ANTLR start "rule__Sass__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:474:1: rule__Sass__Group__2 : rule__Sass__Group__2__Impl rule__Sass__Group__3 ;
    public final void rule__Sass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:478:1: ( rule__Sass__Group__2__Impl rule__Sass__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:479:2: rule__Sass__Group__2__Impl rule__Sass__Group__3
            {
            pushFollow(FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2964);
            rule__Sass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2967);
            rule__Sass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__2"


    // $ANTLR start "rule__Sass__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:486:1: rule__Sass__Group__2__Impl : ( ( ruleVariableDeclaration )* ) ;
    public final void rule__Sass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:490:1: ( ( ( ruleVariableDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:491:1: ( ( ruleVariableDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:491:1: ( ( ruleVariableDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:492:1: ( ruleVariableDeclaration )*
            {
             before(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:493:1: ( ruleVariableDeclaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_VARIABLE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:493:3: ruleVariableDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl995);
            	    ruleVariableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__2__Impl"


    // $ANTLR start "rule__Sass__Group__3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:503:1: rule__Sass__Group__3 : rule__Sass__Group__3__Impl ;
    public final void rule__Sass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:507:1: ( rule__Sass__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:508:2: rule__Sass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__31026);
            rule__Sass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__3"


    // $ANTLR start "rule__Sass__Group__3__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:514:1: rule__Sass__Group__3__Impl : ( ( rule__Sass__StatementsAssignment_3 )* ) ;
    public final void rule__Sass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:518:1: ( ( ( rule__Sass__StatementsAssignment_3 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:519:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:519:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:520:1: ( rule__Sass__StatementsAssignment_3 )*
            {
             before(grammarAccess.getSassAccess().getStatementsAssignment_3()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:521:1: ( rule__Sass__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SELECTOR||LA8_0==RULE_MIXIN_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:521:2: rule__Sass__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl1053);
            	    rule__Sass__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSassAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:539:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:543:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:544:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01092);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01095);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:551:1: rule__VariableDeclaration__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:555:1: ( ( RULE_VARIABLE ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:556:1: ( RULE_VARIABLE )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:556:1: ( RULE_VARIABLE )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:557:1: RULE_VARIABLE
            {
             before(grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1122); 
             after(grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:568:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:572:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:573:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11151);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11154);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:580:1: rule__VariableDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:584:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:585:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:585:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:586:1: RULE_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1181); 
             after(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:597:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:601:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:602:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21210);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21213);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:609:1: rule__VariableDeclaration__Group__2__Impl : ( RULE_WORD ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:613:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:614:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:614:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:615:1: RULE_WORD
            {
             before(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1240); 
             after(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:626:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:630:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:631:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31269);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:637:1: rule__VariableDeclaration__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:641:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:642:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:642:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:643:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1296); 
             after(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:662:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:666:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:667:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01333);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01336);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:674:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:678:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:679:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:679:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:680:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:681:1: ( rule__Rule__Alternatives_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:681:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl1363);
            rule__Rule__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:691:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:695:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:696:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11393);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11396);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:703:1: rule__Rule__Group__1__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:707:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:708:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:708:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:709:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1423); 
             after(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:720:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:724:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:725:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21452);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21455);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:732:1: rule__Rule__Group__2__Impl : ( ruleRuleBody ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:736:1: ( ( ruleRuleBody ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:737:1: ( ruleRuleBody )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:737:1: ( ruleRuleBody )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:738:1: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1482);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:749:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:753:1: ( rule__Rule__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:754:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31511);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:760:1: rule__Rule__Group__3__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:764:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:765:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:765:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:766:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1538); 
             after(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__RuleHead__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:785:1: rule__RuleHead__Group__0 : rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 ;
    public final void rule__RuleHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:789:1: ( rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:790:2: rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01575);
            rule__RuleHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01578);
            rule__RuleHead__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__0"


    // $ANTLR start "rule__RuleHead__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:797:1: rule__RuleHead__Group__0__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:801:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:802:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:802:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:803:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1605); 
             after(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__0__Impl"


    // $ANTLR start "rule__RuleHead__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:814:1: rule__RuleHead__Group__1 : rule__RuleHead__Group__1__Impl ;
    public final void rule__RuleHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:818:1: ( rule__RuleHead__Group__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:819:2: rule__RuleHead__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11634);
            rule__RuleHead__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__1"


    // $ANTLR start "rule__RuleHead__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:825:1: rule__RuleHead__Group__1__Impl : ( ( rule__RuleHead__Group_1__0 )* ) ;
    public final void rule__RuleHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:829:1: ( ( ( rule__RuleHead__Group_1__0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:830:1: ( ( rule__RuleHead__Group_1__0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:830:1: ( ( rule__RuleHead__Group_1__0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:831:1: ( rule__RuleHead__Group_1__0 )*
            {
             before(grammarAccess.getRuleHeadAccess().getGroup_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:832:1: ( rule__RuleHead__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:832:2: rule__RuleHead__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1661);
            	    rule__RuleHead__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleHeadAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group__1__Impl"


    // $ANTLR start "rule__RuleHead__Group_1__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:846:1: rule__RuleHead__Group_1__0 : rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 ;
    public final void rule__RuleHead__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:850:1: ( rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:851:2: rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01696);
            rule__RuleHead__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01699);
            rule__RuleHead__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group_1__0"


    // $ANTLR start "rule__RuleHead__Group_1__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:858:1: rule__RuleHead__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__RuleHead__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:862:1: ( ( RULE_COMMA ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:863:1: ( RULE_COMMA )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:863:1: ( RULE_COMMA )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:864:1: RULE_COMMA
            {
             before(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1726); 
             after(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group_1__0__Impl"


    // $ANTLR start "rule__RuleHead__Group_1__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:875:1: rule__RuleHead__Group_1__1 : rule__RuleHead__Group_1__1__Impl ;
    public final void rule__RuleHead__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:879:1: ( rule__RuleHead__Group_1__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:880:2: rule__RuleHead__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11755);
            rule__RuleHead__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group_1__1"


    // $ANTLR start "rule__RuleHead__Group_1__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:886:1: rule__RuleHead__Group_1__1__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:890:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:891:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:891:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:892:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl1782); 
             after(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleHead__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:907:1: rule__PropertyDeclaration__Group__0 : rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 ;
    public final void rule__PropertyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:911:1: ( rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:912:2: rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__01815);
            rule__PropertyDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__01818);
            rule__PropertyDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__0"


    // $ANTLR start "rule__PropertyDeclaration__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:919:1: rule__PropertyDeclaration__Group__0__Impl : ( RULE_WORD ) ;
    public final void rule__PropertyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:923:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:924:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:924:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:925:1: RULE_WORD
            {
             before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl1845); 
             after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:936:1: rule__PropertyDeclaration__Group__1 : rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 ;
    public final void rule__PropertyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:940:1: ( rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:941:2: rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__11874);
            rule__PropertyDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__11877);
            rule__PropertyDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__1"


    // $ANTLR start "rule__PropertyDeclaration__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:948:1: rule__PropertyDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__PropertyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:952:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:953:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:953:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:954:1: RULE_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl1904); 
             after(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:965:1: rule__PropertyDeclaration__Group__2 : rule__PropertyDeclaration__Group__2__Impl ;
    public final void rule__PropertyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:969:1: ( rule__PropertyDeclaration__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:970:2: rule__PropertyDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__21933);
            rule__PropertyDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__2"


    // $ANTLR start "rule__PropertyDeclaration__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:976:1: rule__PropertyDeclaration__Group__2__Impl : ( ( rule__PropertyDeclaration__Alternatives_2 ) ) ;
    public final void rule__PropertyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:980:1: ( ( ( rule__PropertyDeclaration__Alternatives_2 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:981:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:981:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:982:1: ( rule__PropertyDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:983:1: ( rule__PropertyDeclaration__Alternatives_2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:983:2: rule__PropertyDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl1960);
            rule__PropertyDeclaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_0__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:999:1: rule__PropertyDeclaration__Group_2_0__0 : rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 ;
    public final void rule__PropertyDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1003:1: ( rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1004:2: rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__01996);
            rule__PropertyDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__01999);
            rule__PropertyDeclaration__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_0__0"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_0__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1011:1: rule__PropertyDeclaration__Group_2_0__0__Impl : ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) ;
    public final void rule__PropertyDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1015:1: ( ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1016:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1016:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1017:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1017:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1018:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1019:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1019:2: rule__PropertyDeclaration__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2028);
            rule__PropertyDeclaration__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 

            }

            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1022:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1023:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1024:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_HEX_COLOR)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1024:2: rule__PropertyDeclaration__Alternatives_2_0_0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2040);
            	    rule__PropertyDeclaration__Alternatives_2_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_0__0__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_0__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1035:1: rule__PropertyDeclaration__Group_2_0__1 : rule__PropertyDeclaration__Group_2_0__1__Impl ;
    public final void rule__PropertyDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1039:1: ( rule__PropertyDeclaration__Group_2_0__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1040:2: rule__PropertyDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12073);
            rule__PropertyDeclaration__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_0__1"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_0__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1046:1: rule__PropertyDeclaration__Group_2_0__1__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__PropertyDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1050:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1051:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1051:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1052:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2100); 
             after(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_0__1__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_1__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1067:1: rule__PropertyDeclaration__Group_2_1__0 : rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 ;
    public final void rule__PropertyDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1071:1: ( rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1072:2: rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02133);
            rule__PropertyDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02136);
            rule__PropertyDeclaration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_1__0"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_1__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1079:1: rule__PropertyDeclaration__Group_2_1__0__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1083:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1084:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1084:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1085:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2163); 
             after(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_1__0__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_1__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1096:1: rule__PropertyDeclaration__Group_2_1__1 : rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 ;
    public final void rule__PropertyDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1100:1: ( rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1101:2: rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12192);
            rule__PropertyDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12195);
            rule__PropertyDeclaration__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_1__1"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_1__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1108:1: rule__PropertyDeclaration__Group_2_1__1__Impl : ( ( rulePropertyDeclaration )* ) ;
    public final void rule__PropertyDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1112:1: ( ( ( rulePropertyDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1113:1: ( ( rulePropertyDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1113:1: ( ( rulePropertyDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1114:1: ( rulePropertyDeclaration )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1115:1: ( rulePropertyDeclaration )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1115:3: rulePropertyDeclaration
            	    {
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2223);
            	    rulePropertyDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_1__1__Impl"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_1__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1125:1: rule__PropertyDeclaration__Group_2_1__2 : rule__PropertyDeclaration__Group_2_1__2__Impl ;
    public final void rule__PropertyDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1129:1: ( rule__PropertyDeclaration__Group_2_1__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1130:2: rule__PropertyDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22254);
            rule__PropertyDeclaration__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_1__2"


    // $ANTLR start "rule__PropertyDeclaration__Group_2_1__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1136:1: rule__PropertyDeclaration__Group_2_1__2__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1140:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1141:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1141:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1142:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2281); 
             after(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDeclaration__Group_2_1__2__Impl"


    // $ANTLR start "rule__Charset__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1159:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1163:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1164:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__02316);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__02319);
            rule__Charset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__0"


    // $ANTLR start "rule__Charset__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1171:1: rule__Charset__Group__0__Impl : ( RULE_CHARSET_ID ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1175:1: ( ( RULE_CHARSET_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1176:1: ( RULE_CHARSET_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1176:1: ( RULE_CHARSET_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1177:1: RULE_CHARSET_ID
            {
             before(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
            match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl2346); 
             after(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__0__Impl"


    // $ANTLR start "rule__Charset__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1188:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1192:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1193:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__12375);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__12378);
            rule__Charset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__1"


    // $ANTLR start "rule__Charset__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1200:1: rule__Charset__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1204:1: ( ( RULE_STRING ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1205:1: ( RULE_STRING )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1205:1: ( RULE_STRING )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1206:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl2405); 
             after(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__1__Impl"


    // $ANTLR start "rule__Charset__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1217:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1221:1: ( rule__Charset__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1222:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__22434);
            rule__Charset__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__2"


    // $ANTLR start "rule__Charset__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1228:1: rule__Charset__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1232:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1233:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1233:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1234:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl2461); 
             after(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charset__Group__2__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1251:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1255:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1256:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02496);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02499);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1263:1: rule__Include__Group__0__Impl : ( RULE_INCLUDE_ID ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1267:1: ( ( RULE_INCLUDE_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1268:1: ( RULE_INCLUDE_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1268:1: ( RULE_INCLUDE_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1269:1: RULE_INCLUDE_ID
            {
             before(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
            match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl2526); 
             after(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1280:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1284:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1285:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12555);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12558);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1292:1: rule__Include__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1296:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1297:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1297:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1298:1: RULE_WORD
            {
             before(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl2585); 
             after(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1309:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1313:1: ( rule__Include__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1314:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22614);
            rule__Include__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1320:1: rule__Include__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1324:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1325:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1325:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1326:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl2641); 
             after(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Mixin__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1343:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1347:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1348:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__02676);
            rule__Mixin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__02679);
            rule__Mixin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0"


    // $ANTLR start "rule__Mixin__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1355:1: rule__Mixin__Group__0__Impl : ( RULE_MIXIN_ID ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1359:1: ( ( RULE_MIXIN_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1360:1: ( RULE_MIXIN_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1360:1: ( RULE_MIXIN_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1361:1: RULE_MIXIN_ID
            {
             before(grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 
            match(input,RULE_MIXIN_ID,FOLLOW_RULE_MIXIN_ID_in_rule__Mixin__Group__0__Impl2706); 
             after(grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0__Impl"


    // $ANTLR start "rule__Mixin__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1372:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl rule__Mixin__Group__2 ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1376:1: ( rule__Mixin__Group__1__Impl rule__Mixin__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1377:2: rule__Mixin__Group__1__Impl rule__Mixin__Group__2
            {
            pushFollow(FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__12735);
            rule__Mixin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__12738);
            rule__Mixin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1"


    // $ANTLR start "rule__Mixin__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1384:1: rule__Mixin__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1388:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1389:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1389:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1390:1: RULE_WORD
            {
             before(grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Mixin__Group__1__Impl2765); 
             after(grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1__Impl"


    // $ANTLR start "rule__Mixin__Group__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1401:1: rule__Mixin__Group__2 : rule__Mixin__Group__2__Impl ;
    public final void rule__Mixin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1405:1: ( rule__Mixin__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1406:2: rule__Mixin__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__22794);
            rule__Mixin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__2"


    // $ANTLR start "rule__Mixin__Group__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1412:1: rule__Mixin__Group__2__Impl : ( ( rule__Mixin__Group_2__0 )? ) ;
    public final void rule__Mixin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1416:1: ( ( ( rule__Mixin__Group_2__0 )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1417:1: ( ( rule__Mixin__Group_2__0 )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1417:1: ( ( rule__Mixin__Group_2__0 )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1418:1: ( rule__Mixin__Group_2__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1419:1: ( rule__Mixin__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_PAREN_LEFT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1419:2: rule__Mixin__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mixin__Group_2__0_in_rule__Mixin__Group__2__Impl2821);
                    rule__Mixin__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__2__Impl"


    // $ANTLR start "rule__Mixin__Group_2__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1435:1: rule__Mixin__Group_2__0 : rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 ;
    public final void rule__Mixin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1439:1: ( rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1440:2: rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__0__Impl_in_rule__Mixin__Group_2__02858);
            rule__Mixin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group_2__1_in_rule__Mixin__Group_2__02861);
            rule__Mixin__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__0"


    // $ANTLR start "rule__Mixin__Group_2__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1447:1: rule__Mixin__Group_2__0__Impl : ( RULE_PAREN_LEFT ) ;
    public final void rule__Mixin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1451:1: ( ( RULE_PAREN_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1452:1: ( RULE_PAREN_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1452:1: ( RULE_PAREN_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1453:1: RULE_PAREN_LEFT
            {
             before(grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
            match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_rule__Mixin__Group_2__0__Impl2888); 
             after(grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__0__Impl"


    // $ANTLR start "rule__Mixin__Group_2__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1464:1: rule__Mixin__Group_2__1 : rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 ;
    public final void rule__Mixin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1468:1: ( rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1469:2: rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__1__Impl_in_rule__Mixin__Group_2__12917);
            rule__Mixin__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group_2__2_in_rule__Mixin__Group_2__12920);
            rule__Mixin__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__1"


    // $ANTLR start "rule__Mixin__Group_2__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1476:1: rule__Mixin__Group_2__1__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Mixin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1480:1: ( ( RULE_VARIABLE ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1481:1: ( RULE_VARIABLE )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1481:1: ( RULE_VARIABLE )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1482:1: RULE_VARIABLE
            {
             before(grammarAccess.getMixinAccess().getVARIABLETerminalRuleCall_2_1()); 
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Mixin__Group_2__1__Impl2947); 
             after(grammarAccess.getMixinAccess().getVARIABLETerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__1__Impl"


    // $ANTLR start "rule__Mixin__Group_2__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1493:1: rule__Mixin__Group_2__2 : rule__Mixin__Group_2__2__Impl ;
    public final void rule__Mixin__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1497:1: ( rule__Mixin__Group_2__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1498:2: rule__Mixin__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__2__Impl_in_rule__Mixin__Group_2__22976);
            rule__Mixin__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__2"


    // $ANTLR start "rule__Mixin__Group_2__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1504:1: rule__Mixin__Group_2__2__Impl : ( RULE_PAREN_RIGHT ) ;
    public final void rule__Mixin__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1508:1: ( ( RULE_PAREN_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1509:1: ( RULE_PAREN_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1509:1: ( RULE_PAREN_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1510:1: RULE_PAREN_RIGHT
            {
             before(grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); 
            match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_rule__Mixin__Group_2__2__Impl3003); 
             after(grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__2__Impl"


    // $ANTLR start "rule__Sass__StatementsAssignment_3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1528:1: rule__Sass__StatementsAssignment_3 : ( ruleRule ) ;
    public final void rule__Sass__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1532:1: ( ( ruleRule ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1533:1: ( ruleRule )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1533:1: ( ruleRule )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1534:1: ruleRule
            {
             before(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_33043);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sass__StatementsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSass_in_entryRuleSass61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSass68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__0_in_ruleSass94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0_in_ruleRuleHead274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody334 = new BitSet(new long[]{0x0000000000018812L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0_in_ruleCharset455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__0_in_ruleMixin575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_rule__Rule__Alternatives_0611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_rule__Rule__Alternatives_0628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__RuleBody__Alternatives677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleBody__Alternatives694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__PropertyDeclaration__Alternatives_2_0_0794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_rule__PropertyDeclaration__Alternatives_2_0_0811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0841 = new BitSet(new long[]{0x000000000001A830L});
    public static final BitSet FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1902 = new BitSet(new long[]{0x000000000001A830L});
    public static final BitSet FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2964 = new BitSet(new long[]{0x000000000001A830L});
    public static final BitSet FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl995 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__31026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl1053 = new BitSet(new long[]{0x0000000000018812L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01092 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21210 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01333 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11393 = new BitSet(new long[]{0x0000000000018810L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21452 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01575 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1661 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01696 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__01815 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__01818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__11874 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__11877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__21933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__01996 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__01999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2028 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2040 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02133 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12192 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2223 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__02316 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__02319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__12375 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__12378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__22434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12555 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__02676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__02679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MIXIN_ID_in_rule__Mixin__Group__0__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__12735 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Mixin__Group__1__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__22794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__0_in_rule__Mixin__Group__2__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__0__Impl_in_rule__Mixin__Group_2__02858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__1_in_rule__Mixin__Group_2__02861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_rule__Mixin__Group_2__0__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__1__Impl_in_rule__Mixin__Group_2__12917 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__2_in_rule__Mixin__Group_2__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Mixin__Group_2__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__2__Impl_in_rule__Mixin__Group_2__22976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_rule__Mixin__Group_2__2__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_33043 = new BitSet(new long[]{0x0000000000000002L});

}