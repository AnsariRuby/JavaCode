package Learn_Java.OOPs_Interfaces.OOPs.Classes_Obj;

public class Geeks {

    // Default Constructor
//    Geeks() {
//        System.out.println("Default Constructor");
//    }


    // data member of the class
    String name;
    int id;


    // Parameterized Constructor
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Geeks(Geeks obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }

    // Method to display object data
    void display() {
        System.out.println("GeekName: " + name
                + " and GeekID: " + id);
    }
}
