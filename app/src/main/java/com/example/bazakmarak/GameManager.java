package com.example.bazakmarak;


public class GameManager{
    private CardDeck deck;
    private Hand hand1, hand2;
    GameActivity gameActivity;
    private CardOnTable[] cardOnTables = new CardOnTable[5];
    public GameManager(/*GameActivity gameActivity1*/) {
        deck = new CardDeck();
        //gameActivity = gameActivity1;

        //Random rand = new Random();
        /*int randInt = rand.nextInt(deck.getLength());
        int randInt2 = rand.nextInt(deck.getLength());
        hand1 = new Hand(deck.getArrCard().get(randInt), deck.getArrCard().get(randInt2));
        hand2 = new Hand(deck.getArrCard().get(randInt), deck.getArrCard().get(randInt2));*/
        FillGame();
    }

    private void FillGame() {
        for(int i = 0 ; i < cardOnTables.length; i++)
        {
            Card card = deck.remover();
            cardOnTables[i] = new CardOnTable(gameActivity,card.getNumber(),card.getColor(),card.getShape());
        }
        hand1 = new Hand(deck.remover(), deck.remover());
        hand2 = new Hand(deck.remover(),deck.remover());//ברגע זה מוגדרות הידיים והקלפים שעל השולחן
    }



    public int WhatHand(Hand hand){
        Card [] cards7 = new Card[7];
        for (int i = 0; i < 5; i++) {
            cards7[i] = cardOnTables[i];
        }
        cards7[5] = hand.getC1();
        cards7[6] = hand.getC2();
        HandLevelCheck levelCheck = new HandLevelCheck(cards7);
        return levelCheck.LevelIs();
    }


}
