public class Manager implements Employee {
    @Override
    public double getNetSalary() {
        return 100000 - getTax();
    }
    @Override
    public double getTax() {
        return (28.0/100) * 100000;
    }
 }
 