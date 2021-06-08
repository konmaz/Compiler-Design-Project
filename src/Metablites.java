enum typosVarENUM {
    typINTEGER,
    typREAL,
    typLOGICAL,
    typCHARACTER,
    typVOID
}
public class Metablites {
    String ID; //Onoma Metablitis
    typosVarENUM typosMetablitis;
    int thesisPinaka; // Ean i metabliti den einai pinakas tote auto to pedio einai -1;

    public Metablites(String name, typosVarENUM tp) {
        this.ID = name;
        this.typosMetablitis = tp;
        /*
        if (megethosDiastaseon.length == 0)
            this.thesisPinaka = -1;
        else
            this.thesisPinaka = 1;
        for (Integer item: megethosDiastaseon)
            this.thesisPinaka *= item;
         */
    }
}
