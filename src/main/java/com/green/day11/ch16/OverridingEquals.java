package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        String s1 = new String("10");
        String s2 = new String("10");

        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        NumBox n3 = new NumBox(13);

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));


        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);

        //래퍼런스 변수끼리의 == 비교는 주소값 비교(동일성 비교)
        //n1, n2는 각각 객체생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다
        //즉 2개의 NumBox 객체가 만들어 졌다.

        System.out.println("n1 == n2 : " + (n1 == n2));
        //NumBox 객체가 서로 다른 값을 가지고 있으면 true 뜨도록
        System.out.println("n1.equals(n2) : " + n1.equals(n2)); //true
        System.out.println("n1.equals(s1) : " + n1.equals(s1)); //false
        System.out.println("n1.equals(n3) : " + n1.equals(n3)); //false

    }
}

class NumBox{
    private int num;

    NumBox(int num){
        this.num = num;
    }
    @Override
    public boolean equals(Object object){
        if(!(object instanceof NumBox)){ //NumBox 와 다른 타입이면 return false
            return false;
        }
        NumBox nb = (NumBox)object;
//        return num == nb.getNum(); //NumBox 에 있는 값과 num 값을 비교
        return this.num == nb.num; //getNum()을 사용하지 않아도 접근 가능
    }

    public boolean equals2(Object object){
        return toString().equals(object.toString());
    }


    public int getNum() {
        return num;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
        //메소드 ()소괄호가 보이기 때문에
        //static 메소드 (객체 생성없이 class. 을 사용할 수 있기 때문에)
        //리턴타입이 String
        //파라미터는 int 타입이다.
    }
}
