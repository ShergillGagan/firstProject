package com.pragara.day6;

public class LoopsFor {
    public static void main(String[] args) {

        main1(5);

        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0)
                System.out.println(counter);
        }
    }





    public static void main1(int sum) {

        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0) {
                sum = sum + counter;
            }
            System.out.println(counter);
        }
    }
}
