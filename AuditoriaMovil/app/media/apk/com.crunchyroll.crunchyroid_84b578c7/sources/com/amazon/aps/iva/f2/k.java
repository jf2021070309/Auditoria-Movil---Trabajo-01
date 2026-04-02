package com.amazon.aps.iva.f2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: SkewXSpan.kt */
/* loaded from: classes.dex */
public final class k extends MetricAffectingSpan {
    public final float a;

    public k(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.a);
    }
}
