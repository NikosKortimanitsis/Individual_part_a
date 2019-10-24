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
public class Course {

    //variables declaration
    private String title;
    private String stream;
    private String type;
    private String start_date;
    private String end_date;

    //constructor
    public Course(String title, String stream, String type, String start_date, String end_date){
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    //set-get methods
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getStream(){
        return this.stream;
    }

    public void setStream(String stream){ this.stream = stream; }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getStartDate(){
        return this.start_date;
    }

    public void setStartDate(String start_date){
        this.start_date = start_date;
    }

    public String getEndDate(){
        return this.end_date;
    }

    public void setEndDate(String end_date){
        this.end_date = end_date;
    }

    public void print(){
        System.out.println("Course Title: " +getTitle());
    }
}