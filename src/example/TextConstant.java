package example;

public class TextConstant implements Node {
    protected String value;

    public TextConstant(String text) {
        this.value = text;
    }

    public String toString() {
        return value;
    }
}
