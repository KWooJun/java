package com.green.day05.ch06;

//지역변수
public class LocalVariable {
    /*
    Scope(스코프) : 변수가 살아있는 범위
                   변수의 접근 가능 영역
                   변수가 소멸되지 않고 존재할 수 있는 영역
    선언된 변수를 나를 감싸고 있는 가장 가까이 있는 {} 안에서만 살아있다.(물론 선언된 이후)
     */
    public static void multiply(int n1){
        int num1 = 11;
    }
    public static void sum(int n1){
        int num1 = 11;
        // main 메소드에서 사용한 변수명이지만 main 메소드 중괄호를 벗어나게 되면
        // num1은 scope 가 없기 떄문에 num1을 sum 메소드에서 선언할 수 있다.
    }


    public static void main(String[] args) {
        boolean ste = true;
        int num1 = 11;
        System.out.println(num1);

        if(ste){
            int num2 = 22;
            num1 ++;
            System.out.println(num1);
            System.out.println(num2);
        }
        //System.out.println(num2); num2 의 스코프는 사라졌다.
        {
            int num3 = 33;
            num3++;
            System.out.println(num3);
        }
        //System.out.println(num3); num3 의 스코프는 사려졌다.

        for(int i = 0; i < 10; i++){

        }
        //System.out.println(i); i의 스코프는 for 문 밖에서는 사라진다.
        //for 문 초기화 공간에서 생성된 변수는 for 문 안에서만 사용가능하다
    }
}
