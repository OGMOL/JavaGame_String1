import java.util.Arrays;
import java.util.Scanner;

public class FilterNumbersFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new string with numbers");
        String line = sc.nextLine();
        int[] numbers = arrayNumbers(line);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] arrayNumbers(String str) {
        str = str.replaceAll("[^0-9]", " ");
        str = str.replaceAll("\\s+", " ");
        str = str.trim();
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return numArr;
    }
}
