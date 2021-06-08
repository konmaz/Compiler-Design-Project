import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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

        walker.walk(bstVst, tree);

        System.out.println("Array of Variables");

        for (Metablites item :bstVst.metablitesHashMap.values())
            System.out.println(item.ID + ", " + item.typosMetablitis);
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