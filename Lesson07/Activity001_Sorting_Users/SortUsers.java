import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class SortUsers {

    public static void main (String [] args) throws IOException {
        Hashtable<String, User> uniqueUsers = UsersLoader.loadUsersInHashtableByEmail(args[0]);

        // Use Vector to keep elements in order
        Vector<User> users = new Vector<>(uniqueUsers.values());
        System.out.printf("%d unique users found.\n", users.size());

        Scanner reader = new Scanner(System.in);
        System.out.print("What field you want to sort by: ");
        String input = reader.nextLine();

        Comparator<User> comparator;
        switch(input) {
            case "id":
                comparator = new ByIdComparator();
                break;
            case "name":
                comparator = new ByNameComparator();
                break;
            case "email":
                comparator = new ByEmailComparator();
                break;
            default:
                System.out.printf("Sorry, invalid option: %s\n", input);
                return;
        }

        System.out.printf("Sorting by %s\n", input);
        Collections.sort(users, comparator);

        for (User user : users) {
            System.out.printf("%d - %s, %s\n", user.id, user.name, user.email);
        }
    }

}