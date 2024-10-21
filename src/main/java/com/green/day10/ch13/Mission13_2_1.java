package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    /*
    다음 메소드는 int 형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기 만큼 전부 증가시킨다.

    public static void addOneArr(int[] arr, int add){

    }
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
        addOneArr(arr, 5);//두번 째 인자의 값을 모든방에 더해준다
        System.out.println(Arrays.toString(arr));//[4, 5, 6, 7, 8]

        //

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        addTwoDArr(arr2, 3); //메소드 재활용성 극대화 시킨다
        System.out.println(Arrays.deepToString(arr2));
        for(int[] item : arr2){
            System.out.println(Arrays.toString(item));
        }
    }

    //int[] 객체의 각 방의 타입 : int
    //int[][] 객체의 각 방의 타입 : int[]의 주소
    public static void addTwoDArr(int[][] arr, int add){
//        for(int[] item : arr){
//            addOneArr(item, add);
//        }
        for(int i = 0; i < arr.length; i++){
            addOneArr(arr[i], add);
        }
    }

    public static void addOneArr(int[] arr, int add){
        for(int i = 0; i < arr.length; i++){
            arr[i] += add;
        }
    }
}
