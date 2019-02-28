import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortUsersTreeSet {

    public static void main (String [] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a field to sort by: ");
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

        TreeSet<User> users = new TreeSet<>(comparator);
        UsersLoader.loadUsersIntoSet(args[0], users);

        for (User user : users) {
            System.out.printf("%d - %s, %s\n", user.id, user.name, user.email);
        }
    }

}