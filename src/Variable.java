import java.util.LinkedList;

public class Variable {
    public String ID; //Onoma Metablitis
    typosVarENUM typosMetablitis;
    String scope;
    int dimensions; // 1D,2D,3D...


    public Variable(String name, typosVarENUM tp, String scope, int dimensions) {
        this.ID = name;
        this.typosMetablitis = tp;
        this.scope = scope;
        this.dimensions = dimensions;
        /*
        if (megethosDiastaseon.length == 0)
            this.thesisPinaka = -1;
        else
            this.thesisPinaka = 1;
        for (Integer item: megethosDiastaseon)
            this.thesisPinaka *= item;
         */
    }

    @Override
    public String toString() {
        return "Variable{" +
                "\n\tID='" + ID + '\'' +
                ",\n\t typosMetablitis=" + typosMetablitis +
                ",\n\t scope='" + scope + '\'' +
                ",\n\t dimensions=" + dimensions +
                '}';
    }
}
