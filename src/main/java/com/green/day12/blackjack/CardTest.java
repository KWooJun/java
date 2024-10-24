package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck(); //CardDeck 객체 주소값
        System.out.println("-----------------------");
        Card c = cd.draw();
        System.out.println(c);
        System.out.println("--------------------");
        Card c2 = cd.draw();
        System.out.println(c2);
        System.out.println("--------------------");

        cd.checkCard();

    }
}
