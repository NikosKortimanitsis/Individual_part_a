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
public class Trainer {

    //variables declaration
    private String firstName;
    private String lastName;
    private String subject;

    //constructor
    public Trainer(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public void print(){
        System.out.println("First Name: " +getFirstName() + ",Last Name: " +getLastName());
    }

}

