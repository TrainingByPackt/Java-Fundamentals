import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  private static void useTheFile(String s) {
    System.out.println(s);
    throw new RuntimeException("oops");
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader("input.txt"));
      System.out.println("opened the file");
      useTheFile(br.readLine());
    } catch (IOException e) {
      System.out.println("caught an I/O exception while reading the file");
      throw new Exception("something is wrong with I/O", e);
    } catch (Exception e) {
      System.out.println("caught an exception while reading the file");
    } finally {
      if (br != null) {
        br.close();
        System.out.println("closed the file");
      }
    }
  }
}