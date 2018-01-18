package by.it.kozlov.calc;

abstract public class Var implements Operation {
    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException(String.format(" Сложение %s + %s невозможно.\n", this, other));
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException(String.format(" Вычитание %s + %s невозможно.\n", this, other));
    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException(String.format(" Умножение %s + %s невозможно.\n", this, other));
    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException(String.format(" Деление %s + %s невозможно.\n", this, other));
    }

    static Var createVar(String operand) {
        operand = operand.trim();
        if (operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        if (operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        return null;
    }
}
