package com.pragara.day8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr =new int[5];
       // int [] arr1 ={1,2,3,4,5};
        // int [] arr1 = new int []{1,2,3,4,5};as we can pass the value like this also


        for(int i=0;i<= 4;i++) {
            System.out.println("enter the marks ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // this is also to print the array
            //for(int i=0;i<=4;i++) {
                //System.out.println(arr[i]);   to print the array for raw method using the for loop
                // ( arr[i] +"  ") for printing thr space not in a next line


        }

}

