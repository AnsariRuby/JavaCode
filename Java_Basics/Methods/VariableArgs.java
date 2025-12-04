package Learn_Java.Java_Basics.Methods;

public class VariableArgs {
    static void main(String[] args) {
        /*
        In Java, Variable Arguments (Varargs) allow methods that can take any number of inputs,
        which simply means we do not have to create more methods for different numbers of parameters.


        Note: Only one Varargs parameter is allowed per method.
        Case 2: Specifying Varargs as the first parameter of the method instead of the last one, will throw compile time error

         */

        Names("Rubina", "Neha", "Bree", "Komal");
        // Varargs lets a method to take many values or even no value at all.
        // Java will treat these values like a list, so that we can use them inside the method easily.

        fun(100);
        fun(1, 2, 3, 4, 5);
        fun();
        System.out.println("__________________________");

        fun2("GeeksForGeeks", 100, 200);
        fun2("CSPortal", 1, 2, 3, 4, 5);
        fun2("ForGeeks");


    }
    static void fun2(String s, int... a) {
        System.out.println("String: " + s);
        System.out.println("The number of arguments : " + a.length);
        for (int x : a) {
            System.out.print(x +" ");
        }
        System.out.println();
    }
    static void fun(int... a) {
        System.out.println("Number of arguments: " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void Names(String... n) {
        for (String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
