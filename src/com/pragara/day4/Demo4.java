package com.pragara.day4;

public class Demo4 {


    public static void main(String[] args) {

       int result = sum( 4, 7);  // invoke the function when we are using the int
        System.out.println(result);
      //  System.out.println( sum(8,9)); only for when we to invoke the again and again not advised
        jump5times(); // empty invoke function
        int a =7;
        int b= 2;
        System.out.println(  "Sum is : " +(a+b));
        System.out.println("bye");
    }
    public static int sum(int c, int d){

        return c+d;
    }
    public static  int jump5times(){
        System.out.println("jump 5 times");
        return 2;

    }
}
