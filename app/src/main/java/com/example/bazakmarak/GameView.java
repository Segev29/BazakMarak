package com.example.bazakmarak;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;


public class GameView extends View {
    private Card card;
    private Bitmap bitmap;

    public GameView(Context context) {
        super(context);

        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.b13);


    }


    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawBitmap(bitmap,150,200,paint);
    }
}
