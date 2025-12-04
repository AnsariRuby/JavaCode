package Learn_Java.Java_Basics.Basics;

public class DataTypes_02 {
    static void main(String[] args) {
        // Java Data Types: Java is statically typed language meaning variable types are known at compile time.
        // The compiler ensures type correctness.

        /*
         * Data type in Java define the kind of data a variable can hold and the memory required to store it.
         *
         * It is divided into 2 categories:
         *
         * Primitive Data Types: Numeric Type - Integer (byte, short, int, long), floating Point (float, double)
         *                       Non-Numeric Type - Boolean, char
         *
         * Non-Primitive Data Types: String, Arrays etc.
         * */

        // Boolean Data Type : Represents one of two logical values: true or false. Commonly used for conditional checks.
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java Fun? : " + isJavaFun);
        System.out.println("Is Fish Tasty? : " + isFishTasty);

        // Byte Data Type : An 8-bit signed integer used to save memory in large numeric arrays.
        // Size : 1 byte (8 bits)

        byte age = 25;
        byte temperature = -10;
        System.out.println("Age : " + age);
        System.out.println("Temperature : " + temperature);

        // Short Data Type : A 16-bit signed integer often used when memory is limited and values are moderate in size.
        // Size : 2 bytes (16 bits)

        short students = 1000;
        short temp = -20;
        System.out.println("Students : " + students);
        System.out.println("Temperature : " + temp);

        // int Data Type : A 32-bit signed integer commonly used for whole numbers.
        // Size : 4 bytes (32 bits)

        int population = 2000000;
        int distance = 150000000;
        System.out.println("Population : " + population);
        System.out.println("Distance : " + distance);

        // long Data Type : A 64-bit signed integer used when int is not sufficient for large values.
        // Size : 8 bytes (64 bits)

        long worldPopulation = 7800000000L;
        long lightYears = 9460730472580800L;
        System.out.println("World Population : " + worldPopulation);
        System.out.println("Light Years : " + lightYears);

        // float Data Type : A 32-bit single-precision floating-point type used for fractional values.
        // Size : 4 bytes (32 bits)

        float pi = 3.14f;
        float gravity = 9.81f;
        System.out.println("Pi : " + pi);
        System.out.println("Gravity : " + gravity);

        // double Data Type : A 64-bit double-precision floating-point type and the default for decimal numbers.
        // Size : 8 bytes (64 bits).

        double pi2 = 3.141592653589793;
        double avogadro = 6.02214076e23;
        System.out.println("Pi : " + pi2);
        System.out.println("Avogadro's Number : " + avogadro);

        // char Data Type : A 16-bit Unicode character used to store single symbols or letters.
        // Size : 2 bytes (16 bits)

        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade : " + grade);
        System.out.println("Symbol : " + symbol);

        // Non-Primitive (Reference) Data Types : Non-primitive data types store references (memory addresses) rather than actual values.
        // They are created by users and include types like String, Class, Object, Interface, and Array.

        // String : String represents a sequence of characters enclosed in double quotes.Java strings are objects and are immutable.

        String name = "Rubina";
        String message = "Welcome to Java Learning!";
        System.out.println("Name : " + name);
        System.out.println("Message : " + message);

        // Class : A class is a user-defined blueprint that defines variables and methods.
        // It represents a type of object and forms the foundation of Object-Oriented Programming.

        Car myCar = new Car("Honda", 2025);
        myCar.display();

        // Object : An Object is an instance of a class representing real-world entities.
        // It has state (data), behavior (methods), and identity (unique reference).
        System.out.println("Model : " + myCar.model);
        System.out.println("Year : " + myCar.year);

        // Interface : An interface defines a contract of abstract methods that implementing classes must define.
        // It provides a way to achieve abstraction and multiple inheritance in Java.

        Animal dog = new Dog();
        dog.sound();

        // Array : An array stores multiple elements of the same type in a single structure.
        // Java arrays are objects, dynamically allocated, and indexed from 0.

        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Ruby", "Shuby", "Neha", "Komal"};
        System.out.println("First number : " + numbers[0]);
        System.out.println("Second name : " + names[1]);







    }
}
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
