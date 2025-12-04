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

        // Constructor Overloading
        // Java supports Constructor Overloading in addition to overloading methods.
        // In Java, overloaded constructor is called based on the parameters specified when a new is executed.

        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2, 4, 6, 2);
        Box box4 = new Box(box2);
        Box box5 = new Box(3);
        double vol;

        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);

        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);

        vol = box3.volume();
        System.out.println("Volume of box3 is " + vol);

        vol = box4.volume();
        System.out.println("Volume of box4 is " + vol);

        vol = box5.volume();
        System.out.println("Volume of box5 is " + vol);
    }
}
