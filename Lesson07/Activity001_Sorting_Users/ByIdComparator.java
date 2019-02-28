import java.util.Comparator;

public class ByIdComparator implements Comparator<User> {

    public int compare(User first, User second) {
        if (first.id < second.id) {
            return -1;
        }

        if (first.id > second.id) {
            return 1;
        }

        return 0;
    }

}