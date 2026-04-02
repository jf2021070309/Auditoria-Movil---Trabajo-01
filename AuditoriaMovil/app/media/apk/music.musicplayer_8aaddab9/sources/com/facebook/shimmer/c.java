package com.facebook.shimmer;

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
/* loaded from: classes.dex */
public final class c extends Drawable {
    public final ValueAnimator.AnimatorUpdateListener a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4489b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4490c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f4491d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f4492e;

    /* renamed from: f  reason: collision with root package name */
    public b f4493f;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.invalidateSelf();
        }
    }

    public c() {
        Paint paint = new Paint();
        this.f4489b = paint;
        this.f4490c = new Rect();
        this.f4491d = new Matrix();
        paint.setAntiAlias(true);
    }

    public void a() {
        b bVar;
        ValueAnimator valueAnimator = this.f4492e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bVar = this.f4493f) == null || !bVar.o || getCallback() == null) {
            return;
        }
        this.f4492e.start();
    }

    public final float b(float f2, float f3, float f4) {
        return e.a.d.a.a.a(f3, f2, f4, f2);
    }

    public final void c() {
        b bVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (bVar = this.f4493f) == null) {
            return;
        }
        int i2 = bVar.f4481g;
        if (i2 <= 0) {
            i2 = Math.round(bVar.f4483i * width);
        }
        b bVar2 = this.f4493f;
        int i3 = bVar2.f4482h;
        if (i3 <= 0) {
            i3 = Math.round(bVar2.f4484j * height);
        }
        b bVar3 = this.f4493f;
        boolean z = true;
        if (bVar3.f4480f != 1) {
            int i4 = bVar3.f4477c;
            if (i4 != 1 && i4 != 3) {
                z = false;
            }
            if (z) {
                i2 = 0;
            }
            if (!z) {
                i3 = 0;
            }
            b bVar4 = this.f4493f;
            radialGradient = new LinearGradient(0.0f, 0.0f, i2, i3, bVar4.f4476b, bVar4.a, Shader.TileMode.CLAMP);
        } else {
            float f2 = i2 / 2.0f;
            float f3 = i3 / 2.0f;
            double max = Math.max(i2, i3);
            double sqrt = Math.sqrt(2.0d);
            Double.isNaN(max);
            b bVar5 = this.f4493f;
            radialGradient = new RadialGradient(f2, f3, (float) (max / sqrt), bVar5.f4476b, bVar5.a, Shader.TileMode.CLAMP);
        }
        this.f4489b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float b2;
        float b3;
        if (this.f4493f == null || this.f4489b.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.f4493f.f4487m));
        float width = (this.f4490c.width() * tan) + this.f4490c.height();
        float height = (tan * this.f4490c.height()) + this.f4490c.width();
        ValueAnimator valueAnimator = this.f4492e;
        float f2 = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i2 = this.f4493f.f4477c;
        if (i2 != 1) {
            if (i2 == 2) {
                b3 = b(height, -height, animatedFraction);
            } else if (i2 != 3) {
                b3 = b(-height, height, animatedFraction);
            } else {
                b2 = b(width, -width, animatedFraction);
            }
            f2 = b3;
            b2 = 0.0f;
        } else {
            b2 = b(-width, width, animatedFraction);
        }
        this.f4491d.reset();
        this.f4491d.setRotate(this.f4493f.f4487m, this.f4490c.width() / 2.0f, this.f4490c.height() / 2.0f);
        this.f4491d.postTranslate(f2, b2);
        this.f4489b.getShader().setLocalMatrix(this.f4491d);
        canvas.drawRect(this.f4490c, this.f4489b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        b bVar = this.f4493f;
        return (bVar == null || !(bVar.f4488n || bVar.p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4490c.set(0, 0, rect.width(), rect.height());
        c();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
