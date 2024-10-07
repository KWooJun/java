package com.green.day01.ch02;

public class UseVariable {
    public static void main(String[] args) {
        //변수

        int num1; //변수 선언 , 정확히 표현 : num1 이라는 변수명을 가진 정수형을 선언
        //int 데이터 타입 (이 변수에 들어갈 수 있는 데이터를 한정/제한)
        //num1 변수명(사용할 때 쓰는 이름)
        //데이터를 주입할 떄는 대입 연산자를 사용한다.

        num1 = 10; //'=' 대입연산자, 오른쪽 항에 있는 값을 복사하여 왼쪽항에 준다
        // 왼쪽항은 저장할 수 있어야 한다.

        int num2 = 20; // 선언과 초기화를 동시에 할 수 있음
        int num3 = num1 + num2;
        //int num3 = 10 + 20; // num1 변수에 들어있는 값 10, num2 변수에 들어있는 값 20
        //int num = 30;

        System.out.printf("num1 : %d, num2 : %d, num3 : %d\n",num1, num2, num3);
        System.out.printf("num1 : %d, num2 : %d, num3 : %d\n",num1, num2, 11);


        /*
        변수를 사용하기 위해서는 선언을 해야한다.
        선언을 할 때 데이터 타입을 명시하는 데
        해당 데이터 타입만 저장이 될 수 있도록 한다.
        (다른 타입의 데이터는 저장 불가, typed 언어의 특징, 신뢰)

        변수를 사용하는 이유
        0. 데이터를 저장하기 위해
        1. 여러 군대에서 사용을 할 때 참조할 수 있도록 한다.
        왜냐, 값이 변경되었을 때 변수 값만 수정을 하면 모두 변경이 되기 때문
         */
    }
}
