package INTERPRETER;

// Non-terminal expression for addition
public class AdditionExpression implements Expression{
    private Expression left;
    private Expression right;

    public AdditionExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    public int interpret()
    {
        return left.interpret() + right.interpret();
    }
}
