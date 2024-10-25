package com.green.day12.blackjack;

import java.util.List;

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

class CardTest2{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다.
        gamer.receiveCard(cd.draw()); //카드를 저장한다.
        gamer.receiveCard(cd.draw()); //카드를 저장한다.
        gamer.showYourCards();
        System.out.println(gamer.getPoint());

        List<Card> list = gamer.openCards();

    }
}

class CardTest3{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
        dealer.needMoreCard(cd);
        dealer.showYourCards();

        CardDeck cd2 = new CardDeck();
        Card c1 = cd2.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다.
        gamer.receiveCard(cd2.draw()); //카드를 저장한다.
        gamer.receiveCard(cd2.draw()); //카드를 저장한다.
        gamer.showYourCards();

    }
}

class CardTest4{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.needMoreCard(cd);
        System.out.println("딜러 :" + dealer.getPoint());

        CardDeck cd2 = new CardDeck();
        Card c1 = cd2.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다.
        gamer.receiveCard(cd2.draw()); //카드를 저장한다.
        gamer.receiveCard(cd2.draw()); //카드를 저장한다.
        System.out.println("게이머 : " + gamer.getPoint());

        Rule r = new Rule();
        r.getWinner(dealer ,gamer);

    }
}