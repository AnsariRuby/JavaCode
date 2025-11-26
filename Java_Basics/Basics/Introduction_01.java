package Basics.Intro;

public class Introduction_01 {
    static void main(String[] args) {
        System.out.println("Hello Rubina!!");

        // This is single line comment

        /*
        This is a
        multi-line
        comment.
        */

        /*
        * Difference between JDK, JRE, JVM
        * JDK - Java Development Kit provides libraries and tools to develop Java applications working with JRE and JVM (JavaCompiler, Java Debugger etc.)
        * JRE - Java Runtime Environment offers the libraries and JVM to run Java program
        * JVM - Java Virtual Machine executes the compiled Java bytecode on the system
        * */

        /*
        * Java Identifier : Identifier in Java is the name given to Variables, Classes, Methods, Packages, Interfaces etc.
        * Every java variable must be identified with unique name.
        *
        * Identifier contains Alphanumeric (A to Z), (a to z), (0 to 9), underscore (_), dollar sign ($)
        * It cannot start with number
        * reserve keywords are not allowed
        * It is case-sensitive
        * Optimum length (4 to 15)
        * */

        int number = 15;
        float decimal_num = 16.93f;
        System.out.println(number);
        System.out.println(decimal_num);



    }
}
