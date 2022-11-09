package homeworks;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int lines = 10;
        int i = 1;
        int j = 1;
        for (i = 1; i <= lines; i++) {
            for (j = 1; j <= lines; j++) {
                System.out.print(i * j + " ");

            }
            System.out.println(" ");
        }
    }

}