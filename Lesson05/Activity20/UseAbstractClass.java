public class UseAbstractClass {

    public static void main (String [] args) {
        for (int i = 0; i < 10; i++) {
            Employee employee = EmployeeLoader.getEmployeeWithSalary();
            System.out.println("--- " + employee.getClass().getName());

            System.out.println("Net Salary: " + employee.getNetSalary());
            System.out.println("Tax: " + employee.getTax());

            if (employee instanceof GenericSalesWithCommission) {
                // Cast to sales with commission
                GenericSalesWithCommission sales = (GenericSalesWithCommission) employee;
                System.out.println("Commission: " + sales.getCommission());
            }
        }
    }

}
