package com.green.day03.ch05;

public class MissionContinue2 {
    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해 나간다.
        그리고 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지,
        그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.

        마지막 더한 값 : 63
        1,000넘은 값 : 1024
         */

//        int n = 1;
//        int sum = 0;
//
//        while(true){
//            if((n % 2) == 1) {
//                sum += n;
//                if (sum > 1000) {
//                    break;
//                }
//            }
//            n++;
//        }
//
//        System.out.printf("마지막 더한 값 : %d\n", n);
//        System.out.printf("1,000 넘은 값 : %d\n", sum);

        int i = 0;
        int odd = 0;

        while(odd < 1000){
            i++;
            if((i % 2) == 1){  //i 값을 2로 나누었을 때 나머지 값이 1이면 >> 홀수
                //odd = odd+ i;
                System.out.println("i : " + i);
                odd += i;
            }
        }

        System.out.println("마지막 더한 값 : " + i);
        System.out.println("odd : " + odd);
    }
}
