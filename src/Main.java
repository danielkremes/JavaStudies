import student.Student;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Get name student
        String nameStudent = JOptionPane.showInputDialog("Enter name student ?");
        student.setName(nameStudent);

        // Get and Set grade for student
        String gradeOne = JOptionPane.showInputDialog("Enter tbe grade one ");
        student.getDiscipline().setGradeOne(Double.parseDouble(gradeOne));

        String gradeTwo = JOptionPane.showInputDialog("Enter tbe grade two ");
        student.getDiscipline().setGradeTwo(Double.parseDouble(gradeTwo));

        String gradeThree = JOptionPane.showInputDialog("Enter tbe grade three ");
        student.getDiscipline().setGradeThree(Double.parseDouble(gradeThree));

        String gradeFour = JOptionPane.showInputDialog("Enter tbe grade four ");
        student.getDiscipline().setGradeFour(Double.parseDouble(gradeFour));

        // Show average grade
        System.out.println("Average student: " + student.getAverage());
        // Show student approved or not
        System.out.println("Student Approved " + student.getApproved());

    }
}