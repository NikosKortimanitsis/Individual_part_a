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
public class AssignedTrainer {

    //variables declaration
    private int trainerId;
    private int courseId;

    //constructor
    public AssignedTrainer(int trainerId, int courseId){
        this.trainerId = trainerId;
        this.courseId = courseId;
    }

    //set-get methods
    public int getTrainerId(){
        return this.trainerId;
    }
    public int getCourseId(){
        return this.courseId;
    }
    public void setTrainerId(int trainerId){
        this.trainerId = trainerId;
    }
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
}

