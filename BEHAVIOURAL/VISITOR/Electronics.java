package VISITOR;

// Concrete element - Electronics
public class Electronics implements ItemElement{
    private String brand;
    private int price;
    public Electronics(String brand, int price)
    {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public int getPrice()
    {
        return price;
    }

    public int accept(ShoppingCartVisitor visitor)
    {
        return visitor.visit(this);
    }
}
