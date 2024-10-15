package com.green.day04.ch06;

public class MissionMethod {
    static void printStar(int n){
        for(int i = 0; i < n; i ++){
            System.out.print("*");
        }
        System.out.println();
    }

    static void printStarSquare(int n){
//        for(int i = 0; i < n; i++){
//            for(int z = 0; z < n; z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("------------------------------");
        for(int i = 0; i <n; i++){
            printStar(n);
        }
    }
    static void printStarTriang(int n){

//        for(int i = 1; i <= n; i++){
//            for(int z = 0; z < i; z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 0; i <= n; i++){
            printStar(i);
        }
    }

    public static void main(String[] args) {
        printStar(5); // *****
        System.out.println("------------------------------");
        printStar(2); // **
        System.out.println("------------------------------");
        printStarSquare(4);
        System.out.println("------------------------------");
        printStarTriang(4);

    }
}
