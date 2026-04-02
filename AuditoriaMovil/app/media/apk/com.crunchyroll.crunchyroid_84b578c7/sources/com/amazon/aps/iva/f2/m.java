package com.amazon.aps.iva.f2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: TypefaceSpan.kt */
/* loaded from: classes.dex */
public final class m extends MetricAffectingSpan {
    public final Typeface a;

    public m(Typeface typeface) {
        com.amazon.aps.iva.yb0.j.f(typeface, "typeface");
        this.a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "ds");
        textPaint.setTypeface(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
        textPaint.setTypeface(this.a);
    }
}
