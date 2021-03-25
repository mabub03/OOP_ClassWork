package com.OOP.Lab3.Students;

public class Student {
    private int ID;
    private String FirstName;
    private String LastName;
    private double GPA;

    public Student() {
        int id;
        String firstName;
        String lastName;
        double gpa;

    }

    public static void displayData (int ID, String FirstName, String LastName, double GPA) {
        System.out.printf("");
        System.out.println(ID + " " + " " + FirstName + "" + LastName + "" + GPA);

    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
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

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gpa) {
        this.GPA = gpa;
    }
}
