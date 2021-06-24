package com.assignment3.main;

import com.assignment3.utility.PingWebsite;

import java.util.ArrayList;

//Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
//Use the system ping utility, do not use any deprecated methods.
public class Driver {
    public static void main(String[] args) throws Exception {
        // creating list for commands
        ArrayList<String> commandList = new ArrayList<>();

        commandList.add("ping");
        // can be replaced by IP
        commandList.add("www.google.com");

        PingWebsite.commands(commandList,7);
    }
}
