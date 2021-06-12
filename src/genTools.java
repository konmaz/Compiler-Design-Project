import org.stringtemplate.v4.ST;

public class genTools {

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
    public static String ENUM2Clike(typosVarENUM typosVarENUMObj){
        if(typosVarENUMObj == typosVarENUM.typINTEGER)
            return "int";
        if(typosVarENUMObj == typosVarENUM.typREAL)
            return "float";
        if(typosVarENUMObj == typosVarENUM.typCHARACTER)
            return "char";
        if(typosVarENUMObj == typosVarENUM.typLOGICAL)
            return "boolean";
        return "void";
    }

}

