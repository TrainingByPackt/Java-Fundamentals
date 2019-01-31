import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ReadUsersIntoVector {

    public static void main (String [] args) throws IOException {
        Vector users = loadUsers(args[0]);
        System.out.println(users.size());
    }

    private static Vector loadUsers(String pathToFile) throws IOException {
        Vector users = new Vector();

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