package SOMEPACKAGE;
public class Employee extends Person {    // Static variable to automatically set employee IDs
    private String position;
    private double salary;
    // Default constructor
    public Employee() {

    }    // Parameterized constructor
    public Employee(String name, String surname, String position, double salary) {
        // Call the default constructor to set the ID
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    // toString method
    @Override
    public String toString() {
        return  position + ": " + id + ". " + name + " " + surname;
    }
    // Getters and setters

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
