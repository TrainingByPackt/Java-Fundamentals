import java.io.BufferedReader;
import java.io.FileReader;;

/**
 * Demonstrates loading data from a CSV into an array, increasing the array size on
 * each record read. This uses the {@link CSVReader} and {@link User} classes.
 * 
 * It expects the name of the CSV file to be passed in as first argument.
 */
public class IncreaseOnEachRead {

    public static final void main (String [] args) throws Exception {
        User[] users = loadUsers(args[0]);
        System.out.println(users.length);
    }

    /**
     * Loads users from a CSV file into an array that increases on each record read.
     */
    public static User[] loadUsers(String fileToReadFrom) throws Exception {
        User[] users = new User[0];
        BufferedReader lineReader = new BufferedReader(new FileReader(fileToReadFrom));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                // Increase array size by one
                // Create new array
                User[] newUsers = new User[users.length + 1];
                // Copy data over
                System.arraycopy(users, 0, newUsers, 0, users.length);
                // Switch
                users = newUsers;

                users[users.length - 1] = userFromRow(row);
            }
        }

        return users;
    }

    private static User userFromRow(String [] row) {
        int id = Integer.parseInt(row[0]);
        String name = row[1];
        String email = row[2];
        return new User(id, name, email);
    }

}