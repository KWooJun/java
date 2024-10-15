package com.green.day05.ch06;

public class StackStudy {
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
