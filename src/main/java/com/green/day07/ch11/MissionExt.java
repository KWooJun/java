package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        //리터럴 사용 금지
        //fileNm 에서 jpg 문자열을 뽑아내주세요.
        String fileNm = "nice_v.ery.Nice.jpg";

        String ext = (fileNm.substring(fileNm.lastIndexOf(".") + 1));

        System.out.println(ext);
    }
}
