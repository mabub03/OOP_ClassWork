package com.OOP.Lab3.StudentsStanding;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class StudentsStanding {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        Path goodFile = Paths.get("../../../../../files");
        Path failingFile = Paths.get("../../../../../files");
        String stringId = "";
        final String EXIT = "exit";
        final double PASSING_GPA = 2.0; // or rename to CUTOFF
        try {
            OutputStream goodGpaStream = new BufferedOutputStream(Files.newOutputStream(goodFile, CREATE));
            BufferedWriter goodGpaWriter = new BufferedWriter(new OutputStreamWriter(goodGpaStream));
            OutputStream failingGpaStream = new BufferedOutputStream(Files.newOutputStream(failingFile, CREATE));
            BufferedWriter failingGpaWriter = new BufferedWriter(new OutputStreamWriter(failingGpaStream));
            System.out.println("Enter student ID");
            stringId = scanObj.nextLine();
            while (!stringId.equals(EXIT)) {
                System.out.println("Enter first name");
            }
            scanObj.close();
        }
        catch (Exception e) {
            System.out.println("Error Message: " + e);
        }
    }
}