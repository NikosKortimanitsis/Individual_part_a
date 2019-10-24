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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Bootcamp {

    //variables declaration
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Trainer> trainerList = new ArrayList<>();
    private ArrayList<Course> courseList = new ArrayList<>();
    private ArrayList<Assignment> assignmentList = new ArrayList<>();
    private ArrayList<SubscribedStudent> subscribedStudentList = new ArrayList<>();
    private ArrayList<AssignedTrainer> assignedTrainerList = new ArrayList<>();
    private ArrayList<CourseAssignment> courseAssignmentList = new ArrayList<>();

    //constructor
    public Bootcamp(){
    }

    public void insertStudent(Student student){
        studentList.add(student);
    }

    public void insertTrainer(Trainer trainer){
        trainerList.add(trainer);
    }

    public void insertCourse(Course course){
        courseList.add(course);
    }

    public void insertAssignment(Assignment assignment) { assignmentList.add(assignment); }

    public void insertSubscribedStudent(SubscribedStudent subscribedStudent){
        subscribedStudentList.add(subscribedStudent);
    }

    public void insertAssignedTrainer(AssignedTrainer assignedTrainer){
        assignedTrainerList.add(assignedTrainer);
    }

    public void insertCourseAssignment(CourseAssignment courseAssignment){
        courseAssignmentList.add(courseAssignment);
    }

    public int giveCoursesListSize(){
        int size = courseList.size();
        return size;
    }

    public int giveAssignmentListSize(){
        int size = assignmentList.size();
        return size;
    }
    /**
     * This method prints out all students
     */
    public void printStudentList() {
        for (int i = 0; i < studentList.size(); i++) {

            System.out.printf((i+1) +". ");
            studentList.get(i).print();
        }

    }

    /**
     * This method prints out all trainers
     */
    public void printTrainerList() {
        for (int i = 0; i < trainerList.size(); i++) {

            System.out.printf((i+1) +". ");
            trainerList.get(i).print();
        }

    }

    /**
     * This method prints out all courses
     */
    public void printCourseList() {
        for (int i = 0; i < courseList.size(); i++) {

            System.out.printf((i+1) +". ");
            courseList.get(i).print();
        }

    }

    /**
     * This method prints out all assignments
     */
    public void printAssignmentList() {
        for (int i = 0; i < assignmentList.size(); i++){

            System.out.printf((i+1) + ". ");
            assignmentList.get(i).print();

        }
    }

    /**
     * This method prints out all the students per course
     */
    public void printSubscribedStudentList() {
        for (int i = 0; i < courseList.size(); i++) {
            boolean foundStudent = false;
            System.out.println("Course: " + courseList.get(i).getTitle());
            for (int j = 0; j < subscribedStudentList.size(); j++) {
                int courseId = subscribedStudentList.get(j).getCourseId();
                if (i == (courseId -1)){
                    foundStudent = true;
                    int studentId = subscribedStudentList.get(j).getStudentId();
                    System.out.println(" Student: " + studentList.get(studentId - 1).getFirstName() + " " + studentList.get(studentId - 1).getLastName());
                }
            }
            // if no student available for this course
            if (!foundStudent){
                System.out.println(" No Students available");
            }
            System.out.println("");
        }
    }

    /**
     * This method prints out all the trainers per course
     */
    public void printAssignedTrainerList() {
        for (int i = 0; i < courseList.size(); i++) {
            boolean foundTrainer = false;
            System.out.println("Course: " + courseList.get(i).getTitle());
            for (int j = 0; j < assignedTrainerList.size(); j++) {
                int courseId = assignedTrainerList.get(j).getCourseId();
                if (i == (courseId -1)){
                    foundTrainer = true;
                    int trainerId = assignedTrainerList.get(j).getTrainerId();
                    System.out.println(" Trainer: " + trainerList.get(trainerId - 1).getFirstName() + " " + trainerList.get(trainerId - 1).getLastName());
                }
            }
            // if no trainer available for this course
            if (!foundTrainer){
                System.out.println(" No Trainers available");
            }
            System.out.println("");
        }
    }

    /**
     * This method prints out all the assignments per course
     */
    public void printCourseAssignments() {
        for (int i = 0; i < courseList.size(); i++) {
            boolean foundAssignment = false;
            System.out.println("Course: " + courseList.get(i).getTitle());
            for (int j = 0; j < courseAssignmentList.size(); j++) {
                int courseId = courseAssignmentList.get(j).getCourseId();
                if (i == (courseId -1)){
                    foundAssignment = true;
                    int assignmentId = courseAssignmentList.get(j).getAssignmentId();
                    System.out.println(" Assignment: " + assignmentList.get(assignmentId - 1).getTitle());
                }
            }
            // if no assignment available for this course
            if (!foundAssignment){
                System.out.println(" No assignment available");
            }
            System.out.println("");
        }
    }

    /**
     * This method prints out all the assignments per student
     */
    public void printStudentAssignments() {
        for (int i = 0; i < studentList.size(); i++) {
            boolean foundAssignment = false;
            System.out.println("Student: " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
            for (int j = 0; j < subscribedStudentList.size(); j++) {
                for (int k = 0; k < courseAssignmentList.size(); k++){
                    int studentId = subscribedStudentList.get(j).getStudentId();

                    //if student is in subscribedStudentList
                    if (i == (studentId -1)){
                        int courseId1 = subscribedStudentList.get(j).getCourseId();
                        int courseId2 = courseAssignmentList.get(k).getCourseId();

                        //if course where the student is subscribed contains any assignment
                        if (courseId1 == courseId2) {
                            foundAssignment = true;
                            int assignmentId = courseAssignmentList.get(k).getAssignmentId();
                            System.out.println(" Assignment: " + assignmentList.get(assignmentId - 1).getTitle());
                        }
                    }
                }
            }
            // if no assignment available for this student
            if (!foundAssignment){
                System.out.println(" No assignment available");
            }
            System.out.println("");
        }
    }


    /**
     * This method prints out the students that
     * belong to more than one courses
     */
    public void printStudentInMultipleCourses() {

        for (int i = 0; i < studentList.size(); i++) {
            int subscribedInCourse = 0;
            for (int j = 0; j < subscribedStudentList.size(); j++) {
                int studentId = subscribedStudentList.get(j).getStudentId();
                if (i == (studentId - 1)) {
                    subscribedInCourse++;
                }
            }
            // if student[i] belongs to more than one courses (subscribedInCourse>=2)
            if (subscribedInCourse >= 2){
                System.out.println(" Student: " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
            }
        }
    }

    /**
     * This method prints out the students who
     * need to submit one or more assignments on the same
     * calendar week as the inputDate
     */
    public void findStudentAssignmentSubmission(String inputDate) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputDate, dateFormat);

        int inputDayOfMonth = date.getDayOfMonth();
        //Gets the day-of-week int value.
        //The values are numbered following the ISO-8601 standard, from 1 (Monday) to 7 (Sunday).
        int dayValue = date.getDayOfWeek().getValue();
        int mondayIntValue = 1;
        int fridayIntValue = 5;

        int startWeekDay = inputDayOfMonth - (mondayIntValue + dayValue);
        int endWeekDay = inputDayOfMonth + (fridayIntValue - dayValue);

        for (int i = 0; i < studentList.size(); i++) {
            boolean foundStudent = false;
            for (int j = 0; j < subscribedStudentList.size(); j++) {
                for (int k = 0; k < courseAssignmentList.size(); k++) {
                    int studentId = subscribedStudentList.get(j).getStudentId();

                    //if student is in subscribedStudentList
                    if (i == (studentId -1)) {
                        int courseId1 = subscribedStudentList.get(j).getCourseId();
                        int courseId2 = courseAssignmentList.get(k).getCourseId();

                        //if course where the student is subscribed contains any assignment
                        if (courseId1 == courseId2) {
                            int assignmentId = courseAssignmentList.get(k).getAssignmentId();
                            String subDateTime = assignmentList.get(assignmentId - 1).getSubDateTime();
                            LocalDate assignmentDate = LocalDate.parse(subDateTime, dateFormat);

                            //if year and month are the same we perform the days check
                            //otherwise we go to next assignment submission date
                            if ((assignmentDate.getYear() == date.getYear()) && (assignmentDate.getMonth() == date.getMonth())) {

                                int submissionDayOfMonth = assignmentDate.getDayOfMonth();
                                //If submissionDayOfMonth belongs to the following range: [startWeekDay - endWeekDay]
                                if (submissionDayOfMonth >= startWeekDay && submissionDayOfMonth <= endWeekDay) {
                                    foundStudent = true;
                                }
                            }
                        }
                    }
                }
            }
            // Print the student that needs to submit assignment(s) this calendar week
            if (foundStudent) {
                System.out.println("Student: " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
            }
        }
    }

    public void addStaticData(){
        int studentListSize = studentList.size();
        //Student [1-3]
        insertStudent(new Student ("Nikolaos", "Kortimanitsis", "12/05/1980", 1500));
        insertStudent(new Student ("Ioannis", "Petrou", "15/06/1988", 2000));
        insertStudent(new Student ("Maria", "Papadopoulou", "07/10/1985", 2200));

        int trainerListSize = trainerList.size();
        //Trainer [1-2]
        insertTrainer(new Trainer("Panagiotis", "Vasileiou", "JAVA Developper"));
        insertTrainer(new Trainer("Katerina", "Pappa", "Computer Engineer"));

        int courseListSize = courseList.size();
        //Course [1-3]
        insertCourse(new Course("JAVA", "Junior", "1", "01/01/2019", "31/07/2019"));
        insertCourse(new Course("C#", "Junior", "2", "01/09/2019", "31/12/2019"));
        insertCourse(new Course("Python", "Advanced", "3", "01/01/2019", "31/07/2019"));

        int assignmentListSize = assignmentList.size();
        //Assignment [1-4]
        insertAssignment(new Assignment("Assignment1-JAVA", "oral exam", "15/04/2019", 90.5, 95.0));
        insertAssignment(new Assignment("Assignment2-JAVA", "final exam", "20/06/2019", 71.5, 82.0));
        insertAssignment(new Assignment("Assignment1-C#", "oral exam", "10/10/2019", 85.0, 86.0));
        insertAssignment(new Assignment("Assignment2-C#", "final exam", "13/12/2019", 90.5, 95.0));
        insertAssignment(new Assignment("Assignment1-Python", "oral exam", "13/03/2019", 65.0, 80.0));
        insertAssignment(new Assignment("Assignment2-Python", "final exam", "24/06/2019", 87.0, 90.0));

        // subscribe student to a course
        insertSubscribedStudent(new SubscribedStudent(studentListSize+1, courseListSize+2));
        insertSubscribedStudent(new SubscribedStudent(studentListSize+3, courseListSize+2));
        insertSubscribedStudent(new SubscribedStudent(studentListSize+1, courseListSize+1));
        insertSubscribedStudent(new SubscribedStudent(studentListSize+2, courseListSize+1));

        // assign course to a trainer
        insertAssignedTrainer(new AssignedTrainer(trainerListSize+1, courseListSize+1));
        insertAssignedTrainer(new AssignedTrainer(trainerListSize+1, courseListSize+2));
        insertAssignedTrainer(new AssignedTrainer(trainerListSize+2, courseListSize+2));
        insertAssignedTrainer(new AssignedTrainer(trainerListSize+2, courseListSize+3));

        // relate assignment with a course
        insertCourseAssignment(new CourseAssignment(assignmentListSize+1, courseListSize+1));
        insertCourseAssignment(new CourseAssignment(assignmentListSize+2, courseListSize+1));
        insertCourseAssignment(new CourseAssignment(assignmentListSize+3, courseListSize+2));
        insertCourseAssignment(new CourseAssignment(assignmentListSize+4, courseListSize+2));
        insertCourseAssignment(new CourseAssignment(assignmentListSize+5, courseListSize+3));
        insertCourseAssignment(new CourseAssignment(assignmentListSize+6, courseListSize+3));

    }


}

