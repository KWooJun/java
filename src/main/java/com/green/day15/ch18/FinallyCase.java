package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이떄는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생하면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이 문장이 실행이 되어야 한다.
        try{
            Path path = Paths.get("D:/Simple.txt");//절대경로 (full 경로)
            BufferedWriter writer = Files.newBufferedWriter(path);
                writer.write("FinallyCase");
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
        }
    }
}

class FinallyCase2{
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try{
            Path path = Paths.get("D:/Simple.txt");//절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            writer.close();
        } catch (IOException e) {

        }
        System.out.println("-- 끝 --");
    }
}

class FinallyCase3{
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try{
            Path path = Paths.get("D:/Simple.txt");//절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally { //(실행보장)예외가 발생해도 안해도 무조건 실행되는 부분(메소드에서 return 을 만나도 실행)
            System.out.println("실행이 되나 안되나");
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
        System.out.println("-- 끝 --");
    }
}
//궁금증 : return 이 주는 값을 finally 에서 바꾸고 실행이 가능한가?