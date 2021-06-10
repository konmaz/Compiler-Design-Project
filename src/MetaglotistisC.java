import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class MetaglotistisC extends ErgasiaBaseListener {
    public HashMap<String, LinkedList<Variable>> variablesHashMap; // A hash map that contains <key:CurrentScope, A list of function objects
    public HashSet<Function> functionHashSet; // A hash set that contains all the function objects
    boolean insideBody;
    String currentScope = "body";
    LinkedList<typosVarENUM> queueForDeclarations;
    private boolean insideParameters = false;

    public MetaglotistisC(){
        queueForDeclarations = new LinkedList<>();
        variablesHashMap = new HashMap<>();
        variablesHashMap.put("body", new LinkedList<>());
    }

    public void enterBody(ErgasiaParser.BodyContext ctx) { this.insideBody = true;}
    public void exitBody(ErgasiaParser.BodyContext ctx) { this.insideBody = false;}

    public void enterDeclarations(ErgasiaParser.DeclarationsContext ctx) {

        if (ctx.vars() != null){
            //queueForDeclarations.add(typosVarENUM.typVOID);
            //System.out.println("mpika");
            //System.out.println(ctx.type().getText());
            if (ctx.type().getText().equalsIgnoreCase("integer"))
                queueForDeclarations.add(typosVarENUM.typINTEGER);
            else if (ctx.type().getText().equalsIgnoreCase("real"))
                queueForDeclarations.add(typosVarENUM.typREAL);
            else if (ctx.type().getText().equalsIgnoreCase("character"))
                queueForDeclarations.add(typosVarENUM.typCHARACTER);
            else if (ctx.type().getText().equalsIgnoreCase("logical"))
                queueForDeclarations.add(typosVarENUM.typLOGICAL);
            //System.out.printf("Initialize variable/s : %s\t type : %s\n",ctx.vars().getText(), ctx.type().getText());
        }
    }

    public void exitDeclarations(ErgasiaParser.DeclarationsContext ctx) {
        if (ctx.vars() != null) {
            queueForDeclarations.removeLast();
        }
    }

    public void enterUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        //if (variablesHashMap.containsKey(ctx.ID().getText())){
          //  System.out.println("Η μεταβλητή '"+ctx.ID().getText()+ "' έχει δηλώθεί προηγουμένως ως "+ variablesHashMap.get(ctx.ID().getText()));
            //System.exit(-1);
        //}
        if (!insideParameters)
            variablesHashMap.get(currentScope).add(new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), currentScope,-1));
        else
            functionsHashMap.get(currentScope);
        //dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        //System.out.println(ctx.ID().getText());
    }

    public void enterHeader(ErgasiaParser.HeaderContext ctx) {
        currentScope = ctx.ID().getSymbol().getText();
        if (!variablesHashMap.containsKey(currentScope))
            variablesHashMap.put(currentScope, new LinkedList<>());
        if (!functionsHashMap.containsKey(currentScope))
            functionsHashMap.put(currentScope, new LinkedList<>());
    }

    public void enterAssignment(ErgasiaParser.AssignmentContext ctx) {
        String assignmentID =  ctx.variable().ID().getText();
    }

    public void enterFormal_parameters(ErgasiaParser.Formal_parametersContext ctx){
        insideParameters = true;
    }
    public void exitFormal_parameters(ErgasiaParser.Formal_parametersContext ctx){
        insideParameters = false;
    };

}
