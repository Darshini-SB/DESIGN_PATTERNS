package TEMPLATEMETHOD;

// Tea implementation of the template
public class Tea extends BeverageTemplate{
    public void brew()
    {
        System.out.println("steeping the tea");
    }

    public void addToppings()
    {
        System.out.println("adding lemon and honey");
    }
}
