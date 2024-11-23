package arrays;

import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.util.Arrays;

/**
 * @author Daniel Renato Kremes
 * @date: 11/23/2024
 */

public class Main {

    public static void main(String[] args) {

        try {
            /// @array with 3 positions
            /// @param default: 0
            double[] salary = new double[4];

            salary[0] = 1;
            salary[1] = 2;
            salary[2] = 3;
            salary[3] = 4;

            System.out.println(Arrays.toString(salary));
            System.out.println(salary[0]);
            System.out.println(salary[1]);
            System.out.println(salary[2]);

            System.out.println("*******************");

            for (int i = 0; i < salary.length; i++) {
                System.out.println("Nota " +  (i + 1)  + ": " + salary[i]);
            }

            System.out.println("*******************");

            String sizeArray = JOptionPane.showInputDialog("Enter the size of array ?");

            int[] grades = new int[Integer.parseInt(sizeArray)];

            /*
              @return array with grades
             */
            for (int i = 0; i < grades.length; i++) {
                String grade = JOptionPane.showInputDialog("enter the grade " + (i + 1) + "?");
                grades[i] = Integer.parseInt(grade);
            }

            System.out.println(Arrays.toString(grades));
            System.out.println(Arrays.stream(grades).sum());
            System.out.println(Arrays.stream(grades).average());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
