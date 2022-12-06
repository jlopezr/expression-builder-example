package example;

import parser.AbstractFactory;
import parser.AbstractNode;
import parser.ExpressionBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Expression: 1+2");

        AbstractFactory factory;
        ExpressionBuilder builder;

        factory = new Factory();
        builder = new ExpressionBuilder(factory);

        builder.buildExpression("1+2");

        // Returns the expression
        AbstractNode expression = builder.getExpression();

        // Returns the list of cell references... in the case empty
        List<String> references = builder.getCellReferences();

        System.out.println("Done!");
    }
}
