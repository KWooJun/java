package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소 값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용
    //멤버필드 선언, 변수명은 cards

    private final List<Card> cards;
    protected int point;

    public Gamer(){
        cards = new ArrayList();
    }
    public void receiveCard(Card c){
        int point = switch (c.getDenomination()){
            case "A" -> 1;
            case "J","Q","K" -> 10;
            default -> Integer.parseInt(c.getDenomination());
        };
        this.point += point;
        String str = "10";
        int val = Integer.parseInt(str); //val 변수에 10 정수값이 주입된다.
        cards.add(c);
    }
    public int getPoint(){
        return point;
    }
    public void showYourCards(){
        for (Card card : cards){ System.out.println(card); }
//        for(int i = 0; i < cards.size(); i++){System.out.println(cards.get(i));}

    }
    public List<Card> openCards(){
        return cards;
    }
}
