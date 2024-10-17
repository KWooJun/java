package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {

        int[] arr = new int[20];

        //1 ~ 20 순차적으로 값을 넣어주세요.
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        int temp;

        for(int i = 0; i < arr.length; i++) {
            int rIdx = ((int) (Math.random() * arr.length)+1);
            arr[i] = rIdx;
            for(int z = 0; z < i; z++){
                temp = arr[z];
                if(temp == rIdx) {
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
