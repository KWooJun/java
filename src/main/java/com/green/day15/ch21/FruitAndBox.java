package com.green.day15.ch21;
//p.480
//Generic 이 없던 시절의 코드

public class FruitAndBox {
    public static void main(String[] args) {
        Apple ap = new Apple();
        AppleBox apBox = new AppleBox(ap);
//      AppleBox appleBox = new AppleBox(new Apple()); 이렇게 해도 가능
        Orange og = new Orange();
        OrangeBox ogBox = new OrangeBox(og);
    }
}

//toString 메소드를 오버라이딩 했다.
class Apple{
    public String toString(){
        return "사과";
    }
}

class Orange{
    public String toString(){
        return "오렌지";
    }
}

class AppleBox{
    private Apple ap;

    //private 한 멤버필드에 값 넣는 방버 2가지
    //생성자와 setter 메소드

    //생성자 통해서 값 넣을 수 있게 해주세요.
    AppleBox(Apple ap){
        this.ap = ap;
    }
    //메소드를 통해 ap 값을 외부로 리턴할 수 있게 해주세요
    public Apple getAp(){
        return ap;
    }

}

class OrangeBox{
    private Orange orange;

    OrangeBox(Orange orange){
        this.orange = orange;
    }

    public Orange getOrange(){
        return orange;
    }
}
