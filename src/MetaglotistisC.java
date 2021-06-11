import org.antlr.v4.runtime.Token;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class MetaglotistisC extends ErgasiaBaseListener {
    public HashMap<String, LinkedList<Variable>> variablesHashMap; // A hash map that contains <key:CurrentScope, A list of function objects
    public HashMap<String, Function> functionsHashMap; // A hash map that contains <key:Name of function, A list of function objects
    Function lastFunctionObj = null;
    String currentScope = "body";
    LinkedList<typosVarENUM> queueForDeclarations;
    private boolean insideParameters = false;

    public MetaglotistisC(){
        queueForDeclarations = new LinkedList<>();
        variablesHashMap = new HashMap<>();
        variablesHashMap.put("body", new LinkedList<>());
        functionsHashMap = new HashMap<>();
    }

    public void enterBody(ErgasiaParser.BodyContext ctx) {
        if (currentScope.equalsIgnoreCase("body"))
            System.out.println("int main() {");
        else
        {System.out.println(enumTools.ENUM2Clike(lastFunctionObj.returnType) + " " + lastFunctionObj.name + "()");}
        //System.out.println(currentScope);
    }
    public void exitBody(ErgasiaParser.BodyContext ctx) {

        System.out.println("}");
    }

    public void enterDeclarations(ErgasiaParser.DeclarationsContext ctx) {

        if (ctx.vars() != null){
            //queueForDeclarations.add(typosVarENUM.typVOID);
            //System.out.println("mpika");
            //System.out.println(ctx.type().getText());
            queueForDeclarations.add(enumTools.getEnumFromString(ctx.type().getText()));
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
        else // insideParameters == True
            functionsHashMap.get(currentScope).addFunctionArgument(new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), currentScope,-1));
        //dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        //System.out.println(ctx.ID().getText());
    }

    public void enterHeader(ErgasiaParser.HeaderContext ctx) {
        currentScope = ctx.ID().getSymbol().getText();
        if (!variablesHashMap.containsKey(currentScope))
            variablesHashMap.put(currentScope, new LinkedList<>());
        typosVarENUM functionReturnType;
        if (ctx.type() != null){
            functionReturnType = enumTools.getEnumFromString(ctx.type().getText());
        }else {
            functionReturnType = typosVarENUM.typVOID;
        }
        if (!functionsHashMap.containsKey(currentScope)){
            lastFunctionObj = new Function(currentScope, functionReturnType);
            functionsHashMap.put(currentScope, lastFunctionObj); // TODO EDO NA BALEIS TON TYPO TOU RETURN TOU FUNCTION OK TO EBALA
        }

    }

    public void enterAssignment(ErgasiaParser.AssignmentContext ctx) {
        String assignmentID =  ctx.variable().ID().getText();
    }

    public void enterFormal_parameters(ErgasiaParser.Formal_parametersContext ctx){
        //System.out.println(ctx.getText());
        if (ctx.vars() != null)
            queueForDeclarations.add(enumTools.getEnumFromString(ctx.type().getText()));
        insideParameters = true;
    }
    public void exitFormal_parameters(ErgasiaParser.Formal_parametersContext ctx){
        if(ctx.vars() != null)
            queueForDeclarations.removeLast();
        insideParameters = false;
    };

}
