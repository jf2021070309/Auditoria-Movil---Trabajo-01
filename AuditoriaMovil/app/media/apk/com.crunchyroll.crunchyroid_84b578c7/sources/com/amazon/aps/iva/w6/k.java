package com.amazon.aps.iva.w6;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.iva.w6.d;
import com.amazon.aps.iva.w6.j;
/* compiled from: TouchTracker.java */
/* loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {
    public final a d;
    public final GestureDetector f;
    public final PointF b = new PointF();
    public final PointF c = new PointF();
    public final float e = 25.0f;
    public volatile float g = 3.1415927f;

    /* compiled from: TouchTracker.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public k(Context context, j.a aVar) {
        this.d = aVar;
        this.f = new GestureDetector(context, this);
    }

    @Override // com.amazon.aps.iva.w6.d.a
    public final void a(float f, float[] fArr) {
        this.g = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.b.x) / this.e;
        float y = motionEvent2.getY();
        PointF pointF = this.b;
        float f3 = (y - pointF.y) / this.e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.g;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.c;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        a aVar = this.d;
        PointF pointF3 = this.c;
        j.a aVar2 = (j.a) aVar;
        synchronized (aVar2) {
            float f5 = pointF3.y;
            aVar2.h = f5;
            Matrix.setRotateM(aVar2.f, 0, -f5, (float) Math.cos(aVar2.i), (float) Math.sin(aVar2.i), 0.0f);
            Matrix.setRotateM(aVar2.g, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return j.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f.onTouchEvent(motionEvent);
    }
}
