package TEMPLATEMETHOD;

public class Main {
    public static void main(String[] args) {
        System.out.println("preparing tea");
        BeverageTemplate tea = new Tea();
        tea.prepare();

        System.out.println("preparing coffee");
        BeverageTemplate coffee = new Coffee();
        coffee.prepare();

        System.out.println("preparing black coffee");
        BeverageTemplate blackCoffee = new BlackCoffee();
        blackCoffee.prepare(); // Template method in action
    }
}
