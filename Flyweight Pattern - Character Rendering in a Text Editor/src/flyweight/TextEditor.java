package flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private CharacterFactory characterFactory;
    private List<Character> document; // List to hold rendered characters

    public TextEditor() {
        characterFactory = new CharacterFactory();
        document = new ArrayList<>();
    }

    // Method to insert text with specified font and size
    public void insertText(String text, String font, int size) {
        for (char ch : text.toCharArray()) {
            Character character = characterFactory.getCharacter(ch, font, size);
            document.add(character);
        }
    }

    // Method to render the entire document
    public void render() {
        for (int i = 0; i < document.size(); i++) {
            document.get(i).render(i);
        }
    }
}
