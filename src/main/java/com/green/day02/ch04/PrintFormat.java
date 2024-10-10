package com.green.day02.ch04;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 떄 사용
         */

        String name = "홍길동";
        int age = 22;
        float height = 172.5f;
        char bloodType = 'O';
        boolean isMan = true;
        System.out.println(name + "의 나이는 " + age + "살 키는 " + height
                            + height + "cm 혈액형은 " + bloodType + "형입니다. 그는 남자입니까?" + isMan);

        System.out.printf("%s의 나이는 %d살 키는 %.1fcm 혈액형은 %c형 입니다. 그는 남자입니까? %b\n", name,
                            age, height, bloodType, isMan);
        System.out.printf("%s의 나이는 %d살 키는 %.1fcm 혈액형은 %s형 입니다. 그는 남자입니까? %b\n", name,
                            age, height, bloodType, isMan);
        
        // %f 사이의 값을 주어서 기능을 활용할 수 있다. 12는 총 12칸을 차지한다
        // 012는 12칸을 사용하는 데 빈칸이 있으면 0으로 채운다.
        // .1는 실수를 나타내는 길이
        System.out.printf("키는 %12.1f 입니다.\n", 172.2843857); //Nice
        System.out.printf("키는 %12.1f 입니다.\n", 172.2843857); //Nice
        System.out.printf("키는 %-12.1f 입니다.\n", 172.2843857);
        System.out.printf("키는 %012.1f 입니다.\n", 172.2843857);
        //System.out.printf("키는 %-012.1f\n", 172.2843857);// 이건 안됨

        int won = 230000000;
        System.out.printf("won : %d원\n", won);
        System.out.printf("won : %,d원\n", won); //Nice!
        System.out.printf("won : %12d원\n", won);
        System.out.printf("won : %-12d원\n", won);
        System.out.printf("won : %012d원\n", won);

        String result = String.format("%,d", won);
        System.out.println("result : " + result);
    }
}
