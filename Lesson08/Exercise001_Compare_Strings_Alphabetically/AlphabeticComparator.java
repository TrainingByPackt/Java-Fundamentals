import java.util.Comparator;

/**
 * Comparator that turn strings to lowercase then compare them.
 */
public class AlphabeticComparator implements Comparator<String> {

    public int compare(String first, String second) {
        return first.toLowerCase().compareTo(second.toLowerCase());
    }

}
