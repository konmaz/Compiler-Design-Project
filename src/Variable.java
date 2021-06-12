import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Variable {
    public String ID; //Onoma Metablitis
    public typosVarENUM typosMetablitis;
    public String scope;
    public String[] dimensions; // 1D,2D,3D...
    public boolean isGlobal;
    public LinkedList<String> initialValues;

    public Variable(String name, typosVarENUM tp, String scope, String[] dimensions) {
        this.ID = name;
        this.typosMetablitis = tp;
        this.scope = scope;
        this.dimensions = dimensions;
        this.isGlobal = false;
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
    public void makeVariableGlobal(){
        this.isGlobal = true;
    }
    public boolean isArray(){
        return dimensions != null;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "\n\tID='" + ID + '\'' +
                ",\n\t typosMetablitis=" + typosMetablitis +
                ",\n\t scope='" + scope + '\'' +
                ",\n\t dimensions=" + Arrays.toString(dimensions) +
                ",\n\t is Array=" + this.isArray() +
                ",\n\t isGlobal=" + isGlobal +
                ",\n\t initialValue=" + Arrays.toString(initialValues.toArray())+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variable variable = (Variable) o;
        return ID.equals(variable.ID) && typosMetablitis == variable.typosMetablitis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, typosMetablitis);
    }
}
