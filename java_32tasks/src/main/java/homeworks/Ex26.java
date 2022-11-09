package homeworks;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key word that u want to multiply");
        String key  = sc.nextLine();
        System.out.println("Enter the value you want to multiply the keyword by ");
        int v = sc.nextInt();




            System.out.println( key.repeat(v) );

        }
    }

