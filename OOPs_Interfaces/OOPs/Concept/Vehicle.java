package Learn_Java.OOPs_Interfaces.OOPs.Concept;

/*
Abstraction in Java is the process of hiding the implementation details and only showing the essential details or features to the user.
It allows to focus on what an object does rather than how it does it. The unnecessary details are not displayed to the user.
Note: In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
* */
abstract class Vehicle {
    // abstract method (what it can do)
    abstract void accelerate();
    abstract void brake();

    // concrete method (common for all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}

// concrete implementation (hidden details)
class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car: pressing gas pedal...");
        // Hidden complex logic: fuel injection, gear shifting etc
    }

    @Override
    void brake() {
        System.out.println("Car: Applying brakes...");
        // Hidden logic: Hydraulic pressure, brake pads, etc.
    }
}