package com.amazon.aps.iva.h2;

import android.graphics.Typeface;
/* compiled from: AndroidFontUtils.android.kt */
/* loaded from: classes.dex */
public final class m0 {
    public static final m0 a = new m0();

    public final Typeface a(Typeface typeface, int i, boolean z) {
        Typeface create;
        com.amazon.aps.iva.yb0.j.f(typeface, "typeface");
        create = Typeface.create(typeface, i, z);
        com.amazon.aps.iva.yb0.j.e(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
