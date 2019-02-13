public class UseInterfaces {

    public static void main(String[] args){
        System.out.println("--- Manager ---");
        Manager manager = new Manager();
        System.out.println("Net Salary: " + manager.getNetSalary());
        System.out.println("Tax: " + manager.getTax());

        System.out.println("--- Sales ---");
        Sales sales = new Sales();
        System.out.println("Net Salary: " + sales.getNetSalary());
        System.out.println("Tax: " + sales.getTax());

        System.out.println("--- Engineer ---");
        Engineer engineer = new Engineer();
        System.out.println("Net Salary: " + engineer.getNetSalary());
        System.out.println("Tax: " + engineer.getTax());
    }

}