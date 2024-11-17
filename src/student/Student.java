package student;

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

    private double gradeOne;
    private double gradeTwo;
    private double gradeThree;
    private double gradeFour;

    public Student() {

    }

    // Add constructor with two parameters (nameStudent, ageStudent)
    public Student(String nameStudent, int ageStudent) {
        nameStudent = this.getName();
        ageStudent = this.getAge();
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

    public double getGradeOne() {
        return gradeOne;
    }

    public void setGradeOne(double gradeOne) {
        this.gradeOne = gradeOne;
    }

    public double getGradeTwo() {
        return gradeTwo;
    }

    public void setGradeTwo(double gradTwo) {
        this.gradeTwo = gradTwo;
    }

    public double getGradeThree() {
        return gradeThree;
    }

    public void setGradeThree(double gradeThree) {
        this.gradeThree = gradeThree;
    }

    public double getGradeFour() {
        return gradeFour;
    }

    public void setGradeFour(double gradeFour) {
        this.gradeFour = gradeFour;
    }

    // Add method calculate average with based in 4 grades.
    public double getAverage() {
        return ( getGradeOne() + getGradeTwo() + getGradeThree() + getGradeFour() ) / 4;
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
}