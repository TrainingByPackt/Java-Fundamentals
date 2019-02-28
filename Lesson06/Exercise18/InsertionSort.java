import java.util.Arrays;
public class InsertionSort {
public static void sort(int[] arr) {
int num = arr.length;
for (int i = 1; i < num; i++) {
int k = arr[i];
int j = i - 1;
while (j>= 0 && arr[j] > k) {
arr[j + 1] = arr[j];
j = j - 1;
}
arr[j + 1] = k;
}
}
public static void main(String[] args) {
int[] arr = {1, 3, 354, 64, 364, 64, 3, 4, 74, 2, 46};
System.out.println("Array before sorting is as follows: ");
System.out.println(Arrays.toString(arr));
sort(arr);
System.out.print("Array after sort looks as follows: ");
for (int i : arr) {
System.out.print(i + " ");
}
}
}