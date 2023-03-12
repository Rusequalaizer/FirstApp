public class OOP {
    public static void main(String[] args) {
        Person kirill = new Person();
        println("Here's classes!");
        println("Now we create a [Person] instance - kirill:");
        println("Person kirill = new Person();");
        println("Call [displayInfo()] before init:");
        kirill.displayInfo();
        kirill.name = "Kirill";
        kirill.age = 20;
        println("Call [displayInfo()] after init:");
        kirill.displayInfo();
        print("\n");

        Person polina = new Person("Polina");
        Person paf = new Person("Paf", 6);
        println("Now we create a two new [Person] instances - Polina, Paf:");
        polina.displayInfo();
        paf.displayInfo();


    }

    static void print(String str) {
        System.out.print(str);
    }
    static void println(String str) {
        System.out.println(str);
    }
}

class Person {
    // Fields:
    String name;
    int age;
    // Constructors:
    Person() {
        name = "none";
        age = 0;
    }
    Person(String n) {
        name = n;
        age = 0;
    }
    Person(String n, int  a) {
        name = n;
        age = a;
    }
    // Methods:
    void displayInfo() {
        System.out.printf("""
                    Name: %s
                    Age: %d
                    """, name, age);
    }
}

class Car {
    /* This class provides
     * examples of using the keyword
     * "this", as well as the initializer
     */
    String color;
    int length;
    int width;

    // Initializer:
    {
        color = "none";
        length = 0;
        width = 0;
    }

    Car() { }
    Car(String c) {
        this(c, 0, 0);
    }
    Car(String c, int l) {
        this(c, l, 0);
    }
    Car(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}
