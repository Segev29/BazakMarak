package com.example.bazakmarak;

public class Hand {
    private Card c1;
    private Card c2;

    public Hand(Card c1, Card c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Card getC1() {
        return c1;
    }

    public Card getC2() {
        return c2;
    }
}
