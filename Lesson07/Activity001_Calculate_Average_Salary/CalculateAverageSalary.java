import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

/**
 * Download the adult.data file from here: https://archive.ics.uci.edu/ml/datasets/Adult
 * Calculate the average, min and max wages from the CSV.
 * More information about the file can be found here:
 * https://archive.ics.uci.edu/ml/datasets/Adult
 */
public class CalculateAverageSalary {

    public static void main (String [] args) throws Exception {
        long start = System.currentTimeMillis();
        Vector wages = loadWages(args[0]);

        int totalWage = 0;
        int maxWage = 0;
        int minWage = Integer.MAX_VALUE;
        for (Object wageAsObject : wages) {
            int wage = (int) wageAsObject;
            totalWage += wage;

            if (wage > maxWage) {
                maxWage = wage;
            }

            if (wage < minWage) {
                minWage = wage;
            }
        }

        System.out.printf("Read %d rows in %dms\n", wages.size(), System.currentTimeMillis() - start);
        System.out.printf("Average, Min, Max: %d, %d, %d\n", totalWage / wages.size(), minWage, maxWage);
    }

    private static Vector loadWages(String pathToFile) throws Exception {
        Vector result = new Vector();

        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader csvReader = new CSVReader(bufferedReader, false)) {
            String [] row = null;
            while ( (row = csvReader.readRow()) != null) {
                if (row.length == 15) {
                    result.add(Integer.parseInt(row[2].trim()));
                }
            }
        }

        return result;
    }
}
