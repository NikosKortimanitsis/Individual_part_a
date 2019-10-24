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
public class Assignment {

    //variables declaration
    private String title;
    private String description;
    private String subDateTime;
    private double oralMark;
    private double totalMark;

    //constructor
    public Assignment(String title, String description, String subDateTime, double oralMark, double totalMark){
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    //set-get methods
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getSubDateTime(){
        return this.subDateTime;
    }

    public void setSubDateTime(String subDateTime){
        this.subDateTime = subDateTime;
    }

    public double getOralMark(){
        return this.oralMark;
    }

    public void setOralMark(double oralMark){
        this.oralMark = oralMark;
    }

    public double getTotalMark(){
        return this.totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public void print (){
        System.out.println("Assignment Title:" +getTitle() + ", Submission Date: " +getSubDateTime());
        }
}
