public class GenericSalesWithCommission extends GenericEmployee {
    private final double grossSales;

    public GenericSalesWithCommission(double grossSalary, double grossSales) {
        super(grossSalary);
        this.grossSales = grossSales;
    }

    public double getCommission() {
        return grossSales * 0.15;
    }

    @Override
    public double getTax() {
        return (19.0/100) * getGrossSalary();
    }

}
