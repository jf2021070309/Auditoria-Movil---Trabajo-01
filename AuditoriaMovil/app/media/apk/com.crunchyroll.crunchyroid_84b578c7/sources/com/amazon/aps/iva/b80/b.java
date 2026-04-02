package com.amazon.aps.iva.b80;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.e4.t0;
/* compiled from: ShimmerDrawable.java */
/* loaded from: classes2.dex */
public final class b extends Drawable {
    public final a a = new a();
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public com.facebook.shimmer.a f;

    /* compiled from: ShimmerDrawable.java */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.invalidateSelf();
        }
    }

    public b() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f) != null && aVar.o && getCallback() != null) {
            this.e.start();
        }
    }

    public final void b() {
        com.facebook.shimmer.a aVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (aVar = this.f) != null) {
            int i = aVar.g;
            if (i <= 0) {
                i = Math.round(aVar.i * width);
            }
            com.facebook.shimmer.a aVar2 = this.f;
            int i2 = aVar2.h;
            if (i2 <= 0) {
                i2 = Math.round(aVar2.j * height);
            }
            com.facebook.shimmer.a aVar3 = this.f;
            boolean z = true;
            if (aVar3.f != 1) {
                int i3 = aVar3.c;
                if (i3 != 1 && i3 != 3) {
                    z = false;
                }
                if (z) {
                    i = 0;
                }
                if (!z) {
                    i2 = 0;
                }
                com.facebook.shimmer.a aVar4 = this.f;
                radialGradient = new LinearGradient(0.0f, 0.0f, i, i2, aVar4.b, aVar4.a, Shader.TileMode.CLAMP);
            } else {
                com.facebook.shimmer.a aVar5 = this.f;
                radialGradient = new RadialGradient(i / 2.0f, i2 / 2.0f, (float) (Math.max(i, i2) / Math.sqrt(2.0d)), aVar5.b, aVar5.a, Shader.TileMode.CLAMP);
            }
            this.b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float a2;
        float a3;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f.m));
                Rect rect = this.c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.e;
                float f2 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i = this.f.c;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            float f3 = -height;
                            a3 = t0.a(height, f3, f, f3);
                        } else {
                            a2 = t0.a(-width, width, f, width);
                        }
                    } else {
                        a3 = t0.a(-height, height, f, height);
                    }
                    f2 = a3;
                    a2 = 0.0f;
                } else {
                    float f4 = -width;
                    a2 = t0.a(width, f4, f, f4);
                }
                Matrix matrix = this.d;
                matrix.reset();
                matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f2, a2);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f;
        if (aVar != null && (aVar.n || aVar.p)) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
