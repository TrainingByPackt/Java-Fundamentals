public class ExampleArray {
  public static void main(String[] args) {
    double[] array = {14.5, 28.3, 15.4, 89.0, 46.7, 25.1, 9.4, 33.12, 82, 11.3, 3.7, 59.99, 68.65, 27.78, 16.3, 45.45, 24.76, 33.23, 72.88, 51.23};
    double min = array[0];
    for (double f : array) {
      if (f < min)
        min = f;
    }
    System.out.println("The lowest number in the array is " + min);
  }
}
