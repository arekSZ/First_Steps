package homeworks;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please, enter a number ");
        int n = number.nextInt();

        int length = 0;
        long temp = 1;
        while (temp <= n) {
            length++;
            temp *= 10;

        }
        System.out.println("Length of the number is: " + length);
    }

}
