package student.utilities;

/**
 * The Discipline class represents an academic discipline for a student.
 * It holds information about the discipline's name and the student's grade in that discipline.
 */
public class Discipline {

    private double grades;             // The grade achieved by the student in the discipline
    private String disciplinesName;    // The name of the academic discipline

    /**
     * Gets the grade achieved by the student in the discipline.
     *
     * @return the grade in the discipline
     */
    public double getGrades() {
        return grades;
    }

    /**
     * Sets the grade for the discipline.
     *
     * @param grades the grade to set
     */
    public void setGrades(double grades) {
        this.grades = grades;
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
     * Returns a string representation of the Discipline object,
     * including the discipline's name and the student's grade.
     *
     * @return a string representation of the discipline
     */
    @Override
    public String toString() {
        return "Discipline{" +
                "grades=" + grades +
                ", disciplinesName='" + disciplinesName + '\'' +
                '}';
    }
}
