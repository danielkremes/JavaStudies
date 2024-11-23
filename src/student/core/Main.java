package student.core;

import student.interfaces.AllowAccess;
import student.interfaces.FunctionAllowAccess;
import student.utilities.Discipline;
import student.utilities.Secretary;
import student.utilities.Student;
import student.utilities.StudentStatus;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Entry point for the student management application.
 * This class manages student records, disciplines, and authentication.
 * Provides functionality for adding, updating, and removing students and their disciplines.
 */
public class Main {

    /**
     * Main method that serves as the entry point of the application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {

        // Review: Consider using dependency injection to improve testability.
        FunctionAllowAccess allowAccess = new FunctionAllowAccess();

        try {

            // Collect user credentials
            String user = JOptionPane.showInputDialog("User");
            String password = JOptionPane.showInputDialog("Password");

            // Instantiate an authentication object
            AllowAccess authenticate = new Secretary(user, password);

            // Authenticate the user
            if (allowAccess.authenticate(authenticate)) {

                List<Student> students = new ArrayList<>();

                // Review: Use a map to categorize students by their statuses (e.g., APPROVED, REPROVED, RECUPERATION).
                HashMap<String, List<Student>> studentList = new HashMap<>();

                // Loop to collect student data
                for (int qtdStudent = 0; qtdStudent < 1; qtdStudent++) {
                    Student student = new Student();

                    // Collect student name
                    String nameStudent = JOptionPane.showInputDialog("Enter student name:");
                    student.setName(nameStudent);

                    // Loop to collect discipline and grade data
                    for (int i = 1; i <= 1; i++) {
                        Discipline discipline = new Discipline();

                        // Collect discipline name
                         String nameDiscipline = JOptionPane.showInputDialog("Name of discipline " + i + ":");
                         discipline.setDisciplinesName(nameDiscipline);

                        // Collect and parse grade
                        String grade = JOptionPane.showInputDialog("Grade for discipline " + i + ":");
                        discipline.setGrades(Double.parseDouble(grade));

                        student.getDiscipline().add(discipline);
                    }

                    // Prompt user for discipline removal
                    int chooseRemoveDiscipline = JOptionPane.showConfirmDialog(null, "Would you like to remove any discipline?");

                    if (chooseRemoveDiscipline == 0) {
                        int continueRemove = 0;

                        while (continueRemove == 0) {
                            // Display the list of disciplines
                            for (int i = 0; i < student.getDiscipline().size(); i++) {
                                System.out.println((i + 1) + ". " + student.getDiscipline().get(i).getDisciplinesName());
                            }

                            // Prompt for discipline to remove
                            String nameDisciplineRemove = JOptionPane.showInputDialog("Enter the number of the discipline to remove:");
                            student.getDiscipline().remove(Integer.parseInt(nameDisciplineRemove) - 1);

                            continueRemove = JOptionPane.showConfirmDialog(null, "Would you like to remove another discipline?");
                        }
                    }

                    students.add(student);
                }

                // Categorize students by status
                studentList.put(StudentStatus.APPROVED, new ArrayList<>());
                studentList.put(StudentStatus.RECUPERATION, new ArrayList<>());
                studentList.put(StudentStatus.REPROVED, new ArrayList<>());

                for (Student student : students) {
                    // Determine student status and add to the corresponding list
                    if (student.getApproved2().equalsIgnoreCase(StudentStatus.APPROVED)) {
                        studentList.get(StudentStatus.APPROVED).add(student);
                    } else if (student.getApproved2().equalsIgnoreCase(StudentStatus.RECUPERATION)) {
                        studentList.get(StudentStatus.RECUPERATION).add(student);
                    } else if (student.getApproved2().equalsIgnoreCase(StudentStatus.REPROVED)) {
                        studentList.get(StudentStatus.REPROVED).add(student);
                    } else {
                        System.out.println("Error determining student status.");
                    }
                }

                // Display disciplines for each student
                for (Student student : students) {
                    System.out.println("Student: " + student.getName());
//                    for (Discipline discipline : student.getDiscipline()) {
//                        System.out.println("Discipline: " + discipline.getDisciplinesName());
//                    }
                    System.out.println(student.getApproved2());
                    System.out.println(student.getAverage());

                    JOptionPane.showMessageDialog(null,"Name: " + student.getName() + ","
                            + student.getDiscipline().iterator().next().getDisciplinesName() + ", "
                            + student.getApproved() + ", " + student.getAverage());
                }

                // Modify a specific student's data
                for (int i = 0; i < students.size(); i++) {
                    Student studentPosition = students.get(i);

                    if (studentPosition.getName().equalsIgnoreCase("Daniel")) {
                        Student changeStudent = new Student();
                        changeStudent.setName("Daniel");

                        Discipline discipline = new Discipline();
                        discipline.setDisciplinesName("Math");
                        discipline.setGrades(90);
                        changeStudent.getDiscipline().add(discipline);

                        students.set(i, changeStudent);
                    }
                }

            } else {
                System.out.println("Access not permitted.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"error process grade");
            throw e;
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"error process grade don't be empty");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error process program");
            throw new RuntimeException(e);
        } finally {
            JOptionPane.showMessageDialog(null,"Thank you for using our program");
        }
    }
}
