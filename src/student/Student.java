package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends People{

    // Attributes
    private String enrollmentDate;
    private String seriesEnrolled;
    private String nameSchool;

    List<Discipline> discipline = new ArrayList<>();

    public Student() {

    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getSeriesEnrolled() {
        return seriesEnrolled;
    }

    public void setSeriesEnrolled(String seriesEnrolled) {
        this.seriesEnrolled = seriesEnrolled;
    }

    public List<Discipline> getDiscipline() {
        return discipline;
    }

    public void setDiscipline(List<Discipline> discipline) {
        this.discipline = discipline;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    // Add method calculate average with based in 4 grades.
    public double getAverage() {
        double sum = 0.0;
        for (Discipline discipline1 : discipline) {
            sum += discipline1.getGrades();
        }
        return sum / discipline.size();
    }

    // Add method to Approved or Reproved
    public boolean getApproved() {
        if (getAverage() > 50) {
            if (getAverage() > 70) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Add method 2 to Approved or Reproved
    public String getApproved2() {
        double average = getAverage();
        if (average > 60) {
            if (average > 70) {
                return StudentStatus.APPROVED;
            } else {
                return StudentStatus.RECUPERATION;
            }
        } else {
            return StudentStatus.REPROVED;
        }
    }



    @Override
    public String toString() {
        return "Student{" +
                ", nameSchool='" + nameSchool + '\'' +
                ", discipline=" + discipline +
                '}';
    }
}