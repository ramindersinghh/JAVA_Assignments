package com.assignment4.main;

import com.assignment4.utility.DateConverter;
import com.assignment4.utility.FindDateRange;
import junit.framework.TestCase;

import java.time.LocalDate;
import java.util.Scanner;

public class Driver extends TestCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfInputs= scanner.nextInt();
        while(numberOfInputs>0){
            String date1=scanner.next();
            String date2=scanner.next();

            LocalDate signupDate= DateConverter.convertDMYtoYMD(date1);
            LocalDate currentDate=DateConverter.convertDMYtoYMD(date2);

            FindDateRange findDateRange=new FindDateRange(signupDate,currentDate);
            findDateRange.calculateRange();
            if(findDateRange.isRangePossible()){
                String lowerBound=DateConverter.convertYMDtoDMY( findDateRange.getLowestPossibleDateForKYC().toString());
                String upperBound=DateConverter.convertYMDtoDMY( findDateRange.getHighestPossibleDateForKYC().toString());

                System.out.println(lowerBound+ "  " +upperBound);
            }else{
                System.out.println("No range");
            }

            numberOfInputs--;
        }
    }
}
/*
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016


 */