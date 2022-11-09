package homeworks;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;
        System.out.println("Press any number ");
        for (; ;)  {
            int a = sc.nextInt();
            sum += a;
            count++;
            if (a == -1)  {
                System.out.println("Avg is: " + (sum +1) / (count-1));
                break;
            }

        }

    }
}