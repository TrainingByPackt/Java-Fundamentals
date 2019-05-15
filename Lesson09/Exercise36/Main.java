public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("result 1: " + (2 / 2));
      System.out.println("result 2: " + (4 / 0));
      System.out.println("result 3: " + (6 / 2));
    } catch (ArithmeticException e) {
      System.out.println("---- An exception in first block");
    }
    try {
      System.out.println("result 4: " + (8 / 2));
      System.out.println("result 5: " + (10 / 0));
      System.out.println("result 6: " + (12 / 2));
    } catch (ArithmeticException e) {
      System.out.println("---- An exception in second block");
    }
  }
}
