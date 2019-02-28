public class Salary {
public static void main(String args[]) {
int workerhours = 10; 
double salary = 0;
if (workerhours <= 8 ) 
salary = workerhours*10;
else if((workerhours > 8) && (workerhours < 12)) 
salary = 8*10 + (workerhours - 8) * 12;
else
    salary = 160;
System.out.println("The worker's salary is " + salary);
}
}
