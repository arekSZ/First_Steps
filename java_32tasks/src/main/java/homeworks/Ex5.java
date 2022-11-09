package homeworks;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        System.out.println(min(-10, -5));
        System.out.println(min(-10, -5, -50, -90));
        System.out.println(min(-20, -10, -30, 90));
        System.out.println(min(-80, -1, -75, 40));
    }

    public static int min(int a, int b, int c, int d) {
        int outcome1;
        if (min(a, b) < d && min(a, b) < c) {
            outcome1 = min(a, b);
        } else if (min(a, b) > c && c < d) {
            outcome1 = c;
        } else {
            outcome1 = d;
        }
        return outcome1;
    }

    public static int min(int a, int b) {
        int outcome2;
        if (a < b) {
            outcome2 = a;
        } else {
            outcome2 = b;
        }
        return outcome2;
    }
}
