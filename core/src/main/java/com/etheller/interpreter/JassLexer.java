// Generated from Jass.g4 by ANTLR 4.4

	package com.etheller.interpreter;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JassLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, EQUALS=16, GLOBALS=17, 
		ENDGLOBALS=18, NATIVE=19, FUNCTION=20, TAKES=21, RETURNS=22, ENDFUNCTION=23, 
		NOTHING=24, CALL=25, SET=26, RETURN=27, ARRAY=28, TYPE=29, EXTENDS=30, 
		IF=31, THEN=32, ELSE=33, ENDIF=34, ELSEIF=35, CONSTANT=36, LOCAL=37, LOOP=38, 
		ENDLOOP=39, EXITWHEN=40, DEBUG=41, STRING_LITERAL=42, INTEGER=43, HEX_CONSTANT=44, 
		DOLLAR_HEX_CONSTANT=45, RAWCODE=46, REAL=47, NULL=48, TRUE=49, FALSE=50, 
		NOT=51, OR=52, AND=53, ID=54, WS=55, NEWLINE=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "EQUALS", "GLOBALS", "ENDGLOBALS", 
		"NATIVE", "FUNCTION", "TAKES", "RETURNS", "ENDFUNCTION", "NOTHING", "CALL", 
		"SET", "RETURN", "ARRAY", "TYPE", "EXTENDS", "IF", "THEN", "ELSE", "ENDIF", 
		"ELSEIF", "CONSTANT", "LOCAL", "LOOP", "ENDLOOP", "EXITWHEN", "DEBUG", 
		"ESCAPED_QUOTE", "STRING_LITERAL", "INTEGER", "HEX_CONSTANT", "DOLLAR_HEX_CONSTANT", 
		"RAWCODE", "REAL", "NULL", "TRUE", "FALSE", "NOT", "OR", "AND", "ID", 
		"WS", "NEWLINE"
	};


	public JassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jass.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u01dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\7,\u014d\n,\f,\16"+
		",\u0150\13,\3,\3,\3-\3-\3-\7-\u0157\n-\f-\16-\u015a\13-\5-\u015c\n-\3"+
		".\3.\3.\3.\7.\u0162\n.\f.\16.\u0165\13.\3/\3/\7/\u0169\n/\f/\16/\u016c"+
		"\13/\3\60\3\60\7\60\u0170\n\60\f\60\16\60\u0173\13\60\3\60\3\60\3\61\3"+
		"\61\3\61\7\61\u017a\n\61\f\61\16\61\u017d\13\61\5\61\u017f\n\61\3\61\3"+
		"\61\7\61\u0183\n\61\f\61\16\61\u0186\13\61\3\61\3\61\7\61\u018a\n\61\f"+
		"\61\16\61\u018d\13\61\5\61\u018f\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\78\u01ae\n8\f8\168\u01b1\138\3"+
		"9\69\u01b4\n9\r9\169\u01b5\39\39\3:\3:\3:\3:\7:\u01be\n:\f:\16:\u01c1"+
		"\13:\3:\3:\3:\3:\3:\3:\7:\u01c9\n:\f:\16:\u01cc\13:\3:\3:\3:\3:\3:\7:"+
		"\u01d3\n:\f:\16:\u01d6\13:\3:\3:\3:\3:\5:\u01dc\n:\7\u014e\u0171\u01bf"+
		"\u01ca\u01d4\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-[.]/_\60a\61c\62e\63"+
		"g\64i\65k\66m\67o8q9s:\3\2\13\4\2\f\f\17\17\3\2\62\62\3\2\63;\3\2\62;"+
		"\4\2\62;ch\4\2\62;CH\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\u01f0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7z\3\2\2\2\t|\3\2\2\2\13\177"+
		"\3\2\2\2\r\u0082\3\2\2\2\17\u0084\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3"+
		"\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2"+
		"\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%"+
		"\u00a1\3\2\2\2\'\u00ac\3\2\2\2)\u00b3\3\2\2\2+\u00bc\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00ca\3\2\2\2\61\u00d6\3\2\2\2\63\u00de\3\2\2\2\65\u00e3\3\2\2"+
		"\2\67\u00e7\3\2\2\29\u00ee\3\2\2\2;\u00f4\3\2\2\2=\u00f9\3\2\2\2?\u0101"+
		"\3\2\2\2A\u0104\3\2\2\2C\u0109\3\2\2\2E\u010e\3\2\2\2G\u0114\3\2\2\2I"+
		"\u011b\3\2\2\2K\u0124\3\2\2\2M\u012a\3\2\2\2O\u012f\3\2\2\2Q\u0137\3\2"+
		"\2\2S\u0140\3\2\2\2U\u0146\3\2\2\2W\u0149\3\2\2\2Y\u015b\3\2\2\2[\u015d"+
		"\3\2\2\2]\u0166\3\2\2\2_\u016d\3\2\2\2a\u018e\3\2\2\2c\u0190\3\2\2\2e"+
		"\u0195\3\2\2\2g\u019a\3\2\2\2i\u01a0\3\2\2\2k\u01a4\3\2\2\2m\u01a7\3\2"+
		"\2\2o\u01ab\3\2\2\2q\u01b3\3\2\2\2s\u01db\3\2\2\2uv\7\61\2\2v\4\3\2\2"+
		"\2wx\7#\2\2xy\7?\2\2y\6\3\2\2\2z{\7]\2\2{\b\3\2\2\2|}\7@\2\2}~\7?\2\2"+
		"~\n\3\2\2\2\177\u0080\7?\2\2\u0080\u0081\7?\2\2\u0081\f\3\2\2\2\u0082"+
		"\u0083\7>\2\2\u0083\16\3\2\2\2\u0084\u0085\7_\2\2\u0085\20\3\2\2\2\u0086"+
		"\u0087\7@\2\2\u0087\22\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7*\2\2\u008c\26\3\2\2\2\u008d\u008e\7+\2\2\u008e"+
		"\30\3\2\2\2\u008f\u0090\7,\2\2\u0090\32\3\2\2\2\u0091\u0092\7-\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0094\7.\2\2\u0094\36\3\2\2\2\u0095\u0096\7/\2\2\u0096"+
		" \3\2\2\2\u0097\u0098\7?\2\2\u0098\"\3\2\2\2\u0099\u009a\7i\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7d\2\2\u009d\u009e\7c\2\2"+
		"\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7g\2"+
		"\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7x\2\2"+
		"\u00b1\u00b2\7g\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7w\2"+
		"\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9"+
		"\7k\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb*\3\2\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7m\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7p\2\2"+
		"\u00c8\u00c9\7u\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2"+
		"\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7q\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7p\2\2\u00dc\u00dd\7i\2\2\u00dd\62\3\2\2\2\u00de\u00df\7"+
		"e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7n\2\2\u00e2\64"+
		"\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"\66\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7w\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7p\2\2\u00ed8\3\2\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7c\2\2"+
		"\u00f2\u00f3\7{\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7{\2"+
		"\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7g\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7"+
		"g\2\2\u00fa\u00fb\7z\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe"+
		"\7p\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7u\2\2\u0100>\3\2\2\2\u0101\u0102"+
		"\7k\2\2\u0102\u0103\7h\2\2\u0103@\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7j\2\2\u0106\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108B\3\2\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u010d\7g\2\2\u010d"+
		"D\3\2\2\2\u010e\u010f\7g\2\2\u010f\u0110\7p\2\2\u0110\u0111\7f\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7h\2\2\u0113F\3\2\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117\u0118\7g\2\2\u0118\u0119\7k\2\2"+
		"\u0119\u011a\7h\2\2\u011aH\3\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7q\2"+
		"\2\u011d\u011e\7p\2\2\u011e\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120\u0121"+
		"\7c\2\2\u0121\u0122\7p\2\2\u0122\u0123\7v\2\2\u0123J\3\2\2\2\u0124\u0125"+
		"\7n\2\2\u0125\u0126\7q\2\2\u0126\u0127\7e\2\2\u0127\u0128\7c\2\2\u0128"+
		"\u0129\7n\2\2\u0129L\3\2\2\2\u012a\u012b\7n\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7q\2\2\u012d\u012e\7r\2\2\u012eN\3\2\2\2\u012f\u0130\7g\2\2\u0130"+
		"\u0131\7p\2\2\u0131\u0132\7f\2\2\u0132\u0133\7n\2\2\u0133\u0134\7q\2\2"+
		"\u0134\u0135\7q\2\2\u0135\u0136\7r\2\2\u0136P\3\2\2\2\u0137\u0138\7g\2"+
		"\2\u0138\u0139\7z\2\2\u0139\u013a\7k\2\2\u013a\u013b\7v\2\2\u013b\u013c"+
		"\7y\2\2\u013c\u013d\7j\2\2\u013d\u013e\7g\2\2\u013e\u013f\7p\2\2\u013f"+
		"R\3\2\2\2\u0140\u0141\7f\2\2\u0141\u0142\7g\2\2\u0142\u0143\7d\2\2\u0143"+
		"\u0144\7w\2\2\u0144\u0145\7i\2\2\u0145T\3\2\2\2\u0146\u0147\7^\2\2\u0147"+
		"\u0148\7$\2\2\u0148V\3\2\2\2\u0149\u014e\7$\2\2\u014a\u014d\5U+\2\u014b"+
		"\u014d\n\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\7$\2\2\u0152X\3\2\2\2\u0153\u015c\t\3\2\2\u0154"+
		"\u0158\t\4\2\2\u0155\u0157\t\5\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0154\3\2\2\2\u015cZ\3\2\2\2"+
		"\u015d\u015e\7\62\2\2\u015e\u015f\7z\2\2\u015f\u0163\3\2\2\2\u0160\u0162"+
		"\t\6\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\\\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\7&\2\2"+
		"\u0167\u0169\t\7\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b^\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0171\7)\2\2\u016e\u0170\13\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7)\2\2\u0175`\3\2\2\2\u0176\u017f\t\3\2\2\u0177"+
		"\u017b\t\4\2\2\u0178\u017a\t\5\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u0176\3\2\2\2\u017e\u0177\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0184\7\60\2\2\u0181\u0183\t\5\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018f\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0187\u018b\7\60\2\2\u0188\u018a\t\5\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u017e\3\2\2\2\u018e"+
		"\u0187\3\2\2\2\u018fb\3\2\2\2\u0190\u0191\7p\2\2\u0191\u0192\7w\2\2\u0192"+
		"\u0193\7n\2\2\u0193\u0194\7n\2\2\u0194d\3\2\2\2\u0195\u0196\7v\2\2\u0196"+
		"\u0197\7t\2\2\u0197\u0198\7w\2\2\u0198\u0199\7g\2\2\u0199f\3\2\2\2\u019a"+
		"\u019b\7h\2\2\u019b\u019c\7c\2\2\u019c\u019d\7n\2\2\u019d\u019e\7u\2\2"+
		"\u019e\u019f\7g\2\2\u019fh\3\2\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7q\2"+
		"\2\u01a2\u01a3\7v\2\2\u01a3j\3\2\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7"+
		"t\2\2\u01a6l\3\2\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa"+
		"\7f\2\2\u01aan\3\2\2\2\u01ab\u01af\t\b\2\2\u01ac\u01ae\t\t\2\2\u01ad\u01ac"+
		"\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"p\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\t\n\2\2\u01b3\u01b2\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b8\b9\2\2\u01b8r\3\2\2\2\u01b9\u01ba\7\61\2\2\u01ba"+
		"\u01bb\7\61\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01be\13\2\2\2\u01bd\u01bc\3"+
		"\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\17\2\2\u01c3\u01dc\7"+
		"\f\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\7\61\2\2\u01c6\u01ca\3\2\2\2\u01c7"+
		"\u01c9\13\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01cb\3"+
		"\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01dc\7\f\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d0\7\61\2\2\u01d0\u01d4\3"+
		"\2\2\2\u01d1\u01d3\13\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01dc\7\17\2\2\u01d8\u01d9\7\17\2\2\u01d9\u01dc\7\f\2\2\u01da"+
		"\u01dc\t\2\2\2\u01db\u01b9\3\2\2\2\u01db\u01c4\3\2\2\2\u01db\u01ce\3\2"+
		"\2\2\u01db\u01d8\3\2\2\2\u01db\u01da\3\2\2\2\u01dct\3\2\2\2\27\2\u014c"+
		"\u014e\u0158\u015b\u0161\u0163\u0168\u016a\u0171\u017b\u017e\u0184\u018b"+
		"\u018e\u01af\u01b5\u01bf\u01ca\u01d4\u01db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}