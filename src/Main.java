import student.Discipline;
import student.Student;
import student.StudentStatus;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String password = JOptionPane.showInputDialog("Password");
        String user = JOptionPane.showInputDialog("User");

        if (password.equalsIgnoreCase("1234") && user.equalsIgnoreCase("user")) {

            List<Student> students = new ArrayList<>();

            // List<Student> studentsApproved = new ArrayList<>();
            // List<Student> studentsReproved = new ArrayList<>();
            // List<Student> studentsRecuperation = new ArrayList<>();

            HashMap<String, List<Student>> studentList = new HashMap<>();

            for (int qtdStudent = 0; qtdStudent < 2; qtdStudent++) {
                Student student = new Student();
                // Get name student
                String nameStudent = JOptionPane.showInputDialog("Enter name student ?");
                student.setName(nameStudent);

                // Loop for get name and grade for discipline
                for (int i = 1; i <= 4; i++) {
                    Discipline discipline1 = new Discipline();

                    // Get and Set grade for student
                    String nameDiscipline = JOptionPane.showInputDialog("Name discipline " + i + " ?");
                    discipline1.setDisciplinesName(nameDiscipline);

                    String grade = JOptionPane.showInputDialog("Enter tbe grade " + i + " ?");
                    discipline1.setGrades(Double.parseDouble(grade));

                    student.getDiscipline().add(discipline1);
                }

                int chooseRemoveDiscipline = JOptionPane.showConfirmDialog(null, "Would you like to remove any discipline?");

                if (chooseRemoveDiscipline == 0) {
                    int continueRemove = 0;

                    while (continueRemove == 0) {
                        for (int i = 0; i < student.getDiscipline().size(); i++) {
                            // Display the list of disciplines with numbers
                            System.out.println("List of Disciplines:");
                            System.out.println((i + 1) + ". " + student.getDiscipline().get(i).getDisciplinesName());
                        }
                        // Get and Set grade for student
                        String nameDisciplineRemove = JOptionPane.showInputDialog("Name discipline 1,2,3,4 ?");
                        student.getDiscipline().remove(Integer.parseInt(nameDisciplineRemove) - 1);

                        for (int i = 0; i < student.getDiscipline().size(); i++) {
                            System.out.println("Discipline " + student.getDiscipline().get(i).getDisciplinesName());
                            continueRemove = JOptionPane.showConfirmDialog(null, "Would you like to continue remove any discipline ?");
                        }
                    }
                }
                students.add(student);
            } //////////////////////////////////////

            // Show average
//        for (Student student : students) {
//            System.out.println("*********************************************");
//            System.out.println("Name student " + student.getName());
//            System.out.println("Average student: " + student.getAverage());
//            System.out.println("Student approved: " + student.getApproved());
//            System.out.println("*********************************************");
//        }

//        // Search student in list
//
//        for (Student student : students) {
//            if (student.getName().equalsIgnoreCase("Daniel")) {
//                System.out.println("*********************************************");
//                System.out.println("Name student " + student.getName());
//                System.out.println("Average student: " + student.getAverage());
//                System.out.println("Student approved: " + student.getApproved());
//                System.out.println("*********************************************");
//            } else {
//                break;
//            }
//        }

            // Remove student in list
//        for (Student student : students) {
//            if (student.getName().equalsIgnoreCase("Daniel")) {
//                System.out.println("*********************************************");
//                System.out.println("Name student " + student.getName());
//                System.out.println("Average student: " + student.getAverage());
//                System.out.println("Student approved: " + student.getApproved());
//                System.out.println("*********************************************");
//                students.remove(student);
//            } else {
//                break;
//            }
//        }

            // get disciplines
            for (int i = 0; i < students.size(); i++) {
                Student studentPosition = students.get(i);

                for (int j = 0; j < studentPosition.getDiscipline().size(); j++) {
                    System.out.println(studentPosition.getDiscipline().get(j).getDisciplinesName());
                }
            }

            // Change student in list
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
                } else {
                    break;
                }
            }

            studentList.put(StudentStatus.APPROVED, new ArrayList<>());
            studentList.put(StudentStatus.RECUPERATION, new ArrayList<>());
            studentList.put(StudentStatus.REPROVED, new ArrayList<>());

            // Student Approved, Recuperation, Reproved
            for (Student student : students) {
                if (student.getName().equalsIgnoreCase(StudentStatus.APPROVED)) {
                    studentList.get(StudentStatus.APPROVED).add(student);
                } else if (student.getName().equalsIgnoreCase(StudentStatus.RECUPERATION)) {
                    studentList.get(StudentStatus.RECUPERATION).add(student);
                } else if (student.getName().equalsIgnoreCase(StudentStatus.REPROVED)) {
                    studentList.get(StudentStatus.REPROVED).add(student);
                } else {
                    System.out.println("Error");
                }
            }
        } else {
            System.out.println("Access not permitted");
        }
    }
}