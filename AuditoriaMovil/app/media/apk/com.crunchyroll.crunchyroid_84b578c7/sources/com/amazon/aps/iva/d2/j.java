package com.amazon.aps.iva.d2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
/* compiled from: LayoutIntrinsics.kt */
/* loaded from: classes.dex */
public final class j {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d;
    public float e;
    public BoringLayout.Metrics f;
    public boolean g;

    public j(CharSequence charSequence, com.amazon.aps.iva.k2.f fVar, int i) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "charSequence");
        com.amazon.aps.iva.yb0.j.f(fVar, "textPaint");
        this.a = charSequence;
        this.b = fVar;
        this.c = i;
        this.d = Float.NaN;
        this.e = Float.NaN;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics b;
        if (!this.g) {
            TextDirectionHeuristic a = l0.a(this.c);
            CharSequence charSequence = this.a;
            com.amazon.aps.iva.yb0.j.f(charSequence, "text");
            TextPaint textPaint = this.b;
            com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
            if (Build.VERSION.SDK_INT >= 33) {
                b = d.b(charSequence, textPaint, a);
            } else {
                b = f.b(charSequence, textPaint, a);
            }
            this.f = b;
            this.g = true;
        }
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (com.amazon.aps.iva.gr.n.v(r3, com.amazon.aps.iva.f2.e.class) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r2 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            r7 = this;
            float r0 = r7.d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc
            float r0 = r7.d
            goto L7a
        Lc:
            android.text.BoringLayout$Metrics r0 = r7.a()
            if (r0 == 0) goto L1a
            int r0 = r0.width
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1 = 0
            android.text.TextPaint r2 = r7.b
            java.lang.CharSequence r3 = r7.a
            if (r0 != 0) goto L34
            int r0 = r3.length()
            float r0 = android.text.Layout.getDesiredWidth(r3, r1, r0, r2)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L34:
            float r4 = r0.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 1
            if (r4 != 0) goto L40
            r4 = r6
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 != 0) goto L67
            boolean r4 = r3 instanceof android.text.Spanned
            if (r4 == 0) goto L59
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<com.amazon.aps.iva.f2.f> r4 = com.amazon.aps.iva.f2.f.class
            boolean r4 = com.amazon.aps.iva.gr.n.v(r3, r4)
            if (r4 != 0) goto L66
            java.lang.Class<com.amazon.aps.iva.f2.e> r4 = com.amazon.aps.iva.f2.e.class
            boolean r3 = com.amazon.aps.iva.gr.n.v(r3, r4)
            if (r3 != 0) goto L66
        L59:
            float r2 = r2.getLetterSpacing()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L63
            r2 = r6
            goto L64
        L63:
            r2 = r1
        L64:
            if (r2 != 0) goto L67
        L66:
            r1 = r6
        L67:
            if (r1 == 0) goto L74
            float r0 = r0.floatValue()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L74:
            float r0 = r0.floatValue()
            r7.d = r0
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d2.j.b():float");
    }
}
