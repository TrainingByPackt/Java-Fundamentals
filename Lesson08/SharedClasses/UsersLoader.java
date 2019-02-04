import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class UsersLoader {

    public static Hashtable<String, User> loadUsersInHashtableByEmail(String pathToFile) throws IOException {
        Hashtable<String, User> users = new Hashtable<>();

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

    public static void loadUsersIntoSet(String pathToFile, Set<User> usersSet) throws IOException {
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                usersSet.add(User.fromValues(row));
            }
        }
    }

    public static Vector<User> loadUsersInVector(String pathToFile) throws IOException{
        Vector<User> users = new Vector<>();

        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                users.add(User.fromValues(row));
            }
        }

        return users;
    }

}