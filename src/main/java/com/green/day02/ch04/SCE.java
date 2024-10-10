package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        /*
        &&연산자는 false 가 될 확률이 높은 연산을 왼쪽으로 배치하는 게 유리
        ||연산자는 true 가 될 확률이 높은 연산을 왼쪽으로 배치하는 게 유리
         */

        int n1 = 0, n2 = 0;
        boolean result;

        result = ((n1 += 10) < 0) && ((n2 += 10) > 10); //false
        System.out.println("result : " + result);
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2); // &&연산자는 false가 나오면 뒤를 연산을 안하기 때문에 n2 = 0이 나옴
        //n1 += 10 >> n1 = n1 +10 >> n1 = 0 + 10 >> n1 = 10
        //n1 < 0 : false 이기 떄문에 ((n2 += 10) > 0) 실행되지 않는다.
        //&& 연산자는 왼쪽항이 false 면 오른쪽 항을 연산을 하지 않고 false 를 리턴한다.
        System.out.println("---------------------------");

        int n3 = 0, n4 = 0;
        result = ((n3 += 10) > 0) || ((n4 += 10) > 0); //true
        System.out.println("result : " + result);
        System.out.println("n3 : " + n3);
        System.out.println("n4 : " + n4);
    }
}
