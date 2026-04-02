package com.amazon.aps.iva.f2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* compiled from: PlaceholderSpan.kt */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt a;
    public int b;
    public int c;
    public boolean d;

    public i() {
        throw null;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        com.amazon.aps.iva.yb0.j.m("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.d) {
            return this.c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int c() {
        if (this.d) {
            return this.b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        boolean z = true;
        this.d = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        com.amazon.aps.iva.yb0.j.e(fontMetricsInt2, "paint.fontMetricsInt");
        this.a = fontMetricsInt2;
        if (a().descent <= a().ascent) {
            z = false;
        }
        if (z) {
            this.b = (int) Math.ceil(0.0f);
            this.c = (int) Math.ceil(0.0f);
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                if (fontMetricsInt.ascent > (-b())) {
                    fontMetricsInt.ascent = -b();
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
