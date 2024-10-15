package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characterMap = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + "_" + font + "_" + size;
        if (!characterMap.containsKey(key)) {
            characterMap.put(key, new Character(value, font, size));
        }
        return characterMap.get(key);
    }
}
