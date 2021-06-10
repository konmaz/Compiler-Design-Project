import java.util.LinkedList;

public class Function {
    String name; //Name of function
    typosVarENUM returnType;
    LinkedList<Variable> functionArguments;

    public Function(String name, typosVarENUM returnType) {
        this.name = name;
        this.returnType = returnType;
    }

    public void addFunctionArgument(Variable variableObj)
    {
        functionArguments.add(variableObj);
    }
}
