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
        print("\n");

        ExtendedPerson exKirill = new ExtendedPerson("Extended Kirill", 20, "Russia", "0-123-456-78-90");
        println("Now we create a [ExtendedPerson] instance - exKirill:");
        exKirill.dispInfo();
        exKirill.dispName();
        exKirill.dispAge();
        exKirill.dispPhone();
        print("\n");

        EncapsPerson encapsKirill = new EncapsPerson("Kirill", 20);
        String kirEncapsName = encapsKirill.getName();
        int kirEncapsAge = encapsKirill.getAge();
        println("Now we create a [EncapsPerson] instance - encapsKirill:");
        println("Name: " + kirEncapsName);
        println("Age: " + kirEncapsAge);
        encapsKirill.setName("(changed Name)");
        encapsKirill.setAge(21);
        String kirEncapsChangedName = encapsKirill.getName();
        int kirEncapsChangedAge = encapsKirill.getAge();
        println("Now we change instance encapsKirill, using [setName(), setAge()]:");
        println("Name: " + kirEncapsChangedName);
        println("Age: " + kirEncapsChangedAge);
        print("\n");

        StaticPerson statKir = new StaticPerson("Kirill");
        println("Now we create a [StaticPerson] instance - statKir:");
        statKir.dispInfo();
        println("Now we will change the value of the static field \"id\" to 4:");
        StaticPerson.id = 4;
        statKir.dispInfo();
        StaticPerson statPoly = new StaticPerson("Polina");
        println("Now we create a new [StaticPerson] instance - statPoly:");
        statPoly.dispInfo();
        println("Now let's make sure that the fields are static:");
        StaticPerson.dispStatic();
        StaticPerson.dispStatic();
        print("\n");

        MathClass.Factorial fact = MathClass.getFactorial(6);
        println("Now we create a [MathClass.Factorial] instance - fact:");
        System.out.printf("Factorial of %d is %d\n", fact.getKey(), fact.getResult());
        print("\n");

        Employee inherKirill = new Employee("Kirill", 20, "Programmer", "Junior");
        println("Now we create a [Employee] instance - inherKirill:");
        inherKirill.dispInfo();
        /*
         * This section of code demonstrates
         * the possibility of dynamic dispatching
         * of methods in the class [start - end].
         */
        EncapsPerson encapsToInherKir = new Employee("Kirill", 20);             // Start.
        System.out.print("""
                        
                        Now we will create an object
                        of the [EncapsPerson] class, but
                        when initializing we will declare
                        it as [Employee]:
                        [EncapsPerson encapsToInherKir = new Employee("Kirill", 20);]
                        
                        """);
        String name = encapsToInherKir.getName();
        encapsToInherKir.setAge(20);
        System.out.println("Name: " + name + "\tAge: " + encapsToInherKir.getAge());        // End.
    }

    public static void print(String str) {
        System.out.print(str);
    }
    public static void println(String str) {
        System.out.println(str);
    }
}

class Person {
    /*
     * The simplest example of a class
     * with default access modifiers for
     * fields and methods, provides an
     * opportunity to get acquainted with
     * the constructor and the general
     * appearance of the class.
     */

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

class ExtendedPerson {
    /*
     * An example of an extended class
     * "Person", which includes a constructor,
     * fields, methods, and also this class
     * provides an introduction to the access
     * modifiers of fields and methods.
     */

    String name;
    protected int age;
    public String address;
    private final String phone; // You will not be able to access this variable outside the class.
    ExtendedPerson(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void dispName() {
        System.out.println("Name: " + name);
    }
    void dispAge() {
        System.out.println("Age: " + age);
    }
    protected void dispPhone() {
        System.out.println("Phone: " + phone);
    }
    private void dispAddress() { // You will not be able to access this method outside the class
        System.out.println("Address: " + address);
    }
    protected void dispInfo() {
        System.out.printf("Name: %s\t-\tAge: %d\t-\tAddress: %s\t-\tPhone: %s\n", name, age, address, phone);
    }
}

class EncapsPerson {
    /*
     * This class demonstrates the
     * application of one of the
     * paradigms of OOP - encapsulation.
     */

    private String name;
    private int age;
    EncapsPerson(String name, int age) {
        setName(name);
        setAge(age);
    }
    public final void setAge(int age) { // The keyword [final] prohibits inheritance
        if(0 <= age && age <= 110) {
            this.age = age;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
class StaticPerson {
    /*
     * This class allows you to
     * familiarize yourself with
     * the "static" modifier.
     */

    public static int id;
    private static final int height = 200;
    private static int counter;
    private String name;

    static {
        id = 0;
        counter = 0;
    }
    StaticPerson(String name) {
        setName(name);
        id++;
        counter++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void dispInfo() {
        System.out.printf("Name: %s\t\tid: %d\t\tcounter: %d\t\theight: %d\n", name, id, counter, height);
    }
    public static void dispStatic() {
        System.out.printf("Name: \t\t\t\tid: %d\t\tcounter: %d\t\theight: %d\n", id, counter, height);
    }
}

class MathClass {
    /*
     * Example of a static nested
     * class (yes, classes can be
     * nested and internal).
     */

    public static class Factorial {
        private final int result;
        private final int key;
        public Factorial(int result, int key) {
            this.result = result;
            this.key = key;
        }
        public int getResult() {
            return result;
        }
        public int getKey() {
            return key;
        }
    }
    public static Factorial getFactorial(int x) {
        int result = 1;
        for(int i = 1; i <= x; i++) {
            result *= i;
        }
        return new Factorial(result, x);
    }
}

class Employee extends EncapsPerson {
    /*
     * Here's example of a
     * class implementing
     * inheritance as one of
     * the OOP paradigms.
     */

    private String profession;
    private String position;
    public Employee(String name, int age) {
        super(name, age);
        setProfession("none");
        setPosition("none");
    }
    public Employee(String name, int age, String profession, String position) {
        super(name, age);
        setPosition(position);
        setProfession(profession);
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void dispInfo() {
        System.out.printf("| Name: %s |\t| Age: %d |\t| Profession: %s |\t| Position: %s |\n",
                            getName(), getAge(), profession, position);
    }
    @Override
    public String getName() {
        return super.getName() + "(Overrided)";
    }
}
