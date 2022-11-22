package com.pragara.day8;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        System.out.println(" let's start the guessing start");
        int thoughtNo = (int) (Math.random()*100);
        System.out.println(thoughtNo);
        System.out.println("I have thought number .. you try guessing it");
        Scanner sc =new Scanner(System.in);
        int guessedNo;
        do {
            System.out.println("guess the number");
            guessedNo = sc.nextInt();
        }
        while (thoughtNo!=guessedNo);
        {
            System.out.println("you win , guessed right");
        }


    }

}
