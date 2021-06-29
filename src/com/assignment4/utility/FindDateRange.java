package com.assignment4.utility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindDateRange {

    private LocalDate signupDate;
    private LocalDate currentDate;
    private LocalDate lowestPossibleDateForKYC;
    private LocalDate highestPossibleDateForKYC;



    private boolean rangePossible;
    public FindDateRange(LocalDate signupDate,LocalDate currentDate){
        this.currentDate=currentDate;
        this.signupDate=signupDate;

    }
    public LocalDate getHighestPossibleDateForKYC() {
        return highestPossibleDateForKYC;
    }

    public LocalDate getLowestPossibleDateForKYC() {
        return lowestPossibleDateForKYC;
    }

    public boolean isRangePossible() {
        return rangePossible;
    }

    public void calculateRange(){
        LocalDate anniversaryDate;
        if(signupDate.isAfter(currentDate)) {
            rangePossible = false;
            return;
        }
        int year=currentDate.getYear();
        int month=signupDate.getMonthValue();
        int day=signupDate.getDayOfMonth();
        anniversaryDate=LocalDate.of(year, month, day);

        //Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
        if(anniversaryDate.isBefore(currentDate) ||
                anniversaryDate.isEqual(currentDate) ||
                (anniversaryDate.isAfter(currentDate) && currentDate.until(anniversaryDate, ChronoUnit.DAYS) <= 30L  )){
            //anniversary year remain same
        }else{
            //get date of previous year
            anniversaryDate=LocalDate.of(year-1, month, day);
        }
        lowestPossibleDateForKYC = anniversaryDate.minusDays(30);
        highestPossibleDateForKYC  = anniversaryDate.plusDays(30);
        if(currentDate.isBefore(highestPossibleDateForKYC))
            highestPossibleDateForKYC  = currentDate;

        rangePossible=true;
    }
}
//https://howtodoinjava.com/java/date-time/calculate-days-between-dates/
//https://www.baeldung.com/java-8-date-time-intro