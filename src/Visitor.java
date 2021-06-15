import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Visitor extends ErgasiaBaseVisitor<String>{
    static LinkedList<Variable> variablesLinkedList;

    public Visitor(LinkedList<Variable> variablesLinkedList) {
        Visitor.variablesLinkedList = variablesLinkedList;
    }

    @Override
    public String visitIf_statement(ErgasiaParser.If_statementContext ctx) {
        //System.out.println(visit(ctx.expression()));
        return "if ("+visit(ctx.expression()) + ")"+" "+visit(ctx.simple_statement()) + ';';
        //return super.visitIf_statement(ctx);
    }

    @Override
    public String visitVariable(ErgasiaParser.VariableContext ctx) {
        if (ctx.LPAREN() != null) {// Function or array access because the variable contains a '('
            if (genTools.findObjByProperty(variablesLinkedList, ctx.ID().getText()) != null)
                return ctx.ID().getText()+genTools.array2CLike(ctx.expressions().getText());
        }
        return ctx.getText();
        //return super.visitVariable(ctx);
    }


    @Override
    public String visitAssignment(ErgasiaParser.AssignmentContext ctx) {

        if (Visitor.variablesLinkedList.getLast().scope.name.equals(ctx.variable().getText())) // Return
            return ("return " + visit(ctx.expression()));
        return (visit(ctx.variable()) + " = " + visit(ctx.expression()));
    }

    @Override
    public String visitExpression(ErgasiaParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1){
            if (ctx.simple_constant() != null) {
                return ctx.simple_constant().getText(); // TODO EDO THELEI CHECK GIA TON TYPO SIMPLE CONSTATNT px COMPLEX
            }
            if (ctx.variable() != null)
                return visit(ctx.variable());
        }
        if (ctx.getChildCount() == 3){
            if (ctx.POWEROP() != null){
                return "(int) power("+visit(ctx.getChild(0))+","+visit(ctx.getChild(2))+")";
            }
            if (ctx.LPAREN() != null && ctx.RPAREN() != null)
                return ("(" + visit(ctx.getChild(1))+ ")");
            return (visit(ctx.getChild(0)))+ genTools.logicSingle2Clike(ctx.getChild(1).getText()) + (visit(ctx.getChild(2)));
        }
        return "ERROR!";
    }
}
