package TEMPLATEMETHOD;

// Black coffee implementation (no condiments)
public class BlackCoffee extends BeverageTemplate{
    public void brew()
    {
        System.out.println("dripping black coffee");
    }

    public void addToppings()
    {
        System.out.println("no topping needed");
    }

    public boolean addCondiments()
    {
        return false; // Override to skip condiments
    }
}
