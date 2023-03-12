package study;

import java.util.*; // Import example
public class PackageExample {
    public static void main(String[] args) {
        Person kir = new Person("Kirill", 20);
        kir.displayInfo();
    }
}

class Person {
    String name;
    int age;

    {
        name = "NoName";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s\tAge: %d\n", name, age);
    }
}
