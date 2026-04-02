package com.amazon.aps.iva.v1;

import android.view.MotionEvent;
/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class z1 {
    public static final z1 a = new z1();

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        boolean z;
        float rawY;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(motionEvent, "event");
        rawX = motionEvent.getRawX(i);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            rawY = motionEvent.getRawY(i);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
