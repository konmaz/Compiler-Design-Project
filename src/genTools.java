import org.stringtemplate.v4.ST;

import java.util.LinkedList;

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
            return "bool";
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
    public static String complex2CLike(String expr){ return expr.replace(':',',');
    }

    public static boolean listContains(LinkedList lkList, Object obj){
        for (Object item : lkList) {
            if (item.equals(obj))
                return true;
        }
        return false;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String array2CLike(String expr){
        StringBuilder dest = new StringBuilder(expr.length()*3);
        String[] srcSplit = expr.split(",");
        for (String dim : srcSplit){
            dest.append("[").append(dim).append("]");
        }
        return String.valueOf(dest);
    }
}

