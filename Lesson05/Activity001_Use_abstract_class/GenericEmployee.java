public abstract class GenericEmployee implements Employee {

    private final double grossSalary;

    public GenericEmployee(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    @Override
    public double getNetSalary() {
        return grossSalary - getTax();
    }

}
