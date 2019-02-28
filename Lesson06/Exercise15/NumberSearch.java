import java.util.Scanner;
public class NumberSearch {
public static void main(String[] args){
int [] sample = { 2, 4, 7, 98, 32, 77, 81, 62, 45, 71 };
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number you want to find: ");
int ele = sc.nextInt();
for (int i = 0; i < 10; i++) {
if (sample[i] == ele) {
System.out.println("Match found at element " + i);
break;
}
else
{
System.out.println("Match not found");
break;
}
}
}
}