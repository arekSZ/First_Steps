package homeworks;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter your birthday in the following part year/month/day");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("My name is  " + name + " , " + "I was born on " + day + "/" + month + "/" + year + ".");
    }
}
