import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

/**
 * Simple CSV reader that uses an underlying {@link BufferedReader} to read the
 * data from.
 */
public class CSVReader implements Closeable {

    private final BufferedReader reader;
    private int lineCount = 0;

    public CSVReader(BufferedReader reader) throws IOException {
        this(reader, true);
    }

    public CSVReader(BufferedReader reader, boolean ignoreFirstLine) throws IOException {
        this.reader = reader;

        if (ignoreFirstLine) {
            reader.readLine();
        }
    }

    public void close() throws IOException {
        this.reader.close();
    }

    public int getLineCount() {
        return lineCount;
    }

    public String[] readRow() throws IOException {
        String line = reader.readLine();
        if (line == null) {
            return null;
        }
        lineCount++;

        return line.split(",");
    }

}