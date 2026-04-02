package com.amazon.aps.iva.xw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
/* compiled from: RoundedBackgroundSpan.kt */
/* loaded from: classes2.dex */
public final class g0 extends ReplacementSpan implements LineHeightSpan {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final Float e;

    public g0(int i, int i2, float f, float f2, Float f3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        com.amazon.aps.iva.yb0.j.f(canvas, "canvas");
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        if (i2 - i == 0) {
            return;
        }
        paint.setColor(this.a);
        float measureText = paint.measureText(charSequence, i, i2);
        float f2 = 2;
        float f3 = this.d;
        float f4 = (f2 * f3) + (paint.getFontMetrics().descent - paint.getFontMetrics().ascent);
        float f5 = this.c;
        Float f6 = this.e;
        if (f6 != null) {
            canvas.drawRoundRect(new RectF(f, i3 - f3, (f2 * f5) + measureText + f, i5 + f3), f6.floatValue(), f6.floatValue(), paint);
        } else {
            canvas.drawCircle((((f2 * f5) + measureText) / f2) + f, (i5 - i3) / 2, f4 / f2, paint);
        }
        paint.setColor(this.b);
        canvas.drawText(charSequence, i, i2, f + f5, i4, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        com.amazon.aps.iva.yb0.j.f(paint, "paint");
        float measureText = paint.measureText(charSequence, i, i2);
        float f = this.c;
        return (int) (measureText + f + f);
    }
}
