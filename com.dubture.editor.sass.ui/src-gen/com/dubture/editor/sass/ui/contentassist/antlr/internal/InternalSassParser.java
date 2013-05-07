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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_VARIABLE", "RULE_CHARSET_ID", "RULE_STRING", "RULE_SC", "RULE_CL", "RULE_BL", "RULE_BR", "RULE_SELECTOR", "RULE_COMMA", "RULE_DOT", "RULE_SHARP", "RULE_DOLLAR", "RULE_AMP", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
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
    public static final int RULE_STRING=7;
    public static final int RULE_CHARSET_ID=6;
    public static final int RULE_DOT=14;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_CL=9;
    public static final int RULE_INT=19;
    public static final int RULE_WS=22;
    public static final int RULE_WORD=4;
    public static final int RULE_SELECTOR=12;
    public static final int RULE_SHARP=15;
    public static final int RULE_SC=8;

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


    // $ANTLR start "entryRuleCharset"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:88:1: entryRuleCharset : ruleCharset EOF ;
    public final void entryRuleCharset() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:89:1: ( ruleCharset EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:90:1: ruleCharset EOF
            {
             before(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_ruleCharset_in_entryRuleCharset121);
            ruleCharset();

            state._fsp--;

             after(grammarAccess.getCharsetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharset128); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:97:1: ruleCharset : ( ( rule__Charset__Group__0 ) ) ;
    public final void ruleCharset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:101:2: ( ( ( rule__Charset__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:102:1: ( ( rule__Charset__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:102:1: ( ( rule__Charset__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:103:1: ( rule__Charset__Group__0 )
            {
             before(grammarAccess.getCharsetAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:104:1: ( rule__Charset__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:104:2: rule__Charset__Group__0
            {
            pushFollow(FOLLOW_rule__Charset__Group__0_in_ruleCharset154);
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:116:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:117:1: ( ruleVariableDeclaration EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:118:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration181);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration188); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:125:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:129:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:130:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:130:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:131:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:132:1: ( rule__VariableDeclaration__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:132:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration214);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:144:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:145:1: ( ruleRule EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:146:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule241);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule248); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:153:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:157:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:158:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:158:1: ( ( rule__Rule__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:159:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:160:1: ( rule__Rule__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:160:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule274);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:172:1: entryRuleRuleHead : ruleRuleHead EOF ;
    public final void entryRuleRuleHead() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:173:1: ( ruleRuleHead EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:174:1: ruleRuleHead EOF
            {
             before(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead301);
            ruleRuleHead();

            state._fsp--;

             after(grammarAccess.getRuleHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead308); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:181:1: ruleRuleHead : ( ( rule__RuleHead__Group__0 ) ) ;
    public final void ruleRuleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:185:2: ( ( ( rule__RuleHead__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:186:1: ( ( rule__RuleHead__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:186:1: ( ( rule__RuleHead__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:187:1: ( rule__RuleHead__Group__0 )
            {
             before(grammarAccess.getRuleHeadAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:188:1: ( rule__RuleHead__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:188:2: rule__RuleHead__Group__0
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0_in_ruleRuleHead334);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:200:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:201:1: ( ruleRuleBody EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:202:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody361);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody368); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:209:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives )* ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:213:2: ( ( ( rule__RuleBody__Alternatives )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:214:1: ( ( rule__RuleBody__Alternatives )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:214:1: ( ( rule__RuleBody__Alternatives )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:215:1: ( rule__RuleBody__Alternatives )*
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:216:1: ( rule__RuleBody__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORD||LA1_0==RULE_SELECTOR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:216:2: rule__RuleBody__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody394);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:228:1: entryRulePropertyDeclaration : rulePropertyDeclaration EOF ;
    public final void entryRulePropertyDeclaration() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:229:1: ( rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:230:1: rulePropertyDeclaration EOF
            {
             before(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration422);
            rulePropertyDeclaration();

            state._fsp--;

             after(grammarAccess.getPropertyDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration429); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:237:1: rulePropertyDeclaration : ( ( rule__PropertyDeclaration__Group__0 ) ) ;
    public final void rulePropertyDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:241:2: ( ( ( rule__PropertyDeclaration__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:242:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:242:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:243:1: ( rule__PropertyDeclaration__Group__0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:244:1: ( rule__PropertyDeclaration__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:244:2: rule__PropertyDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration455);
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


    // $ANTLR start "rule__RuleBody__Alternatives"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:256:1: rule__RuleBody__Alternatives : ( ( rulePropertyDeclaration ) | ( ruleRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:260:1: ( ( rulePropertyDeclaration ) | ( ruleRule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WORD) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SELECTOR) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:261:1: ( rulePropertyDeclaration )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:261:1: ( rulePropertyDeclaration )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:262:1: rulePropertyDeclaration
                    {
                     before(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives491);
                    rulePropertyDeclaration();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:267:6: ( ruleRule )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:267:6: ( ruleRule )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:268:1: ruleRule
                    {
                     before(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__RuleBody__Alternatives508);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:278:1: rule__PropertyDeclaration__Alternatives_2 : ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) );
    public final void rule__PropertyDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:282:1: ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_VARIABLE)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_BL) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:283:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:283:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:284:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:285:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:285:2: rule__PropertyDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2540);
                    rule__PropertyDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:289:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:289:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:290:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:291:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:291:2: rule__PropertyDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2558);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:300:1: rule__PropertyDeclaration__Alternatives_2_0_0 : ( ( RULE_WORD ) | ( RULE_VARIABLE ) );
    public final void rule__PropertyDeclaration__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:304:1: ( ( RULE_WORD ) | ( RULE_VARIABLE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WORD) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VARIABLE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:305:1: ( RULE_WORD )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:305:1: ( RULE_WORD )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:306:1: RULE_WORD
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0591); 
                     after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:311:6: ( RULE_VARIABLE )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:311:6: ( RULE_VARIABLE )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:312:1: RULE_VARIABLE
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__PropertyDeclaration__Alternatives_2_0_0608); 
                     after(grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:324:1: rule__Sass__Group__0 : rule__Sass__Group__0__Impl rule__Sass__Group__1 ;
    public final void rule__Sass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:328:1: ( rule__Sass__Group__0__Impl rule__Sass__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:329:2: rule__Sass__Group__0__Impl rule__Sass__Group__1
            {
            pushFollow(FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0638);
            rule__Sass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0641);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:336:1: rule__Sass__Group__0__Impl : ( () ) ;
    public final void rule__Sass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:340:1: ( ( () ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:341:1: ( () )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:341:1: ( () )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:342:1: ()
            {
             before(grammarAccess.getSassAccess().getSassAction_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:343:1: ()
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:345:1: 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:355:1: rule__Sass__Group__1 : rule__Sass__Group__1__Impl rule__Sass__Group__2 ;
    public final void rule__Sass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:359:1: ( rule__Sass__Group__1__Impl rule__Sass__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:360:2: rule__Sass__Group__1__Impl rule__Sass__Group__2
            {
            pushFollow(FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1699);
            rule__Sass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1702);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:367:1: rule__Sass__Group__1__Impl : ( ( ruleCharset )? ) ;
    public final void rule__Sass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:371:1: ( ( ( ruleCharset )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:372:1: ( ( ruleCharset )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:372:1: ( ( ruleCharset )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:373:1: ( ruleCharset )?
            {
             before(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:374:1: ( ruleCharset )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CHARSET_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:374:3: ruleCharset
                    {
                    pushFollow(FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl730);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:384:1: rule__Sass__Group__2 : rule__Sass__Group__2__Impl rule__Sass__Group__3 ;
    public final void rule__Sass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:388:1: ( rule__Sass__Group__2__Impl rule__Sass__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:389:2: rule__Sass__Group__2__Impl rule__Sass__Group__3
            {
            pushFollow(FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2761);
            rule__Sass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2764);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:396:1: rule__Sass__Group__2__Impl : ( ( ruleVariableDeclaration )* ) ;
    public final void rule__Sass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:400:1: ( ( ( ruleVariableDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:1: ( ( ruleVariableDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:1: ( ( ruleVariableDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:402:1: ( ruleVariableDeclaration )*
            {
             before(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:403:1: ( ruleVariableDeclaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_VARIABLE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:403:3: ruleVariableDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl792);
            	    ruleVariableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:413:1: rule__Sass__Group__3 : rule__Sass__Group__3__Impl ;
    public final void rule__Sass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:417:1: ( rule__Sass__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:418:2: rule__Sass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__3823);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:424:1: rule__Sass__Group__3__Impl : ( ( rule__Sass__StatementsAssignment_3 )* ) ;
    public final void rule__Sass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:428:1: ( ( ( rule__Sass__StatementsAssignment_3 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:429:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:429:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:430:1: ( rule__Sass__StatementsAssignment_3 )*
            {
             before(grammarAccess.getSassAccess().getStatementsAssignment_3()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:431:1: ( rule__Sass__StatementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SELECTOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:431:2: rule__Sass__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl850);
            	    rule__Sass__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "rule__Charset__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:449:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:453:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:454:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__0889);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__0892);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:461:1: rule__Charset__Group__0__Impl : ( RULE_CHARSET_ID ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:465:1: ( ( RULE_CHARSET_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:466:1: ( RULE_CHARSET_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:466:1: ( RULE_CHARSET_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:467:1: RULE_CHARSET_ID
            {
             before(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
            match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl919); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:478:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:482:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:483:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__1948);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__1951);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:490:1: rule__Charset__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:494:1: ( ( RULE_STRING ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:495:1: ( RULE_STRING )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:495:1: ( RULE_STRING )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:496:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl978); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:507:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:511:1: ( rule__Charset__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:512:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__21007);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:518:1: rule__Charset__Group__2__Impl : ( RULE_SC ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:522:1: ( ( RULE_SC ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:523:1: ( RULE_SC )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:523:1: ( RULE_SC )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:524:1: RULE_SC
            {
             before(grammarAccess.getCharsetAccess().getSCTerminalRuleCall_2()); 
            match(input,RULE_SC,FOLLOW_RULE_SC_in_rule__Charset__Group__2__Impl1034); 
             after(grammarAccess.getCharsetAccess().getSCTerminalRuleCall_2()); 

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


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:541:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:545:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:546:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01069);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01072);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:553:1: rule__VariableDeclaration__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:557:1: ( ( RULE_VARIABLE ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:558:1: ( RULE_VARIABLE )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:558:1: ( RULE_VARIABLE )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:559:1: RULE_VARIABLE
            {
             before(grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1099); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:570:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:574:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:575:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11128);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11131);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:582:1: rule__VariableDeclaration__Group__1__Impl : ( RULE_CL ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:586:1: ( ( RULE_CL ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:587:1: ( RULE_CL )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:587:1: ( RULE_CL )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:588:1: RULE_CL
            {
             before(grammarAccess.getVariableDeclarationAccess().getCLTerminalRuleCall_1()); 
            match(input,RULE_CL,FOLLOW_RULE_CL_in_rule__VariableDeclaration__Group__1__Impl1158); 
             after(grammarAccess.getVariableDeclarationAccess().getCLTerminalRuleCall_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:599:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:603:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:604:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21187);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21190);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:611:1: rule__VariableDeclaration__Group__2__Impl : ( RULE_WORD ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:615:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:616:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:616:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:617:1: RULE_WORD
            {
             before(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1217); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:628:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:632:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:633:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31246);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:639:1: rule__VariableDeclaration__Group__3__Impl : ( RULE_SC ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:643:1: ( ( RULE_SC ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:644:1: ( RULE_SC )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:644:1: ( RULE_SC )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:645:1: RULE_SC
            {
             before(grammarAccess.getVariableDeclarationAccess().getSCTerminalRuleCall_3()); 
            match(input,RULE_SC,FOLLOW_RULE_SC_in_rule__VariableDeclaration__Group__3__Impl1273); 
             after(grammarAccess.getVariableDeclarationAccess().getSCTerminalRuleCall_3()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:664:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:668:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:669:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01310);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01313);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:676:1: rule__Rule__Group__0__Impl : ( ruleRuleHead ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:680:1: ( ( ruleRuleHead ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:681:1: ( ruleRuleHead )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:681:1: ( ruleRuleHead )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:682:1: ruleRuleHead
            {
             before(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRuleHead_in_rule__Rule__Group__0__Impl1340);
            ruleRuleHead();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:693:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:697:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:698:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11369);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11372);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:705:1: rule__Rule__Group__1__Impl : ( RULE_BL ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:709:1: ( ( RULE_BL ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:710:1: ( RULE_BL )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:710:1: ( RULE_BL )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:711:1: RULE_BL
            {
             before(grammarAccess.getRuleAccess().getBLTerminalRuleCall_1()); 
            match(input,RULE_BL,FOLLOW_RULE_BL_in_rule__Rule__Group__1__Impl1399); 
             after(grammarAccess.getRuleAccess().getBLTerminalRuleCall_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:722:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:726:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:727:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21428);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21431);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:734:1: rule__Rule__Group__2__Impl : ( ruleRuleBody ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:738:1: ( ( ruleRuleBody ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:739:1: ( ruleRuleBody )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:739:1: ( ruleRuleBody )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:740:1: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1458);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:751:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:755:1: ( rule__Rule__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:756:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31487);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:762:1: rule__Rule__Group__3__Impl : ( RULE_BR ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:766:1: ( ( RULE_BR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:767:1: ( RULE_BR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:767:1: ( RULE_BR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:768:1: RULE_BR
            {
             before(grammarAccess.getRuleAccess().getBRTerminalRuleCall_3()); 
            match(input,RULE_BR,FOLLOW_RULE_BR_in_rule__Rule__Group__3__Impl1514); 
             after(grammarAccess.getRuleAccess().getBRTerminalRuleCall_3()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:787:1: rule__RuleHead__Group__0 : rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 ;
    public final void rule__RuleHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:791:1: ( rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:792:2: rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01551);
            rule__RuleHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01554);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:799:1: rule__RuleHead__Group__0__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:803:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:804:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:804:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:805:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1581); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:816:1: rule__RuleHead__Group__1 : rule__RuleHead__Group__1__Impl ;
    public final void rule__RuleHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:820:1: ( rule__RuleHead__Group__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:821:2: rule__RuleHead__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11610);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:827:1: rule__RuleHead__Group__1__Impl : ( ( rule__RuleHead__Group_1__0 )* ) ;
    public final void rule__RuleHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:831:1: ( ( ( rule__RuleHead__Group_1__0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:832:1: ( ( rule__RuleHead__Group_1__0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:832:1: ( ( rule__RuleHead__Group_1__0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:833:1: ( rule__RuleHead__Group_1__0 )*
            {
             before(grammarAccess.getRuleHeadAccess().getGroup_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:834:1: ( rule__RuleHead__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:834:2: rule__RuleHead__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1637);
            	    rule__RuleHead__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:848:1: rule__RuleHead__Group_1__0 : rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 ;
    public final void rule__RuleHead__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:852:1: ( rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:853:2: rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01672);
            rule__RuleHead__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01675);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:860:1: rule__RuleHead__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__RuleHead__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:864:1: ( ( RULE_COMMA ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:865:1: ( RULE_COMMA )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:865:1: ( RULE_COMMA )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:866:1: RULE_COMMA
            {
             before(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1702); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:877:1: rule__RuleHead__Group_1__1 : rule__RuleHead__Group_1__1__Impl ;
    public final void rule__RuleHead__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:881:1: ( rule__RuleHead__Group_1__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:882:2: rule__RuleHead__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11731);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:888:1: rule__RuleHead__Group_1__1__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:892:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:893:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:893:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:894:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl1758); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:909:1: rule__PropertyDeclaration__Group__0 : rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 ;
    public final void rule__PropertyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:913:1: ( rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:914:2: rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__01791);
            rule__PropertyDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__01794);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:921:1: rule__PropertyDeclaration__Group__0__Impl : ( RULE_WORD ) ;
    public final void rule__PropertyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:925:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:926:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:926:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:927:1: RULE_WORD
            {
             before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl1821); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:938:1: rule__PropertyDeclaration__Group__1 : rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 ;
    public final void rule__PropertyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:942:1: ( rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:943:2: rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__11850);
            rule__PropertyDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__11853);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:950:1: rule__PropertyDeclaration__Group__1__Impl : ( RULE_CL ) ;
    public final void rule__PropertyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:954:1: ( ( RULE_CL ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:955:1: ( RULE_CL )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:955:1: ( RULE_CL )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:956:1: RULE_CL
            {
             before(grammarAccess.getPropertyDeclarationAccess().getCLTerminalRuleCall_1()); 
            match(input,RULE_CL,FOLLOW_RULE_CL_in_rule__PropertyDeclaration__Group__1__Impl1880); 
             after(grammarAccess.getPropertyDeclarationAccess().getCLTerminalRuleCall_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:967:1: rule__PropertyDeclaration__Group__2 : rule__PropertyDeclaration__Group__2__Impl ;
    public final void rule__PropertyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:971:1: ( rule__PropertyDeclaration__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:972:2: rule__PropertyDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__21909);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:978:1: rule__PropertyDeclaration__Group__2__Impl : ( ( rule__PropertyDeclaration__Alternatives_2 ) ) ;
    public final void rule__PropertyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:982:1: ( ( ( rule__PropertyDeclaration__Alternatives_2 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:983:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:983:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:984:1: ( rule__PropertyDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:985:1: ( rule__PropertyDeclaration__Alternatives_2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:985:2: rule__PropertyDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl1936);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1001:1: rule__PropertyDeclaration__Group_2_0__0 : rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 ;
    public final void rule__PropertyDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1005:1: ( rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1006:2: rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__01972);
            rule__PropertyDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__01975);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1013:1: rule__PropertyDeclaration__Group_2_0__0__Impl : ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) ;
    public final void rule__PropertyDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1017:1: ( ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1018:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1018:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1019:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1019:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1020:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1021:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1021:2: rule__PropertyDeclaration__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2004);
            rule__PropertyDeclaration__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 

            }

            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1024:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1025:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1026:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_VARIABLE)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1026:2: rule__PropertyDeclaration__Alternatives_2_0_0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2016);
            	    rule__PropertyDeclaration__Alternatives_2_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1037:1: rule__PropertyDeclaration__Group_2_0__1 : rule__PropertyDeclaration__Group_2_0__1__Impl ;
    public final void rule__PropertyDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1041:1: ( rule__PropertyDeclaration__Group_2_0__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1042:2: rule__PropertyDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12049);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1048:1: rule__PropertyDeclaration__Group_2_0__1__Impl : ( RULE_SC ) ;
    public final void rule__PropertyDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1052:1: ( ( RULE_SC ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1053:1: ( RULE_SC )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1053:1: ( RULE_SC )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1054:1: RULE_SC
            {
             before(grammarAccess.getPropertyDeclarationAccess().getSCTerminalRuleCall_2_0_1()); 
            match(input,RULE_SC,FOLLOW_RULE_SC_in_rule__PropertyDeclaration__Group_2_0__1__Impl2076); 
             after(grammarAccess.getPropertyDeclarationAccess().getSCTerminalRuleCall_2_0_1()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1069:1: rule__PropertyDeclaration__Group_2_1__0 : rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 ;
    public final void rule__PropertyDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1073:1: ( rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1074:2: rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02109);
            rule__PropertyDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02112);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1081:1: rule__PropertyDeclaration__Group_2_1__0__Impl : ( RULE_BL ) ;
    public final void rule__PropertyDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1085:1: ( ( RULE_BL ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1086:1: ( RULE_BL )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1086:1: ( RULE_BL )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1087:1: RULE_BL
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBLTerminalRuleCall_2_1_0()); 
            match(input,RULE_BL,FOLLOW_RULE_BL_in_rule__PropertyDeclaration__Group_2_1__0__Impl2139); 
             after(grammarAccess.getPropertyDeclarationAccess().getBLTerminalRuleCall_2_1_0()); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1098:1: rule__PropertyDeclaration__Group_2_1__1 : rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 ;
    public final void rule__PropertyDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1102:1: ( rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1103:2: rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12168);
            rule__PropertyDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12171);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1110:1: rule__PropertyDeclaration__Group_2_1__1__Impl : ( ( rulePropertyDeclaration )* ) ;
    public final void rule__PropertyDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1114:1: ( ( ( rulePropertyDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1115:1: ( ( rulePropertyDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1115:1: ( ( rulePropertyDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1116:1: ( rulePropertyDeclaration )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1117:1: ( rulePropertyDeclaration )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1117:3: rulePropertyDeclaration
            	    {
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2199);
            	    rulePropertyDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1127:1: rule__PropertyDeclaration__Group_2_1__2 : rule__PropertyDeclaration__Group_2_1__2__Impl ;
    public final void rule__PropertyDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1131:1: ( rule__PropertyDeclaration__Group_2_1__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1132:2: rule__PropertyDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22230);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1138:1: rule__PropertyDeclaration__Group_2_1__2__Impl : ( RULE_BR ) ;
    public final void rule__PropertyDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1142:1: ( ( RULE_BR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1143:1: ( RULE_BR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1143:1: ( RULE_BR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1144:1: RULE_BR
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRTerminalRuleCall_2_1_2()); 
            match(input,RULE_BR,FOLLOW_RULE_BR_in_rule__PropertyDeclaration__Group_2_1__2__Impl2257); 
             after(grammarAccess.getPropertyDeclarationAccess().getBRTerminalRuleCall_2_1_2()); 

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


    // $ANTLR start "rule__Sass__StatementsAssignment_3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1162:1: rule__Sass__StatementsAssignment_3 : ( ruleRule ) ;
    public final void rule__Sass__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1166:1: ( ( ruleRule ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1167:1: ( ruleRule )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1167:1: ( ruleRule )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1168:1: ruleRule
            {
             before(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_32297);
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
    public static final BitSet FOLLOW_ruleCharset_in_entryRuleCharset121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharset128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0_in_ruleCharset154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0_in_ruleRuleHead334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody394 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleBody__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__PropertyDeclaration__Alternatives_2_0_0608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0638 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1699 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2761 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl792 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl850 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__0889 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__0892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__1948 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__21007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_in_rule__Charset__Group__2__Impl1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01069 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CL_in_rule__VariableDeclaration__Group__1__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21187 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_in_rule__VariableDeclaration__Group__3__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01310 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_rule__Rule__Group__0__Impl1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11369 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BL_in_rule__Rule__Group__1__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21428 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BR_in_rule__Rule__Group__3__Impl1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01551 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1637 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01672 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__01791 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__01794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__11850 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CL_in_rule__PropertyDeclaration__Group__1__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__21909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__01972 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__01975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2004 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2016 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SC_in_rule__PropertyDeclaration__Group_2_0__1__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02109 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BL_in_rule__PropertyDeclaration__Group_2_1__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12168 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2199 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BR_in_rule__PropertyDeclaration__Group_2_1__2__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_32297 = new BitSet(new long[]{0x0000000000000002L});

}