// Generated from C:/Users/Konstantinos/IdeaProjects/Antlr4GuideSetup/src\Ergasia.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErgasiaParser}.
 */
public interface ErgasiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(ErgasiaParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(ErgasiaParser.CommentStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ErgasiaParser#executableUnit}.
	 * @param ctx the parse tree
	 */
	void enterExecutableUnit(ErgasiaParser.ExecutableUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#executableUnit}.
	 * @param ctx the parse tree
	 */
	void exitExecutableUnit(ErgasiaParser.ExecutableUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(ErgasiaParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(ErgasiaParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#functionSubprogram}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSubprogram(ErgasiaParser.FunctionSubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#functionSubprogram}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSubprogram(ErgasiaParser.FunctionSubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subroutineSubprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineSubprogram(ErgasiaParser.SubroutineSubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subroutineSubprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineSubprogram(ErgasiaParser.SubroutineSubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#blockdataSubprogram}.
	 * @param ctx the parse tree
	 */
	void enterBlockdataSubprogram(ErgasiaParser.BlockdataSubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#blockdataSubprogram}.
	 * @param ctx the parse tree
	 */
	void exitBlockdataSubprogram(ErgasiaParser.BlockdataSubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#otherSpecificationStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherSpecificationStatement(ErgasiaParser.OtherSpecificationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#otherSpecificationStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherSpecificationStatement(ErgasiaParser.OtherSpecificationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#executableStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecutableStatement(ErgasiaParser.ExecutableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#executableStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecutableStatement(ErgasiaParser.ExecutableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void enterProgramStatement(ErgasiaParser.ProgramStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#programStatement}.
	 * @param ctx the parse tree
	 */
	void exitProgramStatement(ErgasiaParser.ProgramStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#entryStatement}.
	 * @param ctx the parse tree
	 */
	void enterEntryStatement(ErgasiaParser.EntryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#entryStatement}.
	 * @param ctx the parse tree
	 */
	void exitEntryStatement(ErgasiaParser.EntryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(ErgasiaParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(ErgasiaParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#blockdataStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockdataStatement(ErgasiaParser.BlockdataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#blockdataStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockdataStatement(ErgasiaParser.BlockdataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subroutineStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineStatement(ErgasiaParser.SubroutineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subroutineStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineStatement(ErgasiaParser.SubroutineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(ErgasiaParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(ErgasiaParser.NamelistContext ctx);
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
	 * Enter a parse tree produced by {@link ErgasiaParser#subprogramBody}.
	 * @param ctx the parse tree
	 */
	void enterSubprogramBody(ErgasiaParser.SubprogramBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subprogramBody}.
	 * @param ctx the parse tree
	 */
	void exitSubprogramBody(ErgasiaParser.SubprogramBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#wholeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWholeStatement(ErgasiaParser.WholeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#wholeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWholeStatement(ErgasiaParser.WholeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(ErgasiaParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(ErgasiaParser.EndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dimensionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDimensionStatement(ErgasiaParser.DimensionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dimensionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDimensionStatement(ErgasiaParser.DimensionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator(ErgasiaParser.ArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator(ErgasiaParser.ArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arrayDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarators(ErgasiaParser.ArrayDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arrayDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarators(ErgasiaParser.ArrayDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arrayDeclaratorExtents}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaratorExtents(ErgasiaParser.ArrayDeclaratorExtentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arrayDeclaratorExtents}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaratorExtents(ErgasiaParser.ArrayDeclaratorExtentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arrayDeclaratorExtent}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaratorExtent(ErgasiaParser.ArrayDeclaratorExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arrayDeclaratorExtent}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaratorExtent(ErgasiaParser.ArrayDeclaratorExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#equivalenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterEquivalenceStatement(ErgasiaParser.EquivalenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#equivalenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitEquivalenceStatement(ErgasiaParser.EquivalenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#equivEntityGroup}.
	 * @param ctx the parse tree
	 */
	void enterEquivEntityGroup(ErgasiaParser.EquivEntityGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#equivEntityGroup}.
	 * @param ctx the parse tree
	 */
	void exitEquivEntityGroup(ErgasiaParser.EquivEntityGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#equivEntity}.
	 * @param ctx the parse tree
	 */
	void enterEquivEntity(ErgasiaParser.EquivEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#equivEntity}.
	 * @param ctx the parse tree
	 */
	void exitEquivEntity(ErgasiaParser.EquivEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#commonStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommonStatement(ErgasiaParser.CommonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#commonStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommonStatement(ErgasiaParser.CommonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#commonName}.
	 * @param ctx the parse tree
	 */
	void enterCommonName(ErgasiaParser.CommonNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#commonName}.
	 * @param ctx the parse tree
	 */
	void exitCommonName(ErgasiaParser.CommonNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#commonItem}.
	 * @param ctx the parse tree
	 */
	void enterCommonItem(ErgasiaParser.CommonItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#commonItem}.
	 * @param ctx the parse tree
	 */
	void exitCommonItem(ErgasiaParser.CommonItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#commonItems}.
	 * @param ctx the parse tree
	 */
	void enterCommonItems(ErgasiaParser.CommonItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#commonItems}.
	 * @param ctx the parse tree
	 */
	void exitCommonItems(ErgasiaParser.CommonItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#commonBlock}.
	 * @param ctx the parse tree
	 */
	void enterCommonBlock(ErgasiaParser.CommonBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#commonBlock}.
	 * @param ctx the parse tree
	 */
	void exitCommonBlock(ErgasiaParser.CommonBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typeStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatement(ErgasiaParser.TypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typeStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatement(ErgasiaParser.TypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typeStatementNameList}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatementNameList(ErgasiaParser.TypeStatementNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typeStatementNameList}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatementNameList(ErgasiaParser.TypeStatementNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typeStatementName}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatementName(ErgasiaParser.TypeStatementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typeStatementName}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatementName(ErgasiaParser.TypeStatementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typeStatementNameCharList}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatementNameCharList(ErgasiaParser.TypeStatementNameCharListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typeStatementNameCharList}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatementNameCharList(ErgasiaParser.TypeStatementNameCharListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typeStatementNameChar}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatementNameChar(ErgasiaParser.TypeStatementNameCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typeStatementNameChar}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatementNameChar(ErgasiaParser.TypeStatementNameCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typeStatementLenSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeStatementLenSpec(ErgasiaParser.TypeStatementLenSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typeStatementLenSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeStatementLenSpec(ErgasiaParser.TypeStatementLenSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typename_}.
	 * @param ctx the parse tree
	 */
	void enterTypename_(ErgasiaParser.Typename_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typename_}.
	 * @param ctx the parse tree
	 */
	void exitTypename_(ErgasiaParser.Typename_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(ErgasiaParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(ErgasiaParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#typenameLen}.
	 * @param ctx the parse tree
	 */
	void enterTypenameLen(ErgasiaParser.TypenameLenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#typenameLen}.
	 * @param ctx the parse tree
	 */
	void exitTypenameLen(ErgasiaParser.TypenameLenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#pointerStatement}.
	 * @param ctx the parse tree
	 */
	void enterPointerStatement(ErgasiaParser.PointerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#pointerStatement}.
	 * @param ctx the parse tree
	 */
	void exitPointerStatement(ErgasiaParser.PointerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#pointerDecl}.
	 * @param ctx the parse tree
	 */
	void enterPointerDecl(ErgasiaParser.PointerDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#pointerDecl}.
	 * @param ctx the parse tree
	 */
	void exitPointerDecl(ErgasiaParser.PointerDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitStatement}.
	 * @param ctx the parse tree
	 */
	void enterImplicitStatement(ErgasiaParser.ImplicitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitStatement}.
	 * @param ctx the parse tree
	 */
	void exitImplicitStatement(ErgasiaParser.ImplicitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitSpec}.
	 * @param ctx the parse tree
	 */
	void enterImplicitSpec(ErgasiaParser.ImplicitSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitSpec}.
	 * @param ctx the parse tree
	 */
	void exitImplicitSpec(ErgasiaParser.ImplicitSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitSpecs}.
	 * @param ctx the parse tree
	 */
	void enterImplicitSpecs(ErgasiaParser.ImplicitSpecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitSpecs}.
	 * @param ctx the parse tree
	 */
	void exitImplicitSpecs(ErgasiaParser.ImplicitSpecsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitNone}.
	 * @param ctx the parse tree
	 */
	void enterImplicitNone(ErgasiaParser.ImplicitNoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitNone}.
	 * @param ctx the parse tree
	 */
	void exitImplicitNone(ErgasiaParser.ImplicitNoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitLetter}.
	 * @param ctx the parse tree
	 */
	void enterImplicitLetter(ErgasiaParser.ImplicitLetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitLetter}.
	 * @param ctx the parse tree
	 */
	void exitImplicitLetter(ErgasiaParser.ImplicitLetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitRange}.
	 * @param ctx the parse tree
	 */
	void enterImplicitRange(ErgasiaParser.ImplicitRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitRange}.
	 * @param ctx the parse tree
	 */
	void exitImplicitRange(ErgasiaParser.ImplicitRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#implicitLetters}.
	 * @param ctx the parse tree
	 */
	void enterImplicitLetters(ErgasiaParser.ImplicitLettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#implicitLetters}.
	 * @param ctx the parse tree
	 */
	void exitImplicitLetters(ErgasiaParser.ImplicitLettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lenSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLenSpecification(ErgasiaParser.LenSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lenSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLenSpecification(ErgasiaParser.LenSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#characterWithLen}.
	 * @param ctx the parse tree
	 */
	void enterCharacterWithLen(ErgasiaParser.CharacterWithLenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#characterWithLen}.
	 * @param ctx the parse tree
	 */
	void exitCharacterWithLen(ErgasiaParser.CharacterWithLenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#cwlLen}.
	 * @param ctx the parse tree
	 */
	void enterCwlLen(ErgasiaParser.CwlLenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#cwlLen}.
	 * @param ctx the parse tree
	 */
	void exitCwlLen(ErgasiaParser.CwlLenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#parameterStatement}.
	 * @param ctx the parse tree
	 */
	void enterParameterStatement(ErgasiaParser.ParameterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#parameterStatement}.
	 * @param ctx the parse tree
	 */
	void exitParameterStatement(ErgasiaParser.ParameterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(ErgasiaParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(ErgasiaParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#paramassign}.
	 * @param ctx the parse tree
	 */
	void enterParamassign(ErgasiaParser.ParamassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#paramassign}.
	 * @param ctx the parse tree
	 */
	void exitParamassign(ErgasiaParser.ParamassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#externalStatement}.
	 * @param ctx the parse tree
	 */
	void enterExternalStatement(ErgasiaParser.ExternalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#externalStatement}.
	 * @param ctx the parse tree
	 */
	void exitExternalStatement(ErgasiaParser.ExternalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#intrinsicStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntrinsicStatement(ErgasiaParser.IntrinsicStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#intrinsicStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntrinsicStatement(ErgasiaParser.IntrinsicStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#saveStatement}.
	 * @param ctx the parse tree
	 */
	void enterSaveStatement(ErgasiaParser.SaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#saveStatement}.
	 * @param ctx the parse tree
	 */
	void exitSaveStatement(ErgasiaParser.SaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#saveEntity}.
	 * @param ctx the parse tree
	 */
	void enterSaveEntity(ErgasiaParser.SaveEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#saveEntity}.
	 * @param ctx the parse tree
	 */
	void exitSaveEntity(ErgasiaParser.SaveEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataStatement(ErgasiaParser.DataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataStatement(ErgasiaParser.DataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataStatementItem}.
	 * @param ctx the parse tree
	 */
	void enterDataStatementItem(ErgasiaParser.DataStatementItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataStatementItem}.
	 * @param ctx the parse tree
	 */
	void exitDataStatementItem(ErgasiaParser.DataStatementItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataStatementMultiple}.
	 * @param ctx the parse tree
	 */
	void enterDataStatementMultiple(ErgasiaParser.DataStatementMultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataStatementMultiple}.
	 * @param ctx the parse tree
	 */
	void exitDataStatementMultiple(ErgasiaParser.DataStatementMultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataStatementEntity}.
	 * @param ctx the parse tree
	 */
	void enterDataStatementEntity(ErgasiaParser.DataStatementEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataStatementEntity}.
	 * @param ctx the parse tree
	 */
	void exitDataStatementEntity(ErgasiaParser.DataStatementEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dse1}.
	 * @param ctx the parse tree
	 */
	void enterDse1(ErgasiaParser.Dse1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dse1}.
	 * @param ctx the parse tree
	 */
	void exitDse1(ErgasiaParser.Dse1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dse2}.
	 * @param ctx the parse tree
	 */
	void enterDse2(ErgasiaParser.Dse2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dse2}.
	 * @param ctx the parse tree
	 */
	void exitDse2(ErgasiaParser.Dse2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataImpliedDo}.
	 * @param ctx the parse tree
	 */
	void enterDataImpliedDo(ErgasiaParser.DataImpliedDoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataImpliedDo}.
	 * @param ctx the parse tree
	 */
	void exitDataImpliedDo(ErgasiaParser.DataImpliedDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataImpliedDoRange}.
	 * @param ctx the parse tree
	 */
	void enterDataImpliedDoRange(ErgasiaParser.DataImpliedDoRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataImpliedDoRange}.
	 * @param ctx the parse tree
	 */
	void exitDataImpliedDoRange(ErgasiaParser.DataImpliedDoRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataImpliedDoList}.
	 * @param ctx the parse tree
	 */
	void enterDataImpliedDoList(ErgasiaParser.DataImpliedDoListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataImpliedDoList}.
	 * @param ctx the parse tree
	 */
	void exitDataImpliedDoList(ErgasiaParser.DataImpliedDoListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#dataImpliedDoListWhat}.
	 * @param ctx the parse tree
	 */
	void enterDataImpliedDoListWhat(ErgasiaParser.DataImpliedDoListWhatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#dataImpliedDoListWhat}.
	 * @param ctx the parse tree
	 */
	void exitDataImpliedDoListWhat(ErgasiaParser.DataImpliedDoListWhatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(ErgasiaParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(ErgasiaParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#unconditionalGoto}.
	 * @param ctx the parse tree
	 */
	void enterUnconditionalGoto(ErgasiaParser.UnconditionalGotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#unconditionalGoto}.
	 * @param ctx the parse tree
	 */
	void exitUnconditionalGoto(ErgasiaParser.UnconditionalGotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#computedGoto}.
	 * @param ctx the parse tree
	 */
	void enterComputedGoto(ErgasiaParser.ComputedGotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#computedGoto}.
	 * @param ctx the parse tree
	 */
	void exitComputedGoto(ErgasiaParser.ComputedGotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lblRef}.
	 * @param ctx the parse tree
	 */
	void enterLblRef(ErgasiaParser.LblRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lblRef}.
	 * @param ctx the parse tree
	 */
	void exitLblRef(ErgasiaParser.LblRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#labelList}.
	 * @param ctx the parse tree
	 */
	void enterLabelList(ErgasiaParser.LabelListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#labelList}.
	 * @param ctx the parse tree
	 */
	void exitLabelList(ErgasiaParser.LabelListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#assignedGoto}.
	 * @param ctx the parse tree
	 */
	void enterAssignedGoto(ErgasiaParser.AssignedGotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#assignedGoto}.
	 * @param ctx the parse tree
	 */
	void exitAssignedGoto(ErgasiaParser.AssignedGotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ErgasiaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ErgasiaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arithmeticIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticIfStatement(ErgasiaParser.ArithmeticIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arithmeticIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticIfStatement(ErgasiaParser.ArithmeticIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#logicalIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogicalIfStatement(ErgasiaParser.LogicalIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#logicalIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogicalIfStatement(ErgasiaParser.LogicalIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#blockIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockIfStatement(ErgasiaParser.BlockIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#blockIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockIfStatement(ErgasiaParser.BlockIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#firstIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterFirstIfBlock(ErgasiaParser.FirstIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#firstIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitFirstIfBlock(ErgasiaParser.FirstIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(ErgasiaParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(ErgasiaParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(ErgasiaParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(ErgasiaParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#endIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndIfStatement(ErgasiaParser.EndIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#endIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndIfStatement(ErgasiaParser.EndIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ErgasiaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ErgasiaParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#doVarArgs}.
	 * @param ctx the parse tree
	 */
	void enterDoVarArgs(ErgasiaParser.DoVarArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#doVarArgs}.
	 * @param ctx the parse tree
	 */
	void exitDoVarArgs(ErgasiaParser.DoVarArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#doWithLabel}.
	 * @param ctx the parse tree
	 */
	void enterDoWithLabel(ErgasiaParser.DoWithLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#doWithLabel}.
	 * @param ctx the parse tree
	 */
	void exitDoWithLabel(ErgasiaParser.DoWithLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#doBody}.
	 * @param ctx the parse tree
	 */
	void enterDoBody(ErgasiaParser.DoBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#doBody}.
	 * @param ctx the parse tree
	 */
	void exitDoBody(ErgasiaParser.DoBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#doWithEndDo}.
	 * @param ctx the parse tree
	 */
	void enterDoWithEndDo(ErgasiaParser.DoWithEndDoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#doWithEndDo}.
	 * @param ctx the parse tree
	 */
	void exitDoWithEndDo(ErgasiaParser.DoWithEndDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#enddoStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnddoStatement(ErgasiaParser.EnddoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#enddoStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnddoStatement(ErgasiaParser.EnddoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ErgasiaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ErgasiaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#stopStatement}.
	 * @param ctx the parse tree
	 */
	void enterStopStatement(ErgasiaParser.StopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#stopStatement}.
	 * @param ctx the parse tree
	 */
	void exitStopStatement(ErgasiaParser.StopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#pauseStatement}.
	 * @param ctx the parse tree
	 */
	void enterPauseStatement(ErgasiaParser.PauseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#pauseStatement}.
	 * @param ctx the parse tree
	 */
	void exitPauseStatement(ErgasiaParser.PauseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(ErgasiaParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(ErgasiaParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(ErgasiaParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(ErgasiaParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ErgasiaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ErgasiaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(ErgasiaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(ErgasiaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlInfoList}.
	 * @param ctx the parse tree
	 */
	void enterControlInfoList(ErgasiaParser.ControlInfoListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlInfoList}.
	 * @param ctx the parse tree
	 */
	void exitControlInfoList(ErgasiaParser.ControlInfoListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlErrSpec}.
	 * @param ctx the parse tree
	 */
	void enterControlErrSpec(ErgasiaParser.ControlErrSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlErrSpec}.
	 * @param ctx the parse tree
	 */
	void exitControlErrSpec(ErgasiaParser.ControlErrSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlInfoListItem}.
	 * @param ctx the parse tree
	 */
	void enterControlInfoListItem(ErgasiaParser.ControlInfoListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlInfoListItem}.
	 * @param ctx the parse tree
	 */
	void exitControlInfoListItem(ErgasiaParser.ControlInfoListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#ioList}.
	 * @param ctx the parse tree
	 */
	void enterIoList(ErgasiaParser.IoListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#ioList}.
	 * @param ctx the parse tree
	 */
	void exitIoList(ErgasiaParser.IoListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#ioListItem}.
	 * @param ctx the parse tree
	 */
	void enterIoListItem(ErgasiaParser.IoListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#ioListItem}.
	 * @param ctx the parse tree
	 */
	void exitIoListItem(ErgasiaParser.IoListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#ioImpliedDoList}.
	 * @param ctx the parse tree
	 */
	void enterIoImpliedDoList(ErgasiaParser.IoImpliedDoListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#ioImpliedDoList}.
	 * @param ctx the parse tree
	 */
	void exitIoImpliedDoList(ErgasiaParser.IoImpliedDoListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#openStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenStatement(ErgasiaParser.OpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#openStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenStatement(ErgasiaParser.OpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#openControl}.
	 * @param ctx the parse tree
	 */
	void enterOpenControl(ErgasiaParser.OpenControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#openControl}.
	 * @param ctx the parse tree
	 */
	void exitOpenControl(ErgasiaParser.OpenControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlFmt}.
	 * @param ctx the parse tree
	 */
	void enterControlFmt(ErgasiaParser.ControlFmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlFmt}.
	 * @param ctx the parse tree
	 */
	void exitControlFmt(ErgasiaParser.ControlFmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlUnit}.
	 * @param ctx the parse tree
	 */
	void enterControlUnit(ErgasiaParser.ControlUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlUnit}.
	 * @param ctx the parse tree
	 */
	void exitControlUnit(ErgasiaParser.ControlUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlRec}.
	 * @param ctx the parse tree
	 */
	void enterControlRec(ErgasiaParser.ControlRecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlRec}.
	 * @param ctx the parse tree
	 */
	void exitControlRec(ErgasiaParser.ControlRecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlEnd}.
	 * @param ctx the parse tree
	 */
	void enterControlEnd(ErgasiaParser.ControlEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlEnd}.
	 * @param ctx the parse tree
	 */
	void exitControlEnd(ErgasiaParser.ControlEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlErr}.
	 * @param ctx the parse tree
	 */
	void enterControlErr(ErgasiaParser.ControlErrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlErr}.
	 * @param ctx the parse tree
	 */
	void exitControlErr(ErgasiaParser.ControlErrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlIostat}.
	 * @param ctx the parse tree
	 */
	void enterControlIostat(ErgasiaParser.ControlIostatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlIostat}.
	 * @param ctx the parse tree
	 */
	void exitControlIostat(ErgasiaParser.ControlIostatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlFile}.
	 * @param ctx the parse tree
	 */
	void enterControlFile(ErgasiaParser.ControlFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlFile}.
	 * @param ctx the parse tree
	 */
	void exitControlFile(ErgasiaParser.ControlFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlStatus}.
	 * @param ctx the parse tree
	 */
	void enterControlStatus(ErgasiaParser.ControlStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlStatus}.
	 * @param ctx the parse tree
	 */
	void exitControlStatus(ErgasiaParser.ControlStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlAccess}.
	 * @param ctx the parse tree
	 */
	void enterControlAccess(ErgasiaParser.ControlAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlAccess}.
	 * @param ctx the parse tree
	 */
	void exitControlAccess(ErgasiaParser.ControlAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlPosition}.
	 * @param ctx the parse tree
	 */
	void enterControlPosition(ErgasiaParser.ControlPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlPosition}.
	 * @param ctx the parse tree
	 */
	void exitControlPosition(ErgasiaParser.ControlPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlForm}.
	 * @param ctx the parse tree
	 */
	void enterControlForm(ErgasiaParser.ControlFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlForm}.
	 * @param ctx the parse tree
	 */
	void exitControlForm(ErgasiaParser.ControlFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlRecl}.
	 * @param ctx the parse tree
	 */
	void enterControlRecl(ErgasiaParser.ControlReclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlRecl}.
	 * @param ctx the parse tree
	 */
	void exitControlRecl(ErgasiaParser.ControlReclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlBlank}.
	 * @param ctx the parse tree
	 */
	void enterControlBlank(ErgasiaParser.ControlBlankContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlBlank}.
	 * @param ctx the parse tree
	 */
	void exitControlBlank(ErgasiaParser.ControlBlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlExist}.
	 * @param ctx the parse tree
	 */
	void enterControlExist(ErgasiaParser.ControlExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlExist}.
	 * @param ctx the parse tree
	 */
	void exitControlExist(ErgasiaParser.ControlExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlOpened}.
	 * @param ctx the parse tree
	 */
	void enterControlOpened(ErgasiaParser.ControlOpenedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlOpened}.
	 * @param ctx the parse tree
	 */
	void exitControlOpened(ErgasiaParser.ControlOpenedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlNumber}.
	 * @param ctx the parse tree
	 */
	void enterControlNumber(ErgasiaParser.ControlNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlNumber}.
	 * @param ctx the parse tree
	 */
	void exitControlNumber(ErgasiaParser.ControlNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlNamed}.
	 * @param ctx the parse tree
	 */
	void enterControlNamed(ErgasiaParser.ControlNamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlNamed}.
	 * @param ctx the parse tree
	 */
	void exitControlNamed(ErgasiaParser.ControlNamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlName}.
	 * @param ctx the parse tree
	 */
	void enterControlName(ErgasiaParser.ControlNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlName}.
	 * @param ctx the parse tree
	 */
	void exitControlName(ErgasiaParser.ControlNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlSequential}.
	 * @param ctx the parse tree
	 */
	void enterControlSequential(ErgasiaParser.ControlSequentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlSequential}.
	 * @param ctx the parse tree
	 */
	void exitControlSequential(ErgasiaParser.ControlSequentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlDirect}.
	 * @param ctx the parse tree
	 */
	void enterControlDirect(ErgasiaParser.ControlDirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlDirect}.
	 * @param ctx the parse tree
	 */
	void exitControlDirect(ErgasiaParser.ControlDirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlFormatted}.
	 * @param ctx the parse tree
	 */
	void enterControlFormatted(ErgasiaParser.ControlFormattedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlFormatted}.
	 * @param ctx the parse tree
	 */
	void exitControlFormatted(ErgasiaParser.ControlFormattedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlUnformatted}.
	 * @param ctx the parse tree
	 */
	void enterControlUnformatted(ErgasiaParser.ControlUnformattedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlUnformatted}.
	 * @param ctx the parse tree
	 */
	void exitControlUnformatted(ErgasiaParser.ControlUnformattedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#controlNextrec}.
	 * @param ctx the parse tree
	 */
	void enterControlNextrec(ErgasiaParser.ControlNextrecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#controlNextrec}.
	 * @param ctx the parse tree
	 */
	void exitControlNextrec(ErgasiaParser.ControlNextrecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#closeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseStatement(ErgasiaParser.CloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#closeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseStatement(ErgasiaParser.CloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#closeControl}.
	 * @param ctx the parse tree
	 */
	void enterCloseControl(ErgasiaParser.CloseControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#closeControl}.
	 * @param ctx the parse tree
	 */
	void exitCloseControl(ErgasiaParser.CloseControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#inquireStatement}.
	 * @param ctx the parse tree
	 */
	void enterInquireStatement(ErgasiaParser.InquireStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#inquireStatement}.
	 * @param ctx the parse tree
	 */
	void exitInquireStatement(ErgasiaParser.InquireStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#inquireControl}.
	 * @param ctx the parse tree
	 */
	void enterInquireControl(ErgasiaParser.InquireControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#inquireControl}.
	 * @param ctx the parse tree
	 */
	void exitInquireControl(ErgasiaParser.InquireControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#backspaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterBackspaceStatement(ErgasiaParser.BackspaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#backspaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitBackspaceStatement(ErgasiaParser.BackspaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#endfileStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndfileStatement(ErgasiaParser.EndfileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#endfileStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndfileStatement(ErgasiaParser.EndfileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#rewindStatement}.
	 * @param ctx the parse tree
	 */
	void enterRewindStatement(ErgasiaParser.RewindStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#rewindStatement}.
	 * @param ctx the parse tree
	 */
	void exitRewindStatement(ErgasiaParser.RewindStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#berFinish}.
	 * @param ctx the parse tree
	 */
	void enterBerFinish(ErgasiaParser.BerFinishContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#berFinish}.
	 * @param ctx the parse tree
	 */
	void exitBerFinish(ErgasiaParser.BerFinishContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#berFinishItem}.
	 * @param ctx the parse tree
	 */
	void enterBerFinishItem(ErgasiaParser.BerFinishItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#berFinishItem}.
	 * @param ctx the parse tree
	 */
	void exitBerFinishItem(ErgasiaParser.BerFinishItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#unitIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnitIdentifier(ErgasiaParser.UnitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#unitIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnitIdentifier(ErgasiaParser.UnitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#formatIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFormatIdentifier(ErgasiaParser.FormatIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#formatIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFormatIdentifier(ErgasiaParser.FormatIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#formatStatement}.
	 * @param ctx the parse tree
	 */
	void enterFormatStatement(ErgasiaParser.FormatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#formatStatement}.
	 * @param ctx the parse tree
	 */
	void exitFormatStatement(ErgasiaParser.FormatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#fmtSpec}.
	 * @param ctx the parse tree
	 */
	void enterFmtSpec(ErgasiaParser.FmtSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#fmtSpec}.
	 * @param ctx the parse tree
	 */
	void exitFmtSpec(ErgasiaParser.FmtSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#formatsep}.
	 * @param ctx the parse tree
	 */
	void enterFormatsep(ErgasiaParser.FormatsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#formatsep}.
	 * @param ctx the parse tree
	 */
	void exitFormatsep(ErgasiaParser.FormatsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#formatedit}.
	 * @param ctx the parse tree
	 */
	void enterFormatedit(ErgasiaParser.FormateditContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#formatedit}.
	 * @param ctx the parse tree
	 */
	void exitFormatedit(ErgasiaParser.FormateditContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#editElement}.
	 * @param ctx the parse tree
	 */
	void enterEditElement(ErgasiaParser.EditElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#editElement}.
	 * @param ctx the parse tree
	 */
	void exitEditElement(ErgasiaParser.EditElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#statementFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFunctionStatement(ErgasiaParser.StatementFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#statementFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFunctionStatement(ErgasiaParser.StatementFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#sfArgs}.
	 * @param ctx the parse tree
	 */
	void enterSfArgs(ErgasiaParser.SfArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#sfArgs}.
	 * @param ctx the parse tree
	 */
	void exitSfArgs(ErgasiaParser.SfArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(ErgasiaParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(ErgasiaParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subroutineCall}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineCall(ErgasiaParser.SubroutineCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subroutineCall}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineCall(ErgasiaParser.SubroutineCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#callArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterCallArgumentList(ErgasiaParser.CallArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#callArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitCallArgumentList(ErgasiaParser.CallArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void enterCallArgument(ErgasiaParser.CallArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#callArgument}.
	 * @param ctx the parse tree
	 */
	void exitCallArgument(ErgasiaParser.CallArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ErgasiaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ErgasiaParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ErgasiaParser#ncExpr}.
	 * @param ctx the parse tree
	 */
	void enterNcExpr(ErgasiaParser.NcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#ncExpr}.
	 * @param ctx the parse tree
	 */
	void exitNcExpr(ErgasiaParser.NcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lexpr0}.
	 * @param ctx the parse tree
	 */
	void enterLexpr0(ErgasiaParser.Lexpr0Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lexpr0}.
	 * @param ctx the parse tree
	 */
	void exitLexpr0(ErgasiaParser.Lexpr0Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lexpr1}.
	 * @param ctx the parse tree
	 */
	void enterLexpr1(ErgasiaParser.Lexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lexpr1}.
	 * @param ctx the parse tree
	 */
	void exitLexpr1(ErgasiaParser.Lexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lexpr2}.
	 * @param ctx the parse tree
	 */
	void enterLexpr2(ErgasiaParser.Lexpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lexpr2}.
	 * @param ctx the parse tree
	 */
	void exitLexpr2(ErgasiaParser.Lexpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lexpr3}.
	 * @param ctx the parse tree
	 */
	void enterLexpr3(ErgasiaParser.Lexpr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lexpr3}.
	 * @param ctx the parse tree
	 */
	void exitLexpr3(ErgasiaParser.Lexpr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#lexpr4}.
	 * @param ctx the parse tree
	 */
	void enterLexpr4(ErgasiaParser.Lexpr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#lexpr4}.
	 * @param ctx the parse tree
	 */
	void exitLexpr4(ErgasiaParser.Lexpr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#aexpr0}.
	 * @param ctx the parse tree
	 */
	void enterAexpr0(ErgasiaParser.Aexpr0Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#aexpr0}.
	 * @param ctx the parse tree
	 */
	void exitAexpr0(ErgasiaParser.Aexpr0Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#aexpr1}.
	 * @param ctx the parse tree
	 */
	void enterAexpr1(ErgasiaParser.Aexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#aexpr1}.
	 * @param ctx the parse tree
	 */
	void exitAexpr1(ErgasiaParser.Aexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#aexpr2}.
	 * @param ctx the parse tree
	 */
	void enterAexpr2(ErgasiaParser.Aexpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#aexpr2}.
	 * @param ctx the parse tree
	 */
	void exitAexpr2(ErgasiaParser.Aexpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#aexpr3}.
	 * @param ctx the parse tree
	 */
	void enterAexpr3(ErgasiaParser.Aexpr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#aexpr3}.
	 * @param ctx the parse tree
	 */
	void exitAexpr3(ErgasiaParser.Aexpr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#aexpr4}.
	 * @param ctx the parse tree
	 */
	void enterAexpr4(ErgasiaParser.Aexpr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#aexpr4}.
	 * @param ctx the parse tree
	 */
	void exitAexpr4(ErgasiaParser.Aexpr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iexpr}.
	 * @param ctx the parse tree
	 */
	void enterIexpr(ErgasiaParser.IexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iexpr}.
	 * @param ctx the parse tree
	 */
	void exitIexpr(ErgasiaParser.IexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iexprCode}.
	 * @param ctx the parse tree
	 */
	void enterIexprCode(ErgasiaParser.IexprCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iexprCode}.
	 * @param ctx the parse tree
	 */
	void exitIexprCode(ErgasiaParser.IexprCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iexpr1}.
	 * @param ctx the parse tree
	 */
	void enterIexpr1(ErgasiaParser.Iexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iexpr1}.
	 * @param ctx the parse tree
	 */
	void exitIexpr1(ErgasiaParser.Iexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iexpr2}.
	 * @param ctx the parse tree
	 */
	void enterIexpr2(ErgasiaParser.Iexpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iexpr2}.
	 * @param ctx the parse tree
	 */
	void exitIexpr2(ErgasiaParser.Iexpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iexpr3}.
	 * @param ctx the parse tree
	 */
	void enterIexpr3(ErgasiaParser.Iexpr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iexpr3}.
	 * @param ctx the parse tree
	 */
	void exitIexpr3(ErgasiaParser.Iexpr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#iexpr4}.
	 * @param ctx the parse tree
	 */
	void enterIexpr4(ErgasiaParser.Iexpr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#iexpr4}.
	 * @param ctx the parse tree
	 */
	void exitIexpr4(ErgasiaParser.Iexpr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#constantExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(ErgasiaParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#constantExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(ErgasiaParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(ErgasiaParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(ErgasiaParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#integerExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(ErgasiaParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#integerExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(ErgasiaParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#intRealDpExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntRealDpExpr(ErgasiaParser.IntRealDpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#intRealDpExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntRealDpExpr(ErgasiaParser.IntRealDpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arithmeticConstExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticConstExpr(ErgasiaParser.ArithmeticConstExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arithmeticConstExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticConstExpr(ErgasiaParser.ArithmeticConstExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#intConstantExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntConstantExpr(ErgasiaParser.IntConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#intConstantExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntConstantExpr(ErgasiaParser.IntConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#characterExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpression(ErgasiaParser.CharacterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#characterExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpression(ErgasiaParser.CharacterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#concatOp}.
	 * @param ctx the parse tree
	 */
	void enterConcatOp(ErgasiaParser.ConcatOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#concatOp}.
	 * @param ctx the parse tree
	 */
	void exitConcatOp(ErgasiaParser.ConcatOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(ErgasiaParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(ErgasiaParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#logicalConstExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConstExpr(ErgasiaParser.LogicalConstExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#logicalConstExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConstExpr(ErgasiaParser.LogicalConstExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arrayElementName}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementName(ErgasiaParser.ArrayElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arrayElementName}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementName(ErgasiaParser.ArrayElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(ErgasiaParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(ErgasiaParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(ErgasiaParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(ErgasiaParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#varRefCode}.
	 * @param ctx the parse tree
	 */
	void enterVarRefCode(ErgasiaParser.VarRefCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#varRefCode}.
	 * @param ctx the parse tree
	 */
	void exitVarRefCode(ErgasiaParser.VarRefCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#substringApp}.
	 * @param ctx the parse tree
	 */
	void enterSubstringApp(ErgasiaParser.SubstringAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#substringApp}.
	 * @param ctx the parse tree
	 */
	void exitSubstringApp(ErgasiaParser.SubstringAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(ErgasiaParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(ErgasiaParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void enterArrayName(ErgasiaParser.ArrayNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#arrayName}.
	 * @param ctx the parse tree
	 */
	void exitArrayName(ErgasiaParser.ArrayNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#subroutineName}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineName(ErgasiaParser.SubroutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#subroutineName}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineName(ErgasiaParser.SubroutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(ErgasiaParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(ErgasiaParser.FunctionNameContext ctx);
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
	 * Enter a parse tree produced by {@link ErgasiaParser#unsignedArithmeticConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedArithmeticConstant(ErgasiaParser.UnsignedArithmeticConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#unsignedArithmeticConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedArithmeticConstant(ErgasiaParser.UnsignedArithmeticConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#complexConstant}.
	 * @param ctx the parse tree
	 */
	void enterComplexConstant(ErgasiaParser.ComplexConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#complexConstant}.
	 * @param ctx the parse tree
	 */
	void exitComplexConstant(ErgasiaParser.ComplexConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#logicalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConstant(ErgasiaParser.LogicalConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#logicalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConstant(ErgasiaParser.LogicalConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ErgasiaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ErgasiaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErgasiaParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(ErgasiaParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErgasiaParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(ErgasiaParser.ToContext ctx);
}