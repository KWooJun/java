package com.green.day04.ch05;

public class MissionFoInFor4 {
    public static void main(String[] args) {
        /*
        star = 3
        *
        **
        ***

        star = 4
        *
        **
        ***
        ****

        star = 5
        *
        **
        ***
        ****
        *****

         */

        int star = ((int)(Math.random()*6)+3);

        System.out.println("star = " + star);

        for(int i = 1; i <= star; i++){
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
