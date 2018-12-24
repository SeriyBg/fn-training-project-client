// Generated from /media/okolka/sdb/pet/java/training/fnparser/src/main/antlr4/RouteCommand.g4 by ANTLR 4.7

package com.training.fnparser.antlr4.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RouteCommandParser}.
 */
public interface RouteCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RouteCommandParser#route}.
	 * @param ctx the parse tree
	 */
	void enterRoute(RouteCommandParser.RouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RouteCommandParser#route}.
	 * @param ctx the parse tree
	 */
	void exitRoute(RouteCommandParser.RouteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addCmd}
	 * labeled alternative in {@link RouteCommandParser#add_or_del}.
	 * @param ctx the parse tree
	 */
	void enterAddCmd(RouteCommandParser.AddCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addCmd}
	 * labeled alternative in {@link RouteCommandParser#add_or_del}.
	 * @param ctx the parse tree
	 */
	void exitAddCmd(RouteCommandParser.AddCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code delCmd}
	 * labeled alternative in {@link RouteCommandParser#add_or_del}.
	 * @param ctx the parse tree
	 */
	void enterDelCmd(RouteCommandParser.DelCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code delCmd}
	 * labeled alternative in {@link RouteCommandParser#add_or_del}.
	 * @param ctx the parse tree
	 */
	void exitDelCmd(RouteCommandParser.DelCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code netAddress}
	 * labeled alternative in {@link RouteCommandParser#net_or_host}.
	 * @param ctx the parse tree
	 */
	void enterNetAddress(RouteCommandParser.NetAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code netAddress}
	 * labeled alternative in {@link RouteCommandParser#net_or_host}.
	 * @param ctx the parse tree
	 */
	void exitNetAddress(RouteCommandParser.NetAddressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hostAddress}
	 * labeled alternative in {@link RouteCommandParser#net_or_host}.
	 * @param ctx the parse tree
	 */
	void enterHostAddress(RouteCommandParser.HostAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hostAddress}
	 * labeled alternative in {@link RouteCommandParser#net_or_host}.
	 * @param ctx the parse tree
	 */
	void exitHostAddress(RouteCommandParser.HostAddressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ipAddress}
	 * labeled alternative in {@link RouteCommandParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(RouteCommandParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ipAddress}
	 * labeled alternative in {@link RouteCommandParser#ip_address}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(RouteCommandParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code netmaskAddress}
	 * labeled alternative in {@link RouteCommandParser#netmask}.
	 * @param ctx the parse tree
	 */
	void enterNetmaskAddress(RouteCommandParser.NetmaskAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code netmaskAddress}
	 * labeled alternative in {@link RouteCommandParser#netmask}.
	 * @param ctx the parse tree
	 */
	void exitNetmaskAddress(RouteCommandParser.NetmaskAddressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gwAddress}
	 * labeled alternative in {@link RouteCommandParser#gateway_ip}.
	 * @param ctx the parse tree
	 */
	void enterGwAddress(RouteCommandParser.GwAddressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gwAddress}
	 * labeled alternative in {@link RouteCommandParser#gateway_ip}.
	 * @param ctx the parse tree
	 */
	void exitGwAddress(RouteCommandParser.GwAddressContext ctx);
}