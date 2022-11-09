package homeworks;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println(sumDigits(4912));
    }

    public static int sumDigits(int number) {
        int num = 4912;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;


        }
        return sum;
    }
}