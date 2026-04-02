package com.amazon.aps.iva.xw;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: SpannableUtil.kt */
/* loaded from: classes2.dex */
public final class r extends MetricAffectingSpan {
    public final Typeface a;

    public r(Typeface typeface) {
        this.a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
        textPaint.setTypeface(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
        textPaint.setTypeface(this.a);
    }
}
