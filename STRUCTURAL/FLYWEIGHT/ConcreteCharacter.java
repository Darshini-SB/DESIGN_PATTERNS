package FLYWEIGHT;

// Concrete flyweight implementation
public class ConcreteCharacter implements TextCharacter{
    private char symbol;
    public ConcreteCharacter(char symbol)
    {
        this.symbol = symbol;
    }
    public void display(String color, int size, String font)
    {
        System.out.println("character: " + symbol + " color: " + color + " size: " + size + " font: " + font);
    }
}
