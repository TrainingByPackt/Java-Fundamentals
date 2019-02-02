import java.util.Comparator;

public class ByNameComparator implements Comparator<User> {

    public int compare(User first, User second) {
        return first.name.toLowerCase().compareTo(second.name.toLowerCase());
    }

}