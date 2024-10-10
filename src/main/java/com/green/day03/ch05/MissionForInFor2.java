package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        /*
        중첩 for 문을 이용하여 구구단을 출력해주세요.

        2 X 1 = 2   \t         3 X 1 = 3       ...      9 X 1 = 9
        2 X 2 = 4   \t         3 X 2 = 3                9 X 2 = 9
        2 X 3 = 6   \t         3 X 2 = 3                9 X 3 = 27
        ...                    ...                      ...
        2 X 9 = 18  \t         3 X 9 = 27               9 X 9 = 81
         */
        for(int i = 2; i < 10; i++){
            for(int z = 1; z < 10; z++) {
                System.out.printf("%d X %d = %d\t", z, i, (i * z));
            }
            System.out.println();
        }
    }
}