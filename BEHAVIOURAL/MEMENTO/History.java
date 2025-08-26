package MEMENTO;
import java.util.Stack;

// Caretaker class that manages memento history
public class History {
    private final Stack<Memento> history = new Stack<>();
    public void saveState(Memento memento)
    {
        history.push(memento);
    }
    public Memento undo()
    {
        return history.isEmpty() ? null : history.pop();
    }
}
