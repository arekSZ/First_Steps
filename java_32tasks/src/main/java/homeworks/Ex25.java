package homeworks;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg");
        double weight = sc.nextDouble();
        System.out.println("Enter height in meters");
        double height = sc.nextDouble();

        double BMI = 0;
        BMI = weight / (height * height);
        System.out.printf("Your BMI is: %10.2f", BMI, "\n");
        System.out.println();
        if (BMI < 18.5) {
            System.out.println("You are Under Weight ");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You have an Healthy Weight ! ");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You are Obese ");
        } else if (BMI > 40) {
            System.out.println("You are Severe Obesity");
        }

    }
}