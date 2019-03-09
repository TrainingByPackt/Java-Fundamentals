import java.util.Random;

public class Employee {
    private static Random random = new Random(15);

    public static Employee getEmployeeWithSalary() {
        int nextNumber = random.nextInt(4);

        // Random salary between 70,000 and 70,000 + 50,000
        double grossSalary = random.nextDouble() * 50000 + 70000;
        switch (nextNumber) {
        case 0:
            // A sales person with total sales between 5000 and 1550000
            double grossSales = random.nextDouble() * 150000 + 5000;
            return new GenericSalesWithCommission(grossSalary, grossSales);
        case 1:
            return new GenericManager(grossSalary);
        case 2:
            return new GenericEngineer(grossSalary);
        case 3:
            return new GenericSales(grossSalary);
        default:
            return new GenericManager(grossSalary);
        }
    }

}