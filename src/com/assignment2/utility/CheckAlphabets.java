package com.assignment2.utility;

import java.util.HashSet;
import java.util.Set;

public class CheckAlphabets {
    public boolean verifyAllLetters(String input){
        boolean allAlphabetsExist=false;
        allAlphabetsExist= input.chars()
                .filter(i -> i >= 'a' && i <= 'z' || i>='A' && i <='Z')
                .distinct().count() == 26;
        return allAlphabetsExist;
    }
}



/*
If you want to end the string iteration as soon as the entire alphabet is found while still using streams, then you can keep track with a HashSet internally:
Set<Integer> chars = new HashSet<>();
String s =  "Your lowercase string" ;
s.length() > 25 && s.chars()
        .filter(i -> i >= 'a' && i <= 'z') //only alphabet
        .filter(chars::add)                //add to our tracking set if we reach this point
        .filter(i -> chars.size() == 26)   //filter the 26th letter found
        .findAny().isPresent();            //if the 26th is found, return
*/
