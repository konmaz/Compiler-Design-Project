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
        else if (x.equalsIgnoreCase("complex"))
            return typosVarENUM.typCOMPLEX;
        return typosVarENUM.typVOID;
    }
    public static String enum2CLike(typosVarENUM typosVarENUMObj){
        if(typosVarENUMObj == typosVarENUM.typINTEGER)
            return "int";
        if(typosVarENUMObj == typosVarENUM.typREAL)
            return "float";
        if(typosVarENUMObj == typosVarENUM.typCHARACTER)
            return "char";
        if(typosVarENUMObj == typosVarENUM.typLOGICAL)
            return "boolean";
        if(typosVarENUMObj == typosVarENUM.typCOMPLEX)
            return "double complex";
        return "void";
    }
    public static String boolean2CLike(String expr){
        if (expr.equalsIgnoreCase(".true."))
            return "true";
        else if (expr.equalsIgnoreCase(".false."))
            return "false";
        return "";
    }
    public static String complex2CLike(String expr){
        return expr.replace(':','+') + " * I";
    }
}

