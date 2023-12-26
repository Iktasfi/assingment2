import SOMEPACKAGE.Person;import SOMEPACKAGE.Student;
import SOMEPACKAGE.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();


        Employee paramEmployee = new Employee("John", "Lennon", "Manager", 50000.0);
        System.out.println(paramEmployee);
        // Create a parameterized person
        Person paramPerson = new Person("John", "Lennon");
        System.out.println(paramPerson);
        // Create a parameterized student
        Student paramStudent = new Student("John", "Lennon", 3.8);
        System.out.println(paramStudent);
        Student AITUStudent = new Student("Artyom", "Lennon", 3.8);
        System.out.println(AITUStudent);
    }
    public void printData(Iterable<Person>){

    }
}
