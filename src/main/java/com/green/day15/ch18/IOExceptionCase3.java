package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*; // 이렇게 적어놔도 전부 로딩하지 않고 사용하는 class 만 로딩한다.
/*
D 드라이브에 Simple.txt 파일을 만든다.
 */
//p.402 예제
public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- 끝 --");
    }
    public static void md1() throws IOException{
        md2();
    }

    public static void md2() throws IOException{
        Path path = Paths.get("D:/Simple.txt");//절대경로 (full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        //1. newBufferedWriter(path) 는 메소드
        //2. static 메소드
        //3. 리턴메소드 - 리턴 타입은 BufferedWriter
        //4. throws 메소드이다.
        writer.write('A');
        writer.write("반갑다");
        writer.close();
    }

}
