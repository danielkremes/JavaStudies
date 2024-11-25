package arrays;

import student.utilities.Discipline;
import student.utilities.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDiscipline {
    public static void main(String[] args) {
        Student student = new Student();
        List<Discipline> disciplines = new ArrayList<>();

        try {
            //Loop quantity student
            for (int i = 0; i < 1; i ++) {
                String studentName = JOptionPane.showInputDialog("Name student ? ");
                student.setName(studentName);

                //Loop names disciplines and grades
                for (int position = 0; position < 2; position ++) {

                    Discipline discipline1 = new Discipline();
                    String nameDiscipline = JOptionPane.showInputDialog("Name discipline: " + (position + 1) + " ? ");
                    String grades = JOptionPane.showInputDialog("Grade " + (position + 1) + " ? ");

                    discipline1.setGrades(Double.parseDouble(grades));
                    discipline1.setDisciplinesName(nameDiscipline);
                    disciplines.add(discipline1);
                }

                student.setDiscipline(disciplines);
            }

            for (Discipline d: student.getDiscipline()) {
                System.out.println(d.getDisciplinesName());
                System.out.println(Arrays.toString(d.getGrades()));
                System.out.println("Largest grade is: " + d.getLargerGrade());
                System.out.println("Less grade is: " + d.getSmallestGrade());
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Format Invalid");
            throw new RuntimeException(e.getMessage());
        }

        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
