
public class UseStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java programmers ");
        stringBuilder.append("are wise ");
        stringBuilder.append("and knowledgeable");
        System.out.println("The string is \n" + stringBuilder.toString());
        int len = stringBuilder.length();
        System.out.println("The length of the string is: " + len);
        int capacity = stringBuilder.capacity();
        System.out.println("The capacity of the string is: " + capacity);
        stringBuilder.reverse();
        System.out.println("The string reversed is: \n" + stringBuilder);
    }
}