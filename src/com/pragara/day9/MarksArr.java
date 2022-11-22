package com.pragara.day9;

import java.util.Scanner;

public class MarksArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("enter the marks ");
            marks[i] = sc.nextInt();
            sum= sum + marks[i];}
        System.out.println( "total marks of the " + sum); // finding the average sum/marks.length

        }

    }

