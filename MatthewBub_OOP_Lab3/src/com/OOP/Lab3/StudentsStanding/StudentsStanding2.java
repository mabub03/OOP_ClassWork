package com.OOP.Lab3.StudentsStanding;

/****************************
 *
 * @author Matthew Bub
 * @category OOP
 * @version Lab3
 * @since 03/29/21
 *
 ***************************/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentsStanding2 {

    public static void main(String[] args) {
        Path goodGpaFile = Paths.get("StuGoodStanding.txt");
        Path badGpaFile = Paths.get("StuAcademicProbation.txt");
        String fileContents = "";

        try
        {
            InputStream goodGpaStream = new BufferedInputStream(Files.newInputStream(goodGpaFile));
            BufferedReader goodGpaReader = new BufferedReader(new InputStreamReader(goodGpaStream));
            InputStream probGpaStream = new BufferedInputStream(Files.newInputStream(badGpaFile));
            BufferedReader probGpaReader = new BufferedReader(new InputStreamReader(probGpaStream));

            System.out.println("Academic Probation Standing");
            fileContents = probGpaReader.readLine();
            while( fileContents != null)
            {
                display(fileContents);
                fileContents = probGpaReader.readLine();
            }

            System.out.println("\nGood Academic Standing");
            fileContents = goodGpaReader.readLine();
            while( fileContents != null)
            {
                display(fileContents);
                fileContents = goodGpaReader.readLine();
            }
            probGpaStream.close();
            goodGpaStream.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
    public static void display(String s)
    {
        String[] array = new String[4];
        String delimiter = ",";
        String stringId;
        String firstName;
        String lastName;
        double gpa;
        double overUnder;
        final double CUTOFF = 2.0;

        array = s.split(delimiter);
        stringId = array[0];
        firstName = array[1];
        lastName = array[2];
        gpa = Double.parseDouble(array[3]);
        overUnder = gpa - CUTOFF;

        System.out.println("ID #" + stringId + "    " + firstName + " " +
                lastName + "  GPA: " + gpa + "    " + overUnder +
                " from " + CUTOFF + " cutoff");
    }

}
