package com.example.user.touchtouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by user on 15. 2. 8.
 */
public class TouchEventView extends View{

    private int x;
    private int y;

    // 초기화
    public TouchEventView(Context context){
        super(context);
    }

//    //출력 메서드
//    protected void onDraw(Canvas canvas){
//        Paint p = new Paint();
//        p.setColor(Color.BLACK);
//        p.setTextSize(20);
//        canvas.drawText("좌표 (x , y): "+ x + y, 0 , 20, p);
//    }

    //MotionEvent 로 터치 인식
    public boolean onTouchEvent(MotionEvent event){

        x = (int)event.getX();
        y = (int)event.getY();

        //invalidate();
        Toast.makeText( getContext(), "현재좌표 (x,y) ("+ x + ", " + y + ")" , Toast.LENGTH_LONG ).show();

        return super.onTouchEvent(event);
    }

}
