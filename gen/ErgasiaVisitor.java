// Generated from C:/Users/Konstantinos/IdeaProjects/ErgasiaSxediashGlosonProgrammatismou/src\Ergasia.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link ErgasiaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ErgasiaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ErgasiaParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(ErgasiaParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ErgasiaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(ErgasiaParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#undef_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_variable(ErgasiaParser.Undef_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#listspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListspec(ErgasiaParser.ListspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(ErgasiaParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(ErgasiaParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#cblock_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCblock_list(ErgasiaParser.Cblock_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#cblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCblock(ErgasiaParser.CblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(ErgasiaParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(ErgasiaParser.ValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(ErgasiaParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(ErgasiaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ErgasiaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(ErgasiaParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(ErgasiaParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ErgasiaParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_constant(ErgasiaParser.Simple_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#complex_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_constant(ErgasiaParser.Complex_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ErgasiaParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(ErgasiaParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ErgasiaParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ErgasiaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(ErgasiaParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ErgasiaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ErgasiaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(ErgasiaParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ErgasiaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#listexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListexpression(ErgasiaParser.ListexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(ErgasiaParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels(ErgasiaParser.LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ErgasiaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_call(ErgasiaParser.Subroutine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#io_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo_statement(ErgasiaParser.Io_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#read_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_list(ErgasiaParser.Read_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#read_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_item(ErgasiaParser.Read_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iter_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIter_space(ErgasiaParser.Iter_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(ErgasiaParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#write_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_list(ErgasiaParser.Write_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#write_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_item(ErgasiaParser.Write_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(ErgasiaParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(ErgasiaParser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(ErgasiaParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(ErgasiaParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subprograms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprograms(ErgasiaParser.SubprogramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram(ErgasiaParser.SubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(ErgasiaParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#formal_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameters(ErgasiaParser.Formal_parametersContext ctx);
}