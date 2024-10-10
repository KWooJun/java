package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
        ContinueBasic 의 존재하는 while 문을 for 문으로 변경해보자
         */

        int count = 0;

        for(int i = 1; i < 100; i++){
            if(((i % 5) != 0) || ((i % 7) != 0)){
                continue;
            }

            count++;
            System.out.println("i : " + i);
        }

        System.out.println("count : " + count);

        int count2 = 0;

        for(int i = 1; i < 100; i++){
            if(((i % 5) == 0) && ((i % 7) == 0)){
                continue;
            }

            count2++;
            System.out.println("i : " + i);
        }

        System.out.println("count2 : " + count2);
    }
}
