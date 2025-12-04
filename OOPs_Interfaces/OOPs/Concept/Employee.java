package Learn_Java.OOPs_Interfaces.OOPs.Concept;

//Encapsulation is defined as the process of wrapping data and the methods into a single unit, typically a class.
// It is the mechanism that binds together the code and the data. It manipulates.
// Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield.
public class Employee {
    // Instance variables (non-static)
    private String name;
    private float salary;
    
    // Constructor
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    // getter method
    public String getName() {
        return name;
    }
    public float getSalary() {
        return salary;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Instance Method
    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }


}
