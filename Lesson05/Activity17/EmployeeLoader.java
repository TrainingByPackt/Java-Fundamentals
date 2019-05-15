import java.util.Random;

public class EmployeeLoader {
  private static Random random = new Random(15);

  public static Employee getEmployee() {
    int nextNumber = random.nextInt(4);
    switch (nextNumber) {
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
}