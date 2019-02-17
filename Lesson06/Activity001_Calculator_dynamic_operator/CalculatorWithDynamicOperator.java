public class CalculatorWithDynamicOperator {

    private static final Operator DEFAULT_OPERATOR = new Operator();
    private static final Operator [] OPERATORS = {
        new Division(),
        new Multiplication(),
        DEFAULT_OPERATOR,
        new Subtraction(),
    };

    private static Operator findOperator(String operator) {
        for (Operator possible : OPERATORS) {
            if (possible.matches(operator)) {
                return possible;
            }
        }

        return DEFAULT_OPERATOR;
    }

    public static void main (String [] args) {
        System.out.println("1 + 1 = " + new CalculatorWithDynamicOperator(1, 1, "+").operate());
        System.out.println("4 - 2 = " + new CalculatorWithDynamicOperator(4, 2, "-").operate());
        System.out.println("1 x 2 = " + new CalculatorWithDynamicOperator(1, 2, "x").operate());
        System.out.println("10 / 2 = " + new CalculatorWithDynamicOperator(10, 2, "/").operate());
    }

    private final double operand1;
    private final double operand2;

    // The current operator
    private final Operator operator;

    public CalculatorWithDynamicOperator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = findOperator(operator);
    }

    public double operate() {
        return operator.operate(operand1, operand2);
    }

}