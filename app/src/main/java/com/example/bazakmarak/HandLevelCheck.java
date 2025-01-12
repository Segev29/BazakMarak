package com.example.bazakmarak;

import android.content.Context;

public class HandLevelCheck {
    private Card [] cards = new Card[7];
    private Card [] cardsave = new Card[7];
    //private Context context;
    private Card publiccard = new Card(0,0,0);

    public HandLevelCheck(Card[] cards) {
        this.cards = cards;
    }

    public int LevelIs (/*Hand hand, Card[] arr*/)
    {
        for (int i = 0; i < 7; i++) {
            cardsave[i] = publiccard;
        }
        sort();

        if(RoyalFlush())
        {
            return (10);
        }
        if(StraightFlush())
        {
            return 9;
        }
        if(FourOfAKind())
        {
            return 8;
        }
        if(FullHouse())
        {
            return 7;
        }
        if(Flush())
        {
            return 5;
        }
        if(Straight())
        {
            return 4;
        }
        if(ThreeOfAKind())
        {
            return 3;
        }
        if(Pair())
        {
            return 2;
        }
        return 1;
    }
    public void sort()
    {
        /*cards[0] = hand.getC1();
        cards[1] = hand.getC2();
        for (int i = 2; i < 7; i++) {
            cards[i] = arr[i-2];
        }*/ // הערה חשובה - קיבלת יד ומערך, הפעם הגדרת את המערך הזה מראש ושמת את הפעולה כמו שצריך
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = 0; j < cards.length - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (cards[j].getNumber() > cards[j + 1].getNumber()) {
                    // Swap temp and array[j]
                    Card temp = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = temp;
                }
            }
        }
    }
    public boolean RoyalFlush()
    {
        for(int i = 0; i < 4; i++)
        {
            if(Have(10,i+1)&&Have(11,i+1)&&Have(12,i+1)&&Have(13,i+1)&&Have(1,i+1))
            {
                reset();
                return true;
            }
        }reset();
        return false;
    }
    public boolean StraightFlush()
    {
        for(int i = 0; i < 4; i++)
        {
            for (int j = 1; j < 9; j++) {
                if(Have(j,i+1)&&Have(j+1,i+1)&&Have(j+2,i+1)&&Have(j+3,i+1)&&Have(j+4,i+1))
                {
                    reset();
                    return true;
                }
            }
        }reset();
        return false;
    }
    public boolean FourOfAKind()
    {
        for (int i = 1; i < 14; i++) {
            if(Have(i,1)&&Have(i,2)&&Have(i,3)&&Have(i,4))
            {
                reset();
                return true;
            }
        }reset();
        return false;
    }
    public boolean FullHouse()
    {
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 14; j++) {
                if(HaveNoShape(i) && HaveNoShape(i) && HaveNoShape(i) && HaveNoShape(j) && HaveNoShape(j))
                {
                    reset();
                    return true;
                }
                else {reset();}
            }
        }
        return false;
    }
    public boolean Flush()
    {
        for (int i = 1; i < 5; i++)
        {
            if(HaveNoNumber(i)&&HaveNoNumber(i)&&HaveNoNumber(i)&&HaveNoNumber(i)&&HaveNoNumber(i))
            {
                reset();
                return true;
            }
            reset();
        }
        return false;
    }
    public boolean Straight()
    {
            for (int j = 1; j < 9; j++) {
                if(HaveNoShape(j)&&HaveNoShape(j+1)&&HaveNoShape(j+2)&&HaveNoShape(j+3)&&HaveNoShape(j+4))
                {
                    reset();
                    return true;
                }
                reset();
            }
        return false;
    }
    public boolean ThreeOfAKind()
    {
        for (int i = 1; i < 14; i++) {
            if(HaveNoShape(i) && HaveNoShape(i) && HaveNoShape(i))
            {
                reset();
                return true;
            }
            reset();
        }
        return false;
    }
    public boolean TwoPair()
    {
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 14; j++) {
                if(HaveNoShape(i) && HaveNoShape(i) && HaveNoShape(j) && HaveNoShape(j))
                {
                    reset();
                    return true;
                }
                else {reset();}
            }
        }
        return false;
    }
    public boolean Pair()
    {
        for (int i = 1; i < 14; i++) {
            if(HaveNoShape(i) && HaveNoShape(i))
            {
                reset();return true;
            }
            reset();
        }
        return false;
    }

    public boolean Have(int num, int shape)//when both shape and number are needed.
    {
        for (int i = 0; i < 7; i++) {
            if(cards[i].getNumber() == num && cards[i].getShape() == shape)
            {
                return true;
            }
        }
        return false;
    }
    public boolean HaveNoShape(int num)//when the shape is not needed.
    {
        for (int i = 0; i < 7; i++) {
            if(cards[i].getNumber() == num)
            {
                cardsave[i] = cards[i];
                cards[i] = publiccard;
                return true;
            }
        }
        return false;
    }
    public boolean HaveNoNumber(int shape)//when the number is not needed.
    {
        for (int i = 0; i < 7; i++) {
            if(cards[i].getShape() == shape)
            {
                cardsave[i] = cards[i];
                cards[i] = publiccard;
                return true;
            }
        }
        return false;
    }
    public void reset()
    {
        for (int i = 0; i < 7; i++) {
            if(cards[i] == publiccard)
            {
                cards[i] = cardsave[i];
                cardsave[i] = publiccard;
            }
        }
    }


}
