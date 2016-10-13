package com.example.tylerthompson.comp380project;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Tyler & Hieu on 9/24/2016.
 */

public class GameSession extends View{
    Ball bball;
    Paddle p;

    public GameSession(Context context) {
        super(context);
        bball = new Ball(this);
        p = new Paddle(this);

    }


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int x = bball.getX();
        int y = bball.getY();
        p.setY(canvas);

        if( x >= canvas.getWidth() - 100){
            bball.setRight(false);
        }else if (x == 0)
        {
            bball.setRight(true);
        }

        if( y >= canvas.getHeight() - 100)
        {
            bball.setX(0);
            bball.setY(0);
            bball.setDown(true);
            bball.setRight(true);
        }else if (y == 0)
        {
            bball.setDown(true);
        }

        if( bball.getX() + 50 >= p.getX() && bball.getX() + 50 <= p.getX() + 300 && bball.getY() + 100 >= p.getY())
        {
           bball.setDown(false);
        }

        if(bball.isRight())
        {
            bball.increaseX();
        }else{
           bball.decreaseX();
        }

        if(bball.isDown())
        {
            bball.increaseY();
        }else{
            bball.decreaseY();
        }

        setOnTouchListener(p);


        canvas.drawBitmap(bball.getBitmap(),bball.getX(),bball.getY(),new Paint());
        canvas.drawBitmap(p.getBitmap(), p.getX(),p.getY(),new Paint());
        invalidate();
    }


}
