package com.amazon.aps.iva.f2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: LetterSpacingSpanEm.kt */
/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan {
    public final float a;

    public e(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.a);
    }
}
