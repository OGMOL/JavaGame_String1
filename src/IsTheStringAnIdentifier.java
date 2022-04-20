import java.util.Scanner;

public class IsTheStringAnIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string!!!");
        String str = sc.nextLine();
        System.out.println(isTheStringAnIdentifier(str));
    }

    public static boolean isTheStringAnIdentifier(String str) {
        char[] identifier = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '_'};
        String lowerCaseString = str.toLowerCase();
        char firstLetter = lowerCaseString.charAt(0);
        boolean bool = true;
        for (int i = 0; i < identifier.length; i++) {
            if (firstLetter == identifier[i]) {
                bool = true;
                break;
            } else
                bool = false;
        }
        return bool;
    }

}
