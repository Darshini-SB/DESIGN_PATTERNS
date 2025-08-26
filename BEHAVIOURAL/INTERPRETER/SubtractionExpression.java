package INTERPRETER;

// Non-terminal expression for subtraction
public class SubtractionExpression implements Expression{
    private Expression left;
    private Expression right;

    public SubtractionExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    public int interpret()
    {
        return left.interpret() - right.interpret();
    }
}
