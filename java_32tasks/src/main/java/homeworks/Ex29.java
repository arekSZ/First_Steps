package homeworks;

import java.util.HashSet;

public class Ex29 {
    public static class Cat {
        String name;
        String colour;
        boolean hasOwner;
        boolean isHungry;
    }

    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Gacek");
        cats.add("Giny");
        cats.add("Belzebub");
        cats.add("Rick");
        cats.add("Rysia");
        System.out.println(cats);
    }
}
