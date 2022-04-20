import java.util.Scanner;

public class RemovingDuplicateCharactersFromAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new string");
        String line = sc.nextLine();
        String remuveDuplicateChar = removingDuplicateChar(removeSpacesFromString(line));
        System.out.println(remuveDuplicateChar);
    }

    public static String removeSpacesFromString(String str) {
        str = str.replace(" ", "");
        return str;
    }

    public static String removingDuplicateChar(String str) {
        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        return result;
    }
}
