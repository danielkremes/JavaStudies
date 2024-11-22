package student;

public class Director {
    private String educationRegister;
    private String lengthService;
    private String degree;

    public String getEducationRegister() {
        return educationRegister;
    }

    public void setEducationRegister(String educationRegister) {
        this.educationRegister = educationRegister;
    }

    public String getLengthService() {
        return lengthService;
    }

    public void setLengthService(String lengthService) {
        this.lengthService = lengthService;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Director{" +
                "educationRegister='" + educationRegister + '\'' +
                ", lengthService='" + lengthService + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
