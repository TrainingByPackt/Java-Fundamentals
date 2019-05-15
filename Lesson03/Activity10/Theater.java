import java.util.Scanner;

public class Theater {
  public static void main(String[] args) {
    int total = 10, request = 0, remaining = 10;
    while (remaining >= 0) {
      System.out.println("Enter the number of tickets");
      Scanner in = new Scanner(System.in);
      request = in.nextInt();
      if (request <= remaining) {
        System.out.println("Your " + request + " tickets have been procced. Please pay and enjoy the show.");
        remaining = remaining - request;
        request = 0;
      } else {
        System.out.println("Sorry your request could not be processed");
        break;
      }
    }
  }
}
