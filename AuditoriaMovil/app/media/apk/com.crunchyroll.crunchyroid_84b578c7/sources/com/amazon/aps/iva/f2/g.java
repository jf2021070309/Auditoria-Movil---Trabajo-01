package com.amazon.aps.iva.f2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: LineHeightSpan.kt */
/* loaded from: classes.dex */
public final class g implements LineHeightSpan {
    public final float a;

    public g(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(fontMetricsInt, "fontMetricsInt");
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(this.a);
        int ceil2 = (int) Math.ceil(fontMetricsInt.descent * ((ceil * 1.0f) / i5));
        fontMetricsInt.descent = ceil2;
        fontMetricsInt.ascent = ceil2 - ceil;
    }
}
