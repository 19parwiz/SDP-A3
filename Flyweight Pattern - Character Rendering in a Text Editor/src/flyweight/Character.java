package flyweight;

public class Character {
    private char value;  // Intrinsic state
    private String font; // Intrinsic state
    private int size;    // Intrinsic state

    public Character(char value, String font, int size) {
        this.value = value;
        this.font = font;
        this.size = size;
    }

    public char getValue() {
        return value;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    // Method to render the character at a specific position
    public void render(int position) {
        System.out.println("Rendering character '" + value + "' in font '" + font + "' at size " + size + " at position " + position);
    }
}
