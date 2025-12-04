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
// parent class
public class Parent {
    // overloaded method (compile-time polymorphism)
    public void func() {
        System.out.println("Parent.func()");
    }

    // overloaded method (same name, different parameter)
    public void func(int a) {
        System.out.println("Parent.func(int) " + a);
    }
}

// child class
class Child extends Parent {
    @Override
    public void func(int a) {
        System.out.println("Child.func(int) " + a);
    }
}