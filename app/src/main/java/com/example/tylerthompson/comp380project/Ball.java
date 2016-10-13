package com.example.tylerthompson.comp380project;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;


public class Ball {
    Bitmap bball;
    int x;
    int y;
    boolean right = true;
    boolean down = true;
    int speed = 10;
    public Ball(View view){
        bball = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(view.getResources(),R.drawable.pinball),100,100, true);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void increaseX(){
        x += speed;
    }
    public void increaseY(){
        y += speed;
    }
    public void decreaseX(){
        x-= speed;
    }
    public void decreaseY(){
        y-= speed;
    }
    public boolean isRight(){
        return right;
    }
    public boolean isDown(){
        return down;
    }
    public void setRight(boolean right){
        this.right = right;
    }
    public void setDown(boolean down){
        this.down = down;
    }
    public Bitmap getBitmap(){
        return bball;
    }
}

