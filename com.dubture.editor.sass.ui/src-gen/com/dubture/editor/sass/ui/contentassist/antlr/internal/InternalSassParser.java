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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_VARIABLE", "RULE_CHARSET_ID", "RULE_STRING", "RULE_SEMI_COLON", "RULE_INCLUDE_ID", "RULE_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_SELECTOR", "RULE_COMMA", "RULE_DOT", "RULE_SHARP", "RULE_DOLLAR", "RULE_AMP", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=18;
    public static final int RULE_ID=20;
    public static final int RULE_BRACE_RIGHT=12;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_COMMA=14;
    public static final int RULE_INCLUDE_ID=9;
    public static final int RULE_SL_COMMENT=22;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=21;
    public static final int RULE_BRACE_LEFT=11;
    public static final int RULE_DOLLAR=17;
    public static final int RULE_COLON=10;
    public static final int RULE_STRING=7;
    public static final int RULE_CHARSET_ID=6;
    public static final int RULE_DOT=15;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_SEMI_COLON=8;
    public static final int RULE_INT=19;
    public static final int RULE_WS=23;
    public static final int RULE_WORD=4;
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


    // $ANTLR start "entryRuleInclude"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:116:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:117:1: ( ruleInclude EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:118:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude181);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude188); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:125:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:129:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:130:1: ( ( rule__Include__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:130:1: ( ( rule__Include__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:131:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:132:1: ( rule__Include__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:132:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude214);
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:144:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:145:1: ( ruleVariableDeclaration EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:146:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration241);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration248); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:153:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:157:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:158:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:158:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:159:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:160:1: ( rule__VariableDeclaration__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:160:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration274);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:172:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:173:1: ( ruleRule EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:174:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule301);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule308); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:181:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:185:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:186:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:186:1: ( ( rule__Rule__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:187:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:188:1: ( rule__Rule__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:188:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule334);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:200:1: entryRuleRuleHead : ruleRuleHead EOF ;
    public final void entryRuleRuleHead() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:201:1: ( ruleRuleHead EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:202:1: ruleRuleHead EOF
            {
             before(grammarAccess.getRuleHeadRule()); 
            pushFollow(FOLLOW_ruleRuleHead_in_entryRuleRuleHead361);
            ruleRuleHead();

            state._fsp--;

             after(grammarAccess.getRuleHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleHead368); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:209:1: ruleRuleHead : ( ( rule__RuleHead__Group__0 ) ) ;
    public final void ruleRuleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:213:2: ( ( ( rule__RuleHead__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:214:1: ( ( rule__RuleHead__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:214:1: ( ( rule__RuleHead__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:215:1: ( rule__RuleHead__Group__0 )
            {
             before(grammarAccess.getRuleHeadAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:216:1: ( rule__RuleHead__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:216:2: rule__RuleHead__Group__0
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0_in_ruleRuleHead394);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:228:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:229:1: ( ruleRuleBody EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:230:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_ruleRuleBody_in_entryRuleRuleBody421);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleBody428); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:237:1: ruleRuleBody : ( ( rule__RuleBody__Alternatives )* ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:241:2: ( ( ( rule__RuleBody__Alternatives )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:242:1: ( ( rule__RuleBody__Alternatives )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:242:1: ( ( rule__RuleBody__Alternatives )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:243:1: ( rule__RuleBody__Alternatives )*
            {
             before(grammarAccess.getRuleBodyAccess().getAlternatives()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:244:1: ( rule__RuleBody__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WORD||LA1_0==RULE_INCLUDE_ID||LA1_0==RULE_SELECTOR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:244:2: rule__RuleBody__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody454);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:256:1: entryRulePropertyDeclaration : rulePropertyDeclaration EOF ;
    public final void entryRulePropertyDeclaration() throws RecognitionException {
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:257:1: ( rulePropertyDeclaration EOF )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:258:1: rulePropertyDeclaration EOF
            {
             before(grammarAccess.getPropertyDeclarationRule()); 
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration482);
            rulePropertyDeclaration();

            state._fsp--;

             after(grammarAccess.getPropertyDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration489); 

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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:265:1: rulePropertyDeclaration : ( ( rule__PropertyDeclaration__Group__0 ) ) ;
    public final void rulePropertyDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:269:2: ( ( ( rule__PropertyDeclaration__Group__0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:270:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:270:1: ( ( rule__PropertyDeclaration__Group__0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:271:1: ( rule__PropertyDeclaration__Group__0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getGroup()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:272:1: ( rule__PropertyDeclaration__Group__0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:272:2: rule__PropertyDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration515);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:284:1: rule__RuleBody__Alternatives : ( ( rulePropertyDeclaration ) | ( ruleInclude ) | ( ruleRule ) );
    public final void rule__RuleBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:288:1: ( ( rulePropertyDeclaration ) | ( ruleInclude ) | ( ruleRule ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt2=1;
                }
                break;
            case RULE_INCLUDE_ID:
                {
                alt2=2;
                }
                break;
            case RULE_SELECTOR:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:289:1: ( rulePropertyDeclaration )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:289:1: ( rulePropertyDeclaration )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:290:1: rulePropertyDeclaration
                    {
                     before(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives551);
                    rulePropertyDeclaration();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getPropertyDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:295:6: ( ruleInclude )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:295:6: ( ruleInclude )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:296:1: ruleInclude
                    {
                     before(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInclude_in_rule__RuleBody__Alternatives568);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getRuleBodyAccess().getIncludeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:301:6: ( ruleRule )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:301:6: ( ruleRule )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:302:1: ruleRule
                    {
                     before(grammarAccess.getRuleBodyAccess().getRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__RuleBody__Alternatives585);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:312:1: rule__PropertyDeclaration__Alternatives_2 : ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) );
    public final void rule__PropertyDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:316:1: ( ( ( rule__PropertyDeclaration__Group_2_0__0 ) ) | ( ( rule__PropertyDeclaration__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_WORD && LA3_0<=RULE_VARIABLE)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_BRACE_LEFT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:317:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:317:1: ( ( rule__PropertyDeclaration__Group_2_0__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:318:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:319:1: ( rule__PropertyDeclaration__Group_2_0__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:319:2: rule__PropertyDeclaration__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2617);
                    rule__PropertyDeclaration__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDeclarationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:323:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:323:6: ( ( rule__PropertyDeclaration__Group_2_1__0 ) )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:324:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getGroup_2_1()); 
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:325:1: ( rule__PropertyDeclaration__Group_2_1__0 )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:325:2: rule__PropertyDeclaration__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2635);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:334:1: rule__PropertyDeclaration__Alternatives_2_0_0 : ( ( RULE_WORD ) | ( RULE_VARIABLE ) );
    public final void rule__PropertyDeclaration__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:338:1: ( ( RULE_WORD ) | ( RULE_VARIABLE ) )
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
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:339:1: ( RULE_WORD )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:339:1: ( RULE_WORD )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:340:1: RULE_WORD
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 
                    match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0668); 
                     after(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:345:6: ( RULE_VARIABLE )
                    {
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:345:6: ( RULE_VARIABLE )
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:346:1: RULE_VARIABLE
                    {
                     before(grammarAccess.getPropertyDeclarationAccess().getVARIABLETerminalRuleCall_2_0_0_1()); 
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__PropertyDeclaration__Alternatives_2_0_0685); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:358:1: rule__Sass__Group__0 : rule__Sass__Group__0__Impl rule__Sass__Group__1 ;
    public final void rule__Sass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:362:1: ( rule__Sass__Group__0__Impl rule__Sass__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:363:2: rule__Sass__Group__0__Impl rule__Sass__Group__1
            {
            pushFollow(FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0715);
            rule__Sass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0718);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:370:1: rule__Sass__Group__0__Impl : ( () ) ;
    public final void rule__Sass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:374:1: ( ( () ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:375:1: ( () )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:375:1: ( () )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:376:1: ()
            {
             before(grammarAccess.getSassAccess().getSassAction_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:377:1: ()
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:379:1: 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:389:1: rule__Sass__Group__1 : rule__Sass__Group__1__Impl rule__Sass__Group__2 ;
    public final void rule__Sass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:393:1: ( rule__Sass__Group__1__Impl rule__Sass__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:394:2: rule__Sass__Group__1__Impl rule__Sass__Group__2
            {
            pushFollow(FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1776);
            rule__Sass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1779);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:401:1: rule__Sass__Group__1__Impl : ( ( ruleCharset )? ) ;
    public final void rule__Sass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:405:1: ( ( ( ruleCharset )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:406:1: ( ( ruleCharset )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:406:1: ( ( ruleCharset )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:407:1: ( ruleCharset )?
            {
             before(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:408:1: ( ruleCharset )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CHARSET_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:408:3: ruleCharset
                    {
                    pushFollow(FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl807);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:418:1: rule__Sass__Group__2 : rule__Sass__Group__2__Impl rule__Sass__Group__3 ;
    public final void rule__Sass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:422:1: ( rule__Sass__Group__2__Impl rule__Sass__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:423:2: rule__Sass__Group__2__Impl rule__Sass__Group__3
            {
            pushFollow(FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2838);
            rule__Sass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2841);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:430:1: rule__Sass__Group__2__Impl : ( ( ruleVariableDeclaration )* ) ;
    public final void rule__Sass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:434:1: ( ( ( ruleVariableDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:435:1: ( ( ruleVariableDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:435:1: ( ( ruleVariableDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:436:1: ( ruleVariableDeclaration )*
            {
             before(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:437:1: ( ruleVariableDeclaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_VARIABLE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:437:3: ruleVariableDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl869);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:447:1: rule__Sass__Group__3 : rule__Sass__Group__3__Impl ;
    public final void rule__Sass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:451:1: ( rule__Sass__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:452:2: rule__Sass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__3900);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:458:1: rule__Sass__Group__3__Impl : ( ( rule__Sass__StatementsAssignment_3 )* ) ;
    public final void rule__Sass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:462:1: ( ( ( rule__Sass__StatementsAssignment_3 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:463:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:463:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:464:1: ( rule__Sass__StatementsAssignment_3 )*
            {
             before(grammarAccess.getSassAccess().getStatementsAssignment_3()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:465:1: ( rule__Sass__StatementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SELECTOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:465:2: rule__Sass__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl927);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:483:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:487:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:488:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__0966);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__0969);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:495:1: rule__Charset__Group__0__Impl : ( RULE_CHARSET_ID ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:499:1: ( ( RULE_CHARSET_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:500:1: ( RULE_CHARSET_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:500:1: ( RULE_CHARSET_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:501:1: RULE_CHARSET_ID
            {
             before(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
            match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl996); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:512:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:516:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:517:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__11025);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__11028);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:524:1: rule__Charset__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:528:1: ( ( RULE_STRING ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:529:1: ( RULE_STRING )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:529:1: ( RULE_STRING )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:530:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl1055); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:541:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:545:1: ( rule__Charset__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:546:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__21084);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:552:1: rule__Charset__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:556:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:557:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:557:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:558:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl1111); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:575:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:579:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:580:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01146);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01149);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:587:1: rule__Include__Group__0__Impl : ( RULE_INCLUDE_ID ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:591:1: ( ( RULE_INCLUDE_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:592:1: ( RULE_INCLUDE_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:592:1: ( RULE_INCLUDE_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:593:1: RULE_INCLUDE_ID
            {
             before(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
            match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl1176); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:604:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:608:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:609:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__11205);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__11208);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:616:1: rule__Include__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:620:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:621:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:621:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:622:1: RULE_WORD
            {
             before(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl1235); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:633:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:637:1: ( rule__Include__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:638:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__21264);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:644:1: rule__Include__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:648:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:649:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:649:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:650:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl1291); 
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


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:667:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:671:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:672:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01326);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01329);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:679:1: rule__VariableDeclaration__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:683:1: ( ( RULE_VARIABLE ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:684:1: ( RULE_VARIABLE )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:684:1: ( RULE_VARIABLE )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:685:1: RULE_VARIABLE
            {
             before(grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1356); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:696:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:700:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:701:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11385);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11388);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:708:1: rule__VariableDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:712:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:713:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:713:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:714:1: RULE_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1415); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:725:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:729:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:730:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21444);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21447);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:737:1: rule__VariableDeclaration__Group__2__Impl : ( RULE_WORD ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:741:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:742:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:742:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:743:1: RULE_WORD
            {
             before(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1474); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:754:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:758:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:759:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31503);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:765:1: rule__VariableDeclaration__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:769:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:770:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:770:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:771:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1530); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:790:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:794:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:795:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01567);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01570);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:802:1: rule__Rule__Group__0__Impl : ( ruleRuleHead ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:806:1: ( ( ruleRuleHead ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:807:1: ( ruleRuleHead )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:807:1: ( ruleRuleHead )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:808:1: ruleRuleHead
            {
             before(grammarAccess.getRuleAccess().getRuleHeadParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRuleHead_in_rule__Rule__Group__0__Impl1597);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:819:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:823:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:824:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11626);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11629);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:831:1: rule__Rule__Group__1__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:835:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:836:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:836:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:837:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1656); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:848:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:852:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:853:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21685);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21688);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:860:1: rule__Rule__Group__2__Impl : ( ruleRuleBody ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:864:1: ( ( ruleRuleBody ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:865:1: ( ruleRuleBody )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:865:1: ( ruleRuleBody )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:866:1: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1715);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:877:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:881:1: ( rule__Rule__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:882:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31744);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:888:1: rule__Rule__Group__3__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:892:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:893:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:893:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:894:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1771); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:913:1: rule__RuleHead__Group__0 : rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 ;
    public final void rule__RuleHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:917:1: ( rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:918:2: rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01808);
            rule__RuleHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01811);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:925:1: rule__RuleHead__Group__0__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:929:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:930:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:930:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:931:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1838); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:942:1: rule__RuleHead__Group__1 : rule__RuleHead__Group__1__Impl ;
    public final void rule__RuleHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:946:1: ( rule__RuleHead__Group__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:947:2: rule__RuleHead__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11867);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:953:1: rule__RuleHead__Group__1__Impl : ( ( rule__RuleHead__Group_1__0 )* ) ;
    public final void rule__RuleHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:957:1: ( ( ( rule__RuleHead__Group_1__0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:958:1: ( ( rule__RuleHead__Group_1__0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:958:1: ( ( rule__RuleHead__Group_1__0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:959:1: ( rule__RuleHead__Group_1__0 )*
            {
             before(grammarAccess.getRuleHeadAccess().getGroup_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:960:1: ( rule__RuleHead__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:960:2: rule__RuleHead__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1894);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:974:1: rule__RuleHead__Group_1__0 : rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 ;
    public final void rule__RuleHead__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:978:1: ( rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:979:2: rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01929);
            rule__RuleHead__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01932);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:986:1: rule__RuleHead__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__RuleHead__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:990:1: ( ( RULE_COMMA ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:991:1: ( RULE_COMMA )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:991:1: ( RULE_COMMA )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:992:1: RULE_COMMA
            {
             before(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1959); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1003:1: rule__RuleHead__Group_1__1 : rule__RuleHead__Group_1__1__Impl ;
    public final void rule__RuleHead__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1007:1: ( rule__RuleHead__Group_1__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1008:2: rule__RuleHead__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11988);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1014:1: rule__RuleHead__Group_1__1__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1018:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1019:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1019:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1020:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl2015); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1035:1: rule__PropertyDeclaration__Group__0 : rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 ;
    public final void rule__PropertyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1039:1: ( rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1040:2: rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__02048);
            rule__PropertyDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__02051);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1047:1: rule__PropertyDeclaration__Group__0__Impl : ( RULE_WORD ) ;
    public final void rule__PropertyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1051:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1052:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1052:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1053:1: RULE_WORD
            {
             before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl2078); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1064:1: rule__PropertyDeclaration__Group__1 : rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 ;
    public final void rule__PropertyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1068:1: ( rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1069:2: rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__12107);
            rule__PropertyDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__12110);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1076:1: rule__PropertyDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__PropertyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1080:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1081:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1081:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1082:1: RULE_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl2137); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1093:1: rule__PropertyDeclaration__Group__2 : rule__PropertyDeclaration__Group__2__Impl ;
    public final void rule__PropertyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1097:1: ( rule__PropertyDeclaration__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1098:2: rule__PropertyDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__22166);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1104:1: rule__PropertyDeclaration__Group__2__Impl : ( ( rule__PropertyDeclaration__Alternatives_2 ) ) ;
    public final void rule__PropertyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1108:1: ( ( ( rule__PropertyDeclaration__Alternatives_2 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1109:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1109:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1110:1: ( rule__PropertyDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1111:1: ( rule__PropertyDeclaration__Alternatives_2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1111:2: rule__PropertyDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl2193);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1127:1: rule__PropertyDeclaration__Group_2_0__0 : rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 ;
    public final void rule__PropertyDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1131:1: ( rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1132:2: rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__02229);
            rule__PropertyDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__02232);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1139:1: rule__PropertyDeclaration__Group_2_0__0__Impl : ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) ;
    public final void rule__PropertyDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1143:1: ( ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1144:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1144:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1145:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1145:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1146:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1147:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1147:2: rule__PropertyDeclaration__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2261);
            rule__PropertyDeclaration__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 

            }

            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1150:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1151:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1152:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_WORD && LA9_0<=RULE_VARIABLE)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1152:2: rule__PropertyDeclaration__Alternatives_2_0_0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2273);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1163:1: rule__PropertyDeclaration__Group_2_0__1 : rule__PropertyDeclaration__Group_2_0__1__Impl ;
    public final void rule__PropertyDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1167:1: ( rule__PropertyDeclaration__Group_2_0__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1168:2: rule__PropertyDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12306);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1174:1: rule__PropertyDeclaration__Group_2_0__1__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__PropertyDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1178:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1179:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1179:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1180:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2333); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1195:1: rule__PropertyDeclaration__Group_2_1__0 : rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 ;
    public final void rule__PropertyDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1199:1: ( rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1200:2: rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02366);
            rule__PropertyDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02369);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1207:1: rule__PropertyDeclaration__Group_2_1__0__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1211:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1212:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1212:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1213:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2396); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1224:1: rule__PropertyDeclaration__Group_2_1__1 : rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 ;
    public final void rule__PropertyDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1228:1: ( rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1229:2: rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12425);
            rule__PropertyDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12428);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1236:1: rule__PropertyDeclaration__Group_2_1__1__Impl : ( ( rulePropertyDeclaration )* ) ;
    public final void rule__PropertyDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1240:1: ( ( ( rulePropertyDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1241:1: ( ( rulePropertyDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1241:1: ( ( rulePropertyDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1242:1: ( rulePropertyDeclaration )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1243:1: ( rulePropertyDeclaration )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1243:3: rulePropertyDeclaration
            	    {
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2456);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1253:1: rule__PropertyDeclaration__Group_2_1__2 : rule__PropertyDeclaration__Group_2_1__2__Impl ;
    public final void rule__PropertyDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1257:1: ( rule__PropertyDeclaration__Group_2_1__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1258:2: rule__PropertyDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22487);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1264:1: rule__PropertyDeclaration__Group_2_1__2__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1268:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1269:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1269:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1270:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2514); 
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


    // $ANTLR start "rule__Sass__StatementsAssignment_3"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1288:1: rule__Sass__StatementsAssignment_3 : ( ruleRule ) ;
    public final void rule__Sass__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1292:1: ( ( ruleRule ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1293:1: ( ruleRule )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1293:1: ( ruleRule )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1294:1: ruleRule
            {
             before(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_32554);
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
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_entryRuleRuleHead361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleHead368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0_in_ruleRuleHead394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_entryRuleRuleBody421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleBody428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody454 = new BitSet(new long[]{0x0000000000002212L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__RuleBody__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__RuleBody__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__RuleBody__Alternatives585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0_in_rule__PropertyDeclaration__Alternatives_2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0_in_rule__PropertyDeclaration__Alternatives_2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Alternatives_2_0_0668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__PropertyDeclaration__Alternatives_2_0_0685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0715 = new BitSet(new long[]{0x0000000000002270L});
    public static final BitSet FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1776 = new BitSet(new long[]{0x0000000000002270L});
    public static final BitSet FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2838 = new BitSet(new long[]{0x0000000000002270L});
    public static final BitSet FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl869 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl927 = new BitSet(new long[]{0x0000000000002212L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__0966 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__0969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__11025 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__11028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__21084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__11205 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__11208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__21264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01326 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21444 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01567 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleHead_in_rule__Rule__Group__0__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11626 = new BitSet(new long[]{0x0000000000002210L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21685 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01808 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl1894 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__01929 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__01932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__02048 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__02051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__12107 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__22166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__02229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__02232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2261 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2273 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02366 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12425 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2456 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_32554 = new BitSet(new long[]{0x0000000000000002L});

}