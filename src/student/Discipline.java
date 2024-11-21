package student;

public class Discipline {

    private double grades;
    private String disciplinesName;

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String getDisciplinesName() {
        return disciplinesName;
    }

    public void setDisciplinesName(String disciplinesName) {
        this.disciplinesName = disciplinesName;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "grades=" + grades +
                ", disciplinesName='" + disciplinesName + '\'' +
                '}';
    }
}
