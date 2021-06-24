package com.assignment1.main;

import com.assignment1.utility.MatchPattern;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class FindFilePath {
    public static void main(String[] args) throws IOException {
        // Search through the home directory
        Path startDir = Paths.get("/home/ramins");

        //take pattern input in loop
        Scanner scanner=new Scanner(System.in);
        MatchPattern matchPattern=new MatchPattern();
        String pattern ="";
        //Give exit to end the program
        while(!pattern.equals("exit")){

            System.out.println("Enter a pattern to search files(type \"exit\" to exit:)");
            pattern=scanner.next();
            matchPattern.findFile(startDir, pattern);
        }
    }
}
/*
Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.

Provide appropriate documentation and comments on your code.
 */
//firstprogram.txt
//firstprogram1.txt
// first*.txt-
// firstprogram.txt -