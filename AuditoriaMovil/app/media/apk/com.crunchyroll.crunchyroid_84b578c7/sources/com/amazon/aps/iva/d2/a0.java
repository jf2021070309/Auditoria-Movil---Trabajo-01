package com.amazon.aps.iva.d2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
public final class a0 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout.Alignment g;
    public final int h;
    public final TextUtils.TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final int[] u;

    public a0(CharSequence charSequence, int i, int i2, com.amazon.aps.iva.k2.f fVar, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(fVar, "paint");
        com.amazon.aps.iva.yb0.j.f(textDirectionHeuristic, "textDir");
        com.amazon.aps.iva.yb0.j.f(alignment, "alignment");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = fVar;
        this.e = i3;
        this.f = textDirectionHeuristic;
        this.g = alignment;
        this.h = i4;
        this.i = truncateAt;
        this.j = i5;
        this.k = f;
        this.l = f2;
        this.m = i6;
        this.n = z;
        this.o = z2;
        this.p = i7;
        this.q = i8;
        this.r = i9;
        this.s = i10;
        this.t = iArr;
        this.u = iArr2;
        if (i >= 0 && i <= i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            int length = charSequence.length();
            if (i2 >= 0 && i2 <= length) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i4 >= 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (i3 >= 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (i5 >= 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            if (f >= 0.0f) {
                                return;
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
