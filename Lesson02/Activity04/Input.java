import java.util.Scanner;
{
public class Input{
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
{
System.out.print("Enter student name: ");
String name = sc.nextLine();
System.out.print("Enter Name of the University: ");
String uni = sc.nextLine();
System.out.print("Enter Age: ");
int age = sc.nextInt();
System.out.println("Here is your ID");
System.out.println("*********************************");
System.out.println("Name: " + name);
System.out.println("University: " + uni);
System.out.println("Age: " + age);
System.out.println("*********************************");
    }
}
}