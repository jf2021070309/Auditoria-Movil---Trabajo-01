package com.amazon.aps.iva.e;

import android.window.BackEvent;
/* compiled from: BackEventCompat.kt */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        com.amazon.aps.iva.yb0.j.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
