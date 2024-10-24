package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount();
    }
}
//클래스 앞에 퍼블릭은 딱 하나만 가능하다. 파일명이랑 클래스명이 같을때
class SuperCLS{
    protected static int count;

    SuperCLS(){
        count++;
    }
}

class SubCLS extends SuperCLS{
    void showCount(){
        System.out.println("count : " + count);
    }
}