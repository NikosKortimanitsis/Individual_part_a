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
public class SubscribedStudent {

    //variables declaration
    private int studentId;
    private int courseId;

    //constructor
    public SubscribedStudent(int studentId, int courseId){
        this.studentId = studentId;
        this.courseId = courseId;
    }

    //set-get methods
    public int getStudentId(){
        return this.studentId;
    }
    public int getCourseId(){
        return this.courseId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
}
