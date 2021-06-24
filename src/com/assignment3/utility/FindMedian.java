package com.assignment3.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMedian {
    // Function for calculating median
    public static double findMedian(ArrayList<Double> arrayList) {
        int size=arrayList.size();
        // First we sort the array
        Collections.sort(arrayList);
        // check for even case
        if (size % 2 != 0)
            return (double) arrayList.get(size / 2);

        return (double) (arrayList.get((size - 1) / 2) + arrayList.get(size / 2)) / 2.0;

    }
}
