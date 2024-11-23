package student.abstracts;

import student.testsClass.AdultStatus;

import java.util.Objects;

/**
 * Abstract class representing a general person with basic personal attributes.
 * Subclasses are expected to extend this class and provide additional functionalities.
 * <p>
 * Note: Ensure that sensitive data (e.g., CPF) complies with privacy regulations if used in production.
 * </p>
 */
public abstract class People {

    /** The name of the person. */
    private String name;

    /** The age of the person. */
    private int age;

    /** The birth date of the person in a format (e.g., yyyy-MM-dd). */
    private String dateBorn;

    /** The national identification number (RG) of the person. */
    private String rg;

    /** The tax identification number (CPF) of the person. */
    private String cpf;

    /** The father's name of the person. */
    private String fatherName;

    /** The mother's name of the person. */
    private String motherName;

    /**
     * Abstract method to calculate the salary of a person.
     * Subclasses must implement this method to define how salary is calculated.
     *
     * @return the salary of the person.
     */
    public abstract double salary();

    /**
     * Gets the name of the person.
     *
     * @return the name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to set. Consider adding validation for empty or invalid names.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return the age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the age to set. Must be non-negative.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the birth date of the person.
     *
     * @return the birth date of the person.
     */
    public String getDateBorn() {
        return dateBorn;
    }

    /**
     * Sets the birth date of the person.
     *
     * @param dateBorn the birth date to set. Validate the format (e.g., yyyy-MM-dd).
     */
    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    /**
     * Gets the national identification number (RG) of the person.
     *
     * @return the RG of the person.
     */
    public String getRg() {
        return rg;
    }

    /**
     * Sets the national identification number (RG) of the person.
     *
     * @param rg the RG to set.
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Gets the tax identification number (CPF) of the person.
     *
     * @return the CPF of the person.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the tax identification number (CPF) of the person.
     *
     * @param cpf the CPF to set. Consider validating the CPF format.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Gets the father's name of the person.
     *
     * @return the father's name.
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the father's name of the person.
     *
     * @param fatherName the father's name to set.
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /**
     * Gets the mother's name of the person.
     *
     * @return the mother's name.
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the mother's name of the person.
     *
     * @param motherName the mother's name to set.
     */
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    /**
     * Determines whether the person is an adult.
     * The threshold age for adulthood is 18.
     *
     * @return {@code AdultStatus.ADULT} if age is 18 or above, otherwise {@code AdultStatus.UNDERAGE}.
     */
    public String getAdult() {
        return getAge() >= 18 ? AdultStatus.ADULT : AdultStatus.UNDERAGE;
    }

    /**
     * Checks equality based on the CPF field.
     *
     * @param o the object to compare with.
     * @return {@code true} if the objects are equal based on CPF, otherwise {@code false}.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(cpf, people.cpf);
    }

    /**
     * Generates a hash code based on the CPF field.
     *
     * @return the hash code for the object.
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    /**
     * Provides a string representation of the person's attributes.
     *
     * @return a string containing the person's attributes.
     * Note: Mask sensitive fields like CPF if used in a public or logged context.
     */
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateBorn='" + dateBorn + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
