package com.amazon.aps.iva.h2;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.ArrayList;
/* compiled from: PlatformTypefaces.kt */
/* loaded from: classes.dex */
public final class g0 {
    public static final Typeface a(Typeface typeface, x xVar, Context context) {
        com.amazon.aps.iva.yb0.j.f(xVar, "variationSettings");
        ThreadLocal<Paint> threadLocal = l0.a;
        if (typeface == null) {
            return null;
        }
        ArrayList arrayList = xVar.a;
        if (!arrayList.isEmpty()) {
            ThreadLocal<Paint> threadLocal2 = l0.a;
            Paint paint = threadLocal2.get();
            if (paint == null) {
                paint = new Paint();
                threadLocal2.set(paint);
            }
            paint.setTypeface(typeface);
            paint.setFontVariationSettings(com.amazon.aps.iva.gr.n.t(arrayList, null, new k0(com.amazon.aps.iva.gr.n.i(context)), 31));
            return paint.getTypeface();
        }
        return typeface;
    }
}
