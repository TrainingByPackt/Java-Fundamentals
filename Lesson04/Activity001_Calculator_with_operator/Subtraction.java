public class Subtraction extends Operator {

    public Subtraction() {
        super("-");
    }

    public double operate(double operand1, double operand2) {
        return operand1 - operand2;
    }

}