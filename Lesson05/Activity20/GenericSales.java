public class GenericSales extends GenericEmployee {

  public GenericSales(double grossSalary) {
    super(grossSalary);
  }

  @Override
  public double getTax() {
    return (19.0 / 100) * getGrossSalary();
  }

}
