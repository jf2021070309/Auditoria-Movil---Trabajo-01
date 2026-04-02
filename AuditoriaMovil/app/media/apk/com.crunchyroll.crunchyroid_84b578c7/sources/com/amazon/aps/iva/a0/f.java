package com.amazon.aps.iva.a0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* compiled from: EdgeEffectCompat.kt */
/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float b(EdgeEffect edgeEffect) {
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(EdgeEffect edgeEffect, float f, float f2) {
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
