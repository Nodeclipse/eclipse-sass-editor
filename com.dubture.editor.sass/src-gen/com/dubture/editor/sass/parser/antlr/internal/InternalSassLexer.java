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
    public static final int RULE_AMP=22;
    public static final int RULE_ID=24;
    public static final int RULE_BRACE_RIGHT=9;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_HEX_COLOR=12;
    public static final int RULE_HASH=20;
    public static final int RULE_COMMA=11;
    public static final int RULE_INCLUDE_ID=15;
    public static final int RULE_MIXIN_ID=16;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_PAREN_LEFT=17;
    public static final int RULE_BRACE_LEFT=8;
    public static final int RULE_DOLLAR=21;
    public static final int RULE_COLON=5;
    public static final int RULE_STRING=14;
    public static final int RULE_CHARSET_ID=13;
    public static final int RULE_DOT=19;
    public static final int RULE_VARIABLE=4;
    public static final int RULE_PAREN_RIGHT=18;
    public static final int RULE_SEMI_COLON=7;
    public static final int RULE_INT=23;
    public static final int RULE_WS=27;
    public static final int RULE_SELECTOR=10;
    public static final int RULE_WORD=6;

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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:574:10: ( '.' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:574:12: '.'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:576:12: ( ',' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:576:14: ','
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

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:578:11: ( '#' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:578:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:580:12: ( ':' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:580:14: ':'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:582:17: ( ';' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:582:19: ';'
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

    // $ANTLR start "RULE_PAREN_LEFT"
    public final void mRULE_PAREN_LEFT() throws RecognitionException {
        try {
            int _type = RULE_PAREN_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:584:17: ( '(' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:584:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PAREN_LEFT"

    // $ANTLR start "RULE_PAREN_RIGHT"
    public final void mRULE_PAREN_RIGHT() throws RecognitionException {
        try {
            int _type = RULE_PAREN_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:586:18: ( ')' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:586:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PAREN_RIGHT"

    // $ANTLR start "RULE_BRACE_LEFT"
    public final void mRULE_BRACE_LEFT() throws RecognitionException {
        try {
            int _type = RULE_BRACE_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:588:17: ( '{' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:588:19: '{'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:590:18: ( '}' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:590:20: '}'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:592:13: ( '$' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:592:15: '$'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:594:10: ( '&' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:594:12: '&'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:596:17: ( '@charset ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:596:19: '@charset '
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:598:17: ( '@include ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:598:19: '@include '
            {
            match("@include "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE_ID"

    // $ANTLR start "RULE_MIXIN_ID"
    public final void mRULE_MIXIN_ID() throws RecognitionException {
        try {
            int _type = RULE_MIXIN_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:15: ( '@mixin ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:600:17: '@mixin '
            {
            match("@mixin "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIXIN_ID"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:602:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+ )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:602:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:602:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:604:15: ( RULE_DOLLAR RULE_WORD )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:604:17: RULE_DOLLAR RULE_WORD
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

    // $ANTLR start "RULE_HEX_COLOR"
    public final void mRULE_HEX_COLOR() throws RecognitionException {
        try {
            int _type = RULE_HEX_COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:606:16: ( RULE_HASH RULE_WORD )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:606:18: RULE_HASH RULE_WORD
            {
            mRULE_HASH(); 
            mRULE_WORD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_COLOR"

    // $ANTLR start "RULE_SELECTOR"
    public final void mRULE_SELECTOR() throws RecognitionException {
        try {
            int _type = RULE_SELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:15: ( ( RULE_AMP RULE_COLON RULE_WORD | ( ( RULE_HASH | RULE_DOT )? RULE_WORD )+ ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:17: ( RULE_AMP RULE_COLON RULE_WORD | ( ( RULE_HASH | RULE_DOT )? RULE_WORD )+ )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:17: ( RULE_AMP RULE_COLON RULE_WORD | ( ( RULE_HASH | RULE_DOT )? RULE_WORD )+ )
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
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:18: RULE_AMP RULE_COLON RULE_WORD
                    {
                    mRULE_AMP(); 
                    mRULE_COLON(); 
                    mRULE_WORD(); 

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:48: ( ( RULE_HASH | RULE_DOT )? RULE_WORD )+
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:48: ( ( RULE_HASH | RULE_DOT )? RULE_WORD )+
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
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:49: ( RULE_HASH | RULE_DOT )? RULE_WORD
                    	    {
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:608:49: ( RULE_HASH | RULE_DOT )?
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:610:10: ( 'INT has been deactivated' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:610:12: 'INT has been deactivated'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:612:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:612:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:612:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:612:11: '^'
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

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:612:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:614:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:616:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:616:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:616:24: ( options {greedy=false; } : . )*
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
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:616:52: .
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:41: ( '\\r' )? '\\n'
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:618:41: '\\r'
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:620:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:620:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:620:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:16: ( . )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:622:18: .
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
        // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:8: ( RULE_DOT | RULE_COMMA | RULE_HASH | RULE_COLON | RULE_SEMI_COLON | RULE_PAREN_LEFT | RULE_PAREN_RIGHT | RULE_BRACE_LEFT | RULE_BRACE_RIGHT | RULE_DOLLAR | RULE_AMP | RULE_CHARSET_ID | RULE_INCLUDE_ID | RULE_MIXIN_ID | RULE_WORD | RULE_VARIABLE | RULE_HEX_COLOR | RULE_SELECTOR | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=25;
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
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:30: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 4 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:40: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 5 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:51: RULE_SEMI_COLON
                {
                mRULE_SEMI_COLON(); 

                }
                break;
            case 6 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:67: RULE_PAREN_LEFT
                {
                mRULE_PAREN_LEFT(); 

                }
                break;
            case 7 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:83: RULE_PAREN_RIGHT
                {
                mRULE_PAREN_RIGHT(); 

                }
                break;
            case 8 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:100: RULE_BRACE_LEFT
                {
                mRULE_BRACE_LEFT(); 

                }
                break;
            case 9 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:116: RULE_BRACE_RIGHT
                {
                mRULE_BRACE_RIGHT(); 

                }
                break;
            case 10 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:133: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 11 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:145: RULE_AMP
                {
                mRULE_AMP(); 

                }
                break;
            case 12 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:154: RULE_CHARSET_ID
                {
                mRULE_CHARSET_ID(); 

                }
                break;
            case 13 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:170: RULE_INCLUDE_ID
                {
                mRULE_INCLUDE_ID(); 

                }
                break;
            case 14 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:186: RULE_MIXIN_ID
                {
                mRULE_MIXIN_ID(); 

                }
                break;
            case 15 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:200: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 16 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:210: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 17 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:224: RULE_HEX_COLOR
                {
                mRULE_HEX_COLOR(); 

                }
                break;
            case 18 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:239: RULE_SELECTOR
                {
                mRULE_SELECTOR(); 

                }
                break;
            case 19 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:253: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:262: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:270: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:282: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:298: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:314: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:322: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\30\1\uffff\1\32\6\uffff\1\42\1\44\1\26\2\51\1\26\1\51"+
        "\1\uffff\3\26\6\uffff\1\61\14\uffff\1\51\1\uffff\2\51\6\uffff\1"+
        "\51\1\uffff";
    static final String DFA15_eofS =
        "\64\uffff";
    static final String DFA15_minS =
        "\1\0\1\45\1\uffff\1\45\6\uffff\1\45\1\72\1\143\2\43\1\101\1\43\1"+
        "\uffff\2\0\1\52\6\uffff\1\43\14\uffff\1\43\1\uffff\2\43\6\uffff"+
        "\1\40\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\1\uffff\1\172\6\uffff\1\172\1\72\1\155\4\172\1\uffff"+
        "\2\uffff\1\57\6\uffff\1\172\14\uffff\1\172\1\uffff\2\172\6\uffff"+
        "\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\7\uffff\1\24\3\uffff"+
        "\1\30\1\31\1\22\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1"+
        "\12\1\20\1\13\1\14\1\15\1\16\1\uffff\1\17\2\uffff\1\24\1\25\1\26"+
        "\1\27\1\30\1\21\1\uffff\1\23";
    static final String DFA15_specialS =
        "\1\0\21\uffff\1\1\1\2\40\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\1\3\1\12\1\20\1\13"+
            "\1\23\1\6\1\7\2\26\1\2\1\20\1\1\1\24\12\20\1\4\1\5\4\26\1\14"+
            "\10\16\1\15\21\16\3\26\1\17\1\21\1\26\32\16\1\10\1\26\1\11\uff82"+
            "\26",
            "\1\27\7\uffff\1\27\2\uffff\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\1\33\7\uffff\1\33\2\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\7\uffff\1\43\2\uffff\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\27",
            "\1\45\5\uffff\1\46\3\uffff\1\47",
            "\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12\52\7\uffff"+
            "\15\52\1\50\14\52\4\uffff\1\54\1\uffff\32\52",
            "\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12\52\7\uffff"+
            "\32\52\4\uffff\1\54\1\uffff\32\52",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12\53\7\uffff"+
            "\32\53\6\uffff\32\53",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\1\uffff\1\33\7\uffff\1\33\1\27\1\uffff\12\33\7\uffff"+
            "\32\33\6\uffff\32\33",
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
            "\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12\52\7\uffff"+
            "\23\52\1\62\6\52\4\uffff\1\54\1\uffff\32\52",
            "",
            "\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12\52\7\uffff"+
            "\32\52\4\uffff\1\54\1\uffff\32\52",
            "\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12\53\7\uffff"+
            "\32\53\6\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\2\uffff\1\27\1\uffff\1\53\7\uffff\1\53\1\27\1\uffff\12"+
            "\52\7\uffff\32\52\4\uffff\1\54\1\uffff\32\52",
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
            return "1:1: Tokens : ( RULE_DOT | RULE_COMMA | RULE_HASH | RULE_COLON | RULE_SEMI_COLON | RULE_PAREN_LEFT | RULE_PAREN_RIGHT | RULE_BRACE_LEFT | RULE_BRACE_RIGHT | RULE_DOLLAR | RULE_AMP | RULE_CHARSET_ID | RULE_INCLUDE_ID | RULE_MIXIN_ID | RULE_WORD | RULE_VARIABLE | RULE_HEX_COLOR | RULE_SELECTOR | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
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

                        else if ( (LA15_0=='(') ) {s = 6;}

                        else if ( (LA15_0==')') ) {s = 7;}

                        else if ( (LA15_0=='{') ) {s = 8;}

                        else if ( (LA15_0=='}') ) {s = 9;}

                        else if ( (LA15_0=='$') ) {s = 10;}

                        else if ( (LA15_0=='&') ) {s = 11;}

                        else if ( (LA15_0=='@') ) {s = 12;}

                        else if ( (LA15_0=='I') ) {s = 13;}

                        else if ( ((LA15_0>='A' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {s = 14;}

                        else if ( (LA15_0=='^') ) {s = 15;}

                        else if ( (LA15_0=='%'||LA15_0=='-'||(LA15_0>='0' && LA15_0<='9')) ) {s = 16;}

                        else if ( (LA15_0=='_') ) {s = 17;}

                        else if ( (LA15_0=='\"') ) {s = 18;}

                        else if ( (LA15_0=='\'') ) {s = 19;}

                        else if ( (LA15_0=='/') ) {s = 20;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 21;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='<' && LA15_0<='?')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_18 = input.LA(1);

                        s = -1;
                        if ( ((LA15_18>='\u0000' && LA15_18<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_19 = input.LA(1);

                        s = -1;
                        if ( ((LA15_19>='\u0000' && LA15_19<='\uFFFF')) ) {s = 45;}

                        else s = 22;

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