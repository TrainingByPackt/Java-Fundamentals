import java.util.Scanner;

public class PeachBoxCount {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int numberOfBoxesShipped = 0;
    int numberOfPeaches = 0;
    while (true) {
      System.out.print("Enter the number of peaches picked: ");
      int incomingNumberOfPeaches = sc.nextInt();
      if (incomingNumberOfPeaches == 0) {
        break;
      }
      numberOfPeaches += incomingNumberOfPeaches;
      while (numberOfPeaches >= 20) {
        numberOfPeaches -= 20;
        numberOfBoxesShipped += 1;
        System.out.printf("%d boxes shipped, %d peaches remaining\n",
            numberOfBoxesShipped, numberOfPeaches);
      }
    }
  }
}
