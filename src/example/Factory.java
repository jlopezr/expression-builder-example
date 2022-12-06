package example;

import parser.AbstractFactory;
import parser.AbstractNode;

public class Factory implements AbstractFactory {
    @Override
    public AbstractNode buildOperator(char op, AbstractNode left, AbstractNode right) {
        return new Operator(op, left, right);
    }

    @Override
    public AbstractNode buildFunction(String name, AbstractNode[] parameters) {
        return new FunctionCall(name, parameters);
    }

    @Override
    public AbstractNode buildNumberConstant(double number) {
        return new NumberConstant(number);
    }

    @Override
    public AbstractNode buildTextConstant(String text) {
        return new TextConstant(text);
    }

    @Override
    public AbstractNode buildCellReference(String reference) {
        return new CellReference(reference);
    }

    @Override
    public AbstractNode buildError(String detail) {
        return new Error(detail);
    }
}
