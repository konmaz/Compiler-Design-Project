import java.util.*;

/**
 * Class of MetaglotisticC has methods that are being called when node is visited
 */
public class MetaglotistisC extends ErgasiaBaseListener {

    public LinkedHashMap<Function, LinkedList<Variable>> variablesHashMap; // A hash map that contains <key:Function, A list of variables objects>
    public LinkedHashMap<String, Function> functionsHashMap; // A hash map that contains <key:Name of function, A list of function objects

    Function lastFunctionObj;

    LinkedList<typosVarENUM> queueForDeclarations;

    private boolean insideParameters = false;

    LinkedHashMap<Function, LinkedList<StringBuilder>> entoles;

    Variable currentVariableInData; // For data (init variables)

    /**
     * Default Contactor
     */
    public MetaglotistisC(){
        lastFunctionObj = new Function("main", typosVarENUM.typINTEGER); // Because there is not a main header I add it manually

        entoles = new LinkedHashMap<>(); // Initialize entoles object
        entoles.put(lastFunctionObj, new LinkedList<>());
        queueForDeclarations = new LinkedList<>();

        variablesHashMap = new LinkedHashMap<>();
        variablesHashMap.put(lastFunctionObj, new LinkedList<>());

        functionsHashMap = new LinkedHashMap<>();
        functionsHashMap.put(lastFunctionObj.name, lastFunctionObj);
        entoles.get(lastFunctionObj).add(new StringBuilder()); // proti entoli
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

    /**
     * For initializing a variable
     * @param ctx
     */
    public void enterUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        //if (variablesHashMap.containsKey(ctx.ID().getText())){
          //  System.out.println("Η μεταβλητή '"+ctx.ID().getText()+ "' έχει δηλώθεί προηγουμένως ως "+ variablesHashMap.get(ctx.ID().getText()));
            //System.exit(-1);
        //}
        String[] dimensions = null;
        if (ctx.dims() != null){
            //dimensions = ctx.dims().getText().split(",");
            //System.out.println(Arrays.toString(dimensions));
            dimensions = ctx.dims().getText().split(",");
        }
        if (!insideParameters){
            Variable varObj = new Variable(ctx.ID().getText(), queueForDeclarations.getLast(), lastFunctionObj, dimensions);
            variablesHashMap.get(lastFunctionObj).add(varObj);

            StringBuilder tempVarInit = new StringBuilder();
            tempVarInit.append(genTools.enum2CLike(varObj.typosMetablitis));
            tempVarInit.append(' ');
            tempVarInit.append(varObj.ID);
            if (varObj.isArray())
                for (String dim : varObj.dimensions)
                    tempVarInit.append('[').append(dim).append(']');

            entoles.get(lastFunctionObj).getLast().append(tempVarInit);
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

    /**
     * This method is called every time the Visitor visits the node value in the tree
     * It is used to parse the command 'data' for variable initialization
     */
    public void enterValue(ErgasiaParser.ValueContext ctx){
        if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typCOMPLEX))
            currentVariableInData.initialValues.add(genTools.complex2CLike(ctx.getText()));
        else if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typLOGICAL))
            currentVariableInData.initialValues.add(genTools.boolean2CLike(ctx.getText()));
        else if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typREAL))
            currentVariableInData.initialValues.add(ctx.getText());
        else if (currentVariableInData.typosMetablitis.equals(typosVarENUM.typINTEGER))
            currentVariableInData.initialValues.add(ctx.getText());
        else
            return; // If data init value is not in the if above just ignore it

        StringBuilder commandToAdd = new StringBuilder();
        if (currentVariableInData.isArray())
            commandToAdd.append(currentVariableInData.ID).append('[').append(currentVariableInData.initialValues.size() - 1).append("] = ").append(currentVariableInData.initialValues.getLast());
        else
            commandToAdd.append(currentVariableInData.ID).append(" = ").append(currentVariableInData.initialValues.get(0));
        entoles.get(lastFunctionObj).add(commandToAdd);
    }

    public void enterIo_statement(ErgasiaParser.Io_statementContext ctx) {
        if (ctx.READ() != null)
            entoles.get(lastFunctionObj).add(new StringBuilder("std::cin"));
        else if (ctx.WRITE() != null)
            entoles.get(lastFunctionObj).add(new StringBuilder("std::cout"));
    }
    public void enterRead_item(ErgasiaParser.Read_itemContext ctx) {
        //String original = entoles.get(lastFunctionObj).removeLast();
        entoles.get(lastFunctionObj).getLast().append(">>");//.append(ctx.variable().ID().getText());
        //entoles.get(lastFunctionObj).add(original);
    }

    public void enterWrite_item(ErgasiaParser.Write_itemContext ctx) {
        entoles.get(lastFunctionObj).getLast().append("<<");//.append(ctx.getText());
//        String original = entoles.get(lastFunctionObj).removeLast();
//            original += "<<"+ctx.getText();
//        entoles.get(lastFunctionObj).add(original);
    }

    public void enterVariable(ErgasiaParser.VariableContext ctx) {
        if (ctx.LPAREN() != null){
            //System.out.println(ctx.parent.getChild(indexOfCurrentChildNode + 1).getText());
            int indexOfCurrentChildNode = ctx.getParent().children.indexOf(ctx);

            boolean fistTime = false;
            if (ctx.parent.getChild(indexOfCurrentChildNode + 1) != null)
                if (ctx.parent.getChild(indexOfCurrentChildNode + 1).getText().equals("=")){// Ousiastika to proto variable prin to =
                    fistTime = true;
                    entoles.get(lastFunctionObj).add(new StringBuilder());
                }
            Variable varOfReference; // The variable that is being referenced.
            varOfReference = genTools.findObjByProperty(variablesHashMap.get(lastFunctionObj), ctx.ID().getSymbol().getText());
            if (varOfReference != null){
                if (varOfReference.isArray())
                    entoles.get(lastFunctionObj).getLast().append(ctx.ID().getText()).append(genTools.array2CLike(ctx.expressions().getText()));
                else
                    entoles.get(lastFunctionObj).getLast().append(ctx.getText());
            }
            System.out.println(ctx.getText());
//            else { // Not a variable
//                entoles.get(lastFunctionObj).getLast().append(ctx.ID().getText());
//                if (ctx.LPAREN() != null){ // propably a function call
//                    System.out.println();
//                }
//                else { // Just a normal variable probably
//                    entoles.get(lastFunctionObj).getLast().append(ctx.getText());
//                }
//            }
            //System.out.println(ctx.ID().getSymbol().getText());
            if (fistTime)
                entoles.get(lastFunctionObj).getLast().append('=');
        }
        else { // The variable that is being referenced is not a function or array
            entoles.get(lastFunctionObj).getLast().append(ctx.getText());
        }
    }

    /**
     *
     * @param ctx
     */
    public void exitAssignment(ErgasiaParser.AssignmentContext ctx) {
        entoles.get(lastFunctionObj).add(new StringBuilder());
    }
    public void exitUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        entoles.get(lastFunctionObj).getLast().append(';');
        entoles.get(lastFunctionObj).add(new StringBuilder());
    }

    public void enterIf_statement(ErgasiaParser.If_statementContext ctx) {
        entoles.get(lastFunctionObj).add(new StringBuilder("if ("));
    }
    public void enterExpression(ErgasiaParser.ExpressionContext ctx) {
        if (ctx.simple_constant() != null){
            if (ctx.simple_constant().ICONST() != null)
                entoles.get(lastFunctionObj).getLast().append(ctx.getText());
        }
        if (ctx.getChildCount() == 3)
            entoles.get(lastFunctionObj).getLast().append(genTools.logicalExpr2CLike(ctx.getChild(1).getText()));
    }
    // UNUSED CODE Methods

    public void enterBody(ErgasiaParser.BodyContext ctx) {
        //System.out.print(genTools.enum2CLike(lastFunctionObj.returnType) + " " + lastFunctionObj.name + "(");
        //System.out.println(currentScope);
    }

    public void exitBody(ErgasiaParser.BodyContext ctx) {
        //System.out.println("}");
    }
    public void enterAssignment(ErgasiaParser.AssignmentContext ctx) {
        //String assignmentID =  ctx.variable().ID().getText();
    }
}
