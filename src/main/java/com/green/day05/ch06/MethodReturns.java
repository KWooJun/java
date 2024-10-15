package com.green.day05.ch06;

public class MethodReturns{
    static int adder(int n1, int n2){
        return n1 + n2;
    }
    static double square(double n1){
        return n1 * n1;
    }
    public static void main(String[] args) {

        int result;
        result = adder(4, 5); // 9 리턴

        System.out.printf("%d + %d = %d\n", 4, 5, result);
        System.out.printf("%.2f * %.2f = %.2f\n", 3.5, 3.5, square(3.5));

    }
}
