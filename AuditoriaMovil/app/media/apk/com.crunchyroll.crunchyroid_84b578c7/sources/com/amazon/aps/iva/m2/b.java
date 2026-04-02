package com.amazon.aps.iva.m2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.f1.s0;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.ob0.f;
/* compiled from: ShaderBrushSpan.android.kt */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final s0 a;
    public final float b;
    public long c = g.c;
    public j<g, ? extends Shader> d;

    public b(s0 s0Var, float f) {
        this.a = s0Var;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        Shader b;
        com.amazon.aps.iva.yb0.j.f(textPaint, "textPaint");
        float f = this.b;
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(f.a(com.amazon.aps.iva.aq.j.i(f, 0.0f, 1.0f) * 255));
        }
        long j = this.c;
        int i = g.d;
        if (j == g.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        j<g, ? extends Shader> jVar = this.d;
        if (jVar != null && g.a(jVar.b.a, j)) {
            b = (Shader) jVar.c;
        } else {
            b = this.a.b(this.c);
        }
        textPaint.setShader(b);
        this.d = new j<>(new g(this.c), b);
    }
}
