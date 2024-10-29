package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... a?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = $d\n", n1, n2, (n1 / n2));

        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }catch (Exception e){//Exception 은 항상 가장 아래 catch 문을 적을 수 있다.

        }

        System.out.println("-----------------------------");

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... a?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = $d\n", n1, n2, (n1 / n2));

        }catch (InputMismatchException | ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("-----------------------------");

        try {
            System.out.print("a/b ... a?");
            int n1 = scan.nextInt();
            System.out.print("a/b ... a?");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = $d\n", n1, n2, (n1 / n2));

        }catch (Exception e){ // 모든 예외를 다 잡는다. 예외의 최상위 class
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("-----------------------------");
        System.out.println("-- 종료 --");

    }
}
