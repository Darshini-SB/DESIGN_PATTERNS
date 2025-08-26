package INTERPRETER;

public class Main {
    public static void main(String[] args) {
        Expression number1 = new NumberExpression(10);
        Expression number2 = new NumberExpression(3);
        Expression number3 = new NumberExpression(2);

        Expression sum = new AdditionExpression(number1, number2);
        Expression result = new SubtractionExpression(sum, number3);

        System.out.println("Expression result: " + result.interpret()); // Interpreter pattern in action
    }
}
