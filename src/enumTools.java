public class enumTools {

    public static typosVarENUM getEnumFromString(String x){
        if (x.equalsIgnoreCase("integer"))
            return typosVarENUM.typINTEGER;
        else if (x.equalsIgnoreCase("real"))
            return typosVarENUM.typREAL;
        else if (x.equalsIgnoreCase("character"))
            return typosVarENUM.typCHARACTER;
        else if (x.equalsIgnoreCase("logical"))
            return typosVarENUM.typLOGICAL;
        return typosVarENUM.typVOID;
    }
}
