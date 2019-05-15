public class DataStr {
  public static void main(String[] args) {
    int[] myArray = new int[10];
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = i;
    }
    for (int i = 0; i < myArray.length; i++) {
      System.out.println(myArray[i]);
    }
  }
}