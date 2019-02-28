public class ShowSalaryAndCommission {

    public static void main (String [] args) {
        for (int i = 0; i < 10; i++) {
            Employee employee = EmployeeLoader.getEmployee();
            System.out.println("--- " + employee.getClass().getName());

            System.out.println("Net Salary: " + employee.getNetSalary());
            System.out.println("Tax: " + employee.getTax());

            if (employee instanceof SalesWithCommission) {
                // Cast to sales with commission
                SalesWithCommission sales = (SalesWithCommission) employee;
                System.out.println("Commission: " + sales.getCommission());
            }
        }
    }
}
