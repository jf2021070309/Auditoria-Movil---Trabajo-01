package com.amazon.aps.iva.f2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: ShadowSpan.kt */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public j(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "tp");
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
