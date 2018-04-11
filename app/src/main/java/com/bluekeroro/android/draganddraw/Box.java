package com.bluekeroro.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by BlueKeroro on 2018/4/11.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;
    public Box(PointF origin){
        mOrigin=origin;
        mCurrent=origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }
}
