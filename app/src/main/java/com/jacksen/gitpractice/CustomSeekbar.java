package com.jacksen.gitpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admin on 2017/10/31.
 */

public class CustomSeekbar extends View {

    public CustomSeekbar(Context context) {
        super(context);
    }

    public CustomSeekbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSeekbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(){
        LinearGradient linearGradient = new LinearGradient();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
