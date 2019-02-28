import java.util.Scanner;

public class RollerCoasterWithAgeAndHeight{

class TooYoungException extends Exception {
int age;
String name;
TooYoungException(int age, String name) {
this.age = age;
this.name = name;
}
}

public class RollerCoasterWithAge {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
while (true) {
System.out.print(“Enter name of visitor: “);
String name = input.nextLine().trim();
if (name.length() == 0) {
break;
}

try {
System.out.printf(“Enter %s’s age: “, name);
int age = input.nextInt();
input.nextLine();
if (age < 15) {
throw new TooYoungException(age, name);
}
System.out.printf(“%s is riding the roller coaster.\n”,
name);

} catch (TooYoungException e) {
System.out.printf(“%s is %d years old, which is too
young to ride.\n”, e.name, e.age);
}
}
}
}
