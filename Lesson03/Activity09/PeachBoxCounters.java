import java.util.Scanner;
public class PeachBoxCounters{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    System.out.print("Enter the number of peaches picked: ");
    int numberOfPeaches = sc.nextInt();
    int numberOfBoxesShipped = 0;

    while (numberOfPeaches >= 20) {
        numberOfPeaches -= 20;
        numberOfBoxesShipped += 1;
        System.out.printf("%d boxes shipped, %d peaches remaining\n", 
                numberOfBoxesShipped, numberOfPeaches);
    }
}
}
