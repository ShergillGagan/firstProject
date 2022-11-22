package com.pragara.day9;

import java.util.Random;

public class Array2D { // 2d array is an array of int array
    public static void main(String[] args) {
        int [] [] arr = new int[3][5] ; // rows and column
        Random r = new Random();
        for(int i = 0;i < arr.length;i++) // fill row index number  arr.length = how many array inside the 2d array (index)
        {
            for(int j = 0; j < arr[i].length; j++) // arr[i].length = telling the length of each array
            {
                arr[i][j]= r.nextInt( 100);
                System.out.print( arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
