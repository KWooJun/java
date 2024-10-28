package com.green.baekjoon.array;

import java.util.Scanner;

public class M1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[][] arr = new int[input][2];
        for(int i = 0; i < input; i++){
            for(int z = 0; z < 2; z++){
                arr[i][z] = sc.nextInt();
            }
        }
        int temp1 = 0;
        int temp2 = 0;
        int tmp = 0;
        int a = 0;
        int b = 0;
        int sum;
        for(int i = 0; i < input; i++){
            for(int z = 0; z < 2; z++){
                if((z+1) % 2 == 0){
                    temp2 = arr[i][z];
                }
                else{
                    temp1 = arr[i][z];
                }
            }
        }
    }
}
