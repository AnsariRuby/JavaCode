package Learn_Java.OOPs_Interfaces.OOPs.Classes_Obj;

public class Classes {
    static void main(String[] args) {
        /* Classes and Objects

        * Before Object-Oriented Programming (OOPs), most programs used a procedural approach, where the focus was on writing step-by-step functions.
        * This made it harder to manage and reuse code in large applications.
        * To overcome these limitations, Object-Oriented Programming was introduced. Java is built around OOPs, which helps in organizing code using classes and objects.
        * */
        // A class is a blueprint used to create objects that share common properties and behavior.
        // An object is an instance of a class. It represents a specific entity created from the class template.


        Student s1 = new Student(10, "Alice");

        System.out.println(s1.id);
        System.out.println(s1.n);



        /* Java Class

        * A class is a blueprint that defines data and behavior for objects. It groups related fields and methods in a single unit.
        * Memory for its members is allocated only when an object is created.

            Acts as a template to create objects with shared structure.
            Does not occupy memory for fields until instantiation.
            Can contain fields, methods, constructors, nested classes and interfaces.
         * */


        /* Java Object

        * An object is an instance of a class created to access its data and operations. Each object holds its own state.

            State: Values stored in fields.
            Behavior: Actions defined through methods.
            Identity: Distinguishes one object from another.

         Objects mirror real-world items such as customer, product or circle. Non-primitive objects are stored on the
         heap while their references remain on the stack.
         * */

        // Object Instantiation: Creating an object is known as instantiation. All instances of a class share structure
        // and behavior while storing different state values.
        // The new operator allocates memory and invokes the constructor.


        Dog tuffy = new Dog("Tuffy", "papillon", 5, "white");
        System.out.println(tuffy);

        // Note: Every class has at least one constructor. If none is defined Java provides a default no-argument constructor that calls the parent constructor.


        // Ways to create an Object

        /*
        * 1. Using new Keyword : Most direct way to create an object.
        * 2. Using Reflection : Used for dynamic class loading as seen in frameworks like Spring.
        * 3. Using clone() method : clone() creates a copy of an existing object. The class must implement Cloneable.
        * 4. Using Deserialization : De-serialization is a technique of reading an object from the saved state in a file. Object is recreated from a stored byte stream.
        * */










    }


}
