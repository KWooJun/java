package com.green.day10.ch13;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80, 10}, //영수
                {90, 90, 80, 20}, //상철
                {80, 70, 60, 30},//광수
                {90, 75, 66, 40},//광수
        };

        String[] names = {"영수", "상철", "광수", "민우"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학", "사회"};
        int[] subjectsScore = new int[subjects.length];

        //각 이름별, 과목별 합계값 구하는 부분
        for(int i = 0; i < score.length; i++){
            for(int i2 = 0; i2 < score[i].length; i2++){
                namesScore[i] += score[i][i2]; //학생별 합계 점수 정리
                subjectsScore[i2] += score[i][i2]; //과목 별 합계 점수
            }
        }

        int totalScore = 0;

        for(int i = 0; i < names.length; i++){
            totalScore += namesScore[i];
            System.out.printf("%s : 합계점수 : %d, 평균점수 : %.1f\n",
                            names[i], namesScore[i], (float)namesScore[i] / subjects.length);
        }
        System.out.println("-------------------------------------");

        for(int i = 0; i < subjectsScore.length; i++){
            System.out.printf("%s : 합계점수 %d, 평균점수 : %.1f\n",
                            subjects[i], subjectsScore[i], (float)subjectsScore[i] / names.length);
        }
        System.out.println("========================================");

        System.out.printf("학급 : 합계점수 : %d, 평균점수 : %.1f\n",
                        totalScore, (float)totalScore /(names.length * subjects.length));

//        int sum = 0;
//
//        int[] human = new int[score[0].length];
//        for(int i = 0; i < score.length; i++){
//            for(int z = 0; z < score[i].length; z++){
//                human[i] += score[i][z];
//            }
//        }
//
//        System.out.printf("광수 합계점수 : %d, 평균점수 : %.1f\n", human[0], (float)human[0] / score[0].length);
//        System.out.printf("상철 합계점수 : %d, 평균점수 : %.1f\n", human[1], (float)human[1] / score[0].length);
//        System.out.printf("광수 합계점수 : %d, 평균점수 : %.1f\n", human[2], (float)human[2] / score[0].length);
//
//        int temp = 0;
//        int temp1 = 0;
//        int temp2 = 0;
//        for(int i = 0; i < score.length; i++){
//            for(int z = 0; z < score.length; z++){
//                sum += score[i][z];
//                if(z == 0){
//                    temp += score[i][0];
//                }
//                if(z == 1){
//                    temp1 += score[i][1];
//                }
//                if(z == 2){
//                    temp2 += score[i][2];
//                }
//            }
//        }
//        System.out.printf("국어 : 합계점수 : %d, 평균점수 : %.1f\n", temp, (float)temp / score[0].length);
//        System.out.printf("영어 : 합계점수 : %d, 평균점수 : %.1f\n", temp1, (float)temp1 / score[0].length);
//        System.out.printf("수어 : 합계점수 : %d, 평균점수 : %.1f\n", temp2, (float)temp2 / score[0].length);
//        System.out.printf("학급 : 합계점수 : %d, 평균점수 : %.1f\n", sum, (float)sum / (score.length + score[0].length));
//

    }

}
