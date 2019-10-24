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
public class CourseAssignment {

    //variables declaration
    private int assignmentId;
    private int courseId;

    //constructor
    public CourseAssignment(int assignmentId, int courseId){
        this.assignmentId = assignmentId;
        this.courseId = courseId;
    }

    //set-get methods
    public int getAssignmentId(){
        return this.assignmentId;
    }
    public int getCourseId(){
        return this.courseId;
    }
    public void setAssignmentId(int assignmentId){
        this.assignmentId = assignmentId;
    }
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
}
