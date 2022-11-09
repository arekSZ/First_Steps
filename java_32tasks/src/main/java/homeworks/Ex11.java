package homeworks;

public class Ex11 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.changeAge(person.age);

    }

    public static class Person {
        public int age = 20;

        public void changeAge(int age) {
            age = age + 20;

            System.out.println("The age in changeAge() is " + age);
            System.out.println("New age: " + age);

        }

    }
}
