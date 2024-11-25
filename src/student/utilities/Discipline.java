package student.utilities;

import java.util.Arrays;

/**
 * The Discipline class represents an academic discipline for a student.
 * It holds information about the discipline's name and the student's grade in that discipline.
 */
public class Discipline {

    private double[] grades = new double[4];             // The grade achieved by the student in the discipline
    private String disciplinesName;    // The name of the academic discipline

    /**
     * Gets the grade achieved by the student in the discipline.
     *
     * @return the grade in the discipline
     */
    public double[] getGrades() {
        return grades;
    }

    /**
     * Sets the grade for the discipline.
     *
     * @param grades the grade to set
     */
    public void setGrades(double grades) {
        this.grades = new double[]{grades};
    }

    /**
     * Gets the name of the academic discipline.
     *
     * @return the name of the discipline
     */
    public String getDisciplinesName() {
        return disciplinesName;
    }

    /**
     * Sets the name of the academic discipline.
     *
     * @param disciplinesName the name of the discipline to set
     */
    public void setDisciplinesName(String disciplinesName) {
        this.disciplinesName = disciplinesName;
    }

    /**
     * Calculates the total sum of all grades in the array.
     * <p>
     * Iterates through the array of grades and adds each grade to a running total.
     * This method ensures that the sum is calculated correctly without redundancy.
     *
     * @return the total sum of all grades in the {@code grades} array.
     */
    public double getSumGrades() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade; // Correctly adds each grade
        }
        return sum;
    }

    /**
     * Finds the largest grade from the grades array.
     *
     * @return the highest grade in the grades array
     */
    public double getLargerGrade () {
        double gradeMax = Double.NEGATIVE_INFINITY; // Start with the lowest possible value
        for (Double grade: getGrades()) {  // Use a foreach loop for simplicity
            if (grade > gradeMax) {
                gradeMax = grade;
            }
        }
        return gradeMax;
    }

    /**
     * Finds the smallest grade from the grades array.
     *
     * @return the smallest grade in the grades array
     */
    public double getSmallestGrade() {
        double gradeMin = Double.POSITIVE_INFINITY;  // Start with the highest possible value
        for (double grade: getGrades()) {
           if (grade < gradeMin) {
               gradeMin = grade;
           }
        }
        return gradeMin;
    }

    /**
     * Returns a string representation of the Discipline object,
     * including the discipline's name and the student's grade.
     *
     * @return a string representation of the discipline
     */
    @Override
    public String toString() {
        return "Discipline{" +
                "grades=" + Arrays.toString(grades) +
                ", disciplinesName='" + disciplinesName + '\'' +
                '}';
    }
}
