package com.green.day04.ch05;

//p.135
public class Mission05_7_1 {
    public static void main(String[] args) {
       /*
       1번. 구구단 짝수 단인 2, 4, 6, 8단만 출력하는 프로그램을 작성하되
       2단은 2 X 2까지,
       4단은 4 X 4까지,
       6단은 6 X 6까지,
       8단은 8 X 8까지
       출력하도록 작성하자
        */

//        for(int i = 2; i < 9; i +=2){
//            for(int z = 1; z <= i; z++){
//                System.out.printf("%d X %d = %d\n", i , z ,(i * z));
//            }
//            System.out.println("--------------------");
//        }
        for(int dan = 2; dan <= 8; dan += 2){
            for(int i = 1; i <= dan; i++){
                System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
            }
            System.out.println();
        }
    }
}
