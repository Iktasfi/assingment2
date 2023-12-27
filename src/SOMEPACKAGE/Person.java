package SOMEPACKAGE;
public abstract class Person implements Payable {
    protected static int nextId = 1;
    // Instance variables
    protected int id;
    protected String name;
    protected String surname;
    public Person() {
        this.id = nextId++;
    }
    // Parameterized constructor
    public Person(String name, String surname) {
        this(); // Call the default constructor to set the ID
        setName(name);
        setSurname(surname);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Student: " + id + ". " + name + " " + surname;
    }
    public String getPosition(){
        return null;
    }
    //string getPosition() – method (should return either the appropriate position or text “Student”)
    // Method to get the position    public String getPosition() {
    // Assuming this is a generic Person class, so returning "Student" by default        return "Adam";
}

