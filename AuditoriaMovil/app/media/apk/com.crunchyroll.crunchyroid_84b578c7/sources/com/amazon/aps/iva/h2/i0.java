package com.amazon.aps.iva.h2;

import android.content.Context;
import android.graphics.Typeface;
/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes.dex */
public final class i0 {
    public static final i0 a = new i0();

    public final Typeface a(Context context, h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(h0Var, "font");
        Typeface font = context.getResources().getFont(h0Var.a);
        com.amazon.aps.iva.yb0.j.e(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
