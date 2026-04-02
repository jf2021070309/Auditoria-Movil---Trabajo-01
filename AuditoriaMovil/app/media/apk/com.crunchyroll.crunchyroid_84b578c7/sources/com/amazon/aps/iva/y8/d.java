package com.amazon.aps.iva.y8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.amazon.aps.iva.e4.t0;
/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class d extends Drawable implements Animatable {
    public static final LinearInterpolator h = new LinearInterpolator();
    public static final com.amazon.aps.iva.c5.b i = new com.amazon.aps.iva.c5.b();
    public static final int[] j = {-16777216};
    public final a b;
    public float c;
    public final Resources d;
    public ValueAnimator e;
    public float f;
    public boolean g;

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class a {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public a() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i) {
            this.j = i;
            this.u = this.i[i];
        }
    }

    public d(Context context) {
        context.getClass();
        this.d = context.getResources();
        a aVar = new a();
        this.b = aVar;
        aVar.i = j;
        aVar.a(0);
        aVar.h = 2.5f;
        aVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new c(this, aVar));
        this.e = ofFloat;
    }

    public static void d(float f, a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = aVar.i;
            int i2 = aVar.j;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            int i5 = (i3 >> 24) & 255;
            int i6 = (i3 >> 16) & 255;
            int i7 = (i3 >> 8) & 255;
            int i8 = i3 & 255;
            aVar.u = (i8 + ((int) (f2 * ((i4 & 255) - i8)))) | ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8);
            return;
        }
        aVar.u = aVar.i[aVar.j];
    }

    public final void a(float f, a aVar, boolean z) {
        float interpolation;
        float f2;
        if (this.g) {
            d(f, aVar);
            float floor = (float) (Math.floor(aVar.m / 0.8f) + 1.0d);
            float f3 = aVar.k;
            float f4 = aVar.l;
            aVar.e = (((f4 - 0.01f) - f3) * f) + f3;
            aVar.f = f4;
            float f5 = aVar.m;
            aVar.g = t0.a(floor, f5, f, f5);
        } else if (f != 1.0f || z) {
            float f6 = aVar.m;
            int i2 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
            com.amazon.aps.iva.c5.b bVar = i;
            if (i2 < 0) {
                interpolation = aVar.k;
                f2 = (bVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = aVar.k + 0.79f;
                interpolation = f7 - (((1.0f - bVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f7;
            }
            aVar.e = interpolation;
            aVar.f = f2;
            aVar.g = (0.20999998f * f) + f6;
            this.c = (f + this.f) * 216.0f;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.d.getDisplayMetrics().density;
        float f6 = f2 * f5;
        a aVar = this.b;
        aVar.h = f6;
        aVar.b.setStrokeWidth(f6);
        aVar.q = f * f5;
        aVar.a(0);
        aVar.r = (int) (f3 * f5);
        aVar.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.b;
        RectF rectF = aVar.a;
        float f = aVar.q;
        float f2 = (aVar.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.r * aVar.p) / 2.0f, aVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = aVar.e;
        float f4 = aVar.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((aVar.f + f4) * 360.0f) - f5;
        Paint paint = aVar.b;
        paint.setColor(aVar.u);
        paint.setAlpha(aVar.t);
        float f7 = aVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        if (aVar.n) {
            Path path = aVar.o;
            if (path == null) {
                Path path2 = new Path();
                aVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.o.moveTo(0.0f, 0.0f);
            aVar.o.lineTo(aVar.r * aVar.p, 0.0f);
            Path path3 = aVar.o;
            float f9 = aVar.p;
            path3.lineTo((aVar.r * f9) / 2.0f, aVar.s * f9);
            aVar.o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((aVar.r * aVar.p) / 2.0f), (aVar.h / 2.0f) + rectF.centerY());
            aVar.o.close();
            Paint paint2 = aVar.c;
            paint2.setColor(aVar.u);
            paint2.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.b.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.e.cancel();
        a aVar = this.b;
        float f = aVar.e;
        aVar.k = f;
        float f2 = aVar.f;
        aVar.l = f2;
        aVar.m = aVar.g;
        if (f2 != f) {
            this.g = true;
            this.e.setDuration(666L);
            this.e.start();
            return;
        }
        aVar.a(0);
        aVar.k = 0.0f;
        aVar.l = 0.0f;
        aVar.m = 0.0f;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        aVar.g = 0.0f;
        this.e.setDuration(1332L);
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.cancel();
        this.c = 0.0f;
        a aVar = this.b;
        if (aVar.n) {
            aVar.n = false;
        }
        aVar.a(0);
        aVar.k = 0.0f;
        aVar.l = 0.0f;
        aVar.m = 0.0f;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        aVar.g = 0.0f;
        invalidateSelf();
    }
}
