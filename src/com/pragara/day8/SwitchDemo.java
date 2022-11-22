package com.pragara.day8;


import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Month Number (1-12)");
        int monthNo = sc.nextInt();
        if (monthNo==1 || monthNo==3 ||monthNo==5||monthNo==7||monthNo==8||monthNo==10||monthNo==12)
        {
            System.out.println("31 days");
        } else if (monthNo==4||monthNo==6||monthNo==9||monthNo==11) {
            System.out.println("30 days");
        }
        else if(monthNo==2) {
            System.out.println("28 days");
        }

        else {
            System.out.println("invalid number");
        }






    }
}

