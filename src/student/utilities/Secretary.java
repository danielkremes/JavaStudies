package student.utilities;

import student.abstracts.People;
import student.interfaces.AllowAccess;
import student.testsClass.SalaryStatus;

/**
 * The Secretary class represents a secretary in the system.
 * It extends the People class and implements the AllowAccess interface for authentication purposes.
 */
public class Secretary extends People implements AllowAccess {
    private String Register;  // The secretary's registration number
    private int LevelJob;     // The secretary's job level
    private double Experience; // The secretary's years of experience
    private String user;
    private String password;

    // Constructor for Secretary with name and age
    public Secretary(String nameSecretary, int ageSecretary) {
        super();
        setName(nameSecretary);
        setAge(ageSecretary);
    }

    // Default constructor
    public Secretary() { }

    // Constructor that accepts user credentials (currently used)
    public Secretary(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * Gets the registration number of the secretary.
     *
     * @return the registration number
     */
    public String getRegister() {
        return Register;
    }

    /**
     * Sets the registration number of the secretary.
     *
     * @param register the registration number to set
     */
    public void setRegister(String register) {
        Register = register;
    }

    /**
     * Gets the job level of the secretary.
     *
     * @return the job level
     */
    public int getLevelJob() {
        return LevelJob;
    }

    /**
     * Sets the job level of the secretary.
     *
     * @param levelJob the job level to set
     */
    public void setLevelJob(int levelJob) {
        LevelJob = levelJob;
    }

    /**
     * Gets the years of experience of the secretary.
     *
     * @return the years of experience
     */
    public double getExperience() {
        return Experience;
    }

    /**
     * Sets the years of experience of the secretary.
     *
     * @param experience the years of experience to set
     */
    public void setExperience(double experience) {
        Experience = experience;
    }

    /**
     * Returns the salary of the secretary.
     *
     * @return the salary
     */
    @Override
    public double salary() {
        return SalaryStatus.salarySecretary;
    }

    /**
     * Returns a string representation of the Secretary object, including its register, job level, and experience.
     *
     * @return a string representation of the secretary
     */
    @Override
    public String toString() {
        return "Secretary{" +
                "Register='" + Register + '\'' +
                ", LevelJob=" + LevelJob +
                ", Experience=" + Experience +
                '}';
    }

    @Override
    public boolean allowAccess() {
        System.out.println("Authenticating user: " + user + " with password: " + password);
        return user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234");
    }

}
