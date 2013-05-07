package com.dubture.editor.sass.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSassLexer extends Lexer {
    public static final int RULE_AMP=18;
    public static final int RULE_ID=20;
    public static final int RULE_BRACE_RIGHT=12;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_COMMA=14;
    public static final int RULE_INCLUDE_ID=7;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=22;
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
    public static final int RULE_SHARP=16;
    public static final int RULE_SELECTOR=13;
    public static final int RULE_WORD=8;

    // delegates
    // delegators

    public InternalSassLexer() {;} 
    public InternalSassLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSassLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g"; }

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:498:10: ( '.' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:498:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:500:12: ( ',' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:500:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_SHARP"
    public final void mRULE_SHARP() throws RecognitionException {
        try {
            int _type = RULE_SHARP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:502:12: ( '#' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:502:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHARP"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:504:12: ( ':' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:504:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMI_COLON"
    public final void mRULE_SEMI_COLON() throws RecognitionException {
        try {
            int _type = RULE_SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:506:17: ( ';' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:506:19: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI_COLON"

    // $ANTLR start "RULE_BRACE_LEFT"
    public final void mRULE_BRACE_LEFT() throws RecognitionException {
        try {
            int _type = RULE_BRACE_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:508:17: ( '{' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:508:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACE_LEFT"

    // $ANTLR start "RULE_BRACE_RIGHT"
    public final void mRULE_BRACE_RIGHT() throws RecognitionException {
        try {
            int _type = RULE_BRACE_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:510:18: ( '}' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:510:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACE_RIGHT"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:512:13: ( '$' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:512:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_AMP"
    public final void mRULE_AMP() throws RecognitionException {
        try {
            int _type = RULE_AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:514:10: ( '&' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:514:12: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMP"

    // $ANTLR start "RULE_CHARSET_ID"
    public final void mRULE_CHARSET_ID() throws RecognitionException {
        try {
            int _type = RULE_CHARSET_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:516:17: ( '@charset ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:516:19: '@charset '
            {
            match("@charset "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARSET_ID"

    // $ANTLR start "RULE_INCLUDE_ID"
    public final void mRULE_INCLUDE_ID() throws RecognitionException {
        try {
            int _type = RULE_INCLUDE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:518:17: ( '@include' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:518:19: '@include'
            {
            match("@include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE_ID"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:520:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+ )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:520:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:520:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='%'||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
            	    {
            	    if ( input.LA(1)=='%'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:522:15: ( RULE_DOLLAR RULE_WORD )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:522:17: RULE_DOLLAR RULE_WORD
            {
            mRULE_DOLLAR(); 
            mRULE_WORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SELECTOR"
    public final void mRULE_SELECTOR() throws RecognitionException {
        try {
            int _type = RULE_SELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:15: ( ( RULE_AMP RULE_COLON RULE_WORD | ( ( RULE_SHARP | RULE_DOT )? RULE_WORD )+ ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:17: ( RULE_AMP RULE_COLON RULE_WORD | ( ( RULE_SHARP | RULE_DOT )? RULE_WORD )+ )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:17: ( RULE_AMP RULE_COLON RULE_WORD | ( ( RULE_SHARP | RULE_DOT )? RULE_WORD )+ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='&') ) {
                alt4=1;
            }
            else if ( (LA4_0=='#'||LA4_0=='%'||(LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:18: RULE_AMP RULE_COLON RULE_WORD
                    {
                    mRULE_AMP(); 
                    mRULE_COLON(); 
                    mRULE_WORD(); 

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:48: ( ( RULE_SHARP | RULE_DOT )? RULE_WORD )+
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:48: ( ( RULE_SHARP | RULE_DOT )? RULE_WORD )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='#'||LA3_0=='%'||(LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:49: ( RULE_SHARP | RULE_DOT )? RULE_WORD
                    	    {
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:524:49: ( RULE_SHARP | RULE_DOT )?
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0=='#'||LA2_0=='.') ) {
                    	        alt2=1;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
                    	            {
                    	            if ( input.LA(1)=='#'||input.LA(1)=='.' ) {
                    	                input.consume();

                    	            }
                    	            else {
                    	                MismatchedSetException mse = new MismatchedSetException(null,input);
                    	                recover(mse);
                    	                throw mse;}


                    	            }
                    	            break;

                    	    }

                    	    mRULE_WORD(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECTOR"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:526:10: ( 'INT has been deactivated' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:526:12: 'INT has been deactivated'
            {
            match("INT has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:528:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:530:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:532:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:41: ( '\\r' )? '\\n'
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:534:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:536:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:536:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:536:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:538:16: ( . )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:538:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:8: ( RULE_DOT | RULE_COMMA | RULE_SHARP | RULE_COLON | RULE_SEMI_COLON | RULE_BRACE_LEFT | RULE_BRACE_RIGHT | RULE_DOLLAR | RULE_AMP | RULE_CHARSET_ID | RULE_INCLUDE_ID | RULE_WORD | RULE_VARIABLE | RULE_SELECTOR | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=21;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:10: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 2 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:19: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 3 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:30: RULE_SHARP
                {
                mRULE_SHARP(); 

                }
                break;
            case 4 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:41: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 5 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:52: RULE_SEMI_COLON
                {
                mRULE_SEMI_COLON(); 

                }
                break;
            case 6 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:68: RULE_BRACE_LEFT
                {
                mRULE_BRACE_LEFT(); 

                }
                break;
            case 7 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:84: RULE_BRACE_RIGHT
                {
                mRULE_BRACE_RIGHT(); 

                }
                break;
            case 8 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:101: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 9 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:113: RULE_AMP
                {
                mRULE_AMP(); 

                }
                break;
            case 10 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:122: RULE_CHARSET_ID
                {
                mRULE_CHARSET_ID(); 

                }
                break;
            case 11 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:138: RULE_INCLUDE_ID
                {
                mRULE_INCLUDE_ID(); 

                }
                break;
            case 12 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:154: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 13 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:164: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 14 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:178: RULE_SELECTOR
                {
                mRULE_SELECTOR(); 

                }
                break;
            case 15 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:192: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:201: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:209: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:221: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:237: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:253: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:261: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\25\1\uffff\1\30\4\uffff\1\35\1\37\1\24\2\43\1\24\1\43"+
        "\1\uffff\3\24\17\uffff\1\43\1\uffff\1\43\1\uffff\1\43\4\uffff\1"+
        "\43\1\uffff";
    static final String DFA15_eofS =
        "\55\uffff";
    static final String DFA15_minS =
        "\1\0\1\45\1\uffff\1\45\4\uffff\1\45\1\72\1\143\2\43\1\101\1\43\1"+
        "\uffff\2\0\1\52\17\uffff\1\43\1\uffff\1\43\1\uffff\1\43\4\uffff"+
        "\1\40\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\1\uffff\1\172\4\uffff\1\172\1\72\1\151\4\172\1\uffff"+
        "\2\uffff\1\57\17\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff"+
        "\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\7\uffff\1\20\3\uffff\1\24\1"+
        "\25\1\1\1\16\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\15\1\11\1\12\1\13\1"+
        "\uffff\1\14\1\uffff\1\20\1\uffff\1\21\1\22\1\23\1\24\1\uffff\1\17";
    static final String DFA15_specialS =
        "\1\0\17\uffff\1\2\1\1\33\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\1\3\1\10\1\16\1\11"+
            "\1\21\4\24\1\2\1\16\1\1\1\22\12\16\1\4\1\5\4\24\1\12\10\14\1"+
            "\13\21\14\3\24\1\15\1\17\1\24\32\14\1\6\1\24\1\7\uff82\24",
            "\1\26\7\uffff\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "\1\26\7\uffff\1\26\2\uffff\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\36\7\uffff\1\36\2\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\26",
            "\1\40\5\uffff\1\41",
            "\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12\44\7\uffff"+
            "\15\44\1\42\14\44\4\uffff\1\45\1\uffff\32\44",
            "\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12\44\7\uffff"+
            "\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12\46\7\uffff"+
            "\32\46\6\uffff\32\46",
            "",
            "\0\47",
            "\0\47",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12\44\7\uffff"+
            "\23\44\1\53\6\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12\44\7\uffff"+
            "\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12\46\7\uffff"+
            "\32\46\6\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\54\2\uffff\1\26\1\uffff\1\46\7\uffff\1\46\1\26\1\uffff\12"+
            "\44\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_DOT | RULE_COMMA | RULE_SHARP | RULE_COLON | RULE_SEMI_COLON | RULE_BRACE_LEFT | RULE_BRACE_RIGHT | RULE_DOLLAR | RULE_AMP | RULE_CHARSET_ID | RULE_INCLUDE_ID | RULE_WORD | RULE_VARIABLE | RULE_SELECTOR | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='.') ) {s = 1;}

                        else if ( (LA15_0==',') ) {s = 2;}

                        else if ( (LA15_0=='#') ) {s = 3;}

                        else if ( (LA15_0==':') ) {s = 4;}

                        else if ( (LA15_0==';') ) {s = 5;}

                        else if ( (LA15_0=='{') ) {s = 6;}

                        else if ( (LA15_0=='}') ) {s = 7;}

                        else if ( (LA15_0=='$') ) {s = 8;}

                        else if ( (LA15_0=='&') ) {s = 9;}

                        else if ( (LA15_0=='@') ) {s = 10;}

                        else if ( (LA15_0=='I') ) {s = 11;}

                        else if ( ((LA15_0>='A' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {s = 12;}

                        else if ( (LA15_0=='^') ) {s = 13;}

                        else if ( (LA15_0=='%'||LA15_0=='-'||(LA15_0>='0' && LA15_0<='9')) ) {s = 14;}

                        else if ( (LA15_0=='_') ) {s = 15;}

                        else if ( (LA15_0=='\"') ) {s = 16;}

                        else if ( (LA15_0=='\'') ) {s = 17;}

                        else if ( (LA15_0=='/') ) {s = 18;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 19;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='<' && LA15_0<='?')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_17 = input.LA(1);

                        s = -1;
                        if ( ((LA15_17>='\u0000' && LA15_17<='\uFFFF')) ) {s = 39;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_16 = input.LA(1);

                        s = -1;
                        if ( ((LA15_16>='\u0000' && LA15_16<='\uFFFF')) ) {s = 39;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}