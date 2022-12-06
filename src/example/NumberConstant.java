package example;

public class NumberConstant implements Node {
    protected double value;

    public NumberConstant(double n) {
        value = n;
    }

    public String toString() {
        return ""+value;
    }
}
