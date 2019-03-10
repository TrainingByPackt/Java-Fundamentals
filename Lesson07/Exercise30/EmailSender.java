import java.util.Random;

public class EmailSender {

    public static void main (String [] args) throws Exception {
        System.out.printf("Sending email to %s...\n", args[0]);
        // Let's take some time to send the email
        Thread.sleep(new Random().nextInt(100));
        System.out.printf("Email sent to %s!\n", args[0]);
    }

}