package com.stackroute.unittest.pe2;

import java.util.Scanner;

/**TWrite a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and
 * displays the average, minimum and maximum.Your program shall check for valid input. You should keep all the grades in an int[]
 * and use a method for each of the computations.
 .
 *
 * @version 1.0 11-1-2018
 *
 * @author Uday N
 */

public class StudentGradesMaxMinAvg {

    public int minimum(int num, int arr[]) {
        int min = arr[0];
        for (int i = 0; i < num; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    public int maximum(int num, int arr[]) {
        int max = arr[0];
        for (int i = 0; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public float average(int num, int arr[]) {

        int sum = 0;
        if (num != 0) {
            for (int i = 0; i < num; i++) {
                sum += arr[i];
            }
            return (sum / num);
        } else
            return -1;
    }

}
