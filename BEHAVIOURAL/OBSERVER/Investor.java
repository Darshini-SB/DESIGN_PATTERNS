package OBSERVER;

// Concrete observer implementation
public class Investor implements Observer{
    private String name;
    public Investor(String name)
    {
        this.name = name;
    }

    public void update(String stockName, double price)
    {
        System.out.println("NOTIFICATION TO: " + name + " stockName: " + stockName + " price: " + price);
    }
}
