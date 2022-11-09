package homeworks;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first length, a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second length, b: ");
        int b = scanner.nextInt();
        System.out.println("Enter the last length, c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle is possible");
        } else {
            System.out.println("The triangle is not possible");
        }
    }
}
