package com.green.day07.ch07;

public class Car {
    private String color;
    private String gearType; // auto, manual
    private int door;

    /*
    정의할 때 생성자와 메소드 다른점
    1. 이름과 클래스 명이 같다
    2. 리턴타입(반환형) 작성하면 안된다.
     */

    /*
    this 사용법은 2가지가 있다.
    1. this.    : 멤버필드, 멤버메소드 사용, this. 생략가능할 때가 있다
    2. this()   : 생성자에서 다른 생성자 호출 시 사용 가능
     */

    Car(){ //기본 생성자
        this("white", "auto", 4);
        //this.introduce();
        //introduce();
    }
    /*
    밑에 파라미터가 있는 생성자를 this 로 불러와서 white, auto, 4를 넣는 개념
    밑에 파라미터가 있는 생성자가 없으면 this 를 사용하지 못함
     */

    Car(String color, String gearType, int door){ //파라미터가 있는 생성자 or 오버로딩된 생성자
        this.color = color; //매개변수명이 멤버필드명과 달랐다면 this. 을 생략할 수 있다.
        this.gearType = gearType;
        this.door = door;
    }

    Car(String gearType, int door){
//        color = "white";
//        this.gearType = gearType;
//        this.door = door;
        this("white", gearType, door);
    }

    public void introduce(){
        //this("dd","ddd",12);
        //introduce 메소드가 호출된다는 말은 이미 객체 생성이 끝난 이후다.
        //생성자는 객체 생성시에만 호출할 수 있기 떄문에 객체 생성 이후에는 호출 불가다.

        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n"
                        , color, gearType, door);
    }
}

class CarTest {
    //main 메소드의 내용을 수정하지 않고
    //생성자를 이용하여
    //"white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요
    public static void main(String[] args) {
        Car c1 = new Car(); //
        c1.introduce();

        Car c2 = new Car();
        c2.introduce();

        Car c3 = new Car("red", "manual", 5);
        c3.introduce();
        //"red 컬러의 manual 기어를 가진 5개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.

        Car c4 = new Car("auto", 6);
        c4.introduce();
        //"white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요
    }
}
