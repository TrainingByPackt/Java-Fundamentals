import java.util.ArrayList;
import java.util.List;
public class StudentList {
public static void main(String[] args) {
List<String> students = new ArrayList<>();
students.add("Diana");
students.add("Florence");
students.add("Mary");
students.add("Betty");
System.out.println(students);
students.remove("Betty");
System.out.println(students);
students.set(0, "Jean");
System.out.println(students);
}
}
