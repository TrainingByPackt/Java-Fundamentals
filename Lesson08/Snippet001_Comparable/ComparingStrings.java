public class ComparingStrings {

    public static void main (String [] args) {
        System.out.println("A".compareTo("B") < 0); // -> true!
        System.out.println("B".compareTo("A") > 0); // -> true!

        System.out.println("a".compareTo("B") < 0); // -> false. WAT?
        System.out.println("a".compareTo("B") > 0); // -> true. WAT?
    }

}