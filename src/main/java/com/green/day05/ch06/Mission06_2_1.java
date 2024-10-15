package com.green.day05.ch06;

public class Mission06_2_1 {
    static double getArea(int radius){
        return (radius * 2 * 3.14);
    }

    static double getcircumference(int radius){
        return radius * radius * 3.14;
    }
    public static void main(String[] args) {
        /*
        인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 변환하는
        메소드와 원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고,
        이 둘을 호출하는 main 메소드를 정의하자.
         */
        int radius = 10;

        System.out.printf("둘레 : %f\n", getcircumference(3));
        System.out.printf("둘레 : %f\n", getcircumference(radius));
        System.out.printf("넓이 : %f\n", getArea(3));
        System.out.printf("넓이 : %f\n", getArea(radius));

    }
}
