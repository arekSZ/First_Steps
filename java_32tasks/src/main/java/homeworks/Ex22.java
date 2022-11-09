package homeworks;

import java.util.Scanner;

public class Ex22 {
    public static class Soldier {
        int age;
        double weight;
        int strength;
        int agility;

        public Soldier(int age, double weight, int strength, int agility) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
            this.agility = agility;
        }

        public boolean fight(Soldier anotherSoldier) {
            if (this.age + this.weight + this.strength + this.agility > anotherSoldier.age + anotherSoldier.weight + anotherSoldier.strength + anotherSoldier.agility)
                return true;
            else
                return false;
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome in our strategy Game");

        Scanner scan = new Scanner(System.in);
        System.out.println("How old is your solider? ");
        int age = scan.nextInt();
        System.out.println("How much your soldier weighs? ");
        double weight = scan.nextDouble();
        System.out.println("How much strength your soldier has, in Niuton's ");
        int strength = scan.nextInt();
        System.out.println("How much agility your soldier has, in scale of % ");
        int agility = scan.nextInt();
        Soldier Soldier = new Soldier(age, weight, strength, agility);

        System.out.println("NOW, Enter the second Solider");

        System.out.println("How old is your solider? ");
        int age1 = scan.nextInt();
        System.out.println("How much your soldier weighs? ");
        double weight1 = scan.nextDouble();
        System.out.println("How much strength your soldier has, in Niuton's ");
        int strength1 = scan.nextInt();
        System.out.println("How much agility your soldier has, in scale of % ");
        int agility1 = scan.nextInt();
        Soldier anotherSoldier = new Soldier(age1, weight1, strength1, agility1);

        boolean a = Soldier.fight(anotherSoldier);
        System.out.println(a);
        boolean b = anotherSoldier.fight(Soldier);
        System.out.println(b);
    }

}
