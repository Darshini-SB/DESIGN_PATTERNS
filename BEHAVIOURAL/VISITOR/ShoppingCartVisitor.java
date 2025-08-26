package VISITOR;

// Visitor interface for shopping cart operations
interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Electronics electronics);
}
