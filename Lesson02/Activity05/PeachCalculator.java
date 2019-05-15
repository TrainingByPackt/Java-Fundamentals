import java.util.Scanner;

public class PeachCalculator {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter the number of peaches picked: ");
    int numberOfPeaches = sc.nextInt();
    int numberOfFullBoxes = numberOfPeaches / 20;
    int numberOfPeachesLeft = numberOfPeaches - numberOfFullBoxes * 20;
    System.out.printf("We have %d full boxes and %d peaches left.", numberOfFullBoxes, numberOfPeachesLeft);
  }

}
