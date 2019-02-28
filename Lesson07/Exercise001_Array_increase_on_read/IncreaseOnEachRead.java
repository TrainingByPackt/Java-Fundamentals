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
    public static User[] loadUsers(String pathToFile) throws Exception {
        User[] users = new User[0];
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                // Increase array size by one
                // Create new array
                User[] newUsers = new User[users.length + 1];
                // Copy data over
                System.arraycopy(users, 0, newUsers, 0, users.length);
                // Swap
                users = newUsers;

                users[users.length - 1] = User.fromValues(row);
            }
        }

        return users;
    }

}