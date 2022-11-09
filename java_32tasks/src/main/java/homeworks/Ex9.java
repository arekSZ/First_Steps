package homeworks;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter the number of months");
        int month = scanner.nextInt();
        System.out.println(name + " will be an automation tester in " + month + " months =) ");


    }
}