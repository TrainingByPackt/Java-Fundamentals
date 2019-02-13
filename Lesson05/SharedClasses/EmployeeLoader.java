import java.util.Random;

/* Sample data source, normally this would come from a database or some data file.
 */
public class EmployeeLoader {

    // Pseudo-random generator will give random results but consistent, as long as
    // the seed is the same. Change the seed to generate different results.
    private static Random random = new Random(15);

    /**
     * Generates a new randomly picked employee.
     */
    public static Employee getEmployee() {
        int nextNumber = random.nextInt(4);
        switch(nextNumber) {
            case 0:
                // A sales person with total sales between 5000 and 1550000
                double grossSales = random.nextDouble() * 150000 + 5000;
                return new SalesWithCommission(grossSales);
            case 1:
                return new Manager();
            case 2:
                return new Engineer();
            case 3:
                return new Sales();
            default:
                return new Manager();
        }
    }

    /**
     * Generates a new randomly generated employee with a randomly picked
     * gross salary.
     */
    public static Employee getEmployeeWithSalary() {
        int nextNumber = random.nextInt(4);

        // Random salary between 70,000 and 70,000 + 50,000
        double grossSalary = random.nextDouble() * 50000 + 70000;
        switch(nextNumber) {
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