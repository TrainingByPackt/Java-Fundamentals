import java.util.Hashtable;
import java.util.Vector;

public class AddAndFetchWithGenerics {

    public static void main (String [] args) {
        String[] values = {"1", "John Doe", "john.doe@nowhere.com"};
        User user = User.fromValues(values);

        // This compiles and work
        User[] usersArray = new User[1];
        usersArray[0] = user;

        // This wouldn't compile
        // usersArray[0] = "Not a user";

        User userFromArray = usersArray[0];

        Vector<User> usersVector = new Vector<>();
        usersVector.add(user); // This compiles

        // This does not compile
        // usersVector.add("Not a user");

        // No casting needed anymore
        User userFromVector = usersVector.get(0);

        Hashtable<Integer, User> usersTable = new Hashtable<>();
        usersTable.put(user.id, user); // This compiles

        // This does not compile
        // usersTable.put("Not a number", "Not a user");

        // Now you can iterate directly on Users
        for (User userFromTable : usersTable.values()) {
            // No need to cast anymore
            System.out.println(userFromTable.name);
        }
    }

}