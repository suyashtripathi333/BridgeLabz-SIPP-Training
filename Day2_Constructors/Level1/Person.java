package Day2_Constructors.Level1;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person p) {
        this(p.name, p.age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Asha", 22);
        Person p2 = new Person(p1);
        System.out.println(p2.name + " " + p2.age);
    }
}

