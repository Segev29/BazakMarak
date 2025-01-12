package com.example.bazakmarak;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Card {
    private int number; // 1 - 13
    private int color;
    private int shape; // 1 - לבבות, 2 - מעויין, 3 - תלתן, 4 - עלה

    private Bitmap bitmap;
    //private Drawable drawable;

    //private boolean isUsed;

    public Card(int number, int color, int shape) {
        this.number = number;
        this.color = color;
        this.shape = shape;

        /*if(color == Color.RED)
        {
            this.id = "r" + shape + number;
            id = R.drawable.b13;
        }
        else
        {
            this.id = "b" + shape + number;
        }*/

        //Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),id);
        //this.isUsed = false;
        //this.drawable = ContextCompat.getDrawable(context, R.drawable.jack_of_diamonds2);//?
    }

    /*public String getId() {
        return id;
    }*/

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getShape() {
        return shape;
    }

    public void draw(Canvas canvas)
    {


        canvas.drawBitmap(bitmap,10,10,null);

    }
    public void setShape(int shape) {
        this.shape = shape;
    }
    /*public void setUsed()
    {
        this.isUsed = true;
    }*/
}
