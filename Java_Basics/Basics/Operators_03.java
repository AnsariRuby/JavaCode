package Basics;

import java.util.*;

public class Operators_03 {
    static void main(String[] args) {
        // Java operators are special symbols that perform operations on variables or values.
        // These operators are essential in programming as they allow you to manipulate data efficiently.

        /*
        * Java Operators
        *
        * Arithmetic Operators (+, -, *, /, %)
        * Logical Operators (&&, ||, !)
        * Unary Operators (++, --)
        * Ternary Operators (cond ? true : false)
        * Assignment Operators (+=, -=, *=, /=, %=, =)
        * Relational Operators (>, <, >=, <=, ==, !=)
        * Bitwise & Shift Operators (&, |, ^, >>, <<, >>>)
        * Instance Of Operator (obj instanceof Integer)
        * */

        // Arithmetic Operators are used to perform simple arithmetic operations on primitive and non-primitive data types.

        /*int a = 10, b = 3;
        // Addition
        int sum = a + b;

        // Subtraction
        int diff = a - b;

        // Multiplication
        int mul = a * b;

        // Division
        int div = a / b;

        // Modulus
        int mod = a % b;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + diff);
        System.out.println("Multiplication : " + mul);
        System.out.println("Division : " + div);
        System.out.println("Modulation : " + mod);*/


//        Unary Operators need only one operand. They are used to increment, decrement, or negate a value.

        /*b = 10;
        System.out.println("Postincrement : " + a++);
        System.out.println("Postincrement : " + ++a);

        System.out.println("Postdecrement : " + b--);
        System.out.println("Postdecrement : " + --b);*/

        // The assignment operator assigns a value from the right-hand side to a variable on the left.
        // Since it has right-to-left associativity, the right-hand value must be declared or constant.

        /*int n = 10;

        n += 5;
        System.out.println("After += : " + n);

        n -= 1;
        System.out.println("After -= : " + n);

        n *= 2;
        System.out.println("After *= : " + n);

        n /= 3;
        System.out.println("After /= : " + n);

        n %= 4;
        System.out.println("After %= : " + n);*/

        // Relational Operators are used to check for relations like equality, greater than, and less than.
        // They return boolean results after the comparison and are extensively used in looping statements as well as conditional if-else statements.

        /*int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a != c : " + (a != c));
*/

        // Logical Operators are used to perform "logical AND" and "logical OR" operations, similar to AND gate and OR gate in digital electronics.
        // They have a short-circuiting effect, meaning the second condition is not evaluated if the first is false.

        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));


        // The Ternary Operator is a shorthand version of the if-else statement.
        // It has three operands and hence the name Ternary. The general format is,

        int a = 20, b = 10, c = 30, result;

        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);

        // Bitwise Operators manipulate individual bits using AND, OR, XOR, and NOT.
        // Shift Operators move bits to the left or right, effectively multiplying or dividing by powers of two.

        int d = 0b1010;
        int e = 0b1100;

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + ~d);
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));


        // The instanceof operator is used for type checking.
        // It can be used to test if an object is an instance of a class, a subclass, or an interface. The general format,

        String str = "Hello World";
        System.out.println(str instanceof String);

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);

    }
}
