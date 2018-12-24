// Generated from /media/okolka/sdb/pet/java/training/fnparser/src/main/antlr4/RouteCommand.g4 by ANTLR 4.7

package com.training.fnparser.antlr4.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RouteCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IP=6, OCTET_IP=7, MASK=8, GW=9, 
		WS=10;
	public static final int
		RULE_route = 0, RULE_add_or_del = 1, RULE_net_or_host = 2, RULE_ip_address = 3, 
		RULE_netmask = 4, RULE_gateway_ip = 5;
	public static final String[] ruleNames = {
		"route", "add_or_del", "net_or_host", "ip_address", "netmask", "gateway_ip"
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

	@Override
	public String getGrammarFileName() { return "RouteCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RouteCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RouteContext extends ParserRuleContext {
		public Add_or_delContext add_or_del() {
			return getRuleContext(Add_or_delContext.class,0);
		}
		public Net_or_hostContext net_or_host() {
			return getRuleContext(Net_or_hostContext.class,0);
		}
		public Ip_addressContext ip_address() {
			return getRuleContext(Ip_addressContext.class,0);
		}
		public Gateway_ipContext gateway_ip() {
			return getRuleContext(Gateway_ipContext.class,0);
		}
		public NetmaskContext netmask() {
			return getRuleContext(NetmaskContext.class,0);
		}
		public RouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitRoute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitRoute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteContext route() throws RecognitionException {
		RouteContext _localctx = new RouteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_route);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			add_or_del();
			setState(14);
			net_or_host();
			setState(15);
			ip_address();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MASK) {
				{
				setState(16);
				netmask();
				}
			}

			setState(19);
			gateway_ip();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_or_delContext extends ParserRuleContext {
		public Add_or_delContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_or_del; }
	 
		public Add_or_delContext() { }
		public void copyFrom(Add_or_delContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DelCmdContext extends Add_or_delContext {
		public DelCmdContext(Add_or_delContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterDelCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitDelCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitDelCmd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddCmdContext extends Add_or_delContext {
		public AddCmdContext(Add_or_delContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterAddCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitAddCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitAddCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_or_delContext add_or_del() throws RecognitionException {
		Add_or_delContext _localctx = new Add_or_delContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_add_or_del);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new AddCmdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new DelCmdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Net_or_hostContext extends ParserRuleContext {
		public Net_or_hostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_net_or_host; }
	 
		public Net_or_hostContext() { }
		public void copyFrom(Net_or_hostContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NetAddressContext extends Net_or_hostContext {
		public NetAddressContext(Net_or_hostContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterNetAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitNetAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitNetAddress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HostAddressContext extends Net_or_hostContext {
		public HostAddressContext(Net_or_hostContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterHostAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitHostAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitHostAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Net_or_hostContext net_or_host() throws RecognitionException {
		Net_or_hostContext _localctx = new Net_or_hostContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_net_or_host);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new NetAddressContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new HostAddressContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_addressContext extends ParserRuleContext {
		public Ip_addressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_address; }
	 
		public Ip_addressContext() { }
		public void copyFrom(Ip_addressContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IpAddressContext extends Ip_addressContext {
		public TerminalNode IP() { return getToken(RouteCommandParser.IP, 0); }
		public IpAddressContext(Ip_addressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterIpAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitIpAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitIpAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_addressContext ip_address() throws RecognitionException {
		Ip_addressContext _localctx = new Ip_addressContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ip_address);
		try {
			_localctx = new IpAddressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NetmaskContext extends ParserRuleContext {
		public NetmaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_netmask; }
	 
		public NetmaskContext() { }
		public void copyFrom(NetmaskContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NetmaskAddressContext extends NetmaskContext {
		public TerminalNode MASK() { return getToken(RouteCommandParser.MASK, 0); }
		public TerminalNode IP() { return getToken(RouteCommandParser.IP, 0); }
		public NetmaskAddressContext(NetmaskContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterNetmaskAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitNetmaskAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitNetmaskAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetmaskContext netmask() throws RecognitionException {
		NetmaskContext _localctx = new NetmaskContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_netmask);
		try {
			_localctx = new NetmaskAddressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(MASK);
			setState(32);
			match(IP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gateway_ipContext extends ParserRuleContext {
		public Gateway_ipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gateway_ip; }
	 
		public Gateway_ipContext() { }
		public void copyFrom(Gateway_ipContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GwAddressContext extends Gateway_ipContext {
		public TerminalNode GW() { return getToken(RouteCommandParser.GW, 0); }
		public TerminalNode IP() { return getToken(RouteCommandParser.IP, 0); }
		public GwAddressContext(Gateway_ipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).enterGwAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RouteCommandListener ) ((RouteCommandListener)listener).exitGwAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RouteCommandVisitor ) return ((RouteCommandVisitor<? extends T>)visitor).visitGwAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gateway_ipContext gateway_ip() throws RecognitionException {
		Gateway_ipContext _localctx = new Gateway_ipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gateway_ip);
		try {
			_localctx = new GwAddressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(GW);
			setState(35);
			match(IP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\2"+
		"\3\2\3\3\3\3\5\3\32\n\3\3\4\3\4\5\4\36\n\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2$\2\16\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2"+
		"\2\b\37\3\2\2\2\n!\3\2\2\2\f$\3\2\2\2\16\17\7\3\2\2\17\20\5\4\3\2\20\21"+
		"\5\6\4\2\21\23\5\b\5\2\22\24\5\n\6\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25"+
		"\3\2\2\2\25\26\5\f\7\2\26\3\3\2\2\2\27\32\7\4\2\2\30\32\7\5\2\2\31\27"+
		"\3\2\2\2\31\30\3\2\2\2\32\5\3\2\2\2\33\36\7\6\2\2\34\36\7\7\2\2\35\33"+
		"\3\2\2\2\35\34\3\2\2\2\36\7\3\2\2\2\37 \7\b\2\2 \t\3\2\2\2!\"\7\n\2\2"+
		"\"#\7\b\2\2#\13\3\2\2\2$%\7\13\2\2%&\7\b\2\2&\r\3\2\2\2\5\23\31\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}