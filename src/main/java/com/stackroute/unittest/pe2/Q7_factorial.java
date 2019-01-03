package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Q7_factorial {

    public long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        Q7_factorial q7=new Q7_factorial();

        System.out.println(q7.factorial(n));


    }


}
