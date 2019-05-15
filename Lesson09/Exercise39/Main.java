import java.io.IOException;

public class Main {
  private static void myFunction() throws IOException {
    throw new IOException("hello");
  }

  public static void main(String[] args) {
    try {
      myFunction();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}