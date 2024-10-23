package com.green.baekjoon.array;

import java.util.Scanner;

public class M2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++){
            for(int z = i; z < num; z++){
                System.out.print(" ");
            }
            for(int z = 0; z < i; z++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
