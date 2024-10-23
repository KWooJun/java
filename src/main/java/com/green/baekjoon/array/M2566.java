package com.green.baekjoon.array;

import java.util.Scanner;

public class M2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int x = 0 ,y = 0;
        for(int i = 0; i < 9; i++){
            for(int z = 0; z < 9; z++){
                arr[i][z] = scan.nextInt();
            }
            for(int z = 0; z < 9; z++){
                if(max < arr[i][z]){
                    max = arr[i][z];
                    x = i;
                    y = z;
                }
            }
        }

        System.out.printf("%d\n%d %d", max, x+1, y+1);

    }
}
