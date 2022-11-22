package com.pragara.day8;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number(1-12)" );
        int monthNo = sc.nextInt();

            switch (monthNo){
                case 1:
                    System.out.println("31 days");
                    break;
                case 2:
                    System.out.println("28 days");
                    break;
                case 3:
                    System.out.println("31 days");
                    break;
                case 12:
                    System.out.println("31 days");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
    }
}
