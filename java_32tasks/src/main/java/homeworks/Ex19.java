package homeworks;

import java.util.Scanner;

public class Ex19 {
    public static int middleOfThree(int a, int b,
                                    int c) {

        if ((a < b && b < c) || (c < b && b < a))
            return b;

        else if ((b < a && a < c) || (c < a && a < b))
            return a;

        else
            return c;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Middle of three is " + middleOfThree(a, b, c));
    }
}

