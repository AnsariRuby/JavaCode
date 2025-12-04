package Learn_Java.OOPs_Interfaces.OOPs.Concept;

class Human {
    String name;

    Human(String name) {
        this.name = name;
    }
}

public class Person extends Human {
    int age;
    String eyeColor;

    Person(String name, int age, String eyeColor) {
        super(name);
        this.age = age;
        this.eyeColor = eyeColor;
    }

    // print details
    public void printDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", EyeColor: " + this.eyeColor);
    }
}


