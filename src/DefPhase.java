import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.HashSet;

public class DefPhase extends ErgasiaBaseListener{
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope

    public void enterProgram(ErgasiaParser.ProgramContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }
    public void exitProgram(ErgasiaParser.ProgramContext ctx) {
        System.out.println(globals);
    }

    /*
    @Override public Integer visitUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        System.out.println("Type = " + ctx.parent.getParent().getText());
        System.out.println("ID = "+ctx.ID().getText());
        return 0;
    }

    @Override public Integer visitDeclarations(ErgasiaParser.DeclarationsContext ctx) {
        System.out.println("Init "+ctx.type().getText()+" var with name/s : ..."+ctx.vars().getText());
        return 0;
    }

     */
}
