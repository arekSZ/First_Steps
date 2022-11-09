package homeworks;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five words: ");

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String d = scanner.nextLine();
        String e = scanner.nextLine();
        String[] word = {a, b, c, d, e};
        String longestString = longestString(word);
        System.out.println(longestString);
    }

    static String longestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }
}

