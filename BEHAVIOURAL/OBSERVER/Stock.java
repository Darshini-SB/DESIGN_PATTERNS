package OBSERVER;
import java.util.ArrayList;
import java.util.List;

// Concrete subject implementation
public class Stock implements Subject{
    private String stockName;
    private double price;
    private List<Observer> observers;
    
    public Stock(String stockName, double price)
    {
        this.stockName = stockName;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void setPrice(double price)
    {
        this.price = price;
        notifyObserver();
    }

    public double getPrice()
    {
        return price;
    }

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObserver()
    {
        for(Observer observer : observers)
        {
            observer.update(stockName, price);
        }
    }
}
