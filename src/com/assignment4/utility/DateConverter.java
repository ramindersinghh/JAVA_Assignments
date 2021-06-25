package com.assignment4.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private DateConverter(){
        throw new IllegalStateException("Utility class");
    }
    public static LocalDate convertDMYtoYMD(String date){
        return LocalDate.parse( LocalDate.parse(date,formatter).format(formatter2));
    }
    public static String convertYMDtoDMY(String date){
        return  LocalDate.parse(date,formatter2).format(formatter);
    }
}
