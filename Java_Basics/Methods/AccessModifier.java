package Learn_Java.Java_Basics.Methods;

public class AccessModifier {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    static void main(String[] args) {
        /*
        In Java, access modifiers are essential tools that define how the members of a class, like variables, methods,
        and even the class itself, can be accessed from other parts of our program.

        4 types of access modifiers available in Java:

            1. Private :The private access modifier is specified using the keyword private.
                        The methods or data members declared as private are accessible only within the class in which they are declared.
                        Explanation: Direct access is not allowed and used in encapsulation.

            2. Default :When no access modifier is specified for a class, method, or data member, it is said to have the default access modifier by default.
                        This means only classes within the same package can access it.
                        Explanation: Members with default access cannot be accessed from classes in a different package.

            3. Protected :The protected access modifier is specified using the keyword protected.
                          The methods or data members declared as protected are accessible within the same package or subclasses in different packages.
                          Explanation: speed is accessible via subclass methods and other classes in the same package,
                                       but direct access from a different package (non-subclass) would fail.

            4. Public : The public access modifier is specified using the keyword public. Public members are accessible from everywhere in the program.
                        There is no restriction on the scope of public data members.
                        Explanation: add() is globally accessible due to the public modifier.

         */

        /*
        When to Use Each Access Modifier in Real-World Projects
            Private: The idea should be use as restrictive access as possible, so private should be used as much as possible.
            Default (Package-Private): Often used in package-scoped utilities or helper classes.
            Protected: Commonly used in inheritance-based designs like framework extensions.
            Public: This is used for API endpoints, service classes, or utility methods shared across different parts of an application.
         */

        AccessModifier am = new AccessModifier();
        am.setName("Jack");
        System.out.println("My name is " + am.getName());

        Car car = new Car();
        car.model = "Tesla";
        System.out.println("My car model is " + car.model);

        Bike b = new Bike();
        b.speed = 100;
        System.out.println("My bike speed is " + b.speed);


    }
}
class Car {
    String model;
}
class Vehicle {
    protected int speed;
}

class Bike extends Vehicle {
    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }
}