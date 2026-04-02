package com.amazon.aps.iva.p1;

import android.view.MotionEvent;
/* compiled from: MotionEventAdapter.android.kt */
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public final long a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        com.amazon.aps.iva.yb0.j.f(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return com.amazon.aps.iva.e1.d.d(rawX, rawY);
    }
}
