import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Class of MetaglotisticC has methods that are being called when node is visited
 */
public class MetaglotistisListener extends ErgasiaBaseListener {

    private final LinkedList<typosVarENUM> queueForDeclarations;
    public LinkedHashMap<Function, LinkedHashMap<String, Variable>> variablesHashMap; // A LinkedHashMap that contains <key:Function Name, A linked HashMap that contains <Var name, Var object>>
    public LinkedHashMap<String, Function> functionsHashMap; // A hash map that contains <key:Name of function, A list of function objects
    public LinkedList<String> errorList;
    private Function lastFunctionObj;
    private Variable currentVariableInData; // For data (init variables)
    private boolean insideParameters = false;

    /**
     * Default Contactor
     */
    public MetaglotistisListener() {
        errorList = new LinkedList<>();
        lastFunctionObj = new Function("main", typosVarENUM.typVOID); // Because there is not a main header I add it manually

        queueForDeclarations = new LinkedList<>();

        variablesHashMap = new LinkedHashMap<>();
        variablesHashMap.put(lastFunctionObj, new LinkedHashMap<>());

        functionsHashMap = new LinkedHashMap<>();
        functionsHashMap.put(lastFunctionObj.name, lastFunctionObj);
    }

    /**
     * This method is called every time the Visitor visits the node enter enterDeclarations
     * @param ctx
     */
    public void enterDeclarations(ErgasiaParser.DeclarationsContext ctx) {
        if (ctx.vars() != null) {
            //queueForDeclarations.add(typosVarENUM.typVOID);
            //System.out.println("mpika");
            //System.out.println(ctx.type().getText());
            queueForDeclarations.add(genTools.getEnumFromString(ctx.type().getText()));
        }
    }

    /**
     * This method is called every time the Visitor visits the node enter exitDeclarations
     * @param ctx
     */
    public void exitDeclarations(ErgasiaParser.DeclarationsContext ctx) {
        if (ctx.vars() != null) {
            queueForDeclarations.removeLast();
        }
    }
    /**
     * This method is called every time the Visitor visits the node enter enterUndef_variable
     * @param ctx
     */
    public void enterUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        if (variablesHashMap.get(lastFunctionObj).containsKey(ctx.ID().getText())){
            errorList.add("Error at line "+ctx.getStart().getLine()+" The variable is already declared!");
        }
        String[] dimensions = null;
        if (ctx.dims() != null) {
            dimensions = ctx.dims().getText().split(",");
        }
        Variable varObj = new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), lastFunctionObj, dimensions);
        if (insideParameters) { // insideParameters == True
            functionsHashMap.get(lastFunctionObj.name).addFunctionArgument(varObj);
        }
        variablesHashMap.get(lastFunctionObj).put(varObj.ID, varObj);
    }
    /**
     * This method is called every time the Visitor visits the node enter enterHeader
     * @param ctx
     */
    public void enterHeader(ErgasiaParser.HeaderContext ctx) { // A new function declaration found
        //currentFunctionScope = ctx.ID().getSymbol().getText();
        typosVarENUM functionReturnType = typosVarENUM.typVOID; // Set default return type to VOID

        if (ctx.type() != null) {
            functionReturnType = genTools.getEnumFromString(ctx.type().getText()); // Set the return type
        }

        if (!functionsHashMap.containsKey(ctx.ID().getSymbol().getText())) {
            lastFunctionObj = new Function(ctx.ID().getSymbol().getText(), functionReturnType);
            functionsHashMap.put(lastFunctionObj.name, lastFunctionObj);
        }
        if (!variablesHashMap.containsKey(lastFunctionObj)) { // If variablesHashMap don't contains the function object as key add it
            variablesHashMap.put(lastFunctionObj, new LinkedHashMap<>());
        }
    }
    /**
     * This method is called every time the Visitor visits the node enter enterFormal_parameters
     * @param ctx
     */
    public void enterFormal_parameters(ErgasiaParser.Formal_parametersContext ctx) {
        if (ctx.vars() != null)
            queueForDeclarations.add(genTools.getEnumFromString(ctx.type().getText()));
        insideParameters = true;
    }

    /**
     * This method is called every time the Visitor visits the node enter exitFormal_parameters
     * @param ctx
     */
    public void exitFormal_parameters(ErgasiaParser.Formal_parametersContext ctx) {
        if (ctx.vars() != null)
            queueForDeclarations.removeLast();
        insideParameters = false;
    }
    /**
     * This method is called every time the Visitor visits the node enter enterValue_list
     * @param ctx
     */
    public void enterValue_list(ErgasiaParser.Value_listContext ctx) {
        //System.out.println("---");
        int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);
        String varName = ctx.parent.getChild(indexOfCurrentChildNode - 1).getText();
        //currentVariableInData = genTools.findObjByProperty(variablesHashMap.get(lastFunctionObj),ctx.parent.getChild(indexOfCurrentChildNode - 1).getText());
        currentVariableInData = variablesHashMap.get(lastFunctionObj).get(varName);
        //currentVariableInData = genTools.findObjByProperty(variablesHashMap.get(lastFunctionObj), ctx.parent.getChild(indexOfCurrentChildNode - 1).getText());

//        for (Variable searchKey : variablesHashMap.get(lastFunctionObj))
//            if (searchKey.ID.equals(ctx.parent.getChild(indexOfCurrentChildNode - 1).getText()))
//                currentVariableInData = searchKey;
        //System.out.println(); // get left sibling
        //for (String item: ctx.values().getText().split(","))
        //System.out.println(ctx.values().getText());
        //System.out.println("---");
    }

    /**
     * This method is called every time the Visitor visits the node enter Cblock (common)
     */
    public void enterCblock(ErgasiaParser.CblockContext ctx) {
        if (ctx.ID() != null) {
            String cblockID = ctx.ID().getText();
            String[] variablesNames = ctx.id_list().getText().split(",");
            for (String variableName : variablesNames) {
                Variable varObj = variablesHashMap.get(lastFunctionObj).get(variableName);
                if (varObj == null)
                    errorList.add("Error at line " + ctx.getStart().getLine() + " Trying set variable '" + variableName + "' common without declaring it first ");
                else
                    varObj.setCommon(cblockID);
            }

        }
    }


    /**
     * This method is called every time the Visitor visits the node value in the tree
     * It is used to parse the command 'data' for variable initialization
     */
    public void enterValue(ErgasiaParser.ValueContext ctx) {
        if (currentVariableInData == null)
            errorList.add("The variable at line " + ctx.getStart().getLine() + " is not set but you tried to initialize it with data");
        else {
            currentVariableInData.initialValues.add(ctx.getText());

//        if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typCOMPLEX))
//            currentVariableInData.initialValues.add(genTools.complex2CLike(ctx.getText()));
//        else if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typLOGICAL))
//            currentVariableInData.initialValues.add(genTools.boolean2CLike(ctx.getText()));
//        else if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typREAL))
//            currentVariableInData.initialValues.add(ctx.getText());
//        else if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typINTEGER))
//            currentVariableInData.initialValues.add(genTools.boolean2CLike(ctx.getText()));

        }
        // If data init value is not in the if above just ignore it
    }
}