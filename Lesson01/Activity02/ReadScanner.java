import java.util.Scanner;
public class ReadScanner {

	static Scanner sc = new Scanner(System.in);
  
	public static void main(String[] args) {
    		System.out.print("Enter a number: ");
    		int a = sc.nextInt();
    		System.out.print("Enter 2nd number: ");
    		int b = sc.nextInt();
    		System.out.println("The sum is " + (a + b) + ".");

	}
}
