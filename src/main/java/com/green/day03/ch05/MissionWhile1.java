package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {

        /*
        while 문을 활용하여 1 ~ 99
         */

        int n = 0;
        int sum = 0;
        while(n < 100){
            sum = sum + n;
            n++;
        }
        System.out.println(sum);
    }
}
