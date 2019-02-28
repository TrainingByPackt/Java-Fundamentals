import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;

public class SendAllEmails {
    
    private static Process runningProcess = null;

    public static void main (String [] args) throws Exception {
        ArrayDeque<String> queue = new ArrayDeque<>();

        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader reader = new CSVReader(bufferedReader)) {
            String[] row;
            while ( (row = reader.readRow()) != null) {
                User user = User.fromValues(row);

                // Enqueue email to send to
                queue.offer(user.email);

                sendEmailWhenReady(queue);

                // Simulate slow reading from file
                Thread.sleep(100);
            }
        }

        // Drain the queue
        while (!queue.isEmpty()) {
            sendEmailWhenReady(queue);

            // Wait before checking again
            Thread.sleep(100);
        }

        // Wait for process to finish
        while (runningProcess.isAlive()) {
            System.out.print(".");
            Thread.sleep(100);
        }
        System.out.println("\nDone sending emails!");
    }

    private static void sendEmailWhenReady(ArrayDeque<String> queue) throws Exception {
        // If running, return
        if (runningProcess != null && runningProcess.isAlive()) {
            System.out.print(".");
            return;
        }

        System.out.print("\nSending email");
        String email = queue.poll();
        String classpath = System.getProperty("java.class.path");
        String[] command = new String[]{"java", "-cp", classpath, "EmailSender", email};
        runningProcess = Runtime.getRuntime().exec(command);
    }

}
