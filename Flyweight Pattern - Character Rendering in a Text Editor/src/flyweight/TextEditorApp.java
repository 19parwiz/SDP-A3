package flyweight;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Inserting large amount of text
        textEditor.insertText("Hello Flyweight Pattern!", "Arial", 12);
        textEditor.insertText(" This is an example of memory efficiency.", "Arial", 12);
        textEditor.insertText(" The Flyweight Pattern helps in reducing memory usage.", "Arial", 12);

        // Render the entire document
        textEditor.render();
    }
}
