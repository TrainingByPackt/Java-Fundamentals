import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printOptions();
            String option = scanner.next();

            if (option.equalsIgnoreCase("Q")) {
                break;
            }
            System.out.print("Type first operand: ");
            double operand1 = scanner.nextDouble();

            System.out.print("Type second operand: ");
            double operand2 = scanner.nextDouble();
            Operator operator = Operators.findOperator(option);
            double result = operator.operate(operand1, operand2);
            System.out.printf("%f %s %f = %f\n", operand1, operator.operator, operand2, result);
            System.out.println();
        }
    }

    private static void printOptions() {
        System.out.println("Q (or q) - To quit");
        System.out.println("An operator. If not supported, will use sum.");
        System.out.print("Type your option: ");
    }
}
