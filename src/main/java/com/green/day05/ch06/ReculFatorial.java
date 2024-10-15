package com.green.day05.ch06;

public class ReculFatorial {

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        //5! 5 X 4 X 3 X 2 X 1
        //6! 6 X 5 X 4 X 3 X 2 X 1

//        System.out.println(factorial(6));
//        System.out.println(factorial(5));
        System.out.println(factorial(4));
//        System.out.println(factorial(3));
//        System.out.println(factorial(2));

    }
}
