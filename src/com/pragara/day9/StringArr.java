package com.pragara.day9;

import java.util.Random;

public class StringArr {
    public static void main(String[] args) {
        char[] chrr= {'G','A','G','A','N'};
        Random r =new Random();// random is having the value
        int marks[]= new int[1000];
        //for(int i=0;i<=999;i++)
        for (int i= 0; i<marks.length;i++)  // using the property to mention the size of array
        {
            marks[i]= r.nextInt(10); // bound meaning any range
            System.out.println(marks[i]);
        }
        String [] arr= new String[3];   // passing the values in different ways
        arr[0] ="gagan";
        arr[1] = " ";
        arr[2]= "shergill";
        String[] arr1 ={"Gagan","  ", "Shergill"};
        System.out.println(arr);
        System.out.println(arr1);
    }

    public static void intilizeArray(int [] marks) {


    }
}
