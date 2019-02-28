import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class UseIterableCSVReader {

    public static void main (String [] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        try (IterableCSVReader csvReader = new IterableCSVReader(reader)) {
            for (Object rowAsObject : csvReader) {
                User user = User.fromValues((String[]) rowAsObject);
                System.out.println(user.name);
            }
        }
    }

}