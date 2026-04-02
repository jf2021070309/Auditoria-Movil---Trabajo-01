package com.amazon.aps.iva.w;

import android.graphics.drawable.Drawable;
/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
public final class f extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));
    public static final /* synthetic */ int b = 0;

    public static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - a) * f2) + (f * 1.5f));
        }
        return f * 1.5f;
    }
}
