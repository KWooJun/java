package com.green.day15.ch18;

public class ExceptionCase {
    /*
    try-catch 문 (예외처리)
    try 문에 에러가 날 가능성이 있는 코드를 위치한다.
    만약에 예외가 발생한다면 catch 부분이 실행된다.
    예외가 발생되지 않는다면 catch 부분이 실행되지 않는다.
    if 문과 유사함
     */
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        }catch (ArithmeticException e){
            e.printStackTrace();
            //try-catch 문이 없었다면 콘솔에서 봤을 내용을 출력한다.
            System.out.println(e.getMessage());
        }
        System.out.println("-- 종료 --");
    }
}
