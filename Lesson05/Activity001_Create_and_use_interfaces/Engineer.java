public class Engineer implements Employee {

    @Override
    public double getNetSalary() {
        return 9000 - getTax();
    }
 
    @Override
    public double getTax() {
        return (22.0/100) * 9000;
    }

}