package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Gradebook Example");
        try {
            File gradebook = new File("C:\\Users\\Matt\\IdeaProjects\\Gradebook");
            if (gradebook.createNewFile())
        }
        new Course("algebra");
        new Student("matthew", "menna");
        new Assignment(20, 0);


    }
}
