package com.green.day12.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("====================Black Jack=========================");

        CardDeck cd = new CardDeck();
        Rule rule = new Rule();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        //번갈아 가면서 게이머와 딜러가 카드를 받을수 있게 해주세요

        for(int i = 0; i < 2; i++){
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }
        dealer.needMoreCard(cd);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------");
            gamer.showYourCards();
            System.out.print("카드를 추가하시겠습니까?(취소 : N)");
            String input = scan.nextLine();
            if ("n".equalsIgnoreCase(input)) {
                break;
            }
            else{
                gamer.receiveCard(cd.draw());
            }
        }
        System.out.println("----------딜러의 카드----------");
        dealer.showYourCards();
        System.out.println("딜러의 카드 값 : " + dealer.getPoint());
        System.out.println("----------게이머의 카드---------------");
        gamer.showYourCards();
        System.out.println("게이머의 카드 값 : " + gamer.getPoint());

        rule.getWinner(dealer, gamer);
    }
}
