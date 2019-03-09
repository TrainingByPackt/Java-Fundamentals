import java.io.IOException;
import java.util.Random;

public class Main {
    Random rand = new Random();

    void thFunction1() throws IOException {
        System.out.println("thFunction1 start");
        if (rand.nextInt(10) < 2) {
            throw new IOException("An I/O exception occurred in thFunction1");
        }
        System.out.println("thFunction1 done");
    }

    void thFunction2() throws IOException, InterruptedException {
        System.out.println("thFunction2 start");
        int r = rand.nextInt(10);
        if (r < 2) {
            throw new IOException("An I/O exception occurred in thFunction2");
        }
        if (r > 8) {
            throw new InterruptedException("An interruption occurred in thFunction2");
        }
        System.out.println("thFunction2 done");
    }

    private static final int EC_NONE = 0;
    private static final int EC_IO = 1;
    private static final int EC_INTERRUPTION = 2;

    int ecFunction1() {
        System.out.println("ecFunction1 start");
        if (rand.nextInt(10) < 2) {
            return EC_IO;
        }
        System.out.println("thFunction1 done");
        return EC_NONE;
    }

    int ecFunction2() {
        System.out.println("ecFunction2 start");
        int r = rand.nextInt(10);
        if (r < 2) {
            return EC_IO;
        }
        if (r > 8) {
            return EC_INTERRUPTION;
        }
        System.out.println("ecFunction2 done");
        return EC_NONE;
    }

    private void callThrowingFunctions() {
        try {
            thFunction1();
            thFunction2();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    private void callErrorCodeFunctions() {
        int err = ecFunction1();
        if (err != EC_NONE) {
            if (err == EC_IO) {
                System.out.println("An I/O exception occurred in ecFunction1.");
            }
        }
        err = ecFunction2();
        switch (err) {
        case EC_IO:
            System.out.println("An I/O exception occurred in ecFunction2.");
            break;
        case EC_INTERRUPTION:
            System.out.println("An interruption occurred in ecFunction2.");
            break;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.callThrowingFunctions();
        main.callErrorCodeFunctions();
    }
}