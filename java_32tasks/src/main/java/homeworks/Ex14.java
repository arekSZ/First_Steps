package homeworks;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int rok;
        System.out.println("Enter the year");
        rok = getInt();
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is an ordinary year.");
        }

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}



