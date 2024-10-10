package com.green.day03.ch05;

public class MissonFor2 {
    public static void main(String[] args) {
        /*
        구구단 5단을 출력하는 프로그램을 for 문을 이용해서 작성해주세요.

        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        ...
        5 X 9 = 45
         */

        int dan = 5; //매직넘버

        for(int i = 1; i < 10; i++){
            System.out.printf("5 X %d = %d\n", i , (dan * i));
        }
    }
}
