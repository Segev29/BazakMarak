package com.example.bazakmarak;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private ArrayList <Card> arrCard;
    private ArrayList <Card> arrCardSaver;

    public CardDeck() {
        arrCard = new ArrayList<Card>();
        arrCardSaver = new ArrayList<Card>();

        for(int i = 1; i < 14; i++)
        {
            arrCard.add(new Card(i, Color.RED, 1));
            arrCard.add(new Card(i, Color.RED, 2));
            arrCard.add(new Card(i, Color.BLACK, 3));
            arrCard.add(new Card(i, Color.BLACK, 4));
            //arrCard.add(new Card(gameActivity,i, Color.BLACK, 4));
        }
        //shuffle -
        Collections.shuffle(arrCard);//הערה לעצמי - בבוא היום תכתוב את הפעולה בעצמך וככה יהיה// מורכב יותר אך בינתיים שאפל מוכן

    }
    public int getLength()
    {
        return arrCard.size();
    }

    public ArrayList<Card> getArrCard() {
        return arrCard;
    }

    public Card remover()
    {
        Card c1 = arrCard.remove(arrCard.size()-1);
        arrCardSaver.add(c1);
        return c1;
    }

}
