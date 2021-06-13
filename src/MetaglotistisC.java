import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MetaglotistisC extends ErgasiaBaseListener {
    public HashMap<Function, LinkedList<Variable>> variablesHashMap; // A hash map that contains <key:Function, A list of variables objects>
    public HashMap<String, Function> functionsHashMap; // A hash map that contains <key:Name of function, A list of function objects

    Function lastFunctionObj;

    LinkedList<typosVarENUM> queueForDeclarations;

    private boolean insideParameters = false;

    HashMap<Function, LinkedList<String>> entoles;

    Variable currentVariableInData; // gia to data (arxikopoihsh entolon)

    public MetaglotistisC(){
        lastFunctionObj = new Function("main", typosVarENUM.typVOID);

        entoles = new HashMap<>();
        entoles.put(lastFunctionObj, new LinkedList<>());

        queueForDeclarations = new LinkedList<>();

        variablesHashMap = new HashMap<>();
        variablesHashMap.put(lastFunctionObj, new LinkedList<>());

        functionsHashMap = new HashMap<>();
        functionsHashMap.put(lastFunctionObj.name, lastFunctionObj);
    }

    public void enterBody(ErgasiaParser.BodyContext ctx) {
        //System.out.print(genTools.enum2CLike(lastFunctionObj.returnType) + " " + lastFunctionObj.name + "(");
        //System.out.println(currentScope);
    }
    public void exitBody(ErgasiaParser.BodyContext ctx) {
        //System.out.println("}");
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
            //System.out.println(Arrays.toString(dimensions));
            dimensions = ctx.dims().getText().split(",");
        }
        if (!insideParameters){
            variablesHashMap.get(lastFunctionObj).add(new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), lastFunctionObj, dimensions));
            //System.out.println("\t"+ genTools.enum2CLike(queueForDeclarations.getLast())+" "+ctx.ID().getText()+";");
        }
        else{ // insideParameters == True
            functionsHashMap.get(lastFunctionObj.name).addFunctionArgument(new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), lastFunctionObj, dimensions));
        }
        //dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        //System.out.println(ctx.ID().getText());
    }

    public void enterHeader(ErgasiaParser.HeaderContext ctx) { // A new function declaration found
        //currentFunctionScope = ctx.ID().getSymbol().getText();
        System.out.println("-S-");
        System.out.println(ctx.ID().getSymbol().getText());

        typosVarENUM functionReturnType = typosVarENUM.typVOID; // Set default return type to VOID

        if (ctx.type() != null){
            functionReturnType = genTools.getEnumFromString(ctx.type().getText()); // Set the return type
        }

        if (!functionsHashMap.containsKey(ctx.ID().getSymbol().getText())){
            lastFunctionObj = new Function(ctx.ID().getSymbol().getText(), functionReturnType);
            functionsHashMap.put(lastFunctionObj.name, lastFunctionObj);
            entoles.put(lastFunctionObj, new LinkedList<>());
        }

        if (!variablesHashMap.containsKey(lastFunctionObj)) // If variablesHashMap don't contains the function object as key add it
        {
            variablesHashMap.put(lastFunctionObj, new LinkedList<>());
        }
        System.out.println("-F-");
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
        for (Variable searchKey : variablesHashMap.get(lastFunctionObj))
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

    public void enterAssignment(ErgasiaParser.AssignmentContext ctx) {
        //String assignmentID =  ctx.variable().ID().getText();
    }
}
