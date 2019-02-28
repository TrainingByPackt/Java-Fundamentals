public class Main {
public static void main(String[] args) {
try {
for (int i = 0; i < 5; i++) {
System.out.println("line " + i);
if (i == 3) throw new Exception("EXCEPTION!");
}
} catch (Exception e) {
e.printStackTrace();
} catch (InstantiationException e) {
System.out.println("Caught an InstantiationException");
}
}
}