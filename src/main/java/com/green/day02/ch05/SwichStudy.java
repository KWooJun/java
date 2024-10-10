package com.green.day02.ch05;

import java.util.Scanner;

public class SwichStudy {
    public static void main(String[] args) {

        String name = new String("홍길동");
        String name2 = new String("홍길동");

        System.out.printf("name : %s\n", name);
        System.out.printf("name2 : %s\n", name2);
        System.out.printf("name ==  name %b\n", name, name2, name == name2);
        System.out.printf("name.equals(name2) : %b\n", name.equals(name2));

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 >> ");
        String input = scan.nextLine();

        switch (input){
            case "abc" :
                System.out.printf("switch-def");
                break;
        }

        System.out.println("--------------끝------------------");

    }
}
