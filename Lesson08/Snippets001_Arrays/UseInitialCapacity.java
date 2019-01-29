import java.io.BufferedReader;
import java.io.FileReader;;

public class UseInitialCapacity {

    private static final int INITIAL_CAPACITY = 5;

    public static final void main (String [] args) throws Exception {
        User[] users = loadUsers();
        System.out.println(users.length);
    }

    /**
     * Loads users from a CSV file into an array with initial capacity. The array will have to increase
     * if reached the limit. It also needs to be trimmed at the end to ensure no empty rows in it.
     */
    public static User[] loadUsers() throws Exception {
        User[] users = new User[INITIAL_CAPACITY];

        // Ignore header and first line will be index 0 in the array
        int rowIndex = -2;
        try (BufferedReader usersReader = new BufferedReader(new FileReader("../data/users.csv"))) {
            String line = null;
            while ( (line = usersReader.readLine()) != null) {
                rowIndex++;

                // Ignore the header
                if (rowIndex < 0) {
                    continue;
                }

                // Reached end of the array
                if (users.length == rowIndex) {
                    // Increase the array in INITIAL_CAPACITY
                    // Create new array
                    User[] newUsers = new User[users.length + INITIAL_CAPACITY];
                    // Copy data over
                    System.arraycopy(users, 0, newUsers, 0, users.length);
                    // Switch
                    users = newUsers;
                }
                

                users[rowIndex] = new User(line.split(","));
            }
        }

        // If read less rows than array capacity, trim it
        if (rowIndex < users.length - 1) {
            // Create new array
            User[] newUsers = new User[rowIndex + 1];
            // Copy data over
            System.arraycopy(users, 0, newUsers, 0, rowIndex - 1);
            // Switch
            users = newUsers;
        }

        return users;
    }

}