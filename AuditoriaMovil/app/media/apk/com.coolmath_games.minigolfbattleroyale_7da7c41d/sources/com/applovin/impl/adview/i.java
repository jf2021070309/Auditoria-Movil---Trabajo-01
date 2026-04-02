package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;
/* loaded from: classes.dex */
public class i extends WebView {
    private PointF a;

    public i(Context context) {
        super(context);
        this.a = new PointF();
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.a;
        this.a = new PointF();
        return pointF;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
