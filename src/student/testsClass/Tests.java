package student.testsClass;

import student.utilities.Director;
import student.abstracts.People;
import student.utilities.Secretary;
import student.utilities.Student;

/**
 * Class to test the behavior of different People objects (Student, Director, Secretary)
 * and check if they are considered adults based on their age.
 */
public class Tests {
    public static void main(String[] args) {
        // Create a Student object with name "Daniel" and age 24
        People student = new Student("Daniel", 24);

        // Create a Director object with name "Jose" and age 38
        People director = new Director("Jose", 38);

        // Create a Secretary object with name "Carlos" and age 52
        People secretary = new Secretary("Carlos", 52);

        // Check if each person is considered an adult (based on age)
        System.out.println(student.getAdult());  // Should print "adult" or "underage" based on the age
        System.out.println(director.getAdult()); // Should print "adult" or "underage" based on the age
        System.out.println(secretary.getAdult()); // Should print "adult" or "underage" based on the age
    }
}
