package homeworks;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please, enter a number ");
        int n = scanner.nextInt();

        if (n > 0 && n % 2==0 ){
            System.out.println("This is positive and even number ");
        }
        else if  (n > 999  ){
            System.out.println("The number is too large, the program will be closed ");
        } else {
            System.out.println("This is negative, odd number.");
        }
    }
}
