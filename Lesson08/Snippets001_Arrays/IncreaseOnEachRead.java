import java.io.BufferedReader;
import java.io.FileReader;;

public class IncreaseOnEachRead {

    public static final void main (String [] args) throws Exception {
        User[] users = loadUsers();
        System.out.println(users.length);
    }

    /**
     * Loads users from a CSV file into an array that gets incremented on each record read.
     */
    public static User[] loadUsers() throws Exception {
        User[] users = new User[0];

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

                // Increase array size by one
                // Create new array
                User[] newUsers = new User[users.length + 1];
                // Copy data over
                System.arraycopy(users, 0, newUsers, 0, users.length);
                // Switch
                users = newUsers;

                users[rowIndex] = new User(line.split(","));
            }
        }

        return users;
    }

}