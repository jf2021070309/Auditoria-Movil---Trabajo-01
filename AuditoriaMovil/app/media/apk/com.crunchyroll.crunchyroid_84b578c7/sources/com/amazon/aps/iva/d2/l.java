package com.amazon.aps.iva.d2;

import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: PaintExtensions.kt */
/* loaded from: classes.dex */
public final class l {
    public static final void a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
