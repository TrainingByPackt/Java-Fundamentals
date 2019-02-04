import java.util.Iterator;
import java.util.Vector;

public class IteratingOnVector {

    public static void main (String [] args) {
        Vector values = new Vector();
        values.add("Value A");
        values.add("Value B");
        values.add("Value C");

        for (int i = 0; i < values.size(); i++) {
            String value = (String) values.get(i);
            System.out.printf("%d - %s\n", i, value);
        }

        for (Object value : values) {
            System.out.println(value);
        }

        System.out.printf("Size before: %s\n", values.size());
        for (Iterator it = values.iterator(); it.hasNext();) {
            String value = (String) it.next();
            if (value.equals("Value B")) {
                it.remove();
            }
        }
        System.out.printf("Size after: %s\n", values.size());
    }

}