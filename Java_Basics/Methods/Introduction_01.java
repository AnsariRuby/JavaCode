package Methods;

public class Introduction_01 {
    static void main(String[] args) {

        // Java Methods are blocks of code that perform a specific task. A method allows us to reuse code, improving both efficiency and organization.
        // All methods in Java must belong to a class.
        // Methods are similar to functions and expose the behavior of objects.


        Introduction_01 obj = new Introduction_01();
        obj.printMessage();

        /* Why use methods?
        *
        * Code Reusability: Write once, use multiple times without repeating code so that code reusability increase.
        * Modularity: Dividing a program into separate methods allows each method to handle a specific task, making the code more organized and easier to manage.
        * Readability: Smaller, named methods make the code easier to read and understand.
        * Maintainability: It’s easier to fix bugs or update code when it's organized into methods.
        *
         * */


//        A();
//        D();


        // Types of Methods
        // 1. Predefined Method : Predefined methods are the method that is already defined in the Java class libraries.
        // It is also known as the standard library method or built-in method.

        // Math.random() - Pre-defined

        // 2. User-defined Method : The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement.

        D(); // User-defined


        // Different Ways to Create Java Method
        // 1. Instance Method: Access the instance data using the object name. Declared inside a class.
        // 2. Static Method: Access the static data using class name. Declared inside class with static keyword.

    }

    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D");
    }
    public static void C() {
        double c = 30.15;
        System.out.println("In Method C");
    }
    public static void B() {
        int b = 20;
        C();
        System.out.println("In Method B");
    }
    public static void A() {
        int a = 10;
        B();
        System.out.println("In Method A");
    }
    public void printMessage() {
        System.out.println("Hello World");
    }
}
