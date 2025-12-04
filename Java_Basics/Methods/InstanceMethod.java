package Learn_Java.Java_Basics.Methods;

import java.util.Scanner;

public class InstanceMethod {
    String name;
    int age;


    // Instance method with no parameter
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Instance method with parameter
    void displayInfo2(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void add(int a, int b) {
        int x = a;
        int y = b;
        int z = x + y;

        System.out.println("Sum: " + z);

    }
    static void main(String[] args) {
        // An instance method is a method that belongs to an instance of a class.
        // We must create an object of that class (or have one already) to call an instance method.
        // Instance methods can access and modify instance fields (object state) and can call other instance or static methods.

        /*
        * modifier: It defines the access type of the method, and it is optional to use.
        * return_type: Method may return a value. Ex:- int, void, String, char, float, etc.
        * method_name: This is the method name you can write anything as you write the variable name.
        * method body: The method body describes what the method does with statements.
        *
        * */

        InstanceMethod obj = new InstanceMethod();
//        obj.name = "John";
//        obj.age = 23;
//        obj.displayInfo();

        obj.displayInfo2("Rubina", 35);
        Scanner sc = new Scanner(System.in);

        obj.add(5, 9);

        account obj2 = new account();
        System.out.println("Current balance is : " + obj2.getBalance());
        int amount = sc.nextInt();
        System.out.print("Your deposited amount is : " + amount + "\n");
        obj2.setBalance(amount);
        System.out.println("Current balance is : " + obj2.getBalance());

    }

}
class account {
    private int balance = 2500;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int a) {
        balance += a;
    }
}
