package com.green.day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
    /*
    List 인터페이스 ,Interface(인터페이스)객체화가 불가능 하다.

    인터페이스는 부모 역할만 한다. List 를 상속 받은 class(LinkedList, ArrayList)가 있다.
    둘 class 의 결과는 똑같은데 처리 방식이 다르다.
    LinkedList 는 Node 방식으로 데이터를 다루고 ArrayList 는 Array(배열)방식으로 데이터를 다룬다.
    LinkedList 는 수정이 많으면 유리하고 ArrayList 읽기 위주의 작업이 많으면 유리하다.

    List 변수명 = new ArrayList();
    List 변수명 = new LinkedList();
    이렇게 작성이 가능하다.
    */

    public static void main(String[] args){
        List list = new ArrayList();
        list.add(10); //0번방 10값이 주입
        list.add(20); //1번방 20값이 주입
        List list2 = (ArrayList)list;
        list2.add(30); //2번방 주입
        list2.add("하하"); //3번방 주입

        Object[] arr2 = new Object[4];
        arr2[0] = 10;
        arr2[1] = "하하";

        int val0 = (int)list.get(0);
        String val3 = (String)list.get(3);
        System.out.println("val0 : " + val0);
        System.out.println("val3 : " + val3 );

        System.out.println(list);
        System.out.println(list2);
    }
}
