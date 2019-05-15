import java.util.Scanner;

public class RollerCoasterWithAgeAndHeight {

  static class TooYoungException extends Exception {
    int age;
    String name;

    TooYoungException(int age, String name) {
      this.age = age;
      this.name = name;
    }
  }

  static class TooShortException extends Exception {
    int height;
    String name;

    TooShortException(int height, String name) {
      this.height = height;
      this.name = name;
    }
  }

  public static class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while (true) {
        System.out.print("Enter name of visitor: ");
        String name = input.nextLine().trim();
        if (name.length() == 0) {
          break;
        }

        try {
          System.out.printf("Enter %s's age: ", name);
          int age = input.nextInt();
          input.nextLine();
          if (age < 15) {
            throw new TooYoungException(age, name);
          }
          System.out.printf("Enter %s's height: ", name);
          int height = input.nextInt();
          input.nextLine();
          if (height < 130) {
            throw new TooShortException(height, name);
          }
          System.out.printf("%s is riding the roller coaster.\n", name);
        } catch (TooYoungException e) {
          System.out.printf("%s is %d years old, which is too young to ride.\n", e.name, e.age);
        } catch (TooShortException e) {
          System.out.printf("%s is %d cm tall, which is too short to ride.\n", e.name, e.height);
        } finally {
          System.out.printf("Escorting %s outside the premises.\n", name);
        }
      }
    }
  }
}
