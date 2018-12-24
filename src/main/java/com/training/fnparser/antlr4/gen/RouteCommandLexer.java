// Generated from /media/okolka/sdb/pet/java/training/fnparser/src/main/antlr4/RouteCommand.g4 by ANTLR 4.7

package com.training.fnparser.antlr4.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RouteCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IP=6, OCTET_IP=7, MASK=8, GW=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "IP", "OCTET_IP", "DOT", "DIGIT", 
		"MASK", "GW", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'route'", "'add'", "'del'", "'-net'", "'-host'", null, null, "'netmask'", 
		"'gw'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "IP", "OCTET_IP", "MASK", "GW", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RouteCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RouteCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\\\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6\rW\n\r\r\r"+
		"\16\rX\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\n\27"+
		"\13\31\f\3\2\4\3\2\62;\4\2\13\13\"\"\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5!\3\2\2\2\7%\3\2\2\2\t)\3\2\2"+
		"\2\13.\3\2\2\2\r\64\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3"+
		"\2\2\2\27R\3\2\2\2\31V\3\2\2\2\33\34\7t\2\2\34\35\7q\2\2\35\36\7w\2\2"+
		"\36\37\7v\2\2\37 \7g\2\2 \4\3\2\2\2!\"\7c\2\2\"#\7f\2\2#$\7f\2\2$\6\3"+
		"\2\2\2%&\7f\2\2&\'\7g\2\2\'(\7n\2\2(\b\3\2\2\2)*\7/\2\2*+\7p\2\2+,\7g"+
		"\2\2,-\7v\2\2-\n\3\2\2\2./\7/\2\2/\60\7j\2\2\60\61\7q\2\2\61\62\7u\2\2"+
		"\62\63\7v\2\2\63\f\3\2\2\2\64\65\5\17\b\2\65\66\5\21\t\2\66\67\5\17\b"+
		"\2\678\5\21\t\289\5\17\b\29:\5\21\t\2:;\5\17\b\2;\16\3\2\2\2<=\5\23\n"+
		"\2=>\5\23\n\2>?\5\23\n\2?E\3\2\2\2@A\5\23\n\2AB\5\23\n\2BE\3\2\2\2CE\5"+
		"\23\n\2D<\3\2\2\2D@\3\2\2\2DC\3\2\2\2E\20\3\2\2\2FG\7\60\2\2G\22\3\2\2"+
		"\2HI\t\2\2\2I\24\3\2\2\2JK\7p\2\2KL\7g\2\2LM\7v\2\2MN\7o\2\2NO\7c\2\2"+
		"OP\7u\2\2PQ\7m\2\2Q\26\3\2\2\2RS\7i\2\2ST\7y\2\2T\30\3\2\2\2UW\t\3\2\2"+
		"VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\r\2\2[\32\3\2\2"+
		"\2\5\2DX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}