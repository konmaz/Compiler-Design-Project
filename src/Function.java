import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Function {
    final String name; //Name of function
    final typosVarENUM returnType;
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
                "\n\t name='" + name + '\'' +
                ",\n\t returnType=" + returnType +
                ",\n\t functionArguments=" + nameOfVariables +
                "\n\t}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Function function = (Function) o;
        return name.equals(function.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
