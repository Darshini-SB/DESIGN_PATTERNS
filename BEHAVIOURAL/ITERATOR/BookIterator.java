package ITERATOR;

// Concrete iterator implementation
public class BookIterator implements Iterator{
    private BookCollection bookCollection;
    private int index;
    public BookIterator(BookCollection bookCollection)
    {
        this.bookCollection = bookCollection;
        this.index = 0;
    }

    public boolean hasNext()
    {
        return index < bookCollection.getSize();
    }

    public Object next()
    {
        return bookCollection.getBookAtIndex(index++);
    }
}
