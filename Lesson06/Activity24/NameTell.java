import java.util.Scanner;

public class NameTell {
  public static void main(String[] args) {
    System.out.print("Enter your name:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int num = name.length();
    char c = name.charAt(0);
    System.out.println("\n Your name has " + num + " letters including spaces.");
    System.out.println("\n The first letter is: " + c);
  }
}
