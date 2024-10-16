package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        //System.abc.kkk().ggg;  . 앞에있는 것은 객체의 주소값

        //System.abc 의 결과물을 "A" 지칭하자
        //A.kkk().ggg

        //A.KKK() 의 결과물을 "B" 지칭하자
        //B.ggg

        //System    : 클래스
        //abc       : 참조변수 , 멤버필드
        //kkk()     : abc 가 가리키고 있는 메소드 , 리턴타입은 참조타입이다.
        //            뒤에 .ggg가 붙었기 때문 return 메소드 였다면 .ggg 가 올 수 없음
        //ggg       : 멤버필드

        System.out.println();

        PrintStream fff = System.out;
        fff.println();

        //System    : 클래스
        //out       : static final 멤버필드, PrintStream 객체의 주소값을 담을 수 있다.
        //println   : 메소드

        /*
        PrintStream 은 println(int i), println(char c), println(String str) 등의 메소드를 가지고 있고
        이것은 오버로딩이다.
        만약 오버로딩이 없다면
        printlnInt(int i), printlnChar(char c), printlnString(String str) 등 이런식으로
        메소드를 만들어야만 한다.
         */
    }
}
