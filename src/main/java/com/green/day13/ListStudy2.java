package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        //Generic 제네릭
        //제네릭을 사용하면 실행시에 타입이 결정된다.
        //제네릭을 사용된 클래스에 타입을 결정하지 않으면 타입은 Object 가 된다.
        //아래 3가지의 결과는 같다. 맘에 드는 것을 사용하면 된다.
        List<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>();

        //list.add("") //정수형 값만 들어갈 수 있는 ArrayList 객체가 만들어짐
        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        System.out.println(list);
        System.out.println(list.size());

        int n1 = list.get(0); //형변환을 하지 않아도 된다.

        list.add(1,60);//중간에 추가하면서 뒤에 값을 늘려나감
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.add(0, 30);
        System.out.println(list);
        System.out.println("list.lastIndexOf(30) : " + list.lastIndexOf(30));
        System.out.println("list.indexOf(30) : " + list.indexOf(30));

        //lastIndexOf, indexOf의 메소드의 리턴값이 -1
        System.out.println("list.lastIndexOf(100) : " + list.lastIndexOf(100));
        System.out.println("list.indexOf(100) : " + list.indexOf(100));

        list.clear();
        System.out.println(list);
        System.out.println(list.size());



    }
}