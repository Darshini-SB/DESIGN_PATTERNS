package VISITOR;

// Concrete element - Book
public class Book implements ItemElement{
    private String isbn;
    private int price;
    public Book(String isbn, int price)
    {
        this.isbn = isbn;
        this.price = price;
    }

    public String getIsbn()
    {
        return isbn;
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
