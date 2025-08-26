package VISITOR;

// Concrete visitor implementation with discount logic
public class ShoppingCartImplementation implements ShoppingCartVisitor{
    public int visit(Book book)
    {
        int cost = book.getPrice();
        if(cost > 200)
        {
            cost -= 50; // Discount for expensive books
        }
        System.out.println("book: " + book.getIsbn() + " price: " + cost);
        return cost;
    }

    public int visit(Electronics electronics)
    {
        int cost = electronics.getPrice();
        if(cost > 500)
        {
            cost -= 100; // Discount for expensive electronics
        }
        System.out.println("electronics brand: " + electronics.getBrand() + " price: " + cost);
        return cost;
    }
}
