package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    // Attributes
    private String name;
    private int age;
    private String birthDate;
    private String numberCPF;
    private String rg;
    private String fatherName;
    private String motherName;
    private String gradeEnrollment;
    private String nameSchool;

    List<Discipline> discipline = new ArrayList<>();

    public Student() {

    }

    // Add constructor with two parameters (nameStudent, ageStudent)
    public Student(String nameStudent, int ageStudent) {
        nameStudent = this.getName();
        ageStudent = this.getAge();
    }

    public List<Discipline> getDiscipline() {
        return discipline;
    }

    public void setDiscipline(List<Discipline> discipline) {
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNumberCPF() {
        return numberCPF;
    }

    public void setNumberCPF(String numberCPF) {
        this.numberCPF = numberCPF;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGradeEnrollment() {
        return gradeEnrollment;
    }

    public void setGradeEnrollment(String gradeEnrollment) {
        this.gradeEnrollment = gradeEnrollment;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numberCPF, student.numberCPF) && Objects.equals(rg, student.rg) && Objects.equals(nameSchool, student.nameSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCPF, rg, nameSchool);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", numberCPF='" + numberCPF + '\'' +
                ", rg='" + rg + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", gradeEnrollment='" + gradeEnrollment + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                ", discipline=" + discipline +
                '}';
    }
}