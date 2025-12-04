package Learn_Java.Java_Basics.Methods;

public class StaticMethod {

    // static variable
    static int a = 40;

    // instance variable
    int b = 50;

    void simpleDisplay() {
        System.out.println(a);
        System.out.println(b);
    }

    static void staticDisplay() {
        System.out.println(a);
//        System.out.println(b); // This is not allowed. cannot call non-static from static context
    }
    static void main(String[] args) {
        // In Java, the static keyword is used to create methods that belongs to the class rather than any specific instance of the class.
        // Any method that uses the static keyword is referred to as a static method.

        /*
        *
        * A static method in Java is associated with the class, not with any object or instance.
        * It can be accessed by all instances of the class, but it does not rely on any specific instance.
        * Static methods can access static variables directly without the need for an object.
        * They cannot access non-static variables (instance) or methods directly.
        * Static methods can be accessed directly in both static and non-static contexts.
        * */

        // The JVM executes the static method first, even before creating class objects.
        // So, static methods cannot access instance variables, as no object exists at that point.


        StaticMethod obj = new StaticMethod();
//        obj.simpleDisplay();

//        StaticMethod.staticDisplay();

        obj.nonStatic();


        /*
        * Why Use Static Methods?
            To access or modify static variables or perform actions not tied to any instance.
            Useful for utility or helper classes like Collections, Math, etc.

        * Restrictions on Static Methods
            Non-static data members or non-static methods cannot be used by static methods, and static methods cannot call non-static methods directly.
            In a static environment, this and super are not allowed to be used.
        * */



        // Calling an Abstract Method: abstract methods have no body and must be overridden in a subclass. They are called using an object of the subclass.
    }

    static int num = 100;
    static String str = "Rubina Ansari";

    // This is static method
    static void display() {
        System.out.println("Static number is : " + num);
        System.out.println("Static string is : " + str);
    }

    // This is non-static method
    void nonStatic() {
        display();
    }
}
