package com.OOP.Lab3.Students;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Student {
    int Id;
    String FirstName;
    String LastName;
    double Gpa;

    public Student() {}

    public Student(int id, String firstName, String lastName, double gpa) {
        this.Id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Gpa = gpa;

    }

    public void outToFile() {
        try {
            String outputStr = "";
            double CUTTOFF = 2.0;

            PrintWriter passingGpaWriter = new PrintWriter(new FileWriter("StuGoodStanding.txt", true));
            PrintWriter failingGpaWriter = new PrintWriter(new FileWriter("StuAcademicProbation.txt", true));

            outputStr = Id + ", " + FirstName + ", " + LastName + ", " +  Gpa + "\n";

            if (Gpa < CUTTOFF) {
                failingGpaWriter.write(outputStr);
            } else {
                passingGpaWriter.write(outputStr);
            }
            passingGpaWriter.close();
            failingGpaWriter.close();
        } catch (Exception e) {
            System.out.println("Error Message: " + e);
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double gpa) {
        this.Gpa = gpa;
    }
}
