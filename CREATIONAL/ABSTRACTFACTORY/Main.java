public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.render();
        windowsCheckbox.check();

        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        macButton.render();
        macCheckbox.check();
    }
}
