// Generated from C:/Users/Konstantinos/IdeaProjects/Antlr4GuideSetup/src\Ergasia.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ErgasiaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ErgasiaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ErgasiaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ErgasiaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ErgasiaParser.ExprContext ctx);
}