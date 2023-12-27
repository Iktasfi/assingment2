import SOMEPACKAGE.Person;import SOMEPACKAGE.Student;
import SOMEPACKAGE.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void printData(Iterable<Person> people)  {
        List<Person> T = new ArrayList<>();
        people.forEach(T::add);

        Collections.sort(T);

        for (Person person : T) {
            System.out.println(person + " earns " + person.getSalary());
        }
    }
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name;
        String surname;
        String position;
        double gpa;
        double salary;

        boolean exit = false;

        while (true != exit) {
            System.out.println("What do you want?");
            System.out.println("1. Add student. ");
            System.out.println("2. Add employee. ");
            System.out.println("3. Print data");
            System.out.println("0. End the program. ");
            System.out.println("Enter what do you want.");

            String answer = scanner.nextLine();

            switch (answer){
                case "Add student":
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter surname: ");
                    surname = scanner.nextLine();

                    System.out.print("Enter gpa: ");
                    gpa = scanner.nextDouble();
                    people.add(new Student(name, surname, gpa));
                    System.out.println();
                    break;



                case "Add employee":
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter surname: ");
                    surname = scanner.nextLine();

                    System.out.print("Enter position: ");
                    position = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    salary = scanner.nextDouble();

                    people.add(new Employee(name, surname, position, salary));
                    System.out.println();
                    break;


                case "Print data":
                    printData(people);
                    break;
                case "End the program":
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect command");
            }
        }




    }
}
