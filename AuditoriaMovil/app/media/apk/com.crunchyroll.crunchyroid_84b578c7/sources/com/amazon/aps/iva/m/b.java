package com.amazon.aps.iva.m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.h3.a;
import com.crunchyroll.crunchyroid.R;
/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public final class b extends Drawable {
    public static final float l = (float) Math.toRadians(45.0d);
    public final Paint a;
    public final float b;
    public final float c;
    public final float d;
    public float e;
    public boolean f;
    public final Path g;
    public final int h;
    public float i;
    public float j;
    public final int k;

    public b(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.g = new Path();
        this.k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, com.amazon.aps.iva.j.a.n, R.attr.drawerArrowStyle, 2132082916);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.j = (float) (Math.cos(l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.e) {
            this.e = round;
            invalidateSelf();
        }
        this.h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        int i;
        Rect bounds = getBounds();
        boolean z = true;
        int i2 = this.k;
        if (i2 == 0 || (i2 != 1 && (i2 == 3 ? a.c.a(this) != 0 : a.c.a(this) != 1))) {
            z = false;
        }
        float f2 = this.b;
        float sqrt = (float) Math.sqrt(f2 * f2 * 2.0f);
        float f3 = this.i;
        float f4 = this.c;
        float a = t0.a(sqrt, f4, f3, f4);
        float a2 = t0.a(this.d, f4, f3, f4);
        float f5 = 0.0f;
        float round = Math.round(((this.j - 0.0f) * f3) + 0.0f);
        float f6 = this.i;
        float a3 = t0.a(l, 0.0f, f6, 0.0f);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f5 = 180.0f;
        }
        float a4 = t0.a(f5, f, f6, f);
        double d = a;
        double d2 = a3;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(Math.sin(d2) * d);
        Path path = this.g;
        path.rewind();
        float f7 = this.e;
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth() + f7;
        float a5 = t0.a(-this.j, strokeWidth, this.i, strokeWidth);
        float f8 = (-a2) / 2.0f;
        path.moveTo(f8 + round, 0.0f);
        path.rLineTo(a2 - (round * 2.0f), 0.0f);
        path.moveTo(f8, a5);
        path.rLineTo(round2, round3);
        path.moveTo(f8, -a5);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth2);
        float f9 = this.e;
        canvas.translate(bounds.centerX(), (strokeWidth2 * 1.5f) + f9 + ((((int) (height - (2.0f * f9))) / 4) * 2));
        if (this.f) {
            if (z) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(a4 * i);
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
