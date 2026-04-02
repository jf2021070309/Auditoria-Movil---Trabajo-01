package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.b;
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4474b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4475c;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        c cVar = new c();
        this.f4474b = cVar;
        this.f4475c = true;
        setWillNotDraw(false);
        cVar.setCallback(this);
        if (attributeSet == null) {
            a(new b.a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        try {
            a(((obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) ? new b.c() : new b.a()).b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShimmerFrameLayout a(b bVar) {
        boolean z;
        c cVar = this.f4474b;
        cVar.f4493f = bVar;
        if (bVar != null) {
            cVar.f4489b.setXfermode(new PorterDuffXfermode(cVar.f4493f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        cVar.c();
        if (cVar.f4493f != null) {
            ValueAnimator valueAnimator = cVar.f4492e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                cVar.f4492e.cancel();
                cVar.f4492e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            b bVar2 = cVar.f4493f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (bVar2.t / bVar2.s)) + 1.0f);
            cVar.f4492e = ofFloat;
            ofFloat.setRepeatMode(cVar.f4493f.r);
            cVar.f4492e.setRepeatCount(cVar.f4493f.q);
            ValueAnimator valueAnimator2 = cVar.f4492e;
            b bVar3 = cVar.f4493f;
            valueAnimator2.setDuration(bVar3.s + bVar3.t);
            cVar.f4492e.addUpdateListener(cVar.a);
            if (z) {
                cVar.f4492e.start();
            }
        }
        cVar.invalidateSelf();
        if (bVar == null || !bVar.f4488n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.a);
        }
        return this;
    }

    public void b() {
        c cVar = this.f4474b;
        ValueAnimator valueAnimator = cVar.f4492e;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                cVar.f4492e.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f4475c) {
            this.f4474b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4474b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f4474b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4474b;
    }
}
