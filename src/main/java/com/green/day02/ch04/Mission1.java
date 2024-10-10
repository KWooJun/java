package com.green.day02.ch04;

public class Mission1 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 3;
        double n3 = (double)n1/n2;
        //n1 / n2 나누어서 3.33333 나올수 있도록 해주세요.

        System.out.println(n1 / n2);
        // int / int 결과타입도 int 이기 때문에 실수값이 날아간다

        float result = n1 / n2;
        System.out.println("result : " + result);
        // int / int 결과 타입도 int 이기 떄문에 실수값이 날아간 3이 float에 저장된 것

        float result2 = (float) n1 / n2;
        System.out.println("result2 : " + result2);
        // float/ int >> float / float >> 결과 타입도 float이다. 실수값도 살아있다.


//        int n1 = 10;
//        int n2 = 3;
//
//        System.out.printf("%d / %d = %f", n1, n2, (double)(n1) / (double)(n2));
    }
}
