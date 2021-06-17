import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Variable {
    public String ID; //Onoma Metablitis
    public typosVarENUM typosMetablitis;
    public Function scope;
    public String[] dimensions; // 1D,2D,3D...
    public LinkedList<String> initialValues;
    public String common = null;

    public Variable(String name, typosVarENUM tp, Function scope, String[] dimensions) {
        this.ID = name;
        this.typosMetablitis = tp;
        this.scope = scope;
        this.dimensions = dimensions;
        this.initialValues = new LinkedList<String>();
        /*
        if (megethosDiastaseon.length == 0)
            this.thesisPinaka = -1;
        else
            this.thesisPinaka = 1;
        for (Integer item: megethosDiastaseon)
            this.thesisPinaka *= item;
         */
    }

    public Variable(String name) {
        this.ID = name;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public boolean isArray() {
        return dimensions != null;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "\n\t ID         = '" + ID + '\'' +
                ",\n\t varType    = " + typosMetablitis +
                ",\n\t scope      = '" + scope.name + '\'' +
                ",\n\t common     = '" + this.common + '\'' +
                ",\n\t dimensions = " + Arrays.toString(dimensions) +
                ",\n\t is Array   = " + this.isArray() +
                ",\n\t initValues = " + Arrays.toString(initialValues.toArray()) +
                "\n\t}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variable variable = (Variable) o;
        return ID.equals(variable.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
