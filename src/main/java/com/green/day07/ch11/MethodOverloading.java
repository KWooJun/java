package com.green.day07.ch11;

public class MethodOverloading {
    /*
    오버로딩은 메소드에서만 적용된다.
    오버로딩은 같은 이름의 메소드를 여러개 정의할 수 있는 기법
    매개변수의 종류 및 타입이 다륻다면 가능하다.
    (같은 이름의 다른 메소드와 매겨변수 구분이 된다면)

     매개변수명의 이름과 리턴타입은 전혀 상관이 없다.
     오로지 매개변수 타입의 갯수와 순서로 구분한다.

     생성자도 메소드의 한 종류기 때문에 오버로딩이 된다.
     */

    public void MethodOverloading(){} //생성자가 적혀있으면 기본생성자를 안만들어줌 void 를 빼면 기본 생성자임
    public MethodOverloading(int n1){}
    public MethodOverloading(int n1, int n2){}
    public MethodOverloading(long n1, int n2){}

    public void sum(int n1){}
    public void sum(int n1, int n2){}
    public void sum(int n1, long n2){}
    public void sum(long n2, int n1){}
    public void sum(int n1, String str){}
    public void sum(String str, int n2){}
    //public String sum(int n1, int n2){ return "String" } //리턴 타입으로는 구분하지 않는다.
    //public void sum(int n2, int n1){} //매개 변수 명으로 구분하지 않는다.

}
