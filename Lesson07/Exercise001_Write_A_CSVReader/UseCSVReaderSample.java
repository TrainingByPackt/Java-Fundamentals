import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseCSVReaderSample {

    public static void main (String [] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        try (CSVReader csvReader = new CSVReader(reader)) {
            String[] row;
            while ( (row = csvReader.readRow()) != null ) {
                System.out.printf("%d - %s\n", csvReader.getLineCount(), row[1]);
            }
        }
    }

}