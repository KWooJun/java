package com.green.day06.ch09;

public class AccessLevelModifiers {
    /*
    접근 수준 지시자 : private, default, protected, public
    
    private     : class 내에서만 접급 가능
    default     : private + 같은 패키지면 접근 가능 >> 사용안함
    protected   : default + 상속관계면 접근 가능
    public      : 무조건 접근 가능

    class 는 보통 public 붙이고
    멤버필드는 대부분 private 이다.
        -private 을 붙이지 않아도 되는 경우가 있다 >> 상수는 오픈핫도 된다.
        -변수는 무조건 private (은닉화/켑슐화)
        -private 한 멤버필드를 읽기/쓰기할 때 메소드를 통해서 한다.(getters/setters)
     */
}
