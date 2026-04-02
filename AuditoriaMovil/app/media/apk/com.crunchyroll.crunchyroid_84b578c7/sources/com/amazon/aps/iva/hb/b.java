package com.amazon.aps.iva.hb;

import android.graphics.Rect;
/* compiled from: CenterInColumnGravityModifier.java */
/* loaded from: classes.dex */
public final class b implements h {
    @Override // com.amazon.aps.iva.hb.h
    public final Rect a(int i, int i2, Rect rect) {
        Rect rect2 = new Rect(rect);
        int i3 = ((i2 - i) - (rect2.right - rect2.left)) / 2;
        rect2.left = i + i3;
        rect2.right = i2 - i3;
        return rect2;
    }
}
