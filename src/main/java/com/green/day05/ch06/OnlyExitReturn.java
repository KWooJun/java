package com.green.day05.ch06;

public class OnlyExitReturn {
    static void divid(int n1, int n2){
        if(n1 == 0 || n2 == 0){
            return;
        }
        System.out.printf("나눗셈 결과 : %d\n", (n1 / n2));
    }

    public static void main(String[] args) {
        divid(4, 2);
        divid(6, 2);
        divid(9, 0);
        System.out.println("-----------끝-------------");
        /*
        0으로 숫자를 나누려고 하면 수학적 예외가 발생된다.
        이러한 예외가 발생되지 않도록 작업을 하는 것을 "예외처리"라고 한다.
        예외처리하는 방법은 크게 2가지
        - 예외가 발생되는 상황을 나오지 않게 한다.
        - 예외가 발생되는 상황을 try - catch 문으로 해결한다.
         */
    }
}
