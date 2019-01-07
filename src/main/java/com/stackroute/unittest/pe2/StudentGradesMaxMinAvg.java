package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class StudentGradesMaxMinAvg {

        public int minimum(int num, int arr[]){
            int min = arr[0];
            for(int i = 0; i < num; i++){
                if(arr[i] < min){
                    min = arr[i];

                }
            }
            return min;
        }
        public int maximum(int num, int arr[]){
            int max = arr[0];
            for(int i = 0; i < num; i++){
                if(arr[i] > max){
                    max = arr[i];

                }
            }
            return max;
        }
        public float average(int num , int arr[]){

            int sum = 0;
            if(num != 0) {
                for (int i = 0; i < num; i++) {
                    sum += arr[i];
                }
                return (sum / num);
            }
            else
                return -1;
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int number=sc.nextInt();

            int a[] = new int[]{1,2,3,4,5};

            StudentGradesMaxMinAvg studentGradesMaxMinAvg = new StudentGradesMaxMinAvg();
            System.out.println(studentGradesMaxMinAvg.maximum(number,a));
            System.out.println(studentGradesMaxMinAvg.minimum(number,a));
            System.out.println(studentGradesMaxMinAvg.average(number,a));


        }



    }
