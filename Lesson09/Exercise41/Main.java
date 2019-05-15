public class Main {
  public static void useDigitString(String digitString) {
    if (digitString.isEmpty()) {
      throw new IllegalArgumentException("An empty string was given instead of a digit");
    }
    if (digitString.length() > 1) {
      throw new NumberFormatException("Please supply a string with a single digit");
    }
    System.out.println(digitString);
  }

  private static void runDigits() {
    try {
      useDigitString("1");
      useDigitString("23");
      useDigitString("4");
      // This slide includes an exercise on throwing an exception.
      // 29 Exception Sources | 237
    } catch (NumberFormatException e) {
      System.out.println("A number format problem occured: " + e.getMessage());
    }
    try {
      useDigitString("5");
      useDigitString("");
      useDigitString("7");
    } catch (NumberFormatException e) {
      System.out.println("A number format problem occured: " + e.getMessage());
    }
  }

  // 3. Add the main() method as follows:
  public static void main(String[] args) {
    try {
      runDigits();
    } catch (IllegalArgumentException e) {
      System.out.println("An illegal argument was provided: " + e.getMessage());
    }
  }
}