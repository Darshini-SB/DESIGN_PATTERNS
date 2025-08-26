package ITERATOR;

// Concrete collection implementation
public class BookCollection implements BookCollectionInterface{
    private String[] books;
    private int size;
    public BookCollection(String[] books)
    {
        this.books = books;
        this.size = books.length;
    }
    public int getSize()
    {
        return size;
    }

    public String getBookAtIndex(int index)
    {
        return books[index];
    }

    public Iterator createIterator()
    {
        return new BookIterator(this);
    }
}
