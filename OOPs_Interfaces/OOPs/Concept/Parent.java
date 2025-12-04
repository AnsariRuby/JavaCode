package Learn_Java.OOPs_Interfaces.OOPs.Concept;

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