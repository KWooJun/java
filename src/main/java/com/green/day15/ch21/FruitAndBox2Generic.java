package com.green.day15.ch21;

public class FruitAndBox2Generic{
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox = new BoxGeneric<>(new Apple());
        Apple apple = appleBox.getBox();
        BoxGeneric<Orange> OrangeBox = new BoxGeneric<>(new Orange());
        Orange orange = OrangeBox.getBox();

        //new 부분에 <>를 생략하면 객체는 타입이 제네릭 타입은 Object 가 되는 것 같음
        //타입에 적은<Orange>로 형변환을 하는 것으로 예상됨
        //new 부분에 <>를 작성하는 것이 성능에 도움이 된다.
        BoxGeneric<Orange> OrangeBox2 = new BoxGeneric(new String());
        OrangeBox2.getBox();
        //BoxGeneric<Orange> OrangeBox2 = new BoxGeneric<>(new String());

    }
}

class BoxGeneric<T>{
    private T fruit;

    BoxGeneric(T fruit){
        this.fruit = fruit;
    }

    T getBox() {
        return fruit;
    }
}