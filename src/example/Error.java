package example;

public class Error implements Node {
    protected String detail;

    public Error(String detail) {
        this.detail = detail;
    }

    public String toString() {
        return "ERROR: "+ detail;
    }
}
