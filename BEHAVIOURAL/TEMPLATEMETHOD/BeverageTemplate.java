package TEMPLATEMETHOD;

// Abstract template class defining the algorithm structure
abstract class BeverageTemplate {
    public final void prepare()
    {
        boil();
        brew();
        pourInCup();
        if(addCondiments())
        {
            addToppings();
        }
        System.out.println("beverage is ready");
    }

    public void boil()
    {
        System.out.println("boiling the water..");
    }

    public void pourInCup()
    {
        System.out.println("pouring in the cup..");
    }

    public boolean addCondiments()
    {
        return true;
    }

    protected abstract void brew();
    protected abstract void addToppings();
}
