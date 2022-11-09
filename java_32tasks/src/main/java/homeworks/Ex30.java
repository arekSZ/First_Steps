package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Ex30 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("uno");
        names.add("dos");
        names.add("tres");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ", " + names.get(i));
        }
    }
}

