package com.pragara.day8;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        System.out.println("let's play the guessing game");
        int thoughtNumber = (int)(Math.random()*100); // type casting
        System.out.println(thoughtNumber);
        System.out.println("I have thought a number ... you try guessing it");
        Scanner sc = new Scanner(System.in);
        int guessedNo =sc.nextInt();
         // while(true){
          //  int guessedNo =sc.nextInt();
            //if (thoughtNumber == guessedNo) {
                //System.out.println(" You guessed right .. you win ");
               // break;
           // }
           // else {
               // System.out.println("You are wrong .. try guessing again");
           // }
           // }
          while (thoughtNumber!=guessedNo){  // doing the check
                  System.out.println("Your guessing wrong .. Try again ");
                  guessedNo =sc.nextInt();

          }
        System.out.println("you win , guessed right");
        }
    }

