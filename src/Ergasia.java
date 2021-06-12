import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ergasia {
    public static void main( String[] args) throws Exception
    {

        ErgasiaLexer lexer = new ErgasiaLexer( new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ErgasiaParser parser = new ErgasiaParser( tokens );
        ParseTree tree = parser.program();
        ergListener elekt = new ergListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        ergListener bstVst = new ergListener();

        //ErgasiaLexer.VOCABULARY.getSymbolicName()

        //walker.walk(bstVst, tree);
        //System.out.println("Symbol Table (Arrays)");

        //for (Metablites item :bstVst.metablitesHashMap.values())
            //System.out.println(item.ID + ", " + item.typosMetablitis);












        MetaglotistisC metaglotistisCObj = new MetaglotistisC();
        walker.walk(metaglotistisCObj, tree);
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Symbol Table - Variables");
        System.out.println("------------------------");

        for (LinkedList<Variable> scope : metaglotistisCObj.variablesHashMap.values())
            for (Variable item : scope)
                System.out.println(item);

        System.out.println("Symbol Table - Functions");
        for (Function functionObj: metaglotistisCObj.functionsHashMap.values())
                System.out.println(functionObj);

        System.out.println("---");

        for (Function key : metaglotistisCObj.entoles.keySet()){
            System.out.println(key.name + "{");
            for (String strItem : metaglotistisCObj.entoles.get(key))
                System.out.println("\t" + strItem + ";");
            System.out.println("}");
        }


        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(elekt, tree );

        /*
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new ErgasiaWalker(), tree );

        List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
        String prettyTree = TreeUtils.toPrettyTree(tree, ruleNamesList);
        //System.out.println(prettyTree);
        */


    }
}