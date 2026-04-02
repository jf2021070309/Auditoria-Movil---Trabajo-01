package com.amazon.aps.iva.f2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: LetterSpacingSpanPx.kt */
/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {
    public final float a;

    public f(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textPaint.setLetterSpacing(this.a / textScaleX);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textPaint.setLetterSpacing(this.a / textScaleX);
        }
    }
}
