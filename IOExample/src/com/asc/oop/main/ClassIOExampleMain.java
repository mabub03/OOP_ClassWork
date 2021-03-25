package com.asc.oop.main;

import java.io.File;

public class ClassIOExampleMain {
    /*
    Example:
    JavaPractice
    |- .idea
    |- out
    |- src
       |- com.company
       |- fs
       |- resources
          |- dummy.txt
       FileSystem

    String file = "dummy.txt";
    var path = Paths.get("src/com/company/fs/resources/", file);
    System.out.println(path);

    System.out.println(Files.readString(path));*/
    public static String ourDir = "src/JavaIOTesting";
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
