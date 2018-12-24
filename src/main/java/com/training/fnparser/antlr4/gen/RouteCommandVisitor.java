// Generated from /media/okolka/sdb/pet/java/training/fnparser/src/main/antlr4/RouteCommand.g4 by ANTLR 4.7

package com.training.fnparser.antlr4.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RouteCommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RouteCommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RouteCommandParser#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute(RouteCommandParser.RouteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addCmd}
	 * labeled alternative in {@link RouteCommandParser#add_or_del}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCmd(RouteCommandParser.AddCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delCmd}
	 * labeled alternative in {@link RouteCommandParser#add_or_del}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelCmd(RouteCommandParser.DelCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code netAddress}
	 * labeled alternative in {@link RouteCommandParser#net_or_host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetAddress(RouteCommandParser.NetAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hostAddress}
	 * labeled alternative in {@link RouteCommandParser#net_or_host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostAddress(RouteCommandParser.HostAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ipAddress}
	 * labeled alternative in {@link RouteCommandParser#ip_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(RouteCommandParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code netmaskAddress}
	 * labeled alternative in {@link RouteCommandParser#netmask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetmaskAddress(RouteCommandParser.NetmaskAddressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gwAddress}
	 * labeled alternative in {@link RouteCommandParser#gateway_ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGwAddress(RouteCommandParser.GwAddressContext ctx);
}