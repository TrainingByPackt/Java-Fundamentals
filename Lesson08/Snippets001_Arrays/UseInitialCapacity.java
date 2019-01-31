import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Demonstrates loading data from a CSV into an array. The array is created with an
 * initial capacity and increased as necessary. At the end, it checks if there are
 * empty spaces in the array and trim it to the correct size.
 * 
 * This uses the {@link CSVReader} and {@link User} classes.
 * 
 * It expects the name of the CSV file to be passed in as first argument.
 */
public class UseInitialCapacity {

    private static final int INITIAL_CAPACITY = 5;

    public static final void main (String [] args) throws Exception {
        User[] users = loadUsers(args[0]);
        System.out.println(users.length);
    }

    /**
     * Loads users from a CSV file into an array with initial capacity. The array will have to increase
     * if reached the limit. It also needs to be trimmed at the end to ensure no empty rows in it.
     */
    public static User[] loadUsers(String fileToReadFrom) throws Exception {
        User[] users = new User[INITIAL_CAPACITY];

        BufferedReader lineReader = new BufferedReader(new FileReader(fileToReadFrom));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                // Reached end of the array
                if (users.length == reader.getLineCount()) {
                    // Increase the array in INITIAL_CAPACITY
                    // Create new array
                    User[] newUsers = new User[users.length + INITIAL_CAPACITY];
                    // Copy data over
                    System.arraycopy(users, 0, newUsers, 0, users.length);
                    // Switch
                    users = newUsers;
                }

                users[users.length - 1] = userFromRow(row);
            }

            // If read less rows than array capacity, trim it
            if (reader.getLineCount() < users.length - 1) {
                // Create new array
                User[] newUsers = new User[reader.getLineCount()];
                // Copy data over
                System.arraycopy(users, 0, newUsers, 0, reader.getLineCount());
                // Switch
                users = newUsers;
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