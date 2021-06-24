package com.assignment6.utility;

import java.util.Arrays;

public class VampireNumber {
    public static void printFirst100VampireNos() {
        int HUNDRED=100;
        int count=0;
        String[] str1, str2;
        int pro, sum = 0;
        for (int i = 10; i < 1000; i++) {
            for (int j = 10; j < 1000; j++) {
                pro = i * j;
                // Exclude numbers less than 1000(not possible) and greater than 999999
                if (pro < 1000 || pro > 999999)
                    continue;
                // Convert the product and multiplier to a string array
                str1 = String.valueOf(pro).split("");
                str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                // Sort the string array
                Arrays.sort(str1);
                Arrays.sort(str2);
                // Compare two arrays
                if (Arrays.equals(str1, str2) && count<HUNDRED) {
                    sum++;
                    count++;
                    System.out.println(" " + sum + "Group vampire number: " + i + "*" + j
                            + "=" + pro);

                }
            }
        }
    }
}
