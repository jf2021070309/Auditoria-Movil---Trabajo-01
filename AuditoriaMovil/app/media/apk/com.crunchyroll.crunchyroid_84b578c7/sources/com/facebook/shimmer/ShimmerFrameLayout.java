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
import com.amazon.aps.iva.b80.b;
import com.facebook.shimmer.a;
/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint b;
    public final b c;
    public final boolean d;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.b = new Paint();
        this.c = new b();
        this.d = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        a.b c0978a;
        setWillNotDraw(false);
        this.c.setCallback(this);
        if (attributeSet == null) {
            b(new a.C0978a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.b80.a.a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                c0978a = new a.c();
            } else {
                c0978a = new a.C0978a();
            }
            b(c0978a.b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void b(a aVar) {
        boolean z;
        PorterDuff.Mode mode;
        b bVar = this.c;
        bVar.f = aVar;
        if (aVar != null) {
            Paint paint = bVar.b;
            if (bVar.f.p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        bVar.b();
        if (bVar.f != null) {
            ValueAnimator valueAnimator = bVar.e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                bVar.e.cancel();
                bVar.e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            a aVar2 = bVar.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (aVar2.t / aVar2.s)) + 1.0f);
            bVar.e = ofFloat;
            ofFloat.setRepeatMode(bVar.f.r);
            bVar.e.setRepeatCount(bVar.f.q);
            ValueAnimator valueAnimator2 = bVar.e;
            a aVar3 = bVar.f;
            valueAnimator2.setDuration(aVar3.s + aVar3.t);
            bVar.e.addUpdateListener(bVar.a);
            if (z) {
                bVar.e.start();
            }
        }
        bVar.invalidateSelf();
        if (aVar != null && aVar.n) {
            setLayerType(2, this.b);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            this.c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        b bVar = this.c;
        ValueAnimator valueAnimator = bVar.e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar.e.cancel();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.c) {
            return false;
        }
        return true;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint();
        this.c = new b();
        this.d = true;
        a(context, attributeSet);
    }
}
