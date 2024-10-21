package com.green.baekjoon.array;


import java.util.Scanner;

public class M10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int[] arr = new int[input];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int num = scan.nextInt();

        int cnt = 0;
        for(int i = 0;  i < arr.length; i++){
            if(num == arr[i]){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
