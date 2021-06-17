import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;


import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

public class Ergasia {
    public static void main( String[] args) throws Exception
    {

//        //ErgasiaLexer lexer = new ErgasiaLexer( new ANTLRFileStream(args[0]));
//        ErgasiaLexer lexer = new ErgasiaLexer(new ANTLRInputStream("if (x.gt.0.(.and.x.lt.a(i))) y(i) = i**x"));
//        ErgasiaParser parser = new ErgasiaParser(new CommonTokenStream(lexer));
//        Object result = new Visitor(null).visit(parser.if_statement());
//        System.out.println(result);



        ErgasiaLexer lexer = new ErgasiaLexer( new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ErgasiaParser parser = new ErgasiaParser( tokens );
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

        MetaglotistisC metaglotistisCObj = new MetaglotistisC();

        walker.walk(metaglotistisCObj, tree);
        // GUI Section
        JFrame frame = new JFrame("Simple Fortran - Syntax Tree - Semantic Analysis");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setTextColor(Color.DARK_GRAY);
        viewer.setScale(1.5);

        //mainPanel.setForeground(new Color(58, 149, 14));

        p1.add(viewer);
        JTextArea textArea = new JTextArea("------------------------\n");

        textArea.setFont(new Font("Courier New", Font.PLAIN, 20));

        textArea.setEditable(false);
        p2.setBorder(new TitledBorder( new EtchedBorder(), "Πίνακας Συμβόλων" ));
        p2.setLayout(new BorderLayout());
        JScrollPane scroll = new JScrollPane(textArea);

        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p1.setBackground(Color.WHITE);
        p2.add(scroll);
        //p2.setBackground(Color.RED);
        //p2.setSize(new Dimension(500,100));

        //mainPanel.add(p1);


        JScrollPane jScrollPane = new JScrollPane(p1);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        //p2.setSize(textArea.getMinimumSize());
        //jScrollPane.setMinimumSize(new Dimension(500,10));
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jScrollPane, p2);
        splitPane.setOneTouchExpandable(true);
        splitPane.setResizeWeight(0.8);
        //splitPane.setDividerLocation(500);

        mainPanel.add(splitPane);

        frame.add(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(250,250));
        frame.setVisible(true);
        frame.toFront();
        frame.toFront();


        //ErgasiaLexer.VOCABULARY.getSymbolicName()

        //walker.walk(bstVst, tree);
        //System.out.println("Symbol Table (Arrays)");

        //for (Metablites item :bstVst.metablitesHashMap.values())
            //System.out.println(item.ID + ", " + item.typosMetablitis);

//

        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println(genTools.ANSI_RED +"Symbol Table - Variables" + genTools.ANSI_RESET);
        System.out.println("------------------------");

        for (LinkedHashMap<String,Variable> scope : metaglotistisCObj.variablesHashMap.values())
            for (Variable item : scope.values()){
                System.out.println(item);
                System.out.println();
            }

        System.out.println(genTools.ANSI_RED  + "Symbol Table - Functions" + genTools.ANSI_RESET);
        for (Function functionObj: metaglotistisCObj.functionsHashMap.values()){
                System.out.println(functionObj);
                System.out.println();
        }


//
//        String ANSI_RESET = "\u001B[0m";
//
//        String ANSI_RED = "\u001B[31m";
//
//
//        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
//
//        System.out.println(genTools.logicalExpr2CLike("if (x.gt.0..and.x.lt.a(i)) y(i) = i**x"));
//
//        System.out.println("---");
//        System.out.println("#include <stdio.h>      /* Standard Library of Input and Output */");
//        System.out.println("#include <complex.h>    /* Standard Library of Complex Numbers */");
//
//        for (Function key : metaglotistisCObj.entoles.keySet()) {// Add functions to header
//            StringBuilder cLikeArguments = new StringBuilder();
//            for (int i = 0; i<key.functionArguments.size() ;i++) {
//
//                Variable argFuncVarObj = key.functionArguments.get(i);
//                cLikeArguments.append(genTools.enum2CLike(argFuncVarObj.typosMetablitis));
//                cLikeArguments.append(' ');
//                cLikeArguments.append(argFuncVarObj.ID);
//                if (argFuncVarObj.isArray())
//                    cLikeArguments.append("[]");
//                if (i!= key.functionArguments.size()-1)
//                    cLikeArguments.append(", ");
//            }
//            //for (Variable arg: key.functionArguments)
//
//            //Function inside body commands
//            System.out.print(genTools.enum2CLike(key.returnType)+" "+key.name + "(" + cLikeArguments +");\n");
//        }
//
//        for (Function key : metaglotistisCObj.entoles.keySet()){ // Printing entoles
//            // Function declaration section
//            StringBuilder cLikeArguments = new StringBuilder();
//            for (int i = 0; i<key.functionArguments.size() ;i++) {
//
//                Variable argFuncVarObj = key.functionArguments.get(i);
//                cLikeArguments.append(genTools.enum2CLike(argFuncVarObj.typosMetablitis));
//                cLikeArguments.append(' ');
//                cLikeArguments.append(argFuncVarObj.ID);
//                if (argFuncVarObj.isArray())
//                    cLikeArguments.append("[]");
//                if (i!= key.functionArguments.size()-1)
//                    cLikeArguments.append(", ");
//            }
//            //for (Variable arg: key.functionArguments)
//
//            //Function inside body commands
//            System.out.print(genTools.enum2CLike(key.returnType)+" "+key.name + "(" + cLikeArguments +") {\n");
//            for (StringBuilder strItem : metaglotistisCObj.entoles.get(key))
//                System.out.println("\t" + strItem);
//            System.out.println("}");
//        }

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
