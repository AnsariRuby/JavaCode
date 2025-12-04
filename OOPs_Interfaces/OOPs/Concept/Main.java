package Learn_Java.OOPs_Interfaces.OOPs.Concept;


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
