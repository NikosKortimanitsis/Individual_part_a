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

//import java.util.Scanner;
import java.util.*;

public class Main {

    private static String choiceMain, choiceYN;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bootcamp myBootcamp = new Bootcamp();

        // use US locale to be able to identify floats in the string
        scanner.useLocale(Locale.US);

        do {

            System.out.println("Main Menu");
            System.out.println("1.Insert student");
            System.out.println("2.Insert trainer");
            System.out.println("3.Insert course");
            System.out.println("4.Insert assignment for a specific course");
            System.out.println("5.Subscribe student to a course");
            System.out.println("6.Assign course to trainer");
            System.out.println("7.Print all students");
            System.out.println("8.Print all trainers");
            System.out.println("9.Print all courses");
            System.out.println("10.Print all assignments");
            System.out.println("11.Print all students per course");
            System.out.println("12.Print all trainers per course");
            System.out.println("13.Print all assignments per course");
            System.out.println("14.Print all assignments per student");
            System.out.println("15.Print students in multiple courses");
            System.out.println("16.Print students that have to submit assignments for a specific date");
            System.out.println("17.Add static data");
            System.out.println("18.Exit");

            do {
                System.out.printf("Please give your selection(1-18):");
                choiceMain = scanner.nextLine();
            } while (  !choiceMain.equals("1") && !choiceMain.equals("2") && !choiceMain.equals("3") && !choiceMain.equals("4") && !choiceMain.equals("5") && !choiceMain.equals("6")
                    && !choiceMain.equals("7") && !choiceMain.equals("8") && !choiceMain.equals("9") && !choiceMain.equals("10") && !choiceMain.equals("11") && !choiceMain.equals("12")
                    && !choiceMain.equals("13")&& !choiceMain.equals("14")&& !choiceMain.equals("15")&& !choiceMain.equals("16") && !choiceMain.equals("17") && !choiceMain.equals("18"));


            switch (choiceMain) {

                //Insert student
                case "1":
                    do {
                        System.out.printf("Give student's first name:");
                        String studentFirstName = scanner.nextLine();
                        if (studentFirstName == null) {
                            System.out.println("!!!!ERROR!!!The first name is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give student's last name:");
                        String studentLastName = scanner.nextLine();
                        if (studentLastName == null) {
                            System.out.println("!!!!ERROR!!!The last name is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give student's date of birth in the following format (DD/MM/YYYY):");
                        String date = scanner.nextLine();
                        if (date == null) {
                            System.out.println("!!!!ERROR!!!The date of birth is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give student's tuition fees:");
                        double fees = scanner.nextDouble();
                        scanner.nextLine();

                        myBootcamp.insertStudent(new Student(studentFirstName, studentLastName, date, fees));
                        System.out.println("\nStudent inserted successfully.");
                        do{
                            System.out.printf("Do you want to add more students? (y,n): ");
                            choiceYN= scanner.nextLine();
                        }while (!choiceYN.equalsIgnoreCase("y") && !choiceYN.equalsIgnoreCase("n"));

                    }while(choiceYN.equalsIgnoreCase("y"));
                    break;

                //Insert trainer
                case "2":
                    do {
                        System.out.printf("Give trainers's first name:");
                        String trainerFirstName = scanner.nextLine();
                        if (trainerFirstName == null) {
                            System.out.println("!!!!ERROR!!!The first name is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give trainers's last name:");
                        String trainerLastName = scanner.nextLine();
                        if (trainerLastName == null) {
                            System.out.println("!!!!ERROR!!!The last name is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give trainer's subject:");
                        String subject = scanner.nextLine();
                        if (subject == null) {
                            System.out.println("!!!!ERROR!!!The subject is null");
                            continue;         // return to initial menu
                        }

                        myBootcamp.insertTrainer(new Trainer(trainerFirstName, trainerLastName, subject));
                        System.out.println("\nTrainer inserted successfully.");

                        do{
                            System.out.printf("Do you want to add more trainers? (y,n): ");
                            choiceYN= scanner.nextLine();
                        }while (!choiceYN.equalsIgnoreCase("y") && !choiceYN.equalsIgnoreCase("n"));

                    }while(choiceYN.equalsIgnoreCase("y"));
                    break;

                //Insert course
                case "3":
                    do {
                        System.out.printf("Give course title:");
                        String courseTitle = scanner.nextLine();
                        if (courseTitle == null) {
                            System.out.println("!!!!ERROR!!!The title is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give course stream:");
                        String courseStream = scanner.nextLine();
                        if (courseStream == null) {
                            System.out.println("!!!!ERROR!!!The stream is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give course type:");
                        String courseType = scanner.nextLine();
                        if (courseType == null) {
                            System.out.println("!!!!ERROR!!!The type is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give course start date in the following format (DD/MM/YYYY):");
                        String startDate = scanner.nextLine();
                        if (startDate == null) {
                            System.out.println("!!!!ERROR!!!The start date is null");
                            continue;         // return to initial menu
                        }

                        System.out.printf("Give course end date in the following format (DD/MM/YYYY):");
                        String endDate = scanner.nextLine();
                        if (endDate == null) {
                            System.out.println("!!!!ERROR!!!The end date is null");
                            continue;         // return to initial menu
                        }

                        myBootcamp.insertCourse(new Course(courseTitle, courseStream, courseType, startDate, endDate));
                        System.out.println("\nCourse inserted successfully.");

                        do{
                            System.out.printf("Do you want to add more courses? (y,n): ");
                            choiceYN= scanner.nextLine();
                        }while (!choiceYN.equalsIgnoreCase("y") && !choiceYN.equalsIgnoreCase("n"));

                    }while(choiceYN.equalsIgnoreCase("y"));
                    break;

                // Insert assignment for a specific course
                case "4":

                        //first check if there are available courses to relate your assignment
                        int numOfCourses = myBootcamp.giveCoursesListSize();
                        if (numOfCourses !=0) {
                            do {
                                System.out.printf("Give title:");
                                String assignmentTitle = scanner.nextLine();
                                if (assignmentTitle == null) {
                                    System.out.println("!!!!ERROR!!!The title is null");
                                    continue;         // return to initial menu
                                }

                                System.out.printf("Give description:");
                                String description = scanner.nextLine();
                                if (description == null) {
                                    System.out.println("!!!!ERROR!!!The description is null");
                                    continue;         // return to initial menu
                                }

                                System.out.printf("Give subDateTime in the following format (DD/MM/YYYY):");
                                String dateTime = scanner.nextLine();
                                if (dateTime == null) {
                                    System.out.println("!!!!ERROR!!!The date is null");
                                    continue;         // return to initial menu
                                }

                                System.out.printf("Give oralMark:");
                                double oralMark = scanner.nextDouble();

                                System.out.printf("Give totalMark:");
                                double totalMark = scanner.nextDouble();
                                scanner.nextLine();


                                System.out.println("Now select one of the available courses to relate your assignment");
                                myBootcamp.printCourseList();
                                System.out.printf("Please give your selection:");
                                String selectedCourse = scanner.nextLine();

                                myBootcamp.insertAssignment(new Assignment(assignmentTitle, description, dateTime, oralMark, totalMark));
                                System.out.println("\nAssignment inserted successfully.");

                                //as this assignment is the last added in assignmentList --> assignmentID = assignmentList.size()
                                int assignmentID = myBootcamp.giveAssignmentListSize();
                                myBootcamp.insertCourseAssignment(new CourseAssignment(assignmentID, Integer.parseInt(selectedCourse)));

                                do{
                                    System.out.printf("Do you want to add more assignments? (y,n): ");
                                    choiceYN= scanner.nextLine();
                                }while (!choiceYN.equalsIgnoreCase("y") && !choiceYN.equalsIgnoreCase("n"));
                            }while(choiceYN.equals("y"));
                        }
                        // if no available courses then guide the user to insert first a course
                        else{
                            System.out.println("First insert a course.");
                        }


                    break;

                // Subscribe student to a course
                case "5":
                    System.out.println("Select one of the following students");
                    myBootcamp.printStudentList();
                    System.out.printf("Please give your selection:");
                    String studentChoice = scanner.nextLine();

                    System.out.println("Subscribe the selected student to one of the following courses");
                    myBootcamp.printCourseList();
                    System.out.printf("Please give your selection:");
                    String courseChoiceForStudent = scanner.nextLine();

                    myBootcamp.insertSubscribedStudent(new SubscribedStudent(Integer.parseInt(studentChoice), Integer.parseInt(courseChoiceForStudent)));
                    System.out.println("\nStudent subscribed successfully to the course.");
                    break;

                // Assign course to trainer
                case "6":
                    System.out.println("Select one of the following trainers");
                    myBootcamp.printTrainerList();
                    System.out.printf("Please give your selection:");
                    String trainerChoice = scanner.nextLine();

                    System.out.println("Assign a course to the selected trainer");
                    myBootcamp.printCourseList();
                    System.out.printf("Please give your selection:");
                    String courseChoiceForTrainer = scanner.nextLine();

                    myBootcamp.insertAssignedTrainer(new AssignedTrainer(Integer.parseInt(trainerChoice), Integer.parseInt(courseChoiceForTrainer)));
                    System.out.println("\nCourse assigned successfully to the trainer.");
                    break;

                // Print all Students
                case "7":
                    myBootcamp.printStudentList();
                    break;

                // Print all Trainers
                case "8":
                    myBootcamp.printTrainerList();
                    break;

                // Print all Courses
                case "9":
                    myBootcamp.printCourseList();
                    break;
                // Print all Assignments
                case "10":
                    myBootcamp.printAssignmentList();
                    break;
                // print all Students per Course
                case "11":
                    myBootcamp.printSubscribedStudentList();
                    break;
                // Print all Trainers per Course
                case "12":
                    myBootcamp.printAssignedTrainerList();
                    break;
                // Print all Assignments per Course
                case "13":
                    myBootcamp.printCourseAssignments();
                    break;
                // Print all Assignments per Student
                case "14":
                    myBootcamp.printStudentAssignments();
                    break;
                // Print a list of Students that belong to more than one courses
                case "15":
                    myBootcamp.printStudentInMultipleCourses();
                    break;
                // fFnd the students that need to submit one or more assignments
                case "16":
                    System.out.printf("Please give a date in the following format (DD/MM/YYYY):");
                    String inputDate = scanner.nextLine();
                    myBootcamp.findStudentAssignmentSubmission(inputDate);
                    break;
                // Add static data
                case "17":
                    myBootcamp.addStaticData();
                    System.out.println("Static data inserted successfully.");
                    break;
                // Exit the main menu
                case "18":
                    System.out.println("Exit!");
                    break;
            }
            System.out.println("------------------\n");

        } while (!choiceMain.equals("18"));

        scanner.close();
    }

}

