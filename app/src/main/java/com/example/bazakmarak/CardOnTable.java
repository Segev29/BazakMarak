package com.example.bazakmarak;

import android.content.Context;

public class CardOnTable extends Card{
    private boolean FaceUp;
    public CardOnTable(Context context, int number, int color, int shape) {
        super(number, color, shape);
        this.FaceUp = false;

    }
}
