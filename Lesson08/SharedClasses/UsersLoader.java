import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
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

    public static Vector<User> loadUsersInVector(String pathToFile) throws IOException{
        Vector<User> users = new Vector<>();

        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String [] row = null;
            while ( (row = reader.readRow()) != null) {
                users.addElement(User.fromValues(row));
            }
        }

        return users;
    }

}