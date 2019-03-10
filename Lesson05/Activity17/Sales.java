public class Sales implements Employee {

    @Override
    public double getNetSalary() {
        return 75000 - getTax();
    }
 
    @Override
    public double getTax() {
        return (19.0/100) * 75000;
    }

}
