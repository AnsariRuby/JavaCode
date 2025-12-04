package Learn_Java.OOPs_Interfaces.OOPs.Concept;

// create a Student class
public class Student {
    String name;
    int rollno;
    double marks;

    // initializing attributes
    public Student(String name, int rollno, double gpa) {
        this.name = name;
        this.rollno = rollno;
        this.marks = gpa;
    }

    // print details
    public void printDetails() {
        System.out.print("Student Details : ");
        System.out.println(this.name + ", " + this.rollno + ", " + this.marks);
    }



}
