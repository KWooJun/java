package com.green.day10.ch14;

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng");
        System.out.println(man1.getName());

        man1.tellYourSelf();
        //Business 클래스 안에는 tellYourSelf 메소드가 없지만 호출할 수 있다.
        //Man 클래스로부터 상속을 받았기 때문이다.
        System.out.println(man1.toString());
        //같은 이유로 Object 클래스로부터 상속을 받았기 toString 메소드를 호출할 수 있다.

        System.out.println("------------------------------");
        man1.jump();
        System.out.println("============================");
        man1.whatIsDoing();
        //man.super.jump;//외부에서 this.
    }
}

//상속 키워드를 생략하면 extends Object 가 자동으로 붙는다
//모든 클래스는 최상위 부모로 Object 를 갖는다
//모든 클래스의 최상위 부모는 Object 이다.
class Man{
    private String name;

    public Man(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void tellYourSelf(){
        System.out.printf("제 이름은 %s 입니다.\n", name);
    }

    public void jump(){
        System.out.printf("%s(이)가 점프!\n", name);
    }
}

class BusinessMan extends Man{
    private String company;
    private String position;
    public String getCompany() {
        return company;
    }


    public BusinessMan(String name, String company, String position) {
        super(name);
        /*
        super 소괄호를 생략하면 자동으로 super(); 이 내용만 추가 된다.
        super 소괄호를 생성자의 가장 위에 작성되어야 한다.
        해결방법
        1. 부모에 기본 생성자를 만들어 준다.
        2. 있는 생성자를 쓰도록 작성한다. (수동 작성)
         */
        this.company = company;//this 는 멤버 필드, 멤버메소드 호출할 떄 사용
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    //오버 라이딩 : 부모가 가진 메소드를 사용하는 것이 아니라 내가 재정의한 메소드를 사용하게끔 하는 기법
    public void jump(){
        super.jump(); //super. 을 생략하면 나 자신 호출(재귀 호출)이기 때문에 무한 루프가 된다.
        System.out.printf("%s에 다니는 %s(이)가 점프!\n", company, getName());
        //name 은 private 이기 떄문에 바로 접근할 수 없다.
        //public 으로 상속받은 getName 메소드를 호출하여 이름값을 얻는다.
    }

    public void whatIsDoing(){
        super.jump();//부모가 가지고 있는 메소드를 호출하고 싶으면 super. 을 이용하면 된다,

    }
}
