// Generated from C:/Users/Konstantinos/IdeaProjects/Antlr4GuideSetup/src\Ergasia.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErgasiaParser}.
 */
public interface ErgasiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ErgasiaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ErgasiaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ErgasiaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ErgasiaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(ErgasiaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(ErgasiaParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ErgasiaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ErgasiaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(ErgasiaParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(ErgasiaParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#undef_variable}.
	 * @param ctx the parse tree
	 */
	void enterUndef_variable(ErgasiaParser.Undef_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#undef_variable}.
	 * @param ctx the parse tree
	 */
	void exitUndef_variable(ErgasiaParser.Undef_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#listspec}.
	 * @param ctx the parse tree
	 */
	void enterListspec(ErgasiaParser.ListspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#listspec}.
	 * @param ctx the parse tree
	 */
	void exitListspec(ErgasiaParser.ListspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ErgasiaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ErgasiaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(ErgasiaParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(ErgasiaParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#cblock_list}.
	 * @param ctx the parse tree
	 */
	void enterCblock_list(ErgasiaParser.Cblock_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#cblock_list}.
	 * @param ctx the parse tree
	 */
	void exitCblock_list(ErgasiaParser.Cblock_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#cblock}.
	 * @param ctx the parse tree
	 */
	void enterCblock(ErgasiaParser.CblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#cblock}.
	 * @param ctx the parse tree
	 */
	void exitCblock(ErgasiaParser.CblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(ErgasiaParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(ErgasiaParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterVals(ErgasiaParser.ValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitVals(ErgasiaParser.ValsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(ErgasiaParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(ErgasiaParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(ErgasiaParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(ErgasiaParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ErgasiaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ErgasiaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(ErgasiaParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(ErgasiaParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(ErgasiaParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(ErgasiaParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ErgasiaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ErgasiaParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#simple_constant}.
	 * @param ctx the parse tree
	 */
	void enterSimple_constant(ErgasiaParser.Simple_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#simple_constant}.
	 * @param ctx the parse tree
	 */
	void exitSimple_constant(ErgasiaParser.Simple_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#complex_constant}.
	 * @param ctx the parse tree
	 */
	void enterComplex_constant(ErgasiaParser.Complex_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#complex_constant}.
	 * @param ctx the parse tree
	 */
	void exitComplex_constant(ErgasiaParser.Complex_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ErgasiaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ErgasiaParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(ErgasiaParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(ErgasiaParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ErgasiaParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ErgasiaParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ErgasiaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ErgasiaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(ErgasiaParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(ErgasiaParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ErgasiaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ErgasiaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ErgasiaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ErgasiaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(ErgasiaParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(ErgasiaParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ErgasiaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ErgasiaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#listexpression}.
	 * @param ctx the parse tree
	 */
	void enterListexpression(ErgasiaParser.ListexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#listexpression}.
	 * @param ctx the parse tree
	 */
	void exitListexpression(ErgasiaParser.ListexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(ErgasiaParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(ErgasiaParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLabels(ErgasiaParser.LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLabels(ErgasiaParser.LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ErgasiaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ErgasiaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subroutine_call}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_call(ErgasiaParser.Subroutine_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subroutine_call}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_call(ErgasiaParser.Subroutine_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement(ErgasiaParser.Io_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement(ErgasiaParser.Io_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#read_list}.
	 * @param ctx the parse tree
	 */
	void enterRead_list(ErgasiaParser.Read_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#read_list}.
	 * @param ctx the parse tree
	 */
	void exitRead_list(ErgasiaParser.Read_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#read_item}.
	 * @param ctx the parse tree
	 */
	void enterRead_item(ErgasiaParser.Read_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#read_item}.
	 * @param ctx the parse tree
	 */
	void exitRead_item(ErgasiaParser.Read_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iter_space}.
	 * @param ctx the parse tree
	 */
	void enterIter_space(ErgasiaParser.Iter_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iter_space}.
	 * @param ctx the parse tree
	 */
	void exitIter_space(ErgasiaParser.Iter_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(ErgasiaParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(ErgasiaParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#write_list}.
	 * @param ctx the parse tree
	 */
	void enterWrite_list(ErgasiaParser.Write_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#write_list}.
	 * @param ctx the parse tree
	 */
	void exitWrite_list(ErgasiaParser.Write_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#write_item}.
	 * @param ctx the parse tree
	 */
	void enterWrite_item(ErgasiaParser.Write_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#write_item}.
	 * @param ctx the parse tree
	 */
	void exitWrite_item(ErgasiaParser.Write_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(ErgasiaParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(ErgasiaParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(ErgasiaParser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(ErgasiaParser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(ErgasiaParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(ErgasiaParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(ErgasiaParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(ErgasiaParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void enterSubprograms(ErgasiaParser.SubprogramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void exitSubprograms(ErgasiaParser.SubprogramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram(ErgasiaParser.SubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram(ErgasiaParser.SubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ErgasiaParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ErgasiaParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#formal_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameters(ErgasiaParser.Formal_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#formal_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameters(ErgasiaParser.Formal_parametersContext ctx);
}