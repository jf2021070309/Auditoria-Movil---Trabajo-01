package com.amazon.aps.iva.f1;

import android.graphics.Canvas;
/* compiled from: CanvasUtils.android.kt */
/* loaded from: classes.dex */
public final class w {
    public static final w a = new w();

    public final void a(Canvas canvas, boolean z) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
