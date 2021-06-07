import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Ergasia {
    public static void main( String[] args) throws Exception
    {


        ErgasiaLexer lexer = new ErgasiaLexer( new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ErgasiaParser parser = new ErgasiaParser( tokens );
        ParseTree tree = parser.program();
        ergListenerBaseVst elekt = new ergListenerBaseVst();
        ParseTreeWalker walker = new ParseTreeWalker();
        ergListenerBaseVst bstVst = new ergListenerBaseVst();
        walker.walk(bstVst, tree);

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