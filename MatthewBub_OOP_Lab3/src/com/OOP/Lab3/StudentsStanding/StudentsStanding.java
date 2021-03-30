package com.OOP.Lab3.StudentsStanding;

/****************************
 *
 * @author Matthew Bub
 * @category OOP
 * @version Lab3
 * @since 03/29/21
 *
 ***************************/

import com.OOP.Lab3.Students.Student;

import java.util.Scanner;

public class StudentsStanding {

    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        String menuID = "";
        String firstName = "";
        String lastName = "";
        final String EXIT = "exit";
        int stuId = 0;
        double gpa = 0.0;

        System.out.println("Welcome to the program!");
        System.out.println("Type start to enter the student data");
        System.out.println("Type exit to close the program.");
        menuID = scanObj.nextLine();

        try {
            while (!menuID.equals(EXIT)) {
                System.out.println("Enter student ID:");
                stuId = scanObj.nextInt();
                // executes a scanner reader for a blank line so it doesn't skip the firstName scan object
                scanObj.nextLine();

                System.out.println("Enter first name:");
                firstName = scanObj.nextLine();

                System.out.println("Enter last name:");
                lastName = scanObj.nextLine();

                System.out.println("Enter the GPA:");
                gpa = scanObj.nextDouble();
                scanObj.nextLine();

                Student stu = new Student(stuId, firstName, lastName, gpa);
                stu.outToFile();

                System.out.println("Enter the next student ID or type " + EXIT + " to exit the program.");
                menuID = scanObj.nextLine();
            }
            scanObj.close();
        }
        catch (Exception e) {
            System.out.println("Error Message: " + e);
        }
    }

}
