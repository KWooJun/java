package com.green.day09.ch13;

import java.io.PrintStream;

public class EnhancedForInst {
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee", 5_000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);

        //미니 미션 라애 포맷처럼 출력되게 해주세요.
        //System.out.println(arr[0]); //제품명 : Coffee, 가격 : 5000원

        /*
        enhanced-for 문을 사용하여 제품명, 가격을 콘솔에 출력하고
        모든 제품의 가격을 더한 값을 출력해주세요.
         */
        int sum = 0;
        for(Product item : arr){
            System.out.println(item);
//            sum = sum + item.getPrice();
        }
        for(Product item : arr){
            sum += item.getPrice();
        }
        System.out.printf("합계 : %,d\n", sum);

        System.out.println("----------------------------");

        //배열에서 제품명이 Apple 인 것만 찾아서 콘솔에 출력

        for(Product item : arr){
            if(item.getName().equals("Apple")){
                System.out.println(item.getName());
            }
        }

    }
}

class Product{
    private String name;
    private int price;

    Product(){
        this.name = name;
        this.price = price;
    }
    
    Product(String name, int price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
//        return "제품명 : "+ name +" 가격 : "+ price + "원";
        return String.format("제품명 : %s 가격 : %,d원", name, price);
    }

}
