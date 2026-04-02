package com.amazon.aps.iva.hb;

import android.graphics.Rect;
/* compiled from: LeftGravityModifier.java */
/* loaded from: classes.dex */
public final class l implements h {
    public final /* synthetic */ int a;

    @Override // com.amazon.aps.iva.hb.h
    public final Rect a(int i, int i2, Rect rect) {
        switch (this.a) {
            case 0:
                Rect rect2 = new Rect(rect);
                int i3 = rect2.left;
                if (i3 > i) {
                    rect2.right -= i3 - i;
                    rect2.left = i;
                }
                return rect2;
            default:
                if (rect.left >= i) {
                    if (rect.right <= i2) {
                        Rect rect3 = new Rect(rect);
                        int i4 = rect3.top;
                        if (i4 > i) {
                            rect3.bottom -= i4 - i;
                            rect3.top = i;
                        }
                        return rect3;
                    }
                    throw new IllegalArgumentException("bottom point of input rect can't be bigger than maxTop");
                }
                throw new IllegalArgumentException("top point of input rect can't be lower than minTop");
        }
    }
}
