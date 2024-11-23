package student.utilities;

import student.abstracts.People;
import student.testsClass.SalaryStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Student class represents a student in the system. It extends the People class and provides
 * additional attributes and methods related to a student's school enrollment, grades, and academic status.
 */
public class Student extends People {

    // Attributes
    private String enrollmentDate;  // Date when the student enrolled
    private String seriesEnrolled;  // The grade level the student is enrolled in
    private String nameSchool;      // The name of the school the student is attending
    private List<Discipline> discipline = new ArrayList<>();  // List of disciplines the student is enrolled in

    /**
     * Default constructor for Student.
     */
    public Student() {
    }

    /**
     * Constructor for initializing a Student with a name and age.
     *
     * @param nameStudent the student's name
     * @param ageStudent the student's age
     */
    public Student(String nameStudent, int ageStudent) {
        super();
        setName(nameStudent);
        setAge(ageStudent);
    }

    /**
     * Gets the enrollment date of the student.
     *
     * @return the enrollment date
     */
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the enrollment date of the student.
     *
     * @param enrollmentDate the enrollment date to set
     */
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * Gets the series (grade level) the student is enrolled in.
     *
     * @return the series enrolled
     */
    public String getSeriesEnrolled() {
        return seriesEnrolled;
    }

    /**
     * Sets the series (grade level) the student is enrolled in.
     *
     * @param seriesEnrolled the series to set
     */
    public void setSeriesEnrolled(String seriesEnrolled) {
        this.seriesEnrolled = seriesEnrolled;
    }

    /**
     * Gets the list of disciplines the student is enrolled in.
     *
     * @return the list of disciplines
     */
    public List<Discipline> getDiscipline() {
        return discipline;
    }

    /**
     * Sets the list of disciplines the student is enrolled in.
     *
     * @param discipline the disciplines to set
     */
    public void setDiscipline(List<Discipline> discipline) {
        this.discipline = discipline;
    }

    /**
     * Gets the name of the school the student is attending.
     *
     * @return the name of the school
     */
    public String getNameSchool() {
        return nameSchool;
    }

    /**
     * Sets the name of the school the student is attending.
     *
     * @param nameSchool the name of the school to set
     */
    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    /**
     * Calculates the average grade of the student based on the grades of all disciplines.
     *
     * @return the average grade
     */
    public double getAverage() {
        double sumGrades = 0.0;
        for (Discipline discipline1 : discipline) {
            sumGrades += discipline1.getSumGrades();
        }
        return sumGrades / discipline.size();
    }

    /**
     * Determines if the student is approved based on the average grade.
     * A student is approved if the average is greater than 70.
     *
     * @return true if the student is approved, false otherwise
     */
    public boolean getApproved() {
        return getAverage() > 70;
    }

    /**
     * Determines the student's status based on their average grade.
     * - Approved if average > 70
     * - Recuperation if average between 60 and 70
     * - Reproved if average < 60
     *
     * @return the student's status
     */
    public String getApproved2() {
        double average = getAverage();
        if (average > 70) {
            return StudentStatus.APPROVED;
        } else if (average > 60) {
            return StudentStatus.RECUPERATION;
        } else {
            return StudentStatus.REPROVED;
        }
    }

    /**
     * Returns the salary of the student (though students typically don't have salaries).
     * This is a placeholder for a system where a student's scholarship or other earnings might be tracked.
     *
     * @return the student's salary (fixed value)
     */
    @Override
    public double salary() {
        return SalaryStatus.salaryStudent;
    }

    /**
     * Returns a string representation of the Student object, including school name and disciplines.
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "Student{" +
                "nameSchool='" + nameSchool + '\'' +
                ", discipline=" + discipline +
                '}';
    }
}
