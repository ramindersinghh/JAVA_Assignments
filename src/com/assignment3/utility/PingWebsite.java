package com.assignment3.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PingWebsite {

    private PingWebsite(){
        throw new IllegalStateException("Utility class");
    }
    // method for finding the ping statics of website
    public static void commands(List<String> commandList, int numberOfPings) throws IOException {
        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        //BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String inputLine = null;
        String time = "";
        ArrayList<Double> pingTime=new ArrayList<>();
        System.out.println("Standard output: ");
        while ((inputLine = input.readLine()) != null  && numberOfPings>0) {
            System.out.println(inputLine);
            if (inputLine.length() > 0 && inputLine.contains("time") && inputLine.contains("ttl")) {
                time = inputLine.substring(inputLine.indexOf("time")+ 5, inputLine.indexOf("ms")-1);
                pingTime.add(Double.parseDouble(time));
                numberOfPings--;
            }
        }
        System.out.println("Median of ping time: " + FindMedian.findMedian(pingTime)+ "ms");
        /*System.out.println("error (if any): ");
        while ((inputLine = error.readLine()) != null) {
            System.out.println(inputLine);
        }*/


    }
}
