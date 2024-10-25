package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0;

    public CardDeck(){
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clover","Spade"};
        /*
        미션 1
        "","" 값을 가지고 있는 Card 객체를 52개 만들어주시고
        cards 배열에 하나씩 넣어주세요
         */

        //미션 2
        //서로 다른 값을 가지고 있는 Card 객체를 만들어서 cards 에 순차적으로 넣어주세요
        int idx = 0;
        for(int i = 0; i < patterns.length; i++){
            String pattern = patterns[i];
            for(int z = 1; z < 14; z++) {
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination);
            }
        }
        for(int i = 0; i < cards.length; i++){
            int rIdx = (int)(Math.random()* cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }


        //enhanced - for 문으로 card 객체 주소값 전부 출력
//        for(Card item : cards){
//            System.out.println(item);
//        }
    }
//    private void shuffle(){
//        for(int i = 0; i < cards.length; i++){
//            int rIdx = (int)(Math.random()* cards.length);
//            Card temp = cards[i];
//            cards[i] = cards[rIdx];
//            cards[rIdx] = temp;
//        }
//    }
    //주소값 하나씩 리턴, 리턴 주소값 지워야되고, selectedIdx 이용하여 해결
    public Card draw(){
        Card tmp = cards[selectedIdx]; //스와핑이랑 갵은 개념
        cards[selectedIdx] = null;
        selectedIdx++;
        return tmp;
    }
    public void checkCard(){
        for(Card c : cards){
            System.out.println(c);
        }
    }

    public String getDenomination(int n){
//        if(n == 1){
//            return "A";
//        }
//        else if(n > 1 && n < 11){
//            return String.valueOf(n);
//        }
//        else if(n == 11){
//            return "J";
//        }
//        else if(n == 12){
//            return "Q";
//        }
//        else if(n == 13){
//            return "K";
//        }
//        else{
//            return "";
//        }
        if(n < 1 || n > 13){
            return"";
        }
        switch (n){
            case 1 : return "A";
            case 11 : return "J"; //return 이 있으면 break 가 없어도 됨
            case 12 : return "Q";
            case 13 : return "K";
            default : return String.valueOf(n);
        }
    }
}

