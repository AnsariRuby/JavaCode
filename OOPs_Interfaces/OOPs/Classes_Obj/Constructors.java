package Learn_Java.OOPs_Interfaces.OOPs.Classes_Obj;

public class Constructors {
    // A constructor in Java is a special member that is called when an object is created. It initializes the new object’s state.
    // It is used to set default or user-defined values for the object's attributes

    /*
    * A constructor has the same name as the class.
    * It does not have a return type, not even void.
    * It can accept parameters to initialize object properties.
    * */

    /* Types of Constructors in Java

    * Default Constructor : A default constructor has no parameters. It’s used to assign default values to an object.
                            If no constructor is explicitly defined, Java provides a default constructor.

     * Parameterized Constructor : A constructor that has parameters is known as parameterized constructor.
                                   If we want to initialize fields of the class with our own values, then use a parameterized constructor.

    * Private Constructor : A private constructor cannot be accessed from outside the class. It is commonly used in:
                            1. Singleton Pattern: To ensure only one instance of a class is created.
                            2. Utility/Helper Classes: To prevent instantiation of a class containing only static methods.

    * Copy Constructor : Unlike other constructors copy constructor is passed with another object which copies the data available from
                         the passed object to the newly created object.

    * */

    static void main(String[] args) {
        //  Note: It is not necessary to write a constructor for a class because the Java compiler automatically creates a default constructor
        //  (a constructor with no arguments) if your class doesn’t have any.
//        Geeks hello = new Geeks();  // Default Constructor

        // Parameterized constructor use case
        /*Geeks geek1 = new Geeks("Shweta", 68);
        System.out.println(geek1.name);
        System.out.println(geek1.id);
        geek1.display();*/

        // This would invoke parameterized constructor
        System.out.println("First Object");
        Geeks geek1 = new Geeks("Shweta", 68);

        System.out.println("GeekName : " + geek1.name + " and GeekId : " + geek1.id);

        System.out.println();

        Geeks geek2 = new Geeks(geek1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("GeekName : " + geek2.name + " and GeekId : " + geek2.id);


    }
}
