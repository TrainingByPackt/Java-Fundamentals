import java.util.ArrayList;
import java.util.Iterator;

public class StudentsArray extends Student{
   public static void main(String[] args){

       ArrayList<Student> students = new ArrayList<>();

       Student james = new Student();
       james.setName("James");

       Student mary = new Student();
       mary.setName("Mary");

       Student jane = new Student();
       jane.setName("Jane");

       students.add(james);
       students.add(mary);
       students.add(jane);

       Iterator studentsIterator = students.iterator();
       while (studentsIterator.hasNext()){
           Student student = (Student) studentsIterator.next();
           String name = student.getName();
           System.out.println(name);
       }
      
       students.clear();

   }

}
