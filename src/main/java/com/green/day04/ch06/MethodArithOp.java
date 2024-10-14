package com.green.day04.ch06;

public class MethodArithOp {

    static void subtract(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }
    static void multiply(int n1, int n2) {
        System.out.printf("%d X %d = %d\n", n1, n2, (n1 * n2));
    }
    static float divide(int n1, int n2){
        return (float)n1 / n2;
    }
    static int modulo(int n1, int n2){
        return n1 % n2;
    }
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        subtract(n1, n2);
        subtract(10, 2);
        subtract(100, 200);
        //System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2);

        multiply(n1, n2);
        //System.out.printf("%d X %d = %d\n", n1, n2, (n1 * n2);

        float r = divide(10, 3); // 나누기 처리
        System.out.printf("r : %f\n", r);

        int r2 = modulo(10, 4);
        System.out.printf("r2 : %d\n", r2);

    }
}
