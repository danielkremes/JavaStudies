package student.utilities;

import student.abstracts.People;
import student.testsClass.AdultStatus;
import student.testsClass.SalaryStatus;

/**
 * The Director class represents a director in the educational institution.
 * It extends from the abstract People class and implements the necessary methods
 * to calculate the salary, determine the adult status, and display the director's information.
 */
public class Director extends People {

    private String educationRegister;  // Education register of the director
    private String lengthService;      // Length of service as a director
    private String degree;             // Degree or educational qualification of the director

    /**
     * Default constructor for Director.
     * Initializes a new Director instance without any specific attributes set.
     */
    public Director () {

    }

    /**
     * Constructor to initialize a Director with a name and age.
     * This is helpful for setting up a Director object with basic information.
     *
     * @param nameDirector the name of the director
     * @param ageDirector  the age of the director
     */
    public Director (String nameDirector, int ageDirector) {
        super();
        setName(nameDirector);
        setAge(ageDirector);
    }

    /**
     * Gets the education register of the director.
     *
     * @return the education register
     */
    public String getEducationRegister() {
        return educationRegister;
    }

    /**
     * Sets the education register of the director.
     *
     * @param educationRegister the education register to set
     */
    public void setEducationRegister(String educationRegister) {
        this.educationRegister = educationRegister;
    }

    /**
     * Gets the length of service of the director.
     *
     * @return the length of service
     */
    public String getLengthService() {
        return lengthService;
    }

    /**
     * Sets the length of service for the director.
     *
     * @param lengthService the length of service to set
     */
    public void setLengthService(String lengthService) {
        this.lengthService = lengthService;
    }

    /**
     * Gets the degree of the director.
     *
     * @return the degree of the director
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the degree of the director.
     *
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Calculates and returns the salary of the director.
     * The salary is fetched from the SalaryStatus class.
     *
     * @return the salary of the director
     */
    @Override
    public double salary() {
        return SalaryStatus.salaryDirector;
    }

    /**
     * Determines the adult status of the director based on age.
     * If the director's age is above 60, they are considered elderly.
     * If their age is between 18 and 60, they are considered an adult.
     * If their age is below 18, they are considered underage.
     *
     * @return a string representing the adult status of the director
     */
    @Override
    public String getAdult() {
        if (getAge() > 60) {
            return AdultStatus.ELDERLY;
        } else if (getAge() > 18 && getAge() < 60) {
            return AdultStatus.ADULT;
        } else {
            return AdultStatus.UNDERAGE;
        }
    }

    /**
     * Provides a string representation of the Director object, including its attributes.
     *
     * @return a string representation of the Director object
     */
    @Override
    public String toString() {
        return "Director{" +
                "educationRegister='" + educationRegister + '\'' +
                ", lengthService='" + lengthService + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
