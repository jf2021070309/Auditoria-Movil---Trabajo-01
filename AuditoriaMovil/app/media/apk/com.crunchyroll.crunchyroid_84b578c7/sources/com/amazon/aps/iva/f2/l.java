package com.amazon.aps.iva.f2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: TextDecorationSpan.kt */
/* loaded from: classes.dex */
public final class l extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public l(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
