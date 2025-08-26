package FLYWEIGHT;

public class Main {
    public static void main(String[] args) {
        TextCharacter char1 = CharacterFactory.getChar('A');
        TextCharacter char2 = CharacterFactory.getChar('B');
        TextCharacter char3 = CharacterFactory.getChar('B'); // Same character, reused

        char1.display("red", 20, "calibri");
        char2.display("blue", 15, "italic");
        char3.display("black", 21, "ariel");
    }
}
