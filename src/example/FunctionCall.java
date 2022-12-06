package example;

import parser.AbstractNode;

public class FunctionCall implements Node {
    protected String name;
    protected AbstractNode[] parameters;

    public FunctionCall(String name, AbstractNode[] parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public String toString() {
        return "FUNCTION: "+name;
    }
}
