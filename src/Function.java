import java.util.Arrays;
import java.util.LinkedList;

public class Function {
    String name; //Name of function
    typosVarENUM returnType;
    LinkedList<Variable> functionArguments;

    public Function(String name, typosVarENUM returnType) {
        functionArguments = new LinkedList<>();
        this.name = name;
        this.returnType = returnType;
    }

    public void addFunctionArgument(Variable variableObj)
    {
        functionArguments.add(variableObj);
    }

    @Override
    public String toString() {
        StringBuilder nameOfVariables = new StringBuilder();
        nameOfVariables.append("[");
        for (Variable item : functionArguments){
            nameOfVariables.append(item.typosMetablitis).append(" ").append(Arrays.toString(item.dimensions)).append(":").append(item.ID).append(", \t");
        }
        nameOfVariables.append(']');

        return "Function{" +
                "name='" + name + '\'' +
                ", returnType=" + returnType +
                ", functionArguments=" + nameOfVariables +
                '}';
    }
}
