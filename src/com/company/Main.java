package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileWriter filewrite;
        BufferedWriter bufferwrite;

        String courseName = "algebra";
        String lastName = "menna";
        String FirstName = "matthew";
        String pathName = "C:\\Users\\Matt\\IdeaProjects\\Gradebook\\Gradebook.txt";

        System.out.println("Gradebook Example");
        File gradebook = new File(pathName);
        new Course("algebra");
        new Student("matthew", "menna");
        new Assignment(20, 0);

        Scanner filecontent = new Scanner(System.in);
        String content = filecontent.nextLine();

        bufferwrite = new BufferedWriter(new FileWriter(pathName ));
        bufferwrite.write(content);
        bufferwrite.close();
    }

}
