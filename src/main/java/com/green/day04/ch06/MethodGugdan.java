package com.green.day04.ch06;

public class MethodGugdan {

    static void gugudan(int n){
        for(int i = 1; i < 10; i++){
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
        }
    }

    static void gugudanFromTo(int n1, int n2){
        for(int i = n1; i <= n2; i++){
//            for(int s = 1; s < 10; s++){
//                System.out.printf("%d X %d = %d\n", i, s, (i * s));
//            }
            gugudan(i);
        }
    }

    public static void main(String[] args) {

        gugudan(4);
        System.out.println("------------------------");
        gugudan(6);
        System.out.println("------------------------");
        gugudanFromTo(5, 9); // 5 ~ 9 단까지 사용
        gugudanFromTo(2, 4); // 2 ~ 4 단까지 사용
    }
}
