public class Division extends Operator {

    public Division() {
        super("/");
    }

    public double operate(double operand1, double operand2) {
        return operand1 / operand2;
    }

}