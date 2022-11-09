package homeworks;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Manchester");
        cities.add("Madryt");
        cities.add("Cracow");
        cities.add("Moscow");
        cities.add("Paris");
        cities.add("Hong-Kong");
        System.out.println(Cities(cities));
        System.out.println(changedCities(cities,5));
    }

    public static String Cities(List<String> a ){
        return a.toString();
    }
    public static String changedCities(List<String> b, int n  ){
        b.set(0, "Hong-Kong");
        for (int i = 0; i < n; i++){
            return b.toString();
        }

        return null;
    }
}