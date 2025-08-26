package FLYWEIGHT;
import java.util.HashMap;
import java.util.Map;

// Flyweight factory for creating and caching characters
public class CharacterFactory {
    private static final Map<Character, TextCharacter> characterMap = new HashMap<>();
    public static TextCharacter getChar(char symbol)
    {
        characterMap.putIfAbsent(symbol, new ConcreteCharacter(symbol));
        return characterMap.get(symbol);
    }
}
