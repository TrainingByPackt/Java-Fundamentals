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
    public static User[] loadUsers(String pathToFile) throws Exception {
        User[] users = new User[INITIAL_CAPACITY];

        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                // Reached end of the array
                if (users.length == reader.getLineCount()) {
                    // Increase the array by INITIAL_CAPACITY
                    users = resizeArray(users, users.length + INITIAL_CAPACITY);
                }

                users[users.length - 1] = User.fromValues(row);
            }

            // If read less rows than array capacity, trim it
            if (reader.getLineCount() < users.length - 1) {
                users = resizeArray(users, reader.getLineCount());
            }
        }

        return users;
    }

    private static User[] resizeArray(User[] users, int newCapacity) {
        // Create new array
        User[] newUsers = new User[newCapacity];

        // If increasing, we can only copy what was in there
        int lengthToCopy = newCapacity > users.length ? users.length : newCapacity;

        // Copy data over
        System.arraycopy(users, 0, newUsers, 0, lengthToCopy);
        return newUsers;
    }

}