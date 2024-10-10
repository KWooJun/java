package com.green.day03.ch05;

public class MissonFor1 {
    public static void main(String[] args) {
        /*
        1 ~ 10까지의 곱의 결과를 출력하는 프로그램을 for 문을 이용하여 작성
        3,628,800
         */
        int sum = 1;

        for(int i = 2; i < 11; i++){
            sum *= i;
        }

        System.out.printf("합은 %,d", sum);
    }
}
