package homeworks;

import java.util.Random;


public class Ex31 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.currentTimeMillis();
        Random random = new Random();
        int x = random.nextInt();
        for (int i = 1; i < 1001; i++) {
            System.out.println(i);
        }
        // System.out.println("Current time in millisecond: " + System.currentTimeMillis() - 1667496255280);
        System.out.println(a - System.currentTimeMillis() + " This is the time");
    }
}

