public class Division extends Operator {

    public Division() {
        super("/");
    }

    @Override
    public double operate(double operand1, double operand2) {
        return operand1 / operand2;
    }

}
