package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());

        list.clear();
        System.out.println(list);//[]
        System.out.println(list.size());//0
//
//        list.remove(2);
//        System.out.println(list);//[]
//        System.out.println(list.size());//0
    }
}

class MyArrayListTest2{
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        int removeValue = list.remove();
        System.out.println(removeValue);
        //마지막 방의 있는 값 리턴
        //마지막 방도 없애야 함, 즉 사이즈()는 3이 되어야함
        System.out.println(list);
    }
}