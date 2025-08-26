package TEMPLATEMETHOD;

// Coffee implementation of the template
public class Coffee extends BeverageTemplate{
    public void brew()
    {
        System.out.println("dripping coffee through filter");
    }
    public void addToppings()
    {
        System.out.println("adding milk and sugar");
    }
}
