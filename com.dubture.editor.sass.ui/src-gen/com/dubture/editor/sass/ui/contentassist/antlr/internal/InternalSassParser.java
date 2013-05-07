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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_VARIABLE", "RULE_CHARSET_ID", "RULE_STRING", "RULE_SEMI_COLON", "RULE_INCLUDE_ID", "RULE_COLON", "RULE_BRACE_LEFT", "RULE_BRACE_RIGHT", "RULE_SELECTOR", "RULE_COMMA", "RULE_MIXIN_ID", "RULE_PAREN_LEFT", "RULE_PAREN_RIGHT", "RULE_DOT", "RULE_SHARP", "RULE_DOLLAR", "RULE_AMP", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_AMP=21;
    public static final int RULE_ID=23;
    public static final int RULE_BRACE_RIGHT=12;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_COMMA=14;
    public static final int RULE_INCLUDE_ID=9;
    public static final int RULE_MIXIN_ID=15;
    public static final int RULE_SL_COMMENT=25;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_PAREN_LEFT=16;
    public static final int RULE_BRACE_LEFT=11;
    public static final int RULE_DOLLAR=20;
    public static final int RULE_COLON=10;
    public static final int RULE_STRING=7;
    public static final int RULE_CHARSET_ID=6;
    public static final int RULE_DOT=18;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_PAREN_RIGHT=17;
    public static final int RULE_SEMI_COLON=8;
    public static final int RULE_INT=22;
    public static final int RULE_WS=26;
    public static final int RULE_SHARP=19;
    public static final int RULE_WORD=4;
    public static final int RULE_SELECTOR=13;

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

                if ( (LA1_0==RULE_WORD||LA1_0==RULE_INCLUDE_ID||LA1_0==RULE_SELECTOR||LA1_0==RULE_MIXIN_ID) ) {
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

            if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_VARIABLE)) ) {
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:384:1: rule__PropertyDeclaration__Alternatives_2_0_0 : ( ( RULE_WORD ) | ( RULE_VARIABLE ) );
    public final void rule__PropertyDeclaration__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:388:1: ( ( RULE_WORD ) | ( RULE_VARIABLE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WORD) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_VARIABLE) ) {
                alt5=2;
            }
            else {
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

            }
        }
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:408:1: rule__Sass__Group__0 : rule__Sass__Group__0__Impl rule__Sass__Group__1 ;
    public final void rule__Sass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:412:1: ( rule__Sass__Group__0__Impl rule__Sass__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:413:2: rule__Sass__Group__0__Impl rule__Sass__Group__1
            {
            pushFollow(FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0824);
            rule__Sass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0827);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:420:1: rule__Sass__Group__0__Impl : ( () ) ;
    public final void rule__Sass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:424:1: ( ( () ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:425:1: ( () )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:425:1: ( () )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:426:1: ()
            {
             before(grammarAccess.getSassAccess().getSassAction_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:427:1: ()
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:429:1: 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:439:1: rule__Sass__Group__1 : rule__Sass__Group__1__Impl rule__Sass__Group__2 ;
    public final void rule__Sass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:443:1: ( rule__Sass__Group__1__Impl rule__Sass__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:444:2: rule__Sass__Group__1__Impl rule__Sass__Group__2
            {
            pushFollow(FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1885);
            rule__Sass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1888);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:451:1: rule__Sass__Group__1__Impl : ( ( ruleCharset )? ) ;
    public final void rule__Sass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:455:1: ( ( ( ruleCharset )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:456:1: ( ( ruleCharset )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:456:1: ( ( ruleCharset )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:457:1: ( ruleCharset )?
            {
             before(grammarAccess.getSassAccess().getCharsetParserRuleCall_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:458:1: ( ruleCharset )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CHARSET_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:458:3: ruleCharset
                    {
                    pushFollow(FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl916);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:468:1: rule__Sass__Group__2 : rule__Sass__Group__2__Impl rule__Sass__Group__3 ;
    public final void rule__Sass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:472:1: ( rule__Sass__Group__2__Impl rule__Sass__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:473:2: rule__Sass__Group__2__Impl rule__Sass__Group__3
            {
            pushFollow(FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2947);
            rule__Sass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2950);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:480:1: rule__Sass__Group__2__Impl : ( ( ruleVariableDeclaration )* ) ;
    public final void rule__Sass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:484:1: ( ( ( ruleVariableDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:485:1: ( ( ruleVariableDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:485:1: ( ( ruleVariableDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:486:1: ( ruleVariableDeclaration )*
            {
             before(grammarAccess.getSassAccess().getVariableDeclarationParserRuleCall_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:487:1: ( ruleVariableDeclaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_VARIABLE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:487:3: ruleVariableDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl978);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:497:1: rule__Sass__Group__3 : rule__Sass__Group__3__Impl ;
    public final void rule__Sass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:501:1: ( rule__Sass__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:502:2: rule__Sass__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__31009);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:508:1: rule__Sass__Group__3__Impl : ( ( rule__Sass__StatementsAssignment_3 )* ) ;
    public final void rule__Sass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:512:1: ( ( ( rule__Sass__StatementsAssignment_3 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:513:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:513:1: ( ( rule__Sass__StatementsAssignment_3 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:514:1: ( rule__Sass__StatementsAssignment_3 )*
            {
             before(grammarAccess.getSassAccess().getStatementsAssignment_3()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:515:1: ( rule__Sass__StatementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SELECTOR||LA8_0==RULE_MIXIN_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:515:2: rule__Sass__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl1036);
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


    // $ANTLR start "rule__Charset__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:533:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:537:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:538:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__01075);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__01078);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:545:1: rule__Charset__Group__0__Impl : ( RULE_CHARSET_ID ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:549:1: ( ( RULE_CHARSET_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:550:1: ( RULE_CHARSET_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:550:1: ( RULE_CHARSET_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:551:1: RULE_CHARSET_ID
            {
             before(grammarAccess.getCharsetAccess().getCHARSET_IDTerminalRuleCall_0()); 
            match(input,RULE_CHARSET_ID,FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl1105); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:562:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:566:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:567:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__11134);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__11137);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:574:1: rule__Charset__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:578:1: ( ( RULE_STRING ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:579:1: ( RULE_STRING )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:579:1: ( RULE_STRING )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:580:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl1164); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:591:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:595:1: ( rule__Charset__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:596:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__21193);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:602:1: rule__Charset__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:606:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:607:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:607:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:608:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getCharsetAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl1220); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:625:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:629:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:630:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01255);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01258);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:637:1: rule__Include__Group__0__Impl : ( RULE_INCLUDE_ID ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:641:1: ( ( RULE_INCLUDE_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:642:1: ( RULE_INCLUDE_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:642:1: ( RULE_INCLUDE_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:643:1: RULE_INCLUDE_ID
            {
             before(grammarAccess.getIncludeAccess().getINCLUDE_IDTerminalRuleCall_0()); 
            match(input,RULE_INCLUDE_ID,FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl1285); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:654:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:658:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:659:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__11314);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__11317);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:666:1: rule__Include__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:670:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:671:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:671:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:672:1: RULE_WORD
            {
             before(grammarAccess.getIncludeAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl1344); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:683:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:687:1: ( rule__Include__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:688:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__21373);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:694:1: rule__Include__Group__2__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:698:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:699:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:699:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:700:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getIncludeAccess().getSEMI_COLONTerminalRuleCall_2()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl1400); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:717:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:721:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:722:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01435);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01438);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:729:1: rule__VariableDeclaration__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:733:1: ( ( RULE_VARIABLE ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:734:1: ( RULE_VARIABLE )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:734:1: ( RULE_VARIABLE )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:735:1: RULE_VARIABLE
            {
             before(grammarAccess.getVariableDeclarationAccess().getVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1465); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:746:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:750:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:751:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11494);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11497);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:758:1: rule__VariableDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:762:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:763:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:763:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:764:1: RULE_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1524); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:775:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:779:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:780:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21553);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21556);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:787:1: rule__VariableDeclaration__Group__2__Impl : ( RULE_WORD ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:791:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:792:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:792:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:793:1: RULE_WORD
            {
             before(grammarAccess.getVariableDeclarationAccess().getWORDTerminalRuleCall_2()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1583); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:804:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:808:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:809:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31612);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:815:1: rule__VariableDeclaration__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:819:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:820:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:820:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:821:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getVariableDeclarationAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1639); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:840:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:844:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:845:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01676);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01679);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:852:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Alternatives_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:856:1: ( ( ( rule__Rule__Alternatives_0 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:857:1: ( ( rule__Rule__Alternatives_0 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:857:1: ( ( rule__Rule__Alternatives_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:858:1: ( rule__Rule__Alternatives_0 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:859:1: ( rule__Rule__Alternatives_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:859:2: rule__Rule__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl1706);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:869:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:873:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:874:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11736);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11739);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:881:1: rule__Rule__Group__1__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:885:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:886:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:886:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:887:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getRuleAccess().getBRACE_LEFTTerminalRuleCall_1()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1766); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:898:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:902:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:903:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21795);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21798);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:910:1: rule__Rule__Group__2__Impl : ( ruleRuleBody ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:914:1: ( ( ruleRuleBody ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:915:1: ( ruleRuleBody )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:915:1: ( ruleRuleBody )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:916:1: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getRuleBodyParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1825);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:927:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:931:1: ( rule__Rule__Group__3__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:932:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31854);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:938:1: rule__Rule__Group__3__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:942:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:943:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:943:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:944:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getRuleAccess().getBRACE_RIGHTTerminalRuleCall_3()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1881); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:963:1: rule__RuleHead__Group__0 : rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 ;
    public final void rule__RuleHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:967:1: ( rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:968:2: rule__RuleHead__Group__0__Impl rule__RuleHead__Group__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01918);
            rule__RuleHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01921);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:975:1: rule__RuleHead__Group__0__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:979:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:980:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:980:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:981:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_0()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1948); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:992:1: rule__RuleHead__Group__1 : rule__RuleHead__Group__1__Impl ;
    public final void rule__RuleHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:996:1: ( rule__RuleHead__Group__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:997:2: rule__RuleHead__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11977);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1003:1: rule__RuleHead__Group__1__Impl : ( ( rule__RuleHead__Group_1__0 )* ) ;
    public final void rule__RuleHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1007:1: ( ( ( rule__RuleHead__Group_1__0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1008:1: ( ( rule__RuleHead__Group_1__0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1008:1: ( ( rule__RuleHead__Group_1__0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1009:1: ( rule__RuleHead__Group_1__0 )*
            {
             before(grammarAccess.getRuleHeadAccess().getGroup_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1010:1: ( rule__RuleHead__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1010:2: rule__RuleHead__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl2004);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1024:1: rule__RuleHead__Group_1__0 : rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 ;
    public final void rule__RuleHead__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1028:1: ( rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1029:2: rule__RuleHead__Group_1__0__Impl rule__RuleHead__Group_1__1
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__02039);
            rule__RuleHead__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__02042);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1036:1: rule__RuleHead__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__RuleHead__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1040:1: ( ( RULE_COMMA ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1041:1: ( RULE_COMMA )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1041:1: ( RULE_COMMA )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1042:1: RULE_COMMA
            {
             before(grammarAccess.getRuleHeadAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl2069); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1053:1: rule__RuleHead__Group_1__1 : rule__RuleHead__Group_1__1__Impl ;
    public final void rule__RuleHead__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1057:1: ( rule__RuleHead__Group_1__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1058:2: rule__RuleHead__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__12098);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1064:1: rule__RuleHead__Group_1__1__Impl : ( RULE_SELECTOR ) ;
    public final void rule__RuleHead__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1068:1: ( ( RULE_SELECTOR ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1069:1: ( RULE_SELECTOR )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1069:1: ( RULE_SELECTOR )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1070:1: RULE_SELECTOR
            {
             before(grammarAccess.getRuleHeadAccess().getSELECTORTerminalRuleCall_1_1()); 
            match(input,RULE_SELECTOR,FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl2125); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1085:1: rule__PropertyDeclaration__Group__0 : rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 ;
    public final void rule__PropertyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1089:1: ( rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1090:2: rule__PropertyDeclaration__Group__0__Impl rule__PropertyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__02158);
            rule__PropertyDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__02161);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1097:1: rule__PropertyDeclaration__Group__0__Impl : ( RULE_WORD ) ;
    public final void rule__PropertyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1101:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1102:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1102:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1103:1: RULE_WORD
            {
             before(grammarAccess.getPropertyDeclarationAccess().getWORDTerminalRuleCall_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl2188); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1114:1: rule__PropertyDeclaration__Group__1 : rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 ;
    public final void rule__PropertyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1118:1: ( rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1119:2: rule__PropertyDeclaration__Group__1__Impl rule__PropertyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__12217);
            rule__PropertyDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__12220);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1126:1: rule__PropertyDeclaration__Group__1__Impl : ( RULE_COLON ) ;
    public final void rule__PropertyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1130:1: ( ( RULE_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1131:1: ( RULE_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1131:1: ( RULE_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1132:1: RULE_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getCOLONTerminalRuleCall_1()); 
            match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl2247); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1143:1: rule__PropertyDeclaration__Group__2 : rule__PropertyDeclaration__Group__2__Impl ;
    public final void rule__PropertyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1147:1: ( rule__PropertyDeclaration__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1148:2: rule__PropertyDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__22276);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1154:1: rule__PropertyDeclaration__Group__2__Impl : ( ( rule__PropertyDeclaration__Alternatives_2 ) ) ;
    public final void rule__PropertyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1158:1: ( ( ( rule__PropertyDeclaration__Alternatives_2 ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1159:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1159:1: ( ( rule__PropertyDeclaration__Alternatives_2 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1160:1: ( rule__PropertyDeclaration__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1161:1: ( rule__PropertyDeclaration__Alternatives_2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1161:2: rule__PropertyDeclaration__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl2303);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1177:1: rule__PropertyDeclaration__Group_2_0__0 : rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 ;
    public final void rule__PropertyDeclaration__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1181:1: ( rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1182:2: rule__PropertyDeclaration__Group_2_0__0__Impl rule__PropertyDeclaration__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__02339);
            rule__PropertyDeclaration__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__02342);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1189:1: rule__PropertyDeclaration__Group_2_0__0__Impl : ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) ;
    public final void rule__PropertyDeclaration__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1193:1: ( ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1194:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1194:1: ( ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1195:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) ) ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1195:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1196:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1197:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1197:2: rule__PropertyDeclaration__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2371);
            rule__PropertyDeclaration__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 

            }

            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1200:1: ( ( rule__PropertyDeclaration__Alternatives_2_0_0 )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1201:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getAlternatives_2_0_0()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1202:1: ( rule__PropertyDeclaration__Alternatives_2_0_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_WORD && LA10_0<=RULE_VARIABLE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1202:2: rule__PropertyDeclaration__Alternatives_2_0_0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2383);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1213:1: rule__PropertyDeclaration__Group_2_0__1 : rule__PropertyDeclaration__Group_2_0__1__Impl ;
    public final void rule__PropertyDeclaration__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1217:1: ( rule__PropertyDeclaration__Group_2_0__1__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1218:2: rule__PropertyDeclaration__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12416);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1224:1: rule__PropertyDeclaration__Group_2_0__1__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__PropertyDeclaration__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1228:1: ( ( RULE_SEMI_COLON ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1229:1: ( RULE_SEMI_COLON )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1229:1: ( RULE_SEMI_COLON )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1230:1: RULE_SEMI_COLON
            {
             before(grammarAccess.getPropertyDeclarationAccess().getSEMI_COLONTerminalRuleCall_2_0_1()); 
            match(input,RULE_SEMI_COLON,FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2443); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1245:1: rule__PropertyDeclaration__Group_2_1__0 : rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 ;
    public final void rule__PropertyDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1249:1: ( rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1250:2: rule__PropertyDeclaration__Group_2_1__0__Impl rule__PropertyDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02476);
            rule__PropertyDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02479);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1257:1: rule__PropertyDeclaration__Group_2_1__0__Impl : ( RULE_BRACE_LEFT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1261:1: ( ( RULE_BRACE_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1262:1: ( RULE_BRACE_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1262:1: ( RULE_BRACE_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1263:1: RULE_BRACE_LEFT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_LEFTTerminalRuleCall_2_1_0()); 
            match(input,RULE_BRACE_LEFT,FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2506); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1274:1: rule__PropertyDeclaration__Group_2_1__1 : rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 ;
    public final void rule__PropertyDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1278:1: ( rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1279:2: rule__PropertyDeclaration__Group_2_1__1__Impl rule__PropertyDeclaration__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12535);
            rule__PropertyDeclaration__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12538);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1286:1: rule__PropertyDeclaration__Group_2_1__1__Impl : ( ( rulePropertyDeclaration )* ) ;
    public final void rule__PropertyDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1290:1: ( ( ( rulePropertyDeclaration )* ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1291:1: ( ( rulePropertyDeclaration )* )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1291:1: ( ( rulePropertyDeclaration )* )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1292:1: ( rulePropertyDeclaration )*
            {
             before(grammarAccess.getPropertyDeclarationAccess().getPropertyDeclarationParserRuleCall_2_1_1()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1293:1: ( rulePropertyDeclaration )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WORD) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1293:3: rulePropertyDeclaration
            	    {
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2566);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1303:1: rule__PropertyDeclaration__Group_2_1__2 : rule__PropertyDeclaration__Group_2_1__2__Impl ;
    public final void rule__PropertyDeclaration__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1307:1: ( rule__PropertyDeclaration__Group_2_1__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1308:2: rule__PropertyDeclaration__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22597);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1314:1: rule__PropertyDeclaration__Group_2_1__2__Impl : ( RULE_BRACE_RIGHT ) ;
    public final void rule__PropertyDeclaration__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1318:1: ( ( RULE_BRACE_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1319:1: ( RULE_BRACE_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1319:1: ( RULE_BRACE_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1320:1: RULE_BRACE_RIGHT
            {
             before(grammarAccess.getPropertyDeclarationAccess().getBRACE_RIGHTTerminalRuleCall_2_1_2()); 
            match(input,RULE_BRACE_RIGHT,FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2624); 
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


    // $ANTLR start "rule__Mixin__Group__0"
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1337:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1341:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1342:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__02659);
            rule__Mixin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__02662);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1349:1: rule__Mixin__Group__0__Impl : ( RULE_MIXIN_ID ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1353:1: ( ( RULE_MIXIN_ID ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1354:1: ( RULE_MIXIN_ID )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1354:1: ( RULE_MIXIN_ID )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1355:1: RULE_MIXIN_ID
            {
             before(grammarAccess.getMixinAccess().getMIXIN_IDTerminalRuleCall_0()); 
            match(input,RULE_MIXIN_ID,FOLLOW_RULE_MIXIN_ID_in_rule__Mixin__Group__0__Impl2689); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1366:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl rule__Mixin__Group__2 ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1370:1: ( rule__Mixin__Group__1__Impl rule__Mixin__Group__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1371:2: rule__Mixin__Group__1__Impl rule__Mixin__Group__2
            {
            pushFollow(FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__12718);
            rule__Mixin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__12721);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1378:1: rule__Mixin__Group__1__Impl : ( RULE_WORD ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1382:1: ( ( RULE_WORD ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1383:1: ( RULE_WORD )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1383:1: ( RULE_WORD )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1384:1: RULE_WORD
            {
             before(grammarAccess.getMixinAccess().getWORDTerminalRuleCall_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Mixin__Group__1__Impl2748); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1395:1: rule__Mixin__Group__2 : rule__Mixin__Group__2__Impl ;
    public final void rule__Mixin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1399:1: ( rule__Mixin__Group__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1400:2: rule__Mixin__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__22777);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1406:1: rule__Mixin__Group__2__Impl : ( ( rule__Mixin__Group_2__0 )? ) ;
    public final void rule__Mixin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1410:1: ( ( ( rule__Mixin__Group_2__0 )? ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1411:1: ( ( rule__Mixin__Group_2__0 )? )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1411:1: ( ( rule__Mixin__Group_2__0 )? )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1412:1: ( rule__Mixin__Group_2__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_2()); 
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1413:1: ( rule__Mixin__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_PAREN_LEFT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1413:2: rule__Mixin__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mixin__Group_2__0_in_rule__Mixin__Group__2__Impl2804);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1429:1: rule__Mixin__Group_2__0 : rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 ;
    public final void rule__Mixin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1433:1: ( rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1434:2: rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__0__Impl_in_rule__Mixin__Group_2__02841);
            rule__Mixin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group_2__1_in_rule__Mixin__Group_2__02844);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1441:1: rule__Mixin__Group_2__0__Impl : ( RULE_PAREN_LEFT ) ;
    public final void rule__Mixin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1445:1: ( ( RULE_PAREN_LEFT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1446:1: ( RULE_PAREN_LEFT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1446:1: ( RULE_PAREN_LEFT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1447:1: RULE_PAREN_LEFT
            {
             before(grammarAccess.getMixinAccess().getPAREN_LEFTTerminalRuleCall_2_0()); 
            match(input,RULE_PAREN_LEFT,FOLLOW_RULE_PAREN_LEFT_in_rule__Mixin__Group_2__0__Impl2871); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1458:1: rule__Mixin__Group_2__1 : rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 ;
    public final void rule__Mixin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1462:1: ( rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1463:2: rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__1__Impl_in_rule__Mixin__Group_2__12900);
            rule__Mixin__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group_2__2_in_rule__Mixin__Group_2__12903);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1470:1: rule__Mixin__Group_2__1__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Mixin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1474:1: ( ( RULE_VARIABLE ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1475:1: ( RULE_VARIABLE )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1475:1: ( RULE_VARIABLE )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1476:1: RULE_VARIABLE
            {
             before(grammarAccess.getMixinAccess().getVARIABLETerminalRuleCall_2_1()); 
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Mixin__Group_2__1__Impl2930); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1487:1: rule__Mixin__Group_2__2 : rule__Mixin__Group_2__2__Impl ;
    public final void rule__Mixin__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1491:1: ( rule__Mixin__Group_2__2__Impl )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1492:2: rule__Mixin__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group_2__2__Impl_in_rule__Mixin__Group_2__22959);
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1498:1: rule__Mixin__Group_2__2__Impl : ( RULE_PAREN_RIGHT ) ;
    public final void rule__Mixin__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1502:1: ( ( RULE_PAREN_RIGHT ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1503:1: ( RULE_PAREN_RIGHT )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1503:1: ( RULE_PAREN_RIGHT )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1504:1: RULE_PAREN_RIGHT
            {
             before(grammarAccess.getMixinAccess().getPAREN_RIGHTTerminalRuleCall_2_2()); 
            match(input,RULE_PAREN_RIGHT,FOLLOW_RULE_PAREN_RIGHT_in_rule__Mixin__Group_2__2__Impl2986); 
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
    // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1522:1: rule__Sass__StatementsAssignment_3 : ( ruleRule ) ;
    public final void rule__Sass__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1526:1: ( ( ruleRule ) )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1527:1: ( ruleRule )
            {
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1527:1: ( ruleRule )
            // ../com.dubture.editor.sass.ui/src-gen/com/dubture/editor/sass/ui/contentassist/antlr/internal/InternalSass.g:1528:1: ruleRule
            {
             before(grammarAccess.getSassAccess().getStatementsRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_33026);
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
    public static final BitSet FOLLOW_rule__RuleBody__Alternatives_in_ruleRuleBody454 = new BitSet(new long[]{0x000000000000A212L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0_in_rulePropertyDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Sass__Group__0__Impl_in_rule__Sass__Group__0824 = new BitSet(new long[]{0x000000000000A270L});
    public static final BitSet FOLLOW_rule__Sass__Group__1_in_rule__Sass__Group__0827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__1__Impl_in_rule__Sass__Group__1885 = new BitSet(new long[]{0x000000000000A270L});
    public static final BitSet FOLLOW_rule__Sass__Group__2_in_rule__Sass__Group__1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharset_in_rule__Sass__Group__1__Impl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__Group__2__Impl_in_rule__Sass__Group__2947 = new BitSet(new long[]{0x000000000000A270L});
    public static final BitSet FOLLOW_rule__Sass__Group__3_in_rule__Sass__Group__2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Sass__Group__2__Impl978 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Sass__Group__3__Impl_in_rule__Sass__Group__31009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sass__StatementsAssignment_3_in_rule__Sass__Group__3__Impl1036 = new BitSet(new long[]{0x000000000000A212L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__01075 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__01078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARSET_ID_in_rule__Charset__Group__0__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__11134 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__Group__1__Impl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__21193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Charset__Group__2__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_ID_in_rule__Include__Group__0__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__11314 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Include__Group__1__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__21373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__Include__Group__2__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__01435 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__01438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__VariableDeclaration__Group__0__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__11494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__VariableDeclaration__Group__1__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__21553 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__21556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__VariableDeclaration__Group__2__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__31612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__VariableDeclaration__Group__3__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01676 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_0_in_rule__Rule__Group__0__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11736 = new BitSet(new long[]{0x000000000000A210L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__Rule__Group__1__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21795 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleBody_in_rule__Rule__Group__2__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__Rule__Group__3__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__0__Impl_in_rule__RuleHead__Group__01918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1_in_rule__RuleHead__Group__01921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group__0__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group__1__Impl_in_rule__RuleHead__Group__11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0_in_rule__RuleHead__Group__1__Impl2004 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__0__Impl_in_rule__RuleHead__Group_1__02039 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1_in_rule__RuleHead__Group_1__02042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__RuleHead__Group_1__0__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleHead__Group_1__1__Impl_in_rule__RuleHead__Group_1__12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SELECTOR_in_rule__RuleHead__Group_1__1__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__0__Impl_in_rule__PropertyDeclaration__Group__02158 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1_in_rule__PropertyDeclaration__Group__02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__PropertyDeclaration__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__1__Impl_in_rule__PropertyDeclaration__Group__12217 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2_in_rule__PropertyDeclaration__Group__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rule__PropertyDeclaration__Group__1__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group__2__Impl_in_rule__PropertyDeclaration__Group__22276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_in_rule__PropertyDeclaration__Group__2__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__0__Impl_in_rule__PropertyDeclaration__Group_2_0__02339 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1_in_rule__PropertyDeclaration__Group_2_0__02342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2371 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Alternatives_2_0_0_in_rule__PropertyDeclaration__Group_2_0__0__Impl2383 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_0__1__Impl_in_rule__PropertyDeclaration__Group_2_0__12416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_COLON_in_rule__PropertyDeclaration__Group_2_0__1__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__0__Impl_in_rule__PropertyDeclaration__Group_2_1__02476 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1_in_rule__PropertyDeclaration__Group_2_1__02479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_LEFT_in_rule__PropertyDeclaration__Group_2_1__0__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__1__Impl_in_rule__PropertyDeclaration__Group_2_1__12535 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2_in_rule__PropertyDeclaration__Group_2_1__12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_rule__PropertyDeclaration__Group_2_1__1__Impl2566 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PropertyDeclaration__Group_2_1__2__Impl_in_rule__PropertyDeclaration__Group_2_1__22597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_RIGHT_in_rule__PropertyDeclaration__Group_2_1__2__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__02659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MIXIN_ID_in_rule__Mixin__Group__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__12718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Mixin__Group__2_in_rule__Mixin__Group__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Mixin__Group__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__2__Impl_in_rule__Mixin__Group__22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__0_in_rule__Mixin__Group__2__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__0__Impl_in_rule__Mixin__Group_2__02841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__1_in_rule__Mixin__Group_2__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PAREN_LEFT_in_rule__Mixin__Group_2__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__1__Impl_in_rule__Mixin__Group_2__12900 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__2_in_rule__Mixin__Group_2__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Mixin__Group_2__1__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group_2__2__Impl_in_rule__Mixin__Group_2__22959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PAREN_RIGHT_in_rule__Mixin__Group_2__2__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Sass__StatementsAssignment_33026 = new BitSet(new long[]{0x0000000000000002L});

}