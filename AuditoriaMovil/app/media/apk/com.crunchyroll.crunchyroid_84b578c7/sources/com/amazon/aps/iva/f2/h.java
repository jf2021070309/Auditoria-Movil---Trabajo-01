package com.amazon.aps.iva.f2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: LineHeightStyleSpan.kt */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public final float a;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public int k;
    public int l;
    public final int b = 0;
    public int g = Integer.MIN_VALUE;
    public int h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(float r1, int r2, boolean r3, boolean r4, float r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.f = r5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g = r2
            r0.h = r2
            r0.i = r2
            r0.j = r2
            r2 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L28
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r2 != 0) goto L36
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r1
        L34:
            if (r2 == 0) goto L37
        L36:
            r1 = r3
        L37:
            if (r1 == 0) goto L3a
            return
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "topRatio should be in [0..1] range or -1"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f2.h.<init>(float, int, boolean, boolean, float):void");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        double ceil;
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z3 = true;
        if (i == this.b) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = this.e;
        boolean z5 = this.d;
        if (z && z2 && z5 && z4) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            int ceil2 = (int) Math.ceil(this.a);
            int i7 = ceil2 - (fontMetricsInt.descent - fontMetricsInt.ascent);
            float f = this.f;
            if (f != -1.0f) {
                z3 = false;
            }
            if (z3) {
                f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            if (i7 <= 0) {
                ceil = Math.ceil(i7 * f);
            } else {
                ceil = Math.ceil((1.0f - f) * i7);
            }
            int i8 = fontMetricsInt.descent;
            int i9 = ((int) ceil) + i8;
            this.i = i9;
            int i10 = i9 - ceil2;
            this.h = i10;
            if (z5) {
                i10 = fontMetricsInt.ascent;
            }
            this.g = i10;
            if (z4) {
                i9 = i8;
            }
            this.j = i9;
            this.k = fontMetricsInt.ascent - i10;
            this.l = i9 - i8;
        }
        if (z) {
            i5 = this.g;
        } else {
            i5 = this.h;
        }
        fontMetricsInt.ascent = i5;
        if (z2) {
            i6 = this.j;
        } else {
            i6 = this.i;
        }
        fontMetricsInt.descent = i6;
    }
}
