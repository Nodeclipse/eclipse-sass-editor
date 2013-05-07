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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_SHARP", "RULE_DOT", "RULE_COLON", "RULE_SEMI_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_COMMA", "RULE_CHARSET_ID", "RULE_STRING", "RULE_INCLUDE_ID", "RULE_MIXIN_ID", "RULE_PAREN_LEFT", "RULE_PAREN_RIGHT", "RULE_AMP", "RULE_DOLLAR", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=18;
    public static final int RULE_ID=21;
    public static final int RULE_BRACE_RIGHT=10;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_COMMA=11;
    public static final int RULE_INCLUDE_ID=14;
    public static final int RULE_MIXIN_ID=15;
    public static final int RULE_SL_COMMENT=23;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_PAREN_LEFT=16;
    public static final int RULE_BRACE_LEFT=9;
    public static final int RULE_DOLLAR=19;
    public static final int RULE_COLON=7;
    public static final int RULE_STRING=13;
    public static final int RULE_DOT=6;
    public static final int RULE_CHARSET_ID=12;
    public static final int RULE_PAREN_RIGHT=17;
    public static final int RULE_SEMI_COLON=8;
    public static final int RULE_INT=20;
    public static final int RULE_WS=24;
    public static final int RULE_SHARP=5;
    public static final int RULE_WORD=4;

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

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_DOT)||(LA1_0>=RULE_INCLUDE_ID && LA1_0<=RULE_MIXIN_ID)||LA1_0==RULE_AMP) ) {
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


    // $ANTLR start "entryRuleSelector"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:312:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:313:1: ( ruleSelector EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:314:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector602);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector609); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:321:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:325:2: ( ( ( rule__Selector__Alternatives ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:326:1: ( ( rule__Selector__Alternatives ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:326:1: ( ( rule__Selector__Alternatives ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:327:1: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:328:1: ( rule__Selector__Alternatives )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:328:2: rule__Selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Selector__Alternatives_in_ruleSelector635);
            rule__Selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleVariable"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:340:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:341:1: ( ruleVariable EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:342:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable662);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable669); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:349:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:353:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:354:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:354:1: ( ( rule__Variable__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:355:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:356:1: ( rule__Variable__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:356:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable695);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Rule__Alternatives_0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:368:1: rule__Rule__Alternatives_0 : ( ( ruleRuleHead ) | ( ruleMixin ) );
    public final void rule__Rule__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:372:1: ( ( ruleRuleHead ) | ( ruleMixin ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_WORD && LA2_0<=RULE_DOT)||LA2_0==RULE_AMP) ) {
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
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:373:1: ( ruleRuleHead )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:373:1: ( ruleRuleHead )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:374:1: ruleRuleHead
                    {
                     before(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleRuleHead_in_rule__Rule__Alternatives_0731);
                    ruleRuleHead();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:379:6: ( ruleMixin )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:379:6: ( ruleMixin )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:380:1: ruleMixin
                    {
                     before(grammarAccess.getRuleAccess().getMixinParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleMixin_in_rule__Rule__Alternatives_0748);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:390:1: rule__RuleBody__Alternatives : ( ( rulePropertyDeclaration ) | ( ruleInclude ) | ( ruleRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:394:1: ( ( rulePropertyDeclaration ) | ( ruleInclude ) | ( ruleRule ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=RULE_WORD && LA3_1<=RULE_DOT)||LA3_1==RULE_BRACE_LEFT||LA3_1==RULE_COMMA) ) {
                    alt3=3;
                }
                else if ( (LA3_1==RULE_COLON) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INCLUDE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_SHARP:
            case RULE_DOT:
            case RULE_MIXIN_ID:
            case RULE_AMP:
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
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:395:1: ( rulePropertyDeclaration )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:395:1: ( rulePropertyDeclaration )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:396:1: rulePropertyDeclaration
                    {
                     before(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives780);
                    rulePropertyDeclaration();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:6: ( ruleInclude )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:6: ( ruleInclude )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:402:1: ruleInclude
                    {
                     before(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__RuleBody__Alternatives797);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:407:6: ( ruleRule )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:407:6: ( ruleRule )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:408:1: ruleRule
                    {
                     before(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__RuleBody__Alternatives814);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:418:1: rule__PropertyDeclaration__Alternatives_2 : ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) );
    public final void rule__PropertyDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:422:1: ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WORD||LA4_0==RULE_DOLLAR) ) {
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
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:423:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:423:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:424:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:425:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:425:2: rule__PropertyDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2846);
                    rule__PropertyDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:429:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:429:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:430:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:431:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:431:2: rule__PropertyDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2864);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:440:1: rule__PropertyDeclaration__Alternatives_2_0_0 : ( ( RULE_WORD ) | ( ruleVariable ) );
    public final void rule__PropertyDeclaration__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:444:1: ( ( RULE_WORD ) | ( ruleVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WORD) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_DOLLAR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:445:1: ( RULE_WORD )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:445:1: ( RULE_WORD )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:446:1: RULE_WORD
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0897); 
                     after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:451:6: ( ruleVariable )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:451:6: ( ruleVariable )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:452:1: ruleVariable
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getVariableParserRuleCall_2_0_0_1()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__PropertyDeclaration__Alternatives_2_0_0914);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getPropertyDeclarationAccess().getVariableParserRuleCall_2_0_0_1()); 

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


    // $ANTLR start "rule__Selector__Alternatives"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:462:1: rule__Selector__Alternatives : ( ( ( rule__Selector__Group_0__0 ) ) | ( ( ( rule__Selector__Group_1__0 ) ) ( ( rule__Selector__Group_1__0 )* ) ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:466:1: ( ( ( rule__Selector__Group_0__0 ) ) | ( ( ( rule__Selector__Group_1__0 ) ) ( ( rule__Selector__Group_1__0 )* ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_AMP) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_WORD && LA7_0<=RULE_DOT)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:467:1: ( ( rule__Selector__Group_0__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:467:1: ( ( rule__Selector__Group_0__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:468:1: ( rule__Selector__Group_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_0()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:469:1: ( rule__Selector__Group_0__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:469:2: rule__Selector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_0__0_in_rule__Selector__Alternatives946);
                    rule__Selector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:473:6: ( ( ( rule__Selector__Group_1__0 ) ) ( ( rule__Selector__Group_1__0 )* ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:473:6: ( ( ( rule__Selector__Group_1__0 ) ) ( ( rule__Selector__Group_1__0 )* ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:474:1: ( ( rule__Selector__Group_1__0 ) ) ( ( rule__Selector__Group_1__0 )* )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:474:1: ( ( rule__Selector__Group_1__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:475:1: ( rule__Selector__Group_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:476:1: ( rule__Selector__Group_1__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:476:2: rule__Selector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Alternatives966);
                    rule__Selector__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1()); 

                    }

                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:479:1: ( ( rule__Selector__Group_1__0 )* )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:480:1: ( rule__Selector__Group_1__0 )*
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:481:1: ( rule__Selector__Group_1__0 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_WORD && LA6_0<=RULE_DOT)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:481:2: rule__Selector__Group_1__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Alternatives978);
                    	    rule__Selector__Group_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getSelectorAccess().getGroup_1()); 

                    }


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
    // $ANTLR end "rule__Selector__Alternatives"


    // $ANTLR start "rule__Selector__Alternatives_1_0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:491:1: rule__Selector__Alternatives_1_0 : ( ( RULE_SHARP ) | ( RULE_DOT ) );
    public final void rule__Selector__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:495:1: ( ( RULE_SHARP ) | ( RULE_DOT ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SHARP) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DOT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:496:1: ( RULE_SHARP )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:496:1: ( RULE_SHARP )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:497:1: RULE_SHARP
                    {
                     before(grammarAccess.getSelectorAccess().getSHARPTerminalRuleCall_1_0_0()); 
                    match(input,RULE_SHARP,FOLLOW_RULE_SHARP_in_rule__Selector__Alternatives_1_01014); 
                     after(grammarAccess.getSelectorAccess().getSHARPTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:502:6: ( RULE_DOT )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:502:6: ( RULE_DOT )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:503:1: RULE_DOT
                    {
                     before(grammarAccess.getSelectorAccess().getDOTTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__Selector__Alternatives_1_01031); 
                     after(grammarAccess.getSelectorAccess().getDOTTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Selector__Alternatives_1_0"


    // $ANTLR start "rule__Sass__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:515:1: rule__Sass__Group__0 : rule__Sass__Group__0__Impl rule__Sass__Group__1 ;
    public final void rule__Sass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:519:1: ( rule__Sass__Group__0__Impl rule__Sass__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:520:2: rule__Sass__Group__0__Impl rule__Sass__Group__1
            {
            pushFollow(FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__01061);
            rule__Sass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__01064);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:527:1: rule__Sass__Group__0__Impl : ( () ) ;
    public final void rule__Sass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:531:1: ( ( () ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:532:1: ( () )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:532:1: ( () )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:533:1: ()
            {
             before(grammarAccess.getSassAccess().getSassAction_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:534:1: ()
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:536:1: 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:546:1: rule__Sass__Group__1 : rule__Sass__Group__1__Impl rule__Sass__Group__2 ;
    public final void rule__Sass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:550:1: ( rule__Sass__Group__1__Impl rule__Sass__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:551:2: rule__Sass__Group__1__Impl rule__Sass__Group__2
            {
            pushFollow(FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__11122);
            rule__Sass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__11125);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:558:1: rule__Sass__Group__1__Impl : ( ( ruleCharset )? ) ;
    public final void rule__Sass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:562:1: ( ( ( ruleCharset )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:563:1: ( ( ruleCharset )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:563:1: ( ( ruleCharset )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:564:1: ( ruleCharset )?
            {
             before(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:565:1: ( ruleCharset )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CHARSET_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:565:3: ruleCharset
                    {
                    pushFollow(FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl1153);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:575:1: rule__Sass__Group__2 : rule__Sass__Group__2__Impl rule__Sass__Group__3 ;
    public final void rule__Sass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:579:1: ( rule__Sass__Group__2__Impl rule__Sass__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:580:2: rule__Sass__Group__2__Impl rule__Sass__Group__3
            {
            pushFollow(FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__21184);
            rule__Sass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__21187);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:587:1: rule__Sass__Group__2__Impl : ( ( ruleVariableDeclaration )* ) ;
    public final void rule__Sass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:591:1: ( ( ( ruleVariableDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:592:1: ( ( ruleVariableDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:592:1: ( ( ruleVariableDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:593:1: ( ruleVariableDeclaration )*
            {
             before(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:594:1: ( ruleVariableDeclaration )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOLLAR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:594:3: ruleVariableDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl1215);
            	    ruleVariableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:604:1: rule__Sass__Group__3 : rule__Sass__Group__3__Impl ;
    public final void rule__Sass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:608:1: ( rule__Sass__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:609:2: rule__Sass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__31246);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:615:1: rule__Sass__Group__3__Impl : ( ( rule__Sass__StatementsAssignment_3 )* ) ;
    public final void rule__Sass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:619:1: ( ( ( rule__Sass__StatementsAssignment_3 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:620:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:620:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:621:1: ( rule__Sass__StatementsAssignment_3 )*
            {
             before(grammarAccess.getSassAccess().getStatementsAssignment_3()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:622:1: ( rule__Sass__StatementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_WORD && LA11_0<=RULE_DOT)||LA11_0==RULE_MIXIN_ID||LA11_0==RULE_AMP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:622:2: rule__Sass__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl1273);
            	    rule__Sass__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:640:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:644:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:645:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01312);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01315);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:652:1: rule__VariableDeclaration__Group__0__Impl : ( ruleVariable ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:656:1: ( ( ruleVariable ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:657:1: ( ruleVariable )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:657:1: ( ruleVariable )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:658:1: ruleVariable
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__VariableDeclaration__Group__0__Impl1342);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getVariableParserRuleCall_0()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:669:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:673:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:674:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11371);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11374);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:681:1: rule__VariableDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:685:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:686:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:686:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:687:1: RULE_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1401); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:698:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:702:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:703:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21430);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21433);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:710:1: rule__VariableDeclaration__Group__2__Impl : ( RULE_WORD ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:714:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:715:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:715:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:716:1: RULE_WORD
            {
             before(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1460); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:727:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:731:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:732:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31489);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:738:1: rule__VariableDeclaration__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:742:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:743:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:743:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:744:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1516); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:763:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:767:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:768:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01553);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01556);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:775:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:779:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:780:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:780:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:781:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:782:1: ( rule__Rule__Alternatives_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:782:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl1583);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:792:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:796:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:797:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11613);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11616);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:804:1: rule__Rule__Group__1__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:808:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:809:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:809:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:810:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1643); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:821:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:825:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:826:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21672);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21675);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:833:1: rule__Rule__Group__2__Impl : ( ruleRuleBody ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:837:1: ( ( ruleRuleBody ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:838:1: ( ruleRuleBody )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:838:1: ( ruleRuleBody )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:839:1: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1702);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:850:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:854:1: ( rule__Rule__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:855:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31731);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:861:1: rule__Rule__Group__3__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:865:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:866:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:866:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:867:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1758); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:886:1: rule__RuleHead__Group__0 : rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 ;
    public final void rule__RuleHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:890:1: ( rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:891:2: rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01795);
            rule__RuleHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01798);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:898:1: rule__RuleHead__Group__0__Impl : ( ruleSelector ) ;
    public final void rule__RuleHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:902:1: ( ( ruleSelector ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:903:1: ( ruleSelector )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:903:1: ( ruleSelector )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:904:1: ruleSelector
            {
             before(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__RuleHead__Group__0__Impl1825);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_0()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:915:1: rule__RuleHead__Group__1 : rule__RuleHead__Group__1__Impl ;
    public final void rule__RuleHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:919:1: ( rule__RuleHead__Group__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:920:2: rule__RuleHead__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11854);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:926:1: rule__RuleHead__Group__1__Impl : ( ( rule__RuleHead__Group_1__0 )* ) ;
    public final void rule__RuleHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:930:1: ( ( ( rule__RuleHead__Group_1__0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:931:1: ( ( rule__RuleHead__Group_1__0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:931:1: ( ( rule__RuleHead__Group_1__0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:932:1: ( rule__RuleHead__Group_1__0 )*
            {
             before(grammarAccess.getRuleHeadAccess().getGroup_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:933:1: ( rule__RuleHead__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:933:2: rule__RuleHead__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1881);
            	    rule__RuleHead__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:947:1: rule__RuleHead__Group_1__0 : rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 ;
    public final void rule__RuleHead__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:951:1: ( rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:952:2: rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01916);
            rule__RuleHead__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01919);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:959:1: rule__RuleHead__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__RuleHead__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:963:1: ( ( RULE_COMMA ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:964:1: ( RULE_COMMA )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:964:1: ( RULE_COMMA )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:965:1: RULE_COMMA
            {
             before(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1946); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:976:1: rule__RuleHead__Group_1__1 : rule__RuleHead__Group_1__1__Impl ;
    public final void rule__RuleHead__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:980:1: ( rule__RuleHead__Group_1__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:981:2: rule__RuleHead__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11975);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:987:1: rule__RuleHead__Group_1__1__Impl : ( ruleSelector ) ;
    public final void rule__RuleHead__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:991:1: ( ( ruleSelector ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:992:1: ( ruleSelector )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:992:1: ( ruleSelector )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:993:1: ruleSelector
            {
             before(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSelector_in_rule__RuleHead__Group_1__1__Impl2002);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getRuleHeadAccess().getSelectorParserRuleCall_1_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1008:1: rule__PropertyDeclaration__Group__0 : rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 ;
    public final void rule__PropertyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1012:1: ( rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1013:2: rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__02035);
            rule__PropertyDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__02038);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1020:1: rule__PropertyDeclaration__Group__0__Impl : ( RULE_WORD ) ;
    public final void rule__PropertyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1024:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1025:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1025:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1026:1: RULE_WORD
            {
             before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl2065); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1037:1: rule__PropertyDeclaration__Group__1 : rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 ;
    public final void rule__PropertyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1041:1: ( rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1042:2: rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__12094);
            rule__PropertyDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__12097);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1049:1: rule__PropertyDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__PropertyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1053:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1054:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1054:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1055:1: RULE_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl2124); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1066:1: rule__PropertyDeclaration__Group__2 : rule__PropertyDeclaration__Group__2__Impl ;
    public final void rule__PropertyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1070:1: ( rule__PropertyDeclaration__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1071:2: rule__PropertyDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__22153);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1077:1: rule__PropertyDeclaration__Group__2__Impl : ( ( rule__PropertyDeclaration__Alternatives_2 ) ) ;
    public final void rule__PropertyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1081:1: ( ( ( rule__PropertyDeclaration__Alternatives_2 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1082:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1082:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1083:1: ( rule__PropertyDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1084:1: ( rule__PropertyDeclaration__Alternatives_2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1084:2: rule__PropertyDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl2180);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1100:1: rule__PropertyDeclaration__Group_2_0__0 : rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 ;
    public final void rule__PropertyDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1104:1: ( rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1105:2: rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__02216);
            rule__PropertyDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__02219);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1112:1: rule__PropertyDeclaration__Group_2_0__0__Impl : ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) ;
    public final void rule__PropertyDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1116:1: ( ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1117:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1117:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1118:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1118:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1119:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1120:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1120:2: rule__PropertyDeclaration__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2248);
            rule__PropertyDeclaration__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 

            }

            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1123:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1124:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1125:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WORD||LA13_0==RULE_DOLLAR) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1125:2: rule__PropertyDeclaration__Alternatives_2_0_0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2260);
            	    rule__PropertyDeclaration__Alternatives_2_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1136:1: rule__PropertyDeclaration__Group_2_0__1 : rule__PropertyDeclaration__Group_2_0__1__Impl ;
    public final void rule__PropertyDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1140:1: ( rule__PropertyDeclaration__Group_2_0__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1141:2: rule__PropertyDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12293);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1147:1: rule__PropertyDeclaration__Group_2_0__1__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__PropertyDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1151:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1152:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1152:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1153:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2320); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1168:1: rule__PropertyDeclaration__Group_2_1__0 : rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 ;
    public final void rule__PropertyDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1172:1: ( rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1173:2: rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02353);
            rule__PropertyDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02356);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1180:1: rule__PropertyDeclaration__Group_2_1__0__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1184:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1185:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1185:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1186:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2383); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1197:1: rule__PropertyDeclaration__Group_2_1__1 : rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 ;
    public final void rule__PropertyDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1201:1: ( rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1202:2: rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12412);
            rule__PropertyDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12415);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1209:1: rule__PropertyDeclaration__Group_2_1__1__Impl : ( ( rulePropertyDeclaration )* ) ;
    public final void rule__PropertyDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1213:1: ( ( ( rulePropertyDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1214:1: ( ( rulePropertyDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1214:1: ( ( rulePropertyDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1215:1: ( rulePropertyDeclaration )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1216:1: ( rulePropertyDeclaration )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WORD) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1216:3: rulePropertyDeclaration
            	    {
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2443);
            	    rulePropertyDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1226:1: rule__PropertyDeclaration__Group_2_1__2 : rule__PropertyDeclaration__Group_2_1__2__Impl ;
    public final void rule__PropertyDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1230:1: ( rule__PropertyDeclaration__Group_2_1__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1231:2: rule__PropertyDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22474);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1237:1: rule__PropertyDeclaration__Group_2_1__2__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1241:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1242:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1242:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1243:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2501); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1260:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1264:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1265:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__02536);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__02539);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1272:1: rule__Charset__Group__0__Impl : ( RULE_CHARSET_ID ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1276:1: ( ( RULE_CHARSET_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1277:1: ( RULE_CHARSET_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1277:1: ( RULE_CHARSET_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1278:1: RULE_CHARSET_ID
            {
             before(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
            match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl2566); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1289:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1293:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1294:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__12595);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__12598);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1301:1: rule__Charset__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1305:1: ( ( RULE_STRING ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1306:1: ( RULE_STRING )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1306:1: ( RULE_STRING )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1307:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl2625); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1318:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1322:1: ( rule__Charset__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1323:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__22654);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1329:1: rule__Charset__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1333:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1334:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1334:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1335:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl2681); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1352:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1356:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1357:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02716);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02719);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1364:1: rule__Include__Group__0__Impl : ( RULE_INCLUDE_ID ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1368:1: ( ( RULE_INCLUDE_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1369:1: ( RULE_INCLUDE_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1369:1: ( RULE_INCLUDE_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1370:1: RULE_INCLUDE_ID
            {
             before(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
            match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl2746); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1381:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1385:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1386:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12775);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12778);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1393:1: rule__Include__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1397:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1398:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1398:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1399:1: RULE_WORD
            {
             before(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl2805); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1410:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1414:1: ( rule__Include__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1415:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22834);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1421:1: rule__Include__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1425:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1426:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1426:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1427:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl2861); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1444:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1448:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1449:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__02896);
            rule__Mixin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__02899);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1456:1: rule__Mixin__Group__0__Impl : ( RULE_MIXIN_ID ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1460:1: ( ( RULE_MIXIN_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1461:1: ( RULE_MIXIN_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1461:1: ( RULE_MIXIN_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1462:1: RULE_MIXIN_ID
            {
             before(grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 
            match(input,RULE_MIXIN_ID,FOLLOW_RULE_MIXIN_ID_in_rule__Mixin__Group__0__Impl2926); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1473:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl rule__Mixin__Group__2 ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1477:1: ( rule__Mixin__Group__1__Impl rule__Mixin__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1478:2: rule__Mixin__Group__1__Impl rule__Mixin__Group__2
            {
            pushFollow(FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__12955);
            rule__Mixin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__12958);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1485:1: rule__Mixin__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1489:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1490:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1490:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1491:1: RULE_WORD
            {
             before(grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Mixin__Group__1__Impl2985); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1502:1: rule__Mixin__Group__2 : rule__Mixin__Group__2__Impl ;
    public final void rule__Mixin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1506:1: ( rule__Mixin__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1507:2: rule__Mixin__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__23014);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1513:1: rule__Mixin__Group__2__Impl : ( ( rule__Mixin__Group_2__0 )? ) ;
    public final void rule__Mixin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1517:1: ( ( ( rule__Mixin__Group_2__0 )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1518:1: ( ( rule__Mixin__Group_2__0 )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1518:1: ( ( rule__Mixin__Group_2__0 )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1519:1: ( rule__Mixin__Group_2__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1520:1: ( rule__Mixin__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_PAREN_LEFT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1520:2: rule__Mixin__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mixin__Group_2__0_in_rule__Mixin__Group__2__Impl3041);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1536:1: rule__Mixin__Group_2__0 : rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 ;
    public final void rule__Mixin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1540:1: ( rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1541:2: rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__0__Impl_in_rule__Mixin__Group_2__03078);
            rule__Mixin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group_2__1_in_rule__Mixin__Group_2__03081);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1548:1: rule__Mixin__Group_2__0__Impl : ( RULE_PAREN_LEFT ) ;
    public final void rule__Mixin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1552:1: ( ( RULE_PAREN_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1553:1: ( RULE_PAREN_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1553:1: ( RULE_PAREN_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1554:1: RULE_PAREN_LEFT
            {
             before(grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
            match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_rule__Mixin__Group_2__0__Impl3108); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1565:1: rule__Mixin__Group_2__1 : rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 ;
    public final void rule__Mixin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1569:1: ( rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1570:2: rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__1__Impl_in_rule__Mixin__Group_2__13137);
            rule__Mixin__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group_2__2_in_rule__Mixin__Group_2__13140);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1577:1: rule__Mixin__Group_2__1__Impl : ( ruleVariable ) ;
    public final void rule__Mixin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1581:1: ( ( ruleVariable ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1582:1: ( ruleVariable )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1582:1: ( ruleVariable )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1583:1: ruleVariable
            {
             before(grammarAccess.getMixinAccess().getVariableParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Mixin__Group_2__1__Impl3167);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getVariableParserRuleCall_2_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1594:1: rule__Mixin__Group_2__2 : rule__Mixin__Group_2__2__Impl ;
    public final void rule__Mixin__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1598:1: ( rule__Mixin__Group_2__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1599:2: rule__Mixin__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__2__Impl_in_rule__Mixin__Group_2__23196);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1605:1: rule__Mixin__Group_2__2__Impl : ( RULE_PAREN_RIGHT ) ;
    public final void rule__Mixin__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1609:1: ( ( RULE_PAREN_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1610:1: ( RULE_PAREN_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1610:1: ( RULE_PAREN_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1611:1: RULE_PAREN_RIGHT
            {
             before(grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); 
            match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_rule__Mixin__Group_2__2__Impl3223); 
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


    // $ANTLR start "rule__Selector__Group_0__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1628:1: rule__Selector__Group_0__0 : rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 ;
    public final void rule__Selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1632:1: ( rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1633:2: rule__Selector__Group_0__0__Impl rule__Selector__Group_0__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_0__0__Impl_in_rule__Selector__Group_0__03258);
            rule__Selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_0__1_in_rule__Selector__Group_0__03261);
            rule__Selector__Group_0__1();

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
    // $ANTLR end "rule__Selector__Group_0__0"


    // $ANTLR start "rule__Selector__Group_0__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1640:1: rule__Selector__Group_0__0__Impl : ( RULE_AMP ) ;
    public final void rule__Selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1644:1: ( ( RULE_AMP ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1645:1: ( RULE_AMP )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1645:1: ( RULE_AMP )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1646:1: RULE_AMP
            {
             before(grammarAccess.getSelectorAccess().getAMPTerminalRuleCall_0_0()); 
            match(input,RULE_AMP,FOLLOW_RULE_AMP_in_rule__Selector__Group_0__0__Impl3288); 
             after(grammarAccess.getSelectorAccess().getAMPTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Selector__Group_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_0__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1657:1: rule__Selector__Group_0__1 : rule__Selector__Group_0__1__Impl rule__Selector__Group_0__2 ;
    public final void rule__Selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1661:1: ( rule__Selector__Group_0__1__Impl rule__Selector__Group_0__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1662:2: rule__Selector__Group_0__1__Impl rule__Selector__Group_0__2
            {
            pushFollow(FOLLOW_rule__Selector__Group_0__1__Impl_in_rule__Selector__Group_0__13317);
            rule__Selector__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_0__2_in_rule__Selector__Group_0__13320);
            rule__Selector__Group_0__2();

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
    // $ANTLR end "rule__Selector__Group_0__1"


    // $ANTLR start "rule__Selector__Group_0__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1669:1: rule__Selector__Group_0__1__Impl : ( RULE_COLON ) ;
    public final void rule__Selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1673:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1674:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1674:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1675:1: RULE_COLON
            {
             before(grammarAccess.getSelectorAccess().getCOLONTerminalRuleCall_0_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__Selector__Group_0__1__Impl3347); 
             after(grammarAccess.getSelectorAccess().getCOLONTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__Selector__Group_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_0__2"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1686:1: rule__Selector__Group_0__2 : rule__Selector__Group_0__2__Impl ;
    public final void rule__Selector__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1690:1: ( rule__Selector__Group_0__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1691:2: rule__Selector__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_0__2__Impl_in_rule__Selector__Group_0__23376);
            rule__Selector__Group_0__2__Impl();

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
    // $ANTLR end "rule__Selector__Group_0__2"


    // $ANTLR start "rule__Selector__Group_0__2__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1697:1: rule__Selector__Group_0__2__Impl : ( RULE_WORD ) ;
    public final void rule__Selector__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1701:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1702:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1702:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1703:1: RULE_WORD
            {
             before(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_0_2()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Selector__Group_0__2__Impl3403); 
             after(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Selector__Group_0__2__Impl"


    // $ANTLR start "rule__Selector__Group_1__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1720:1: rule__Selector__Group_1__0 : rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 ;
    public final void rule__Selector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1724:1: ( rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1725:2: rule__Selector__Group_1__0__Impl rule__Selector__Group_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1__0__Impl_in_rule__Selector__Group_1__03438);
            rule__Selector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1__1_in_rule__Selector__Group_1__03441);
            rule__Selector__Group_1__1();

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
    // $ANTLR end "rule__Selector__Group_1__0"


    // $ANTLR start "rule__Selector__Group_1__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1732:1: rule__Selector__Group_1__0__Impl : ( ( rule__Selector__Alternatives_1_0 )? ) ;
    public final void rule__Selector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1736:1: ( ( ( rule__Selector__Alternatives_1_0 )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1737:1: ( ( rule__Selector__Alternatives_1_0 )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1737:1: ( ( rule__Selector__Alternatives_1_0 )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1738:1: ( rule__Selector__Alternatives_1_0 )?
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1739:1: ( rule__Selector__Alternatives_1_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SHARP && LA16_0<=RULE_DOT)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1739:2: rule__Selector__Alternatives_1_0
                    {
                    pushFollow(FOLLOW_rule__Selector__Alternatives_1_0_in_rule__Selector__Group_1__0__Impl3468);
                    rule__Selector__Alternatives_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Selector__Group_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1749:1: rule__Selector__Group_1__1 : rule__Selector__Group_1__1__Impl ;
    public final void rule__Selector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1753:1: ( rule__Selector__Group_1__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1754:2: rule__Selector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1__1__Impl_in_rule__Selector__Group_1__13499);
            rule__Selector__Group_1__1__Impl();

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
    // $ANTLR end "rule__Selector__Group_1__1"


    // $ANTLR start "rule__Selector__Group_1__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1760:1: rule__Selector__Group_1__1__Impl : ( RULE_WORD ) ;
    public final void rule__Selector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1764:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1765:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1765:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1766:1: RULE_WORD
            {
             before(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_1_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Selector__Group_1__1__Impl3526); 
             after(grammarAccess.getSelectorAccess().getWORDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Selector__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1781:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1785:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1786:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03559);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03562);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1793:1: rule__Variable__Group__0__Impl : ( RULE_DOLLAR ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1797:1: ( ( RULE_DOLLAR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1798:1: ( RULE_DOLLAR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1798:1: ( RULE_DOLLAR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1799:1: RULE_DOLLAR
            {
             before(grammarAccess.getVariableAccess().getDOLLARTerminalRuleCall_0()); 
            match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_rule__Variable__Group__0__Impl3589); 
             after(grammarAccess.getVariableAccess().getDOLLARTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1810:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1814:1: ( rule__Variable__Group__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1815:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13618);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1821:1: rule__Variable__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1825:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1826:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1826:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1827:1: RULE_WORD
            {
             before(grammarAccess.getVariableAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Variable__Group__1__Impl3645); 
             after(grammarAccess.getVariableAccess().getWORDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Sass__StatementsAssignment_3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1843:1: rule__Sass__StatementsAssignment_3 : ( ruleRule ) ;
    public final void rule__Sass__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1847:1: ( ( ruleRule ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1848:1: ( ruleRule )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1848:1: ( ruleRule )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1849:1: ruleRule
            {
             before(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_33683);
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
    public static final BitSet FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody334 = new BitSet(new long[]{0x000000000004C072L});
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
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_in_ruleSelector635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_rule__Rule__Alternatives_0731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_rule__Rule__Alternatives_0748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__RuleBody__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleBody__Alternatives814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__PropertyDeclaration__Alternatives_2_0_0914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_0__0_in_rule__Selector__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Alternatives966 = new BitSet(new long[]{0x0000000000040072L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0_in_rule__Selector__Alternatives978 = new BitSet(new long[]{0x0000000000040072L});
    public static final BitSet FOLLOW_RULE_SHARP_in_rule__Selector__Alternatives_1_01014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__Selector__Alternatives_1_01031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__01061 = new BitSet(new long[]{0x00000000000CD070L});
    public static final BitSet FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__01064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__11122 = new BitSet(new long[]{0x00000000000CD070L});
    public static final BitSet FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__11125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__21184 = new BitSet(new long[]{0x00000000000CD070L});
    public static final BitSet FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__21187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl1215 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__31246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl1273 = new BitSet(new long[]{0x000000000004C072L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01312 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__VariableDeclaration__Group__0__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01553 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11613 = new BitSet(new long[]{0x000000000004C070L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21672 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01795 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__RuleHead__Group__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1881 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01916 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_rule__RuleHead__Group_1__1__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__02035 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__02038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__12094 = new BitSet(new long[]{0x0000000000080210L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__02216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__02219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2248 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2260 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02353 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12412 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2443 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__02536 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__02539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__12595 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__22654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12775 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__02896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__02899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MIXIN_ID_in_rule__Mixin__Group__0__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__12955 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Mixin__Group__1__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__23014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__0_in_rule__Mixin__Group__2__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__0__Impl_in_rule__Mixin__Group_2__03078 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__1_in_rule__Mixin__Group_2__03081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_rule__Mixin__Group_2__0__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__1__Impl_in_rule__Mixin__Group_2__13137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__2_in_rule__Mixin__Group_2__13140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Mixin__Group_2__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__2__Impl_in_rule__Mixin__Group_2__23196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_rule__Mixin__Group_2__2__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_0__0__Impl_in_rule__Selector__Group_0__03258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Selector__Group_0__1_in_rule__Selector__Group_0__03261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AMP_in_rule__Selector__Group_0__0__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_0__1__Impl_in_rule__Selector__Group_0__13317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selector__Group_0__2_in_rule__Selector__Group_0__13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__Selector__Group_0__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_0__2__Impl_in_rule__Selector__Group_0__23376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Selector__Group_0__2__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__0__Impl_in_rule__Selector__Group_1__03438 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__1_in_rule__Selector__Group_1__03441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_1_0_in_rule__Selector__Group_1__0__Impl3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1__1__Impl_in_rule__Selector__Group_1__13499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Selector__Group_1__1__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_rule__Variable__Group__0__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Variable__Group__1__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_33683 = new BitSet(new long[]{0x0000000000000002L});

}