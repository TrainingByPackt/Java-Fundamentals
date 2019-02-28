import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
public static void main(String[] args) {
File file = new File("input.txt");
FileInputStream fileInputStream = null;
try {
fileInputStream = new FileInputStream(file);
} catch (FileNotFoundException e) {
e.printStackTrace();
}
if (fileInputStream != null) {
try {
int data = 0;
while(data != -1) {
data = fileInputStream.read();
System.out.println(data);
}
fileInputStream.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
}