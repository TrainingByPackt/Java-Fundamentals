public class SalesWithCommission extends Sales implements Employee {

    private final double totalSales;

    public SalesWithCommission(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommission() {
        return totalSales * 0.15;
    }

}