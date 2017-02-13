package edu.tomer;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String socialID;

    public Person() {
        firstName = IO.getString("Enter First Name:");
        lastName = IO.getString("Enter Last Name: ");
        socialID = IO.getString("Enter Social ID:");
    }

    public Person(String firstName, String lastName, String socialID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialID() {
        return socialID;
    }

    public void setSocialID(String socialID) {
        this.socialID = socialID;
    }

    public void print() {
        System.out.printf("First Name: %s\n" +
                "Last Name: %s\n" +
                "Social ID: %s\n",
                firstName, lastName, socialID);
    }
}
