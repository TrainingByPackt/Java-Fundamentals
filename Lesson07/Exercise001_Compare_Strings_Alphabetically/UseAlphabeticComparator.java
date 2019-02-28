public class UseAlphabeticComparator {

    public static void main (String [] args) {
        AlphabeticComparator comparator = new AlphabeticComparator();
        System.out.println(comparator.compare("A", "B") < 0); // -> true
        System.out.println(comparator.compare("B", "A") > 0); // -> true

        System.out.println(comparator.compare("a", "B") < 0); // -> true
        System.out.println(comparator.compare("b", "A") > 0); // -> true

        System.out.println(comparator.compare("a", "b") < 0); // -> true
        System.out.println(comparator.compare("b", "a") > 0); // -> true
    }

}