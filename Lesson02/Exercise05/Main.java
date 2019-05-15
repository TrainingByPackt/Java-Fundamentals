import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter a Number: ");
    int num1 = sc.nextInt();
    System.out.println("Entered value is: " + num1);
    float fl1 = num1;
    System.out.print("Entered value as a floating point variable is: " + fl1);
  }
}