package e.d.b.d.x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class d extends FrameLayout {
    public static final View.OnTouchListener a = new a();

    /* renamed from: b  reason: collision with root package name */
    public c f6671b;

    /* renamed from: c  reason: collision with root package name */
    public b f6672c;

    /* renamed from: d  reason: collision with root package name */
    public int f6673d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6674e;

    /* renamed from: f  reason: collision with root package name */
    public final float f6675f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6676g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6677h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f6678i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f6679j;

    /* loaded from: classes2.dex */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, 0, 0), attributeSet);
        Drawable q0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, e.d.b.d.b.y);
        if (obtainStyledAttributes.hasValue(6)) {
            d0.B(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f6673d = obtainStyledAttributes.getInt(2, 0);
        this.f6674e = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(e.d.b.d.a.C(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(e.d.b.d.a.U(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f6675f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f6676g = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f6677h = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(a);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(e.d.b.d.a.P(e.d.b.d.a.B(this, R.attr.colorSurface), e.d.b.d.a.B(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            if (this.f6678i != null) {
                q0 = c.i.a.q0(gradientDrawable);
                c.i.a.j0(q0, this.f6678i);
            } else {
                q0 = c.i.a.q0(gradientDrawable);
            }
            AtomicInteger atomicInteger = d0.a;
            d0.c.q(this, q0);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f6675f;
    }

    public int getAnimationMode() {
        return this.f6673d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6674e;
    }

    public int getMaxInlineActionWidth() {
        return this.f6677h;
    }

    public int getMaxWidth() {
        return this.f6676g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f6672c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        d0.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f6672c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c cVar = this.f6671b;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f6676g > 0) {
            int measuredWidth = getMeasuredWidth();
            int i4 = this.f6676g;
            if (measuredWidth > i4) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }
    }

    public void setAnimationMode(int i2) {
        this.f6673d = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f6678i != null) {
            drawable = c.i.a.q0(drawable.mutate());
            c.i.a.j0(drawable, this.f6678i);
            c.i.a.k0(drawable, this.f6679j);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6678i = colorStateList;
        if (getBackground() != null) {
            Drawable q0 = c.i.a.q0(getBackground().mutate());
            c.i.a.j0(q0, colorStateList);
            c.i.a.k0(q0, this.f6679j);
            if (q0 != getBackground()) {
                super.setBackgroundDrawable(q0);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6679j = mode;
        if (getBackground() != null) {
            Drawable q0 = c.i.a.q0(getBackground().mutate());
            c.i.a.k0(q0, mode);
            if (q0 != getBackground()) {
                super.setBackgroundDrawable(q0);
            }
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.f6672c = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : a);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f6671b = cVar;
    }
}
