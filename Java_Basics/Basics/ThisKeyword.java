package Basics;

public class ThisKeyword {
    static void main(String[] args) {
        // In Java, "this" is a reference variable that refers to the current object, or
        // can be said "this" in Java is a keyword that refers to the current object instance. It is mainly used to,

        /*
        * Call current class methods and fields
        * To pass an instance of the current class as a parameter
        * To differentiate between the local and instance variables.
        *
        * Using "this" reference can improve code readability and reduce naming conflicts.
        *
        */

        // Objects declared
//        Person first = new Person("Rubina", 36);
//        Person second = new Person("Sam", 33);

//        first.printDetails();
//        second.printDetails();

//        first.setName("Robin");
//        System.out.println("Name has been changed : " + first.getName());

//        Calculate obj = new Calculate(15, 72);
//        obj.display();

//        A obj2 = new A();

//        B obj3 = new B();
//        obj3.display();
//        obj3.get().display();

//        C obj4 = new C();
//        obj4.get();

//        Call object = new Call();
//        object.display();

        E obj = new E();

        /*
        *
        Advantages of Using "this" Reference
        There are many advantages of using "this" reference in Java as mentioned below:

        * It helps to distinguish between instance variables and local variables with the same name.
        * It can be used to pass the current object as an argument to another method.
        * It can be used to return the current object from a method.
        * It can be used to invoke a constructor from another overloaded constructor in the same class.

        Disadvantages of Using "this" Reference
        Although "this" reference comes with many advantages there are disadvantages of also:

        * Overuse of this can make the code harder to read and understand.
        * Using this unnecessarily can add unnecessary overhead to the program.
        * Using this in a static context results in a compile-time error.
        * Overall, this keyword is a useful tool for working with objects in Java, but it should be used judiciously and only when necessary.
        * */




    }
}

// 1. Using "this" to Refer to Current Class Instance Variables
class Calculate {
    int a;
    int b;

    // Parameterized constructor
    Calculate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + " b = " + b);
        System.out.println("addition of a + b is : " + (a + b));
    }
}

// Below is the implementation of "this" reference:
class Person {
    // Field Declared
    String name;
    int age;


    // Constructor
    Person(String name, int age) {
        this.name = name; // 'this' refers to the current object's name
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to print the Details of the person
    public void printDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println();
    }
}

// 2. Using this() to Invoke Current Class Constructor
class A {
    int a;
    int b;

    // Default Constructor
    A() {
        this(10, 83);
        System.out.println("Inside default constructor \n");
    }

    // Parameterized Constructor
    A(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
}

// 3. Using "this" Keyword to Return the Current Class Instance
class B {
    int a;
    int b;

    // Default Constructor
    B() {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
    B get(){
        return this;
    }

    // Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + " b = " + b);
    }
}

// 4. Using "this" Keyword as a Method Parameter
class C {
    int a;
    int b;

    // Default Constructor
    C() {
        a = 10;
        b = 20;
    }

    // Method that receives "this" keyword as parameter
    void display(C obj) {
        System.out.println("a = " + obj.a + " b = " + obj.b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }
}

// 5. Using "this" Keyword to Invoke the Current Class Method
class Call {

    void display() {
        // Calling function show()
        this.show();
        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show function");
    }
}

// 6. Using "this" Keyword as an Argument in the Constructor Call

class D {
    E obj;

    // Parameterized Constructor with object of E as a Parameter
    D(E obj) {
        this.obj = obj;

        // Calling display method of Class E
        obj.display();
    }
}
class E {
    int x = 5;

    // Default constructor that create an object of D
    // with passing this as an argument in the constructor
    E() {
        D obj = new D(this);
    }

    // method to show the value of x
    void display() {
        System.out.println("Value of x in Class E : " + x);
    }
}