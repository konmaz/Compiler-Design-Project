import java.util.Collection;
import java.util.LinkedList;

public class genTools {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static typosVarENUM getEnumFromString(String x) {
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

    public static boolean listContains(LinkedList lkList, Object obj) {
        for (Object item : lkList) {
            if (item.equals(obj))
                return true;
        }
        return false;
    }

    /**
     * https://stackoverflow.com/questions/17526608/how-to-find-an-object-in-an-arraylist-by-property
     *
     * @param variableCollection
     * @param searchID
     * @return null if no object found with id
     */
    public static Variable findObjByProperty(Collection<Variable> variableCollection, String searchID) {
        return variableCollection.stream().filter(carnet -> searchID.equals(carnet.ID)).findFirst().orElse(null);
    }


//    public static String array2CLike(String expr){
//        StringBuilder dest = new StringBuilder(expr.length()*3);
//        String[] srcSplit = expr.split(",");
//        for (String dim : srcSplit){
//            dest.append("[").append(dim).append("]");
//        }
//        return String.valueOf(dest);
//    }
//    public static String complex2CLike(String expr){ return expr.replace(':',',');
//    }
//    public static String enum2CLike(typosVarENUM typosVarENUMObj){
//        if(typosVarENUMObj == typosVarENUM.typINTEGER)
//            return "int";
//        if(typosVarENUMObj == typosVarENUM.typREAL)
//            return "float";
//        if(typosVarENUMObj == typosVarENUM.typCHARACTER)
//            return "char";
//        if(typosVarENUMObj == typosVarENUM.typLOGICAL)
//            return "bool";
//        if(typosVarENUMObj == typosVarENUM.typCOMPLEX)
//            return "complex";
//        return "void";
//    }

//    public static String logicalExpr2CLike(String exp){
//        StringBuilder sb = new StringBuilder(exp);
//        for (int i = 0; i < genTools.contents.length; i++) {
//
//            replaceAll(sb, genTools.contents[i][0], genTools.contents[i][1]);
//            replaceAll(sb, genTools.contents[i][0].toUpperCase(), genTools.contents[i][1]);
//
//        }
//        return sb.toString();
//    }
//
//    public static String logicSingle2Clike(String exp){
//        for (int i = 0; i < genTools.contents.length; i++) {
//            if (genTools.contents[i][0].equalsIgnoreCase(exp))
//                return genTools.contents[i][1];
//        }
//        return exp;
//    }
//
//    public static String if2CLike(String exp, LinkedList<Variable> variablesLinkedList){
//
//        ErgasiaLexer lexer = new ErgasiaLexer(new ANTLRInputStream(exp));
//        ErgasiaParser parser = new ErgasiaParser(new CommonTokenStream(lexer));
//        //String result = new Visitor(variablesLinkedList).visit(parser.if_statement());
//        //System.out.println(result);
//        return new Visitor(variablesLinkedList).visit(parser.if_statement());
//    }
//
//    public static String assignment2CLike(String exp, LinkedList<Variable> variablesLinkedList){
//
//        ErgasiaLexer lexer = new ErgasiaLexer(new ANTLRInputStream(exp));
//        ErgasiaParser parser = new ErgasiaParser(new CommonTokenStream(lexer));
//        //String result = new Visitor(variablesLinkedList).visit(parser.if_statement());
//        //System.out.println(result);
//        return new Visitor(variablesLinkedList).visit(parser.assignment());
//    }

//    private static final String[][] contents = new String[][]{
//            {".or."," || "},
//            {".and."," && "},
//            {".not.", " ! "},
//
//            {".gt.", " > "},
//            {".ge.", " >= "},
//            {".lt.", " < "},
//            {".le.", " <= "},
//            {".eq.", " == "},
//            {".ne.", " != "},
//    };

//public static String boolean2CLike(String expr){
//    System.out.println("ME KALESES");
//    if (expr.equalsIgnoreCase(".true."))
//        return "true";
//    else if (expr.equalsIgnoreCase(".false."))
//        return "false";
//    return expr;
//}
//public static void replaceAll(StringBuilder builder, String from, String to) {
//    int index = builder.indexOf(from);
//    while (index != -1) {
//        builder.replace(index, index + from.length(), to);
//        index += to.length(); // Move to the end of the replacement
//        index = builder.indexOf(from, index);
//    }
//}
}

