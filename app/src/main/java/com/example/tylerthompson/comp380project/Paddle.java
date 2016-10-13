package com.example.tylerthompson.comp380project;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

public class Paddle implements View.OnTouchListener{
    private float x;
    private float y;
    private Bitmap p;
    View v;

    public Paddle(View view)
    {
        p = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(view.getResources(),R.drawable.paddle),300,100, true);
        v = view;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent)
    {
        float x1 = motionEvent.getX();

        if(x1 > x + 150){
            x += 20;
        }
        else if( x1 < x + 150){
            x -= 20;
        }


        return true;
    }

    public float getX()
    {
        return x;
    }
    public float getY(){
        return y;
    }
    public void setY(Canvas canvas){
        y = canvas.getHeight() - canvas.getHeight()/8;
    }
    public Bitmap getBitmap()
    {
        return p;
    }
}
