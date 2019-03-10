import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableCSVReader extends CSVReader implements Iterable {

    private String[] currentRow;
    private String[] nextRow;

    public IterableCSVReader(BufferedReader reader) throws IOException {
        super(reader);
        currentRow = this.readRow();
        nextRow = this.readRow();
    }

    public Iterator iterator() {
        return new Iterator() {
            public boolean hasNext() {
                return nextRow != null;
            }

            public Object next() {
                if (nextRow == null) {
                    throw new NoSuchElementException("No more rows to return.");
                }

                currentRow = nextRow;
                try {
                    nextRow = readRow();
                } catch (IOException ioe) {
                    throw new RuntimeException("Failed to read record.", ioe);
                }
                return currentRow;
            }
        };
    }

}