import java.util.Random;

/* Sample data source, normally this would come from a database or some data file.
 */
public class EmployeeLoader {

    // Pseudo-random generator will give random results but consistent, as long as
    // the seed is the same. Change the seed to generate different results.
    private static Random random = new Random(15);

    /**
     * Returns an employee from the "database".
     */
    public static Employee getEmployee() {
        int nextNumber = random.nextInt(4);
        switch(nextNumber) {
            case 0:
                // A sales person with total sales between 5000 and 1550000
                return new SalesWithCommission(random.nextDouble() * 150000 + 5000);
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

}