public class Main {
private static void method3() throws Exception {
System.out.println("Begin method 3");
try {
for (int i = 0; i < 5; i++) {
System.out.println("line " + i);
if (i == 3) throw new Exception("EXCEPTION!");
}
} catch (InstantiationException e) {
System.out.println("Caught an InstantiationException");
}
System.out.println("End method 3");
}
private static void method2() throws Exception {
System.out.println("Begin method 2");
method3();
System.out.println("End method 2");
}
private static void method1() {
System.out.println("Begin method 1");
try {
method2();
} catch (Exception e) {
System.out.println("method1 caught an Exception!: " +
e.getMessage());
System.out.println("Also, below is the stack trace:");
e.printStackTrace();
}
System.out.println("End method 1");
}

public static void main(String[] args) {
System.out.println("Begin main");
method1();
System.out.println("End main");
}
}