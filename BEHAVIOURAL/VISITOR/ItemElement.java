package VISITOR;

// Element interface in Visitor pattern
interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
