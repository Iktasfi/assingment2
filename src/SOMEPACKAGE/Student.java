package SOMEPACKAGE;
public class Student  extends Person{
    private double gpa;
    // Default constructor
    public Student() {

    }
    // Parameterized constructor

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    /*
    public String toString() {
        return "Student: " + id + ". " + name + " " + surname;
    }
     */

    //Getters and setters

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67){
            return 36660.00;
        }
        return 0;
    }
}

