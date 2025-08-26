package VISITOR;

public class Main {
    public static void main(String[] args) {
        ItemElement items[] = new ItemElement[]{
            new Book("123", 250),
            new Book("444", 100),
            new Electronics("sony", 600),
            new Electronics("samsung", 450)
        };
        ShoppingCartVisitor shoppingCart = new ShoppingCartImplementation();
        int total = 0;
        for(ItemElement item : items)
        {
            total += item.accept(shoppingCart); // Visitor pattern in action
        }
        System.out.println("total cost: " + total);
    }
}
