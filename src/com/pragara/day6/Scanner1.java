package com.pragara.day6;

import java.util.Scanner; // for taking the input next() is for string input and nextInt() is for integer value

public class Scanner1 {

    public static void main(String[] args) {
       // int x = 10;
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in) ;
        int capturedInput = sc.nextInt();
        System.out.println(capturedInput);
    }

}
