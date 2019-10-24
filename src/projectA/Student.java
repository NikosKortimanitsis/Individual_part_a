/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectA;

/**
 *
 * @author korti
 */
public class Student {

    //variables declaration
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double tuitionFees;

    //constructor
    public Student(String firstName, String lastName, String dateOfBirth, double tuitionFees){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    //set-get methods
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public double getFees(){
        return this.tuitionFees;
    }

    public void setFees(double tuitionFees){
        this.tuitionFees = tuitionFees;
    }

    public void print(){
        System.out.println("First Name: " +getFirstName() + ",Last Name: " +getLastName() +",Date of Birth: " +getDateOfBirth() + ",Tuition Fees: " + getFees());
    }

}