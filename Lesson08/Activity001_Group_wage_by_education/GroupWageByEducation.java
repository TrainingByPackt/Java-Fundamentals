import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Vector;

public class GroupWageByEducation {

    public static void main (String [] args) throws Exception {
        Hashtable<String,Vector<Integer>> wagesByEducation = loadWages(args[0]);

        for (Entry<String, Vector<Integer>> entry : wagesByEducation.entrySet()) {
            Vector<Integer> wages = entry.getValue();
            
            int totalWage = 0;
            int maxWage = 0;
            int minWage = Integer.MAX_VALUE;
            for (Integer wage : wages) {
                totalWage += wage;
                
                if (wage > maxWage) {
                    maxWage = wage;
                }
                
                if (wage < minWage) {
                    minWage = wage;
                }
            }

            System.out.printf("%d records found for education %s\n", wages.size(), entry.getKey());
            System.out.printf("\tAverage, Min, Max: %d, %d, %d\n", totalWage / wages.size(), minWage, maxWage);
        }
    }

    private static Hashtable<String, Vector<Integer>> loadWages(String pathToFile) throws Exception {
        Hashtable<String, Vector<Integer>> result = new Hashtable<>();

        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader csvReader = new CSVReader(bufferedReader, false)) {
            String [] row = null;
            while ( (row = csvReader.readRow()) != null) {
                if (row.length == 15) {
                    String education = row[3].trim();
                    int wage = Integer.parseInt(row[2].trim());

                    // Get or create the vector with the wages for the specified education
                    Vector<Integer> wages = result.getOrDefault(education, new Vector<>());

                    wages.add(wage);

                    // Ensure the vector will be in the hashtable next time
                    result.put(education, wages);
                }
            }
        }

        return result;
    }

}