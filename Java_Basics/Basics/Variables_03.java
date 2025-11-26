package Basics;

public class Variables_03 {
    static void main(String[] args) {
        // Variables are containers used to store data in memory.
        // Variables defines how data is stored, accessed, and manipulated.

        // Integer Variable
        int age = 25;

        // String Variable
        String name = "Rubina Ansari";

        // Double Variable
        double salary = 120000.00;

        // Displaying the values of variables
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);

        // Scope of Variables : Where the variable is accessible.
        // in Java, all identifiers are lexically (or statically) scoped,
        // i.e., scope of a variable can be determined at compile time and independent of the function call stack.

        /*
        * Java Scope of Variables:
        *
        * 1. Instance Variables
        * 2. Static Variables
        * 3. Local Variables
        * 4. Parameter Scope
        * 5. Block Scope
        * */

        // 1. Instance Variables - Class Level Scope
        //  These variables must be declared inside a class (outside any function).
        //  They can be directly accessed anywhere in class.
        Test a = new Test(15);
        System.out.println("A : " + a.num); // num is Instance variable



        // 2. Static Variables - Class Level Scope
        // Static Variable is a type of class variable shared across instances.
        // Static Variables are the variables which once declared can be used anywhere even outside the class without initializing the class.
        // Unlike Local variables it scope is not limited to the class or the block.

        System.out.println("Static Variable : " + Test.var);

        // 3. Method Level Scope - Local Variable
        // Variables declared inside a method have method level scope and can't be accessed outside the method.
        // Note: Local variables don't exist after method's execution is over.
        print();

        // 4. Parameter Scope - Local Variable
        // the variable got passed in as a parameter to the method
        System.out.println(add(5, 9));

        Learner l = new Learner();
        l.testFun(7);

        // 5. Block Level Scope : A variable declared inside pair of brackets "{" and "}" in a method has scope within the brackets only.
        // Block Level Scope
      /*  {
            // The variable x has scope within bracket
            int x = 10;
            System.out.println(x);
        }*/

        /*{
            int x = 5;
            {
                x = 10;
                System.out.println(x);
            }
        }*/

        /*int x;
        for (x = 0; x < 4; x++) {
            System.out.print(x + " ");
        }
        System.out.println(x);*/


        Sample obj = new Sample(50);
        obj.showScopes(35);






    }

    static void print() {
        int x = 10;
        int y = 20;
        System.out.println(x + y);
    }

    static int add(int a, int b) {
        return a + b;
    }
}

class Sample {

    // Instance variable (belong to each object)
    private int instanceVar = 10;

    // Static variable (shared among all instance)
    static int staticVar = 100;

    // Constructor demonstrating parameter scope
    public Sample(int instanceVar) {
        // Parameter Scope
        // Using 'this' to refer to instance variable
        this.instanceVar = instanceVar;
    }
    Sample() {

    }

    public int getInstanceVar() {
        return instanceVar;
    }

    public void showScopes(int paramVar) {
        // Local Variable
        // Only accessible in this method
        int localVar = 20;

        System.out.println("Instance Variable : " + instanceVar);
        System.out.println("Static Variable : " + staticVar);
        System.out.println("Method Parameter : " + paramVar);
        System.out.println("Local Variable : " + localVar);

        // Block Scope (Variable only accessible inside this block

        if (localVar > 10) {
            int blockVar = 5;
            System.out.println("Block Variable : " + blockVar);
        }

//        System.out.println(blockVar); // unaccessible due to it is declared in block scope so cannot be access outside
    }
}

class Test {
    int num; // Instance Variable
    static int var = 10; // Static variable

    public Test(int num) {
        this.num = num; // right side variable is local and left is class variable
    }
}

class Learner {

    // class scope variables
    static int x = 11;

    // Instance variables
    private int y = 33;

    // Parameter scope(x)
    public void testFun(int x) {
        // Method Scope(t)
        Learner l = new Learner();
        this.x = 22; // "this" is a reference variable that refers to the current object
        y = 44;

        // Printing variables with different scopes
        System.out.println("Learner.x : " + Learner.x); // 22
        System.out.println("l.x : " + l.x); // 22
        System.out.println("l.y : " + l.y); // 33
        System.out.println("y : " + y); // 44
    }

}