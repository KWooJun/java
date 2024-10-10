package com.green.day03.ch05;

public class MissonWhile2 {
    public static void main(String[] args) {
        /*
        1 ~ 100까지 출력
        100 ~ 1 까지 출력

        do - while , while 각 한번씩 사용하여 해결해주세요
         */

//        int n = 1;
//        int r = 100;
//        do{
//            System.out.println(n++);
//        }while (n < 101);
//
//        do{
//            System.out.println(n--);
//        }while(n > 0);
//
//        System.out.println("--------------------------------------");
//
//        int n2 = 1;
//        int r2 = 100;
//        while (n2 < 101){
//            System.out.println(n2++);
//        }
//
//        while (r2 > 0){
//            System.out.println(r2--);
//        }

        int n = 1;
        while(n <= 100){
            System.out.println(n++);
        }

        System.out.println("------------------------");

        do{
            System.out.println(--n);
        }while (n > 0);


    }
}
