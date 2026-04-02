package com.amazon.aps.iva.f2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: FontFeatureSpan.kt */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.a);
    }
}
