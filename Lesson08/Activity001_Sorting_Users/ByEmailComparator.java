import java.util.Comparator;

public class ByEmailComparator implements Comparator<User> {

    public int compare(User first, User second) {
        return first.email.toLowerCase().compareTo(second.email.toLowerCase());
    }

}