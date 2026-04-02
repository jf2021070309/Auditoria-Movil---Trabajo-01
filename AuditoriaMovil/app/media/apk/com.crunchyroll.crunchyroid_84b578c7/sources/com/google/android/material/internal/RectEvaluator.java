package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* loaded from: classes3.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = rect.bottom;
        int i7 = i6 + ((int) ((rect2.bottom - i6) * f));
        this.rect.set(i2, i4, i5 + ((int) ((rect2.right - i5) * f)), i7);
        return this.rect;
    }
}
