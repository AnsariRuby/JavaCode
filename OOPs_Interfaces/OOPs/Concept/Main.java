package Learn_Java.OOPs_Interfaces.OOPs.Concept;

// The word polymorphism means having many forms, and it comes from the Greek words poly (many) and morph (forms),
// this means one entity can take many forms. In Java, polymorphism allows the same method or object to behave differently based on the context,
// specially on the project's actual runtime class.
/*
* 1. Method Overloading: Also, known as compile-time polymorphism, is the concept of Polymorphism where more than one method
* share the same name with different signature(Parameters) in a class. The return type of these methods can or cannot be same.
*
* 2. Method Overriding: Also, known as run-time polymorphism, is the concept of Polymorphism where method in the child class has the same name,
* return-type and parameters as in parent class. The child class provides the implementation in the method already written.

 */
public class Main {
    static void main(String[] args) {

        Student student1 = new Student("Robert", 12, 83.5);
        Student student2 = new Student("Neha", 27, 53.9);
        Student student3 = new Student("Vishal", 59, 74.6);

        // print student details
//        student1.printDetails();
//        student2.printDetails();
//        student3.printDetails();

        Person person1 = new Person("Rubina", 36, "Brown");
        Person person2 = new Person("Komal", 24, "Black");

//        person1.printDetails();
//        person2.printDetails();

        Employee emp = new Employee("Geeks", 10000.89f);
        emp.setSalary(15765.35f);
//        emp.displayDetails();


        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();


        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();

        myDog.bark();

        Parent myParent = new Parent();
        Child myChild = new Child();

        // Dynamic Dispatch
        Parent polymorphicObj = new Child();

        // Method Overloading (compile time)
        myParent.func();
        myParent.func(10);

        // Method Overriding (runtime)
        myChild.func(20);

        // polymorphism in action
        polymorphicObj.func(30);






    }
}
