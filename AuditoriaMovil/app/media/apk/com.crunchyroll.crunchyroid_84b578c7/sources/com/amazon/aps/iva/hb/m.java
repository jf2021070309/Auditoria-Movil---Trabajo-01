package com.amazon.aps.iva.hb;

import android.graphics.Rect;
/* compiled from: RightGravityModifier.java */
/* loaded from: classes.dex */
public final class m implements h {
    @Override // com.amazon.aps.iva.hb.h
    public final Rect a(int i, int i2, Rect rect) {
        Rect rect2 = new Rect(rect);
        int i3 = rect2.right;
        if (i3 < i2) {
            rect2.left = (i2 - i3) + rect2.left;
            rect2.right = i2;
        }
        return rect2;
    }
}
