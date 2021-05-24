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
	 * Visit a parse tree produced by {@link ErgasiaParser#commentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStatement(ErgasiaParser.CommentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ErgasiaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#executableUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableUnit(ErgasiaParser.ExecutableUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(ErgasiaParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#functionSubprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSubprogram(ErgasiaParser.FunctionSubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subroutineSubprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineSubprogram(ErgasiaParser.SubroutineSubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#blockdataSubprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockdataSubprogram(ErgasiaParser.BlockdataSubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#otherSpecificationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherSpecificationStatement(ErgasiaParser.OtherSpecificationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#executableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableStatement(ErgasiaParser.ExecutableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStatement(ErgasiaParser.ProgramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#entryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryStatement(ErgasiaParser.EntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(ErgasiaParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#blockdataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockdataStatement(ErgasiaParser.BlockdataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subroutineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineStatement(ErgasiaParser.SubroutineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(ErgasiaParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ErgasiaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subprogramBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramBody(ErgasiaParser.SubprogramBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#wholeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWholeStatement(ErgasiaParser.WholeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#endStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStatement(ErgasiaParser.EndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dimensionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionStatement(ErgasiaParser.DimensionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arrayDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator(ErgasiaParser.ArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arrayDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarators(ErgasiaParser.ArrayDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arrayDeclaratorExtents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaratorExtents(ErgasiaParser.ArrayDeclaratorExtentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arrayDeclaratorExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaratorExtent(ErgasiaParser.ArrayDeclaratorExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#equivalenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalenceStatement(ErgasiaParser.EquivalenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#equivEntityGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivEntityGroup(ErgasiaParser.EquivEntityGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#equivEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivEntity(ErgasiaParser.EquivEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#commonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonStatement(ErgasiaParser.CommonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#commonName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonName(ErgasiaParser.CommonNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#commonItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonItem(ErgasiaParser.CommonItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#commonItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonItems(ErgasiaParser.CommonItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#commonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonBlock(ErgasiaParser.CommonBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatement(ErgasiaParser.TypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typeStatementNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementNameList(ErgasiaParser.TypeStatementNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typeStatementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementName(ErgasiaParser.TypeStatementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typeStatementNameCharList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementNameCharList(ErgasiaParser.TypeStatementNameCharListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typeStatementNameChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementNameChar(ErgasiaParser.TypeStatementNameCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typeStatementLenSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementLenSpec(ErgasiaParser.TypeStatementLenSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typename_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename_(ErgasiaParser.Typename_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(ErgasiaParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#typenameLen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypenameLen(ErgasiaParser.TypenameLenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#pointerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerStatement(ErgasiaParser.PointerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#pointerDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDecl(ErgasiaParser.PointerDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitStatement(ErgasiaParser.ImplicitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitSpec(ErgasiaParser.ImplicitSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitSpecs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitSpecs(ErgasiaParser.ImplicitSpecsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitNone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitNone(ErgasiaParser.ImplicitNoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitLetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitLetter(ErgasiaParser.ImplicitLetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitRange(ErgasiaParser.ImplicitRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#implicitLetters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitLetters(ErgasiaParser.ImplicitLettersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lenSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenSpecification(ErgasiaParser.LenSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#characterWithLen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterWithLen(ErgasiaParser.CharacterWithLenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#cwlLen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCwlLen(ErgasiaParser.CwlLenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#parameterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterStatement(ErgasiaParser.ParameterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(ErgasiaParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#paramassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamassign(ErgasiaParser.ParamassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#externalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalStatement(ErgasiaParser.ExternalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#intrinsicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrinsicStatement(ErgasiaParser.IntrinsicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#saveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveStatement(ErgasiaParser.SaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#saveEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveEntity(ErgasiaParser.SaveEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatement(ErgasiaParser.DataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataStatementItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatementItem(ErgasiaParser.DataStatementItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataStatementMultiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatementMultiple(ErgasiaParser.DataStatementMultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataStatementEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatementEntity(ErgasiaParser.DataStatementEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dse1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDse1(ErgasiaParser.Dse1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dse2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDse2(ErgasiaParser.Dse2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataImpliedDo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataImpliedDo(ErgasiaParser.DataImpliedDoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataImpliedDoRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataImpliedDoRange(ErgasiaParser.DataImpliedDoRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataImpliedDoList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataImpliedDoList(ErgasiaParser.DataImpliedDoListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#dataImpliedDoListWhat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataImpliedDoListWhat(ErgasiaParser.DataImpliedDoListWhatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(ErgasiaParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#unconditionalGoto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconditionalGoto(ErgasiaParser.UnconditionalGotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#computedGoto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedGoto(ErgasiaParser.ComputedGotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lblRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblRef(ErgasiaParser.LblRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#labelList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelList(ErgasiaParser.LabelListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#assignedGoto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignedGoto(ErgasiaParser.AssignedGotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ErgasiaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arithmeticIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticIfStatement(ErgasiaParser.ArithmeticIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#logicalIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalIfStatement(ErgasiaParser.LogicalIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#blockIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIfStatement(ErgasiaParser.BlockIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#firstIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstIfBlock(ErgasiaParser.FirstIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(ErgasiaParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(ErgasiaParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#endIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndIfStatement(ErgasiaParser.EndIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ErgasiaParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#doVarArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoVarArgs(ErgasiaParser.DoVarArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#doWithLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWithLabel(ErgasiaParser.DoWithLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#doBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoBody(ErgasiaParser.DoBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#doWithEndDo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWithEndDo(ErgasiaParser.DoWithEndDoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#enddoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnddoStatement(ErgasiaParser.EnddoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ErgasiaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#stopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatement(ErgasiaParser.StopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#pauseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPauseStatement(ErgasiaParser.PauseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(ErgasiaParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(ErgasiaParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ErgasiaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(ErgasiaParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlInfoList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlInfoList(ErgasiaParser.ControlInfoListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlErrSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlErrSpec(ErgasiaParser.ControlErrSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlInfoListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlInfoListItem(ErgasiaParser.ControlInfoListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#ioList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoList(ErgasiaParser.IoListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#ioListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoListItem(ErgasiaParser.IoListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#ioImpliedDoList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoImpliedDoList(ErgasiaParser.IoImpliedDoListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#openStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStatement(ErgasiaParser.OpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#openControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenControl(ErgasiaParser.OpenControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlFmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFmt(ErgasiaParser.ControlFmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlUnit(ErgasiaParser.ControlUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlRec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlRec(ErgasiaParser.ControlRecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlEnd(ErgasiaParser.ControlEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlErr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlErr(ErgasiaParser.ControlErrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlIostat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlIostat(ErgasiaParser.ControlIostatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFile(ErgasiaParser.ControlFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatus(ErgasiaParser.ControlStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlAccess(ErgasiaParser.ControlAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlPosition(ErgasiaParser.ControlPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlForm(ErgasiaParser.ControlFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlRecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlRecl(ErgasiaParser.ControlReclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlBlank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlBlank(ErgasiaParser.ControlBlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlExist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlExist(ErgasiaParser.ControlExistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlOpened}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlOpened(ErgasiaParser.ControlOpenedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlNumber(ErgasiaParser.ControlNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlNamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlNamed(ErgasiaParser.ControlNamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlName(ErgasiaParser.ControlNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlSequential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlSequential(ErgasiaParser.ControlSequentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlDirect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlDirect(ErgasiaParser.ControlDirectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlFormatted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFormatted(ErgasiaParser.ControlFormattedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlUnformatted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlUnformatted(ErgasiaParser.ControlUnformattedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#controlNextrec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlNextrec(ErgasiaParser.ControlNextrecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#closeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStatement(ErgasiaParser.CloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#closeControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseControl(ErgasiaParser.CloseControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#inquireStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInquireStatement(ErgasiaParser.InquireStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#inquireControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInquireControl(ErgasiaParser.InquireControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#backspaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackspaceStatement(ErgasiaParser.BackspaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#endfileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndfileStatement(ErgasiaParser.EndfileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#rewindStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewindStatement(ErgasiaParser.RewindStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#berFinish}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBerFinish(ErgasiaParser.BerFinishContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#berFinishItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBerFinishItem(ErgasiaParser.BerFinishItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#unitIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitIdentifier(ErgasiaParser.UnitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#formatIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatIdentifier(ErgasiaParser.FormatIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#formatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatStatement(ErgasiaParser.FormatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#fmtSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmtSpec(ErgasiaParser.FmtSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#formatsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatsep(ErgasiaParser.FormatsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#formatedit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatedit(ErgasiaParser.FormateditContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#editElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEditElement(ErgasiaParser.EditElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#statementFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFunctionStatement(ErgasiaParser.StatementFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#sfArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSfArgs(ErgasiaParser.SfArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(ErgasiaParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subroutineCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineCall(ErgasiaParser.SubroutineCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#callArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgumentList(ErgasiaParser.CallArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgument(ErgasiaParser.CallArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ErgasiaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ErgasiaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#ncExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcExpr(ErgasiaParser.NcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr0(ErgasiaParser.Lexpr0Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr1(ErgasiaParser.Lexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr2(ErgasiaParser.Lexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr3(ErgasiaParser.Lexpr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#lexpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr4(ErgasiaParser.Lexpr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#aexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr0(ErgasiaParser.Aexpr0Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#aexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr1(ErgasiaParser.Aexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#aexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr2(ErgasiaParser.Aexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#aexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr3(ErgasiaParser.Aexpr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#aexpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr4(ErgasiaParser.Aexpr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexpr(ErgasiaParser.IexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iexprCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexprCode(ErgasiaParser.IexprCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexpr1(ErgasiaParser.Iexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexpr2(ErgasiaParser.Iexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexpr3(ErgasiaParser.Iexpr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#iexpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexpr4(ErgasiaParser.Iexpr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#constantExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(ErgasiaParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(ErgasiaParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#integerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(ErgasiaParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#intRealDpExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntRealDpExpr(ErgasiaParser.IntRealDpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arithmeticConstExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticConstExpr(ErgasiaParser.ArithmeticConstExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#intConstantExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConstantExpr(ErgasiaParser.IntConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#characterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpression(ErgasiaParser.CharacterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#concatOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOp(ErgasiaParser.ConcatOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(ErgasiaParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#logicalConstExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConstExpr(ErgasiaParser.LogicalConstExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arrayElementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementName(ErgasiaParser.ArrayElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(ErgasiaParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(ErgasiaParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#varRefCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRefCode(ErgasiaParser.VarRefCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#substringApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringApp(ErgasiaParser.SubstringAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(ErgasiaParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#arrayName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayName(ErgasiaParser.ArrayNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#subroutineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineName(ErgasiaParser.SubroutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(ErgasiaParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ErgasiaParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#unsignedArithmeticConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedArithmeticConstant(ErgasiaParser.UnsignedArithmeticConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#complexConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexConstant(ErgasiaParser.ComplexConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#logicalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConstant(ErgasiaParser.LogicalConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ErgasiaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErgasiaParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(ErgasiaParser.ToContext ctx);
}