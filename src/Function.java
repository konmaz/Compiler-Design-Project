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
            nameOfVariables.append(item.typosMetablitis).append(" ").append(item.ID);
            if (item.dimensions != null)
                nameOfVariables.append(Arrays.toString(item.dimensions));
            nameOfVariables.append(",\t");
        }
        nameOfVariables.append(']');

        return "Function{" +
                "\n\t ID                 = '" + name + '\'' +
                ",\n\t functionReturnType = " + returnType +
                ",\n\t functionArguments  = " + nameOfVariables +
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
