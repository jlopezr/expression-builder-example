package impl;

import example.Factory;
import example.Operator;
import parser.AbstractFactory;
import parser.AbstractNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parser.ExpressionBuilder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionBuilderTest {

    AbstractFactory factory;
    ExpressionBuilder builder;

    @BeforeEach
    void doSetup() {
        factory = new Factory();
        builder = new ExpressionBuilder(factory);
    }

    @Test
    void buildExpression1() {
        builder.buildExpression("1+2");
        AbstractNode expression = builder.getExpression();
        List<String> references = builder.getCellReferences();

        assertEquals(0, references.size());
        assertEquals("OP: +", expression.toString());
        Operator op = (Operator)expression;
        assertEquals("1.0", op.getLeft().toString());
        assertEquals("2.0", op.getRight().toString());
    }

    @Test
    void buildExpression2() {
        builder.buildExpression("A1*B2+C3");
        AbstractNode expression = builder.getExpression();
        List<String> references = builder.getCellReferences();

        assertEquals(3, references.size());
        assertEquals("C3", references.get(0));
        assertEquals("B2", references.get(1));
        assertEquals("A1", references.get(2));

        assertEquals("OP: +", expression.toString());
        Operator op = (Operator)expression;
        assertEquals("OP: *", op.getLeft().toString());
        assertEquals("Cell: C3", op.getRight().toString());
        op = (Operator)op.getLeft();
        assertEquals("Cell: A1", op.getLeft().toString());
        assertEquals("Cell: B2", op.getRight().toString());
    }
}