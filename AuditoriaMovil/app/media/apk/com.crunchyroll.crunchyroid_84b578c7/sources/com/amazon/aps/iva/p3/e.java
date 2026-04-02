package com.amazon.aps.iva.p3;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: GestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class e {
    public final a a;

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public final GestureDetector a;

        public a(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.a = new GestureDetector(context, onGestureListener, null);
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new a(context, onGestureListener);
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.a.onTouchEvent(motionEvent);
    }
}
