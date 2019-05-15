import java.util.ArrayList;
import java.util.List;

public class Main {
  private static List<Integer> parseIntegers(List<String> inputList) {
    List<Integer> integers = new ArrayList<>();
    for (String s : inputList) {
      integers.add(Integer.parseInt(s));
    }
    return integers;
  }

  public static void main(String[] args) {
    List<String> inputList = new ArrayList<>();
    inputList.add("1");
    inputList.add("two");
    inputList.add("3");
    List<Integer> outputList = parseIntegers(inputList);
    int sum = 0;
    for (Integer i : outputList) {
      sum += i;
    }
    System.out.println("Sum is " + sum);
  }

}