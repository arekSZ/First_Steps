package homeworks;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

        // Read and sum numbers.
        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                sum += scan.nextDouble();
                count++;
            } else {
                String str = scan.next();
                if (str.equals("exit"))
                    break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }
        scan.close();
        System.out.println("Average is " + sum / count);
    }
}

