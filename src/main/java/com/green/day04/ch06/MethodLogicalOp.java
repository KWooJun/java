package com.green.day04.ch06;

public class MethodLogicalOp {
//    static boolean logicaLOp(int n){
//        if (n >= 1 && n <= 100){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
    static boolean logicaLOp(int n){
        return (n >= 1 && n <= 100);
    }

    static boolean logicaLOp2(int n){
        return (n % 2 == 0 || n % 3 == 0);
    }

//    static boolean logicaLOp2(int n){
//        if(n % 2 == 0 || n % 3 == 0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

    public static void main(String[] args) {
        int n1 = 110;

        boolean b = logicaLOp(n1);
        System.out.printf("b : %b\n", b);
        //값이 1 이상 100이하라면 true, 아니라면 false

        boolean b2 = logicaLOp2(n1);
        System.out.println("b : " + b2);
    }
}
