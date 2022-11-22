package com.pragara.day9;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int [][] marks = new int[4][5];
        Random random =new Random();
        int sum ;
        for (int i = 0; i < marks.length;i++)
        {
            sum =0;
            for(int j=0 ; j<marks[i].length;j++)
            {
                marks[i][j]= random.nextInt();
                sum = sum+marks[i][j];
            }
            System.out.println("sum"+ sum);
        }
        System.out.println("vivek changes");
    }
}
