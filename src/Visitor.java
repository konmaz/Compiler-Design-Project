public class Visitor extends ErgasiaBaseVisitor<String>{

    @Override
    public String visitIf_statement(ErgasiaParser.If_statementContext ctx) {
        //System.out.println(visit(ctx.expression()));
        return "if ("+visit(ctx.expression()) + ")";
        //return super.visitIf_statement(ctx);
    }

    @Override
    public String visitVariable(ErgasiaParser.VariableContext ctx) {
        if (ctx.LPAREN() != null) {// Function or array access because the variable contains a '('
            return ctx.ID().getText()+genTools.array2CLike(ctx.expressions().getText());
        }
        return ctx.getText();
        //return super.visitVariable(ctx);
    }

    @Override
    public String visitExpression(ErgasiaParser.ExpressionContext ctx) {

        if (ctx.simple_constant() != null) {
            return ctx.simple_constant().getText(); // TODO EDO THELEI CHECK GIA TON TYPO SIMPLE CONSTATNT px COMPLEX
        }
        if (ctx.variable() != null)
            return visit(ctx.variable());
        if (ctx.getChildCount() == 3)
            return (visit(ctx.getChild(0)))+ genTools.logicSingle2Clike(ctx.getChild(1).getText()) + (visit(ctx.getChild(2)));
        return ctx.getText();
    }
}
