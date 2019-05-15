public class FibonacciSeries {
  public static void main(String[] args) {
    int i = 1, x = 0, y = 1, sum = 0;
    while (i <= 10) {
      System.out.print(x + " ");
      sum = x + y;
      x = y;
      y = sum;
      i++;
    }
  }
}