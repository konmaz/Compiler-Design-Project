import java.util.*;

public class ergListener extends ErgasiaBaseListener{
    public HashMap<String, Variable> metablitesHashMap;
    HashSet<String> builtInFunctions = new HashSet<>(Arrays.asList("CAR", "CDR", "CADR", "CDDR", "CDDDR"));
    LinkedList<typosVarENUM> queue;
    ergListener(){
        queue = new LinkedList<>();
        metablitesHashMap = new HashMap<>();
    }
    public void enterDeclarations(ErgasiaParser.DeclarationsContext ctx) {

        if (ctx.vars() != null){
            queue.add(typosVarENUM.typVOID);
            //System.out.println("mpika");
            //System.out.println(ctx.type().getText());
            if (ctx.type().getText().equalsIgnoreCase("integer"))
                queue.add(typosVarENUM.typINTEGER);
            else if (ctx.type().getText().equalsIgnoreCase("real"))
                queue.add(typosVarENUM.typREAL);
            else if (ctx.type().getText().equalsIgnoreCase("character"))
                queue.add(typosVarENUM.typCHARACTER);
            else if (ctx.type().getText().equalsIgnoreCase("logical"))
                queue.add(typosVarENUM.typLOGICAL);
            //System.out.printf("Initialize variable/s : %s\t type : %s\n",ctx.vars().getText(), ctx.type().getText());
        }
    }
    public void exitDeclarations(ErgasiaParser.DeclarationsContext ctx) {

        if (ctx.vars() != null) {
            queue.removeLast();
            //System.out.println("Exit");
            //System.out.printf("Initialize variable/s : %s\t type : %s\n", ctx.vars().getText(), ctx.type().getText());

        }
    }
    public void enterUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        if (metablitesHashMap.containsKey(ctx.ID().getText())){
            System.out.println("Η μεταβλητή '"+ctx.ID().getText()+ "' έχει δηλώθεί προηγουμένως ως "+ metablitesHashMap.get(ctx.ID().getText()).typosMetablitis);
            //System.exit(-1);
        }
        metablitesHashMap.put(ctx.ID().getText(), new Variable(ctx.ID().getText(), queue.getLast(), "",-1));
        //dilomenesVar.get(currentVarType.toLowerCase()).add(ctx.ID().getText());
        //System.out.println(ctx.ID().getText());

    }
    // p.x. a = 10
    public void enterAssignment(ErgasiaParser.AssignmentContext ctx) {
        String assignmentID =  ctx.variable().ID().getText();
        if (!metablitesHashMap.containsKey(assignmentID) && !builtInFunctions.contains(assignmentID.toUpperCase())){
            System.out.println("ΣΦΑΛΜΑ! "+assignmentID+" δεν έχει αρχικοποιήθει! ("+ctx.getText()+")");
            //printAndExit();
        }
        else {
            if (ctx.expression().simple_constant()!= null){
            if (ctx.expression().simple_constant().ICONST() != null) { // Βρήκα ανάθεση ICONST πχ. x = 10
                if (metablitesHashMap.get(assignmentID).typosMetablitis != typosVarENUM.typINTEGER) //Εαν ο τύπος τις ανάθεσης είναι διαφορετικός απο τον τύπο μεταβλητής
                    System.out.println("ΣΦΑΛΜΑ! Η παράμετρος " + assignmentID + " είναι τύπου integer αλλά προσπαθείς να αποθηκεύσεις κάτι άλλο");
            }

            if (ctx.expression().simple_constant().RCONST() != null) { // Βρήκα ανάθεση ICONST πχ. x = 10
                if (metablitesHashMap.get(assignmentID).typosMetablitis != typosVarENUM.typREAL) //Εαν ο τύπος τις ανάθεσης είναι διαφορετικός απο τον τύπο μεταβλητής
                    System.out.println("ΣΦΑΛΜΑ! Η παράμετρος " + assignmentID + " είναι τύπου real αλλά προσπαθείς να αποθηκεύσεις κάτι άλλο");
            }

            if (ctx.expression().simple_constant().CCONST() != null) { // Βρήκα ανάθεση ICONST πχ. x = 10
                if (metablitesHashMap.get(assignmentID).typosMetablitis != typosVarENUM.typCHARACTER) //Εαν ο τύπος τις ανάθεσης είναι διαφορετικός απο τον τύπο μεταβλητής
                    System.out.println("ΣΦΑΛΜΑ! Η παράμετρος " + assignmentID + " είναι τύπου character αλλά προσπαθείς να αποθηκεύσεις κάτι άλλο");
            }

            if (ctx.expression().simple_constant().LCONST() != null) { // Βρήκα ανάθεση ICONST πχ. x = 10
                if (metablitesHashMap.get(assignmentID).typosMetablitis != typosVarENUM.typLOGICAL) //Εαν ο τύπος τις ανάθεσης είναι διαφορετικός απο τον τύπο μεταβλητής
                    System.out.println("ΣΦΑΛΜΑ! Η παράμετρος " + assignmentID + " είναι τύπου logical αλλά προσπαθείς να αποθηκεύσεις κάτι άλλο");
            }}

        }
        //System.out.println("assigment " + assignmentID);
    }

    /*
    @Override public Integer visitUndef_variable(ErgasiaParser.Undef_variableContext ctx) {
        System.out.println("Type = " + ctx.parent.getParent().getText());
        System.out.println("ID = "+ctx.ID().getText());
        return 0;
    }

    @Override public Integer visitDeclarations(ErgasiaParser.DeclarationsContext ctx) {
        System.out.println("Init "+ctx.type().getText()+" var with name/s : ..."+ctx.vars().getText());
        return 0;
    }

     */
    void printAndExit(){
        System.out.println("Η διαδικασία σταμάταει...\nΈξοδος.");
        System.exit(-1);
    }
}
