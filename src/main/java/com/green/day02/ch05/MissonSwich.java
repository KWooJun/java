package com.green.day02.ch05;

import java.util.Scanner;

public class MissonSwich {
    public static void main(String[] args) {
        //남성은 172cm , 여성은 159cm 평균

        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요. (w/m)");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해주세요.(cm)");
        int height = scan.nextInt();


        System.out.printf("성별 : %s, 키 : %d\n", gender, height);
        // 당신은 평균입니다.
        // 당신은 평균보다 큽니다.
        // 당신은 평균보다 작습니다.

        // 만약 성별 : "남", 키 : 162 >> 당신은 평균보다 작습니다.
        // 만약 성별 : "여", 키 : 160 >> 당신은 평균보다 큽니다.

        int stanHeight = 159;

        switch (gender){
            case "m":
                stanHeight = 172;
        }
        if (stanHeight < height){
            System.out.println("당신은 평균보다 큽니다.");
        }
        else if(stanHeight > height){
            System.out.println("당신은 평균보다 작습니다.");
        }
        else {
            System.out.println("당신은 평균입니다.");
        }

    }
}
