package com.green.day04.ch05;

public class MissionFoInFor5 {
    public static void main(String[] args) {
        /*
        star = 3
        --*
        -**
        ***

         */

        int star = ((int)(Math.random()*6)+3);

        System.out.println("star = " + star);

//        for(int i = star; i > 0; i--){
//            for(int s = 0; s < i - 1; s++){
//                System.out.print("_");
//            }
//            for(int e = i; e <= star; e++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 1; i <= star; i++){
            for(int s = star; s > 0; s--) {
                if(i >= s){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
                System.out.println();
        }

    }
}
