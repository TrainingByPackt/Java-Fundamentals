import java.util.Scanner;

public class Adder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0;
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter a whole number: ");
      boolean isValid = false;
      while (!isValid) {
        if (input.hasNext()) {
          String line = input.nextLine();
          try {
            int newVal = Integer.parseInt(line);
            isValid = true;
            total += newVal;
          } catch (NumberFormatException e) {
            System.out.println("Please provide a valid whole number");
          }
        }
      }
    }
    System.out.println("Total is " + total);
  }
}