import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NonNumberInListException extends Exception {
    public int index;

    NonNumberInListException(int index, Throwable cause) {
        super(cause);
        this.index = index;
    }
}

public class Main {
    private static List<Integer> parseIntegers(List<String> inputList) throws NonNumberInListException {
        List<Integer> integers = new ArrayList<>();
        int index = 0;
        for (String s : inputList) {
            try {
                integers.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                throw new NonNumberInListException(index, e);
            }
            index++;
        }
        return integers;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("1");
        inputList.add("two");
        inputList.add("3");
        boolean done = false;
        while (!done) {
            try {
                List<Integer> outputList = parseIntegers(inputList);
                int sum = 0;
                for (Integer i : outputList) {
                    sum += i;
                }
                System.out.println("Sum is " + sum);
                done = true;
            } catch (NonNumberInListException e) {
                System.out.println("This element does not seem to be a number: " + inputList.get(e.index));
                System.out.print("Please provide a number instead: ");
                Scanner scanner = new Scanner(System.in);
                String newValue = scanner.nextLine();
                inputList.set(e.index, newValue);
            }
        }
    }
}