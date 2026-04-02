package com.amazon.aps.iva.c8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
/* compiled from: SubtitlePainter.java */
/* loaded from: classes.dex */
public final class v {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public CharSequence i;
    public Layout.Alignment j;
    public Bitmap k;
    public float l;
    public int m;
    public int n;
    public float o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public v(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = round;
        this.b = round;
        this.c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z) {
        int i;
        if (z) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.u) > 0) {
                    Paint paint = this.g;
                    paint.setColor(this.u);
                    canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                }
                int i2 = this.w;
                TextPaint textPaint = this.f;
                boolean z2 = true;
                if (i2 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.a);
                    textPaint.setColor(this.v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f = this.b;
                    if (i2 == 2) {
                        float f2 = this.c;
                        textPaint.setShadowLayer(f, f2, f2, this.v);
                    } else if (i2 == 3 || i2 == 4) {
                        if (i2 != 3) {
                            z2 = false;
                        }
                        int i3 = -1;
                        if (z2) {
                            i = -1;
                        } else {
                            i = this.v;
                        }
                        if (z2) {
                            i3 = this.v;
                        }
                        float f3 = f / 2.0f;
                        textPaint.setColor(this.s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f4 = -f3;
                        textPaint.setShadowLayer(f, f4, f4, i);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f, f3, f3, i3);
                    }
                }
                textPaint.setColor(this.s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.k.getClass();
        canvas.drawBitmap(this.k, (Rect) null, this.J, this.h);
    }
}
