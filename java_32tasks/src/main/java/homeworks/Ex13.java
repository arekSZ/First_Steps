package homeworks;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int n = (int) Math.pow(number, 2);
        if (number > 0) {
            System.out.println(number * number);
        } else if (number < 0) {
            System.out.println(n);
        } else {
            System.out.println(number);
        }

    }

}
