package com.asc.oop.main;

import java.io.File;

public class ClassIOExampleMain {
    public static String ourDir = "C:\\JavaIOTesting";
    public static void Main(String[] args) {
        File dir = new File(ourDir);
        File[] files = dir.listFiles();

        System.out.println("There are " + files.length + " files in the directory.");
        System.out.println("The file names are: ");

        for (File f: files) {
            System.out.println(f.getName());
        }
    }
}
