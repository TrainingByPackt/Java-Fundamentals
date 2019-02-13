public class GenericManager extends GenericEmployee {

    public GenericManager(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public double getTax() {
        return (28.0/100) * getGrossSalary();
    }

}
