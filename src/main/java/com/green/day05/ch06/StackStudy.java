package com.green.day05.ch06;

public class StackStudy {
    /*
    Stack : FILO (First In Last Out)
        가장 먼저 들어온 것이 가장 늦게 나간다.


     */

    public static void main(String[] args) {
        System.out.println("-- main [start] --");
        methodA();
        System.out.println("-- main [end]   --");
    }

    static void methodA(){
        System.out.println("---- main [start] ----");
        methidB();
        System.out.println("---- main [end]   ----");
    }

    static void methidB(){
        System.out.println("------ main [start] ------");

        System.out.println("------ main [end]   ------");
    }

}
