public class IteratingOnArrays {

    public static void main (String [] args) {
        String [] values = {"Value A", "Value B", "Value C"};

        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d - %s\n", i, values[i]);
        }

        for (String value : values) {
            System.out.println(value);
        }
    }

}