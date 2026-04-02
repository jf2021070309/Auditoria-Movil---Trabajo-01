package com.amazon.aps.iva.hb;

import android.graphics.Rect;
/* compiled from: CenterInRowGravityModifier.java */
/* loaded from: classes.dex */
public final class c implements h {
    @Override // com.amazon.aps.iva.hb.h
    public final Rect a(int i, int i2, Rect rect) {
        if (rect.top >= i) {
            if (rect.bottom <= i2) {
                Rect rect2 = new Rect(rect);
                int i3 = ((i2 - i) - (rect2.bottom - rect2.top)) / 2;
                rect2.top = i + i3;
                rect2.bottom = i2 - i3;
                return rect2;
            }
            throw new IllegalArgumentException("bottom point of input rect can't be bigger than maxTop");
        }
        throw new IllegalArgumentException("top point of input rect can't be lower than minTop");
    }
}
