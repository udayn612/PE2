package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Q5_iseven {

    public static boolean isEven(int n)
    {

        if(n%2==0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEven(n));

    }
}
