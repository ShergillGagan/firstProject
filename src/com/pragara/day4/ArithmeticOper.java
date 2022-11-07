package com.pragara.day4;

public class ArithmeticOper {
    public static void main(String[] args) {
       int result = extractLastNumber(145);
        System.out.println(result);
        int num = 123456;
        int d= 45876;
        int x = 12/3;
        int y = 10 % 2;
        int z = 13;
       System.out.println( num > d );
       System.out.println(z % 2 == 0);// return false always use double equal to  >  <  >=  ==(equality check)
        System.out.println(x);
        System.out.println(y);
    }
    public static int extractLastNumber(int num) {
        return num%10;
    }
}
