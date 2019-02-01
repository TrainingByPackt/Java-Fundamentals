import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class FindUserHashtable {

    public static void main(String [] args) throws IOException {
        Hashtable users = loadUsers(args[0]);
        System.out.printf("Loaded %d unique users.\n", users.size());

        System.out.print("Type a user email: ");

        // Read user input from command line
        try (Scanner userInput = new Scanner(System.in)) {
            String email = userInput.nextLine();

            if (!users.containsKey(email)) {
                // User email not in file
                System.out.printf("Sorry, user with email %s not found.\n", email);
                System.exit(1);
            }

            User user = (User) users.get(email);
            System.out.printf("User with email '%s' found!", email);
            System.out.printf(" ID: %d, Name: %s", user.id, user.name);
        }
    }

    private static Hashtable loadUsers(String pathToFile) throws IOException {
        Hashtable users = new Hashtable();

        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                User user = User.fromValues(row);
                users.put(user.email, user);
            }
        }

        return users;
    }

}