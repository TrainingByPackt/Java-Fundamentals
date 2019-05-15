public class SalesWithCommission extends Sales implements Employee {

  private final double grossSales;

  public SalesWithCommission(double grossSales) {
    this.grossSales = grossSales;
  }

  public double getCommission() {
    return grossSales * 0.15;
  }
}
