package OBSERVER;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("apple", 100.0);
        Observer observer1 = new Investor("alice");
        Observer observer2 = new Investor("bob"); 
        Observer observer3 = new Investor("john");
        
        stock.addObserver(observer1);
        stock.addObserver(observer2);
        stock.addObserver(observer3);
        
        System.out.println("updating stock price..");
        stock.setPrice(20.0);

        stock.removeObserver(observer2);
        System.out.println("updating stock price again..");
        stock.setPrice(44.0); // Observer pattern in action
    }
}
