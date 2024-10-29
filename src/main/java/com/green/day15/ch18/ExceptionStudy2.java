package com.green.day15.ch18;

public class ExceptionStudy2 {
    /*
    메소드를 호출하는 코드를 작성했는데 빨간줄이고 마우스를 올려서 메시지를 확인해보니
    Unhandled Exception 이라는 내용이 보이면 해당 메소드를 예외를 던지고(throw)하고 있기 떄문에
    호출하는 부분에서 try-catch 로 해결해주어야 한다.(호출 부분을 감싸줘야 한다.)
     */
    public static void main(String[] args) {

        int r = 0;
        try {
            r = div(10, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //int r = div(10.0);
        System.out.println("r : " + r);
    }
    //throw 는 예외를 잡는것이아니라 다시 호출한 것으로 던진다.
    public static int div(int n1, int n2) throws Exception {
        return n1/n2;
    }
}
