package com.green.day06.ch07;
public class PassingRef {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba;
        ba2.checkMyuBalance();
        ba.checkMyuBalance();

        ba2 = null; // null 의 의미는 객체를 가르키고 있지 않다.(주소 값이 없다.), 주소 값을 풀어버리는 방법
        if(ba2 != null){ // null 체크
            ba2.checkMyuBalance();
        }

        //null 인 상태에서 메소드 호출을 하면 NullPointException 이 발생한다
        //null 인 상태에서 메소드 호출을 하면 안된다.

        //ba2 = new BankAccount(); //새롭게 주소값 저장할 수 있다. 변수기 때문에

        check(ba);

//        만약 아래처럼 적었다면 check 메소드는 non-static 메소드였다.
//        PassingRef pf = new PassingRef();
//        pf.check(ba);

        //1. void, return
        //2. static, non-static
    }
    static void check(BankAccount ba){
        ba.checkMyuBalance(); //balance
    }

}
