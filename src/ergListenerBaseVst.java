import java.util.ArrayList;
import java.util.HashMap;

public class ergListenerBaseVst extends ErgasiaBaseListener{
    HashMap<String, ArrayList<String>> dilomenesVar = new HashMap<>();
    String currentVarType;
    ergListenerBaseVst(){
        dilomenesVar.put("integer", new ArrayList<>());
        dilomenesVar.put("real", new ArrayList<>());
    }
    public void enterDeclarations(ErgasiaParser.DeclarationsContext ctx) {
        if (ctx.vars() != null){
            currentVarType = ctx.type().getText();
            System.out.printf("Initialize variable/s : %s\t type : %s\n",ctx.vars().getText(), ctx.type().getText());
        }
    }

    public void exitDeclarations(ErgasiaParser.DeclarationsContext ctx) {

        if (ctx.vars() != null) {
            System.out.println("Exit");
            System.out.printf("Initialize variable/s : %s\t type : %s\n", ctx.vars().getText(), ctx.type().getText());

        }
    }
    public void exitUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        System.out.println(ctx.ID().getText());
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
