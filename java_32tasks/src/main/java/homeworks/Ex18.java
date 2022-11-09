package homeworks;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of 0 - upright");
        int a = scanner.nextInt();
        System.out.println("Enter the number of 0 - horizontally");
        int b = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("0");
            }
            System.out.println();


        }
    }
}



