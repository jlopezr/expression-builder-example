package example;

import parser.AbstractNode;

public class Operator implements Node {
    protected char op;
    private AbstractNode left;
    private AbstractNode right;

    public Operator(char op, AbstractNode left, AbstractNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "OP: "+op;
    }

    public AbstractNode getLeft() {
        return left;
    }

    public AbstractNode getRight() {
        return right;
    }
}
