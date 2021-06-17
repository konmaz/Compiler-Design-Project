import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
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


        String sourceCodeStr = new String(Files.readAllBytes(Paths.get(args[0])));

        ErgasiaLexer lexer = new ErgasiaLexer(new ANTLRInputStream(sourceCodeStr)) ;
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        ErgasiaParser parser = new ErgasiaParser( tokens );
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

        MetaglotistisC metaglotistisCObj = new MetaglotistisC();

        walker.walk(metaglotistisCObj, tree);



        //ErgasiaLexer.VOCABULARY.getSymbolicName()

        //walker.walk(bstVst, tree);
        //System.out.println("Symbol Table (Arrays)");

        //for (Metablites item :bstVst.metablitesHashMap.values())
            //System.out.println(item.ID + ", " + item.typosMetablitis);

//
        StringBuilder textToAdd= new StringBuilder();
        if (metaglotistisCObj.errorList.size() != 0) {
            textToAdd.append("--------------------------------------\n");
            textToAdd.append("\tErrors\n");
            textToAdd.append("--------------------------------------\n");
            for (String item : metaglotistisCObj.errorList){
                textToAdd.append(item);
                textToAdd.append('\n');
            }
            textToAdd.append("\n");
        }
        textToAdd.append("--------------------------------------\n");
        textToAdd.append("\tSymbol Table - Variables\n");
        textToAdd.append("--------------------------------------\n");

        for (LinkedHashMap<String,Variable> scope : metaglotistisCObj.variablesHashMap.values())
            for (Variable item : scope.values()){
                textToAdd.append(item.toString());
                textToAdd.append("\n\n");
            }
        textToAdd.append("\n\n");
        textToAdd.append("--------------------------------------\n");
        textToAdd.append("\tSymbol Table - Functions\n");
        textToAdd.append("--------------------------------------\n");
        for (Function functionObj: metaglotistisCObj.functionsHashMap.values()){
            textToAdd.append(functionObj.toString());
            textToAdd.append("\n\n");
        }





        // GUI Section
        JFrame frame = new JFrame("Simple Fortran - Syntax Tree ");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));


        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setTextColor(Color.DARK_GRAY);
        viewer.setScale(1.5);

        //mainPanel.setForeground(new Color(58, 149, 14));

        //p1.add(viewer);
        p1.setBorder(new TitledBorder( new EtchedBorder(), "Συντακτικό Δέντρο" ));
        p1.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(String.valueOf(textToAdd));

        textArea.setFont(new Font("Courier New", Font.PLAIN, 20));

        textArea.setEditable(false);
        p2.setBorder(new TitledBorder( new EtchedBorder(), "Πίνακας Συμβόλων" ));
        p2.setLayout(new BorderLayout());
        p3.setBorder(new TitledBorder( new EtchedBorder(), "Πηγαίος Κώδικας" ));
        p3.setLayout(new BorderLayout());

        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JTextArea sourceText = new JTextArea(sourceCodeStr);

        sourceText.setFont(new Font("Courier New", Font.PLAIN, 20));
        sourceText.setEditable(false);

        JScrollPane scrollSource = new JScrollPane(sourceText);
        scrollSource.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollSource.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p1.setBackground(Color.WHITE);

        JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,p2, p3);
        splitPane2.setResizeWeight(0.7);

        p2.add(scroll);
        p3.add(scrollSource);


        JScrollPane jScrollPane = new JScrollPane(viewer);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p1.add(jScrollPane);



        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1, splitPane2);
        splitPane.setResizeWeight(0.7);

        mainPanel.add(splitPane);

        frame.add(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(250,250));
        frame.setVisible(true);
        frame.toFront();
        frame.toFront();

        /*
        List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
        String prettyTree = TreeUtils.toPrettyTree(tree, ruleNamesList);
        //System.out.println(prettyTree);
        */


    }
}
