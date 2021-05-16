// Generated from C:/Users/Konstantinos/IdeaProjects/Antlr4GuideSetup/src\Ergasia.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErgasiaParser}.
 */
public interface ErgasiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ErgasiaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ErgasiaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ErgasiaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ErgasiaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ErgasiaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ErgasiaParser.ExprContext ctx);
}