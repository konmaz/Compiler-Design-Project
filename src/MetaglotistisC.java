import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MetaglotistisC extends ErgasiaBaseListener {
    public HashMap<String, LinkedList<Variable>> variablesHashMap; // A hash map that contains <key:CurrentScope, A list of function objects
    public HashMap<String, Function> functionsHashMap; // A hash map that contains <key:Name of function, A list of function objects
    Function lastFunctionObj = null;
    String currentScope = "body";
    LinkedList<typosVarENUM> queueForDeclarations;
    private boolean insideParameters = false;

    HashMap<Function, ArrayList<String>> entoles;

    Variable currentVariableInData; // gia to data (arxikopoihsh entolon)

    public MetaglotistisC(){
        lastFunctionObj = new Function("main", typosVarENUM.typVOID);
        entoles = new HashMap<>();
        entoles.put(lastFunctionObj, new ArrayList<>());
        queueForDeclarations = new LinkedList<>();
        variablesHashMap = new HashMap<>();
        variablesHashMap.put("body", new LinkedList<>());
        functionsHashMap = new HashMap<>();
    }

    public void enterBody(ErgasiaParser.BodyContext ctx) {
        System.out.print(genTools.enum2CLike(lastFunctionObj.returnType) + " " + lastFunctionObj.name + "(");

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
            queueForDeclarations.add(genTools.getEnumFromString(ctx.type().getText()));
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
        String[] dimensions = null;
        if (ctx.dims() != null){
            System.out.println();
            //dimensions = ctx.dims().getText().split(",");
            System.out.println(Arrays.toString(dimensions));
            dimensions = ctx.dims().getText().split(",");
        }
        if (!insideParameters){
            variablesHashMap.get(currentScope).add(new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), currentScope,dimensions));
            //System.out.println("\t"+ genTools.enum2CLike(queueForDeclarations.getLast())+" "+ctx.ID().getText()+";");
        }
        else{ // insideParameters == True
            functionsHashMap.get(currentScope).addFunctionArgument(new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), currentScope, dimensions));
        }
        //dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        //System.out.println(ctx.ID().getText());
    }

    public void enterHeader(ErgasiaParser.HeaderContext ctx) {
        currentScope = ctx.ID().getSymbol().getText();
        if (!variablesHashMap.containsKey(currentScope))
            variablesHashMap.put(currentScope, new LinkedList<>());
        typosVarENUM functionReturnType;
        if (ctx.type() != null){
            functionReturnType = genTools.getEnumFromString(ctx.type().getText());
        }else {
            functionReturnType = typosVarENUM.typVOID;
        }
        if (!functionsHashMap.containsKey(currentScope)){
            lastFunctionObj = new Function(currentScope, functionReturnType);
            functionsHashMap.put(currentScope, lastFunctionObj);
            entoles.put(lastFunctionObj, new ArrayList<>());
        }


    }

    public void enterAssignment(ErgasiaParser.AssignmentContext ctx) {
        String assignmentID =  ctx.variable().ID().getText();
    }

    public void enterFormal_parameters(ErgasiaParser.Formal_parametersContext ctx){
        //System.out.println(ctx.getText());
        if (ctx.vars() != null)
            queueForDeclarations.add(genTools.getEnumFromString(ctx.type().getText()));
        insideParameters = true;
    }
    public void exitFormal_parameters(ErgasiaParser.Formal_parametersContext ctx){
        if(ctx.vars() != null)
            queueForDeclarations.removeLast();
        insideParameters = false;
    }

    public void enterValue_list(ErgasiaParser.Value_listContext ctx) {
        //System.out.println("---");
        int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
        for (Variable searchKey : variablesHashMap.get(currentScope))
            if (searchKey.ID.equals(ctx.parent.getChild(indexOfCurrentChildNode - 1).getText()))
                currentVariableInData = searchKey;
        //System.out.println(); // get left sibling
        //for (String item: ctx.values().getText().split(","))
        //System.out.println(ctx.values().getText());
        //System.out.println("---");
    }
    public void enterValue(ErgasiaParser.ValueContext ctx){

        if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typCOMPLEX))
            currentVariableInData.initialValues.add(genTools.complex2CLike(ctx.getText()));
        if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typLOGICAL))
            currentVariableInData.initialValues.add(genTools.boolean2CLike(ctx.getText()));
    }

}
