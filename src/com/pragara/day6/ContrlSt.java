package com.
        pragara.day6;

public class ContrlSt {
    public static void main(String[] args) {
        testEvenOrOdd(7);
        numPositiveOrNegative(0);
        greatestOf3(6 ,7 , 8);
        checkIlligible(true);
    }
    public static void testEvenOrOdd(int x){
        if (x %2 == 0)
        {
            System.out.println("This is an even number ");
        }
        else {
            System.out.println("This is an odd number");
        }
        System.out.println("End");
    }
    public static void numPositiveOrNegative(int x) {
        if (x>0) {
            System.out.println(" the number is positive:" + x);
        }
        else if(x<0)
        {
            System.out.println("the number is negative:" + x);
        }
        else
        {
            System.out.println("Zero");
        }
    }
    public static void greatestOf3(int a, int b, int c){
        if (a > b && a > c)
        {
            System.out.println("Largest number:"+a);
        }
        else if (b > c && b > a)
        {
            System.out.println("Largest Number :"+ b);

        }
        else
        {
            System.out.println("Largest NUmber :"+c);

        }
    }
    public static void checkIlligible(boolean isSleeping)
    {
        if(!(isSleeping)){
            System.out.println(" Not active");
        }
        else {
            System.out.println("Active");
        }
    }
}
