public class Main {
    public static void main(String[] args) {
        Text plainText = new PlainText("hello world");
        Text boldText = new BoldText(plainText);
        Text italicText = new ItalicText(boldText);
        Text underlinedText = new Underline(italicText);

        System.out.println("plaintext:" + plainText.style());
        System.out.println("boldtext:" + boldText.style());
        System.out.println("italictext:" + italicText.style());
        System.out.println("underlined text:" + underlinedText.style()); // Multiple decorators applied
    }
}
