import java.util.Hashtable;
import java.util.Vector;

public class AddAndFetch {

    public static void main (String [] args) {
        String[] values = {"1", "John Doe", "john.doe@nowhere.com"};
        User user = User.fromValues(values);

        // This compiles and work
        User[] usersArray = new User[1];
        usersArray[0] = user;

        // This wouldn't compile
        // usersArray[0] = "Not a user";

        User userFromArray = usersArray[0];

        Vector usersVector = new Vector();
        usersVector.add(user); // This compiles
        usersVector.add("Not a user"); // This also compiles

        // This would blow up at runtime!
        // User userFromVector = (User) usersVector.get(1);

        Hashtable usersTable = new Hashtable();
        usersTable.put(user.id, user); // This compiles
        usersTable.put("Not a number", "Not a user"); // This also compiles

        for (Object userFromTable : usersTable.values()) {
            // This blows up at runtime!
            // System.out.println( ((User) userFromTable).name);

            // Need to check type
            if (userFromTable instanceof User) {
                System.out.println( ((User) userFromTable).name);
            }
        }
    }

}