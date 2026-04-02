package com.amazon.aps.iva.a0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: EdgeEffectCompat.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static EdgeEffect a(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return f.a.a(context, null);
        }
        return new n0(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return f.a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float f) {
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f.a.c(edgeEffect, f, 0.0f);
        } else {
            edgeEffect.onPull(f, 0.0f);
        }
    }
}
