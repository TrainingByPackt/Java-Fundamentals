import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class FindUserHashtable {

    public static void main(String [] args) throws IOException {
        Hashtable users = UsersLoader.loadUsersInHashtableByEmail(args[0]);
        System.out.printf("Loaded %d unique users.\n", users.size());

        System.out.print("Type a user email: ");

        // Read user input from command line
        try (Scanner userInput = new Scanner(System.in)) {
            String email = userInput.nextLine();

            if (!users.containsKey(email)) {
                // User email not in file
                System.out.printf("Sorry, user with email %s not found.\n", email);
                return;
            }

            User user = (User) users.get(email);
            System.out.printf("User with email '%s' found!", email);
            System.out.printf(" ID: %d, Name: %s\n", user.id, user.name);
        }
    }

}