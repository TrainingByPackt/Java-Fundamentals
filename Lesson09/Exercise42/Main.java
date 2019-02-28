class EmptyInputException extends Exception {
}
public class Main {
public static void useDigitString(String digitString) throws
EmptyInputException {
if (digitString.isEmpty()) {
throw new EmptyInputException();
}
if (digitString.length() > 1) {
throw new NumberFormatException("Please supply a string with
a single digit");
}
System.out.println(digitString);
}
private static void runDigits() throws EmptyInputException {
try {
useDigitString("1");
useDigitString("23");
useDigitString("4");
} catch (NumberFormatException e) {
System.out.println("A number format problem occured: " +
e.getMessage());
}
try {
useDigitString("5");
useDigitString("");
useDigitString("7");
} catch (NumberFormatException e) {
System.out.println("A number format problem occured: " +
e.getMessage());
}
}
public static void main(String[] args) {
try {
runDigits();
} catch (EmptyInputException e) {
System.out.println("An empty string was provided");
}
}
}