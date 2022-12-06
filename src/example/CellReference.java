package example;

public class CellReference implements Node {
    protected String reference;

    public CellReference(String text) {
        this.reference = text;
    }

    public String toString() {
        return "Cell: "+ reference;
    }
}
