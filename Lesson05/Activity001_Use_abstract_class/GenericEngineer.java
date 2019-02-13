public class GenericEngineer extends GenericEmployee {

    public GenericEngineer(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public double getTax() {
        return (22.0/100) * getGrossSalary();
    }

}