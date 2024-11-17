import student.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Set grades
        student.setGradeOne(90);
        student.setGradeTwo(90);
        student.setGradeThree(90);
        student.setGradeFour(90);

        // Show average grade
        System.out.println("Average student: " + student.getAverage());
        // Show student approved or not
        System.out.println("Student Approved " + student.getApproved());

    }
}