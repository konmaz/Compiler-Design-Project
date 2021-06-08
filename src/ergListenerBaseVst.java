import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ergListenerBaseVst extends ErgasiaBaseListener{
    public HashMap<String, Metablites> metablitesHashMap;
    LinkedList<typosVarENUM> queue;
    ergListenerBaseVst(){
        queue = new LinkedList<>();
        metablitesHashMap = new HashMap<>();
    }
    public void enterDeclarations(ErgasiaParser.DeclarationsContext ctx) {


        if (ctx.vars() != null){
            System.out.println("mpika");
            System.out.println(ctx.type().getText());
            if (ctx.type().getText().equalsIgnoreCase("integer"))
                queue.add(typosVarENUM.typINTEGER);
            if (ctx.type().getText().equalsIgnoreCase("real"))
                queue.add(typosVarENUM.typREAL);
            //System.out.printf("Initialize variable/s : %s\t type : %s\n",ctx.vars().getText(), ctx.type().getText());
        }
    }
    public void exitDeclarations(ErgasiaParser.DeclarationsContext ctx) {

        if (ctx.vars() != null) {
            queue.removeLast();
            //System.out.println("Exit");
            //System.out.printf("Initialize variable/s : %s\t type : %s\n", ctx.vars().getText(), ctx.type().getText());

        }
    }
    public void enterUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        if (metablitesHashMap.containsKey(ctx.ID().getText())){
            System.out.println("Το "+ctx.ID().getText()+ " έχει δηλώθεί προηγουμένως ως "+ metablitesHashMap.get(ctx.ID().getText()).typosMetablitis);
            System.out.println("Η διαδικασία σταμάταει...");
            System.exit(-1);
        }
        metablitesHashMap.put(ctx.ID().getText(), new Metablites(ctx.ID().getText(), queue.getLast()));
        //dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        //System.out.println(ctx.ID().getText());

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
