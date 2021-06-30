package com.assignment9.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Driver {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        System.out.println("Enter String to match with Pattern(Enter exit to end) :");
        while(!input.equals("exit")) {
            System.out.println(Pattern.matches("^[A-Z][^.]*.$", input));
            input = scanner.nextLine();
        }
    }
}
/*
^ - Matches the beginning of the string.

[A-Z] - Character class: Matches a single capital letter

[^\.]* - Character Class: Matches any character that is NOT a period. Zero or more.

$ - Matches the end of the string
 */