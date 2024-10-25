package com.green.day12.blackjack;

public class Rule {
    public void getWinner(Dealer dealer, Gamer gamer){
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다. or 누가 이겼다.
        // 비겼는 경우 : 둘의 값이 같을 경우 , 둘다 21을 넘어선 경우
        int deal = dealer.getPoint();
        int gm = gamer.getPoint();

        /*
        if : 비기는 경우의 수를 전부 잡아냄. 둘의 값이 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우
        남은 경우 : 둘중의 하나가 21을 넘우, 둘다 21을 안남은 경우

        else if : 딜러가 이긴 경우의 수를 전부 잡아냄.
        딜러가 21을 안넘으면서 게이머 보다 점수가 많은 경우 >> 둘다 21을 안넘은 경우인데 딜러가 점수가 더 높음
        게이머가 21을 넘었다면 >> 딜러는 21을 안넘었을꺼다.
        남은 경우의 수 : 게이머가 이기는 경우의 수가 남았음

        else 게이머가 이기는 경우이다.
         */
        if ((deal == gm) || (deal >= 21 && gm >= 21)){
            System.out.println("비겼습니다.");
        }
        else if(gm < deal && deal <= 21 || gm > 21){
            System.out.println("딜러가 이겼습니다");
        }
        else{
            System.out.println("게이머가 이겼습니다.");
        }

    }
}