package com.pragara.day8;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("start" +i);
            if (i==5)
            {
                break;
            }
            System.out.println("end "+i);
        }

    }
}
