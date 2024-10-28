package com.green.baekjoon.array;

import java.util.Scanner;

public class M10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        char[][] arr = new char[5][15];

        for(int i = 0; i < str.length; i++){
            str[i] = sc.nextLine();
            for(int z = 0; z < str[i].length(); z++){

                    arr[i][z] = str[i].charAt(z);

            }
        }

        for(int i = 0; i < arr[0].length; i++){
            for(int z = 0; z< arr.length; z++){
                if(arr[z][i] == '\0'){
                    continue;
                }else{
                    System.out.print(arr[z][i]);
                }
            }
        /*
        String str 배열에 입력을 받고 입력받은 한개의 값들을 charAt를 사용하여
        arr char 2차원 배열에 넣어서 한 문자씩 배열에 집어 넣었다.
        2차원 배열에 있는 null 값들은 전부 continue 해서 뛰어넘고
        null 값이 아닌 값들을 출력하는 문제였다.
        arr.length 는 5의 값을 가지고 있고
        arr[0].length 는 15의 값을 가지고 있어서 반복문을 돌렸다,
        하지만 arr[i]는 집어 넣을 수 없었으며 넣으면 에러가 발생한다.
         */
        }
    }
}


