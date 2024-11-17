import student.Student;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Get name student
        String nameStudent = JOptionPane.showInputDialog("Enter name student ?");
        student.setName(nameStudent);

        // Get and Set grade for student
        String gradeOne = JOptionPane.showInputDialog("Enter tbe grade one ");
        student.setGradeOne(Double.parseDouble(gradeOne));

        String gradeTwo = JOptionPane.showInputDialog("Enter tbe grade two ");
        student.setGradeTwo(Double.parseDouble(gradeTwo));

        String gradeThree = JOptionPane.showInputDialog("Enter tbe grade three ");
        student.setGradeThree(Double.parseDouble(gradeThree));

        String gradeFour = JOptionPane.showInputDialog("Enter tbe grade four ");
        student.setGradeFour(Double.parseDouble(gradeFour));

        // Show average grade
        System.out.println("Average student: " + student.getAverage());
        // Show student approved or not
        System.out.println("Student Approved " + student.getApproved());

    }
}