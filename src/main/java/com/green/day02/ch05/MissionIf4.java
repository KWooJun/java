package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {

        int score = ((int)(Math.random()*101));
        System.out.printf("score : %d\n", score);

        /*
            100점이면 A+
            98점이상이면 A0
            94점이상 97점 이하 A-
            90점이상 93점 이하 A-

            88점이상 97점 이하 B+
            94점이상 97점 이하 B0
            80점이상 97점 이하 B-

            78점이상 97점 이하 C+
            74점이상 97점 이하 C0
            70점이상 97점 이하 C-

            나머지 D
         */
        if (score >= 98){
            System.out.println("A+");
        }
        else if (score >= 94){
            System.out.println("A0");
        }
        else if (score >= 90){
            System.out.println("A-");
        }
        else if (score >= 88){
            System.out.println("B+");
        }
        else if (score >= 84){
            System.out.println("B0");
        }
        else if (score >= 80){
            System.out.println("B-");
        }
        else if (score >= 78){
            System.out.println("C+");
        }
        else if (score >= 74){
            System.out.println("C0");
        }
        else if (score >= 70){
            System.out.println("C-");
        }
        else{
            System.out.println("D");
        }
    }
}
