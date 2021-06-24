package com.assignment2.main;

import com.assignment2.utility.CheckAlphabets;
import com.assignment2.utility.SimpleJavaStream;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CheckAlphabets checkAlphabets=new CheckAlphabets();
        System.out.println("Enter a String input:");
        if (checkAlphabets.verifyAllLetters(scanner.next()))
            System.out.println("String contains all alphabets");
        else
            System.out.println("String DOESN'T contains all alphabets");
        //Time complexity: O(N)
        //Space Complexity: O(1)
        SimpleJavaStream.operations();
    }
}
/*
abcdefghijklmnopqrstuvwxyz
abcdefghijklmnopqrstuvwxyZ
 */