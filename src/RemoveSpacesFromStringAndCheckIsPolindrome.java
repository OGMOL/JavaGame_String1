import java.util.Scanner;

public class RemoveSpacesFromStringAndCheckIsPolindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new string");
        String line = sc.nextLine();
        String str = isPolindrome(removeSpacesFromString(line));
        System.out.println(str);

    }

    public static String removeSpacesFromString(String str) {
        str = str.replace(" ", "");
        return str;
    }

    public static String isPolindrome(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        String strReverse = strBuilder.toString();
        String isPolindrome = str.equals(strReverse) ? "polindrome" : "is not polindrome";
        return isPolindrome;
    }
}
