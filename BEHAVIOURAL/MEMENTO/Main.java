package MEMENTO;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.setContent("hello world!");
        history.saveState(textEditor.save());
        System.out.println("current content: " + textEditor.getContent());

        textEditor.setContent("hello everyone!");
        history.saveState(textEditor.save());
        System.out.println("current content: " + textEditor.getContent());

        textEditor.restore(history.undo());
        System.out.println("after undo: " + textEditor.getContent());

        textEditor.restore(history.undo());
        System.out.println("after undo: " + textEditor.getContent()); // Memento pattern in action
    }
}
