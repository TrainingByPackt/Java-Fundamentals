public class Engineer implements Employee {

    @Override
    public double getNetSalary() {
        return 90000 - getTax();
    }
 
    @Override
    public double getTax() {
        return (22.0/100) * 90000;
    }

}