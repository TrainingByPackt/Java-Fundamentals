public class Manager implements Employee {
    @Override
    public double getNetSalary() {
        return 10000 - getTax();
    }
    @Override
    public double getTax() {
        return (28.0/100) * 10000;
    }
 }
 