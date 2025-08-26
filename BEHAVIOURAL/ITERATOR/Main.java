package ITERATOR;

public class Main {
    public static void main(String[] args) {
        String[] books = {"design patterns", "refactoring", "dsa"};
        BookCollection bookCollection = new BookCollection(books);
        Iterator iterator = bookCollection.createIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next()); // Iterator pattern in action
        }
    }
}
