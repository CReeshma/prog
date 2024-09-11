import java.util.Scanner;
import java.util.Arrays;

public class ValidAnagram {
    public static void checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("No");
            return;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(sArray, tArray)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        checkAnagram(s1, s2);

    }
}
