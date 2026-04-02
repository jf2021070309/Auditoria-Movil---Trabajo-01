package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f4693b;

    /* renamed from: c  reason: collision with root package name */
    public float f4694c;

    /* renamed from: d  reason: collision with root package name */
    public float f4695d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4696e;

    /* renamed from: f  reason: collision with root package name */
    public int f4697f;

    /* renamed from: g  reason: collision with root package name */
    public final List<c> f4698g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4699h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4700i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f4701j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4702k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4703l;

    /* renamed from: m  reason: collision with root package name */
    public float f4704m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4705n;
    public double o;
    public int p;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i2 = ClockHandView.a;
            clockHandView.c(floatValue, true);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(float f2, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f4698g = new ArrayList();
        Paint paint = new Paint();
        this.f4701j = paint;
        this.f4702k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.f6317f, R.attr.materialClockStyle, 2131887168);
        this.p = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f4699h = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f4703l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f4700i = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.f4697f = ViewConfiguration.get(context).getScaledTouchSlop();
        AtomicInteger atomicInteger = d0.a;
        d0.c.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f2, boolean z) {
        ValueAnimator valueAnimator = this.f4693b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            c(f2, false);
            return;
        }
        float f3 = this.f4704m;
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f2));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f4693b = ofFloat;
        ofFloat.setDuration(200L);
        this.f4693b.addUpdateListener(new a());
        this.f4693b.addListener(new b(this));
        this.f4693b.start();
    }

    public final void c(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.f4704m = f3;
        this.o = Math.toRadians(f3 - 90.0f);
        float cos = (this.p * ((float) Math.cos(this.o))) + (getWidth() / 2);
        float sin = (this.p * ((float) Math.sin(this.o))) + (getHeight() / 2);
        RectF rectF = this.f4702k;
        int i2 = this.f4699h;
        rectF.set(cos - i2, sin - i2, cos + i2, sin + i2);
        for (c cVar : this.f4698g) {
            cVar.a(f3, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f2 = height;
        this.f4701j.setStrokeWidth(0.0f);
        canvas.drawCircle((this.p * ((float) Math.cos(this.o))) + width2, (this.p * ((float) Math.sin(this.o))) + f2, this.f4699h, this.f4701j);
        double sin = Math.sin(this.o);
        double cos = Math.cos(this.o);
        Double.isNaN(r6);
        Double.isNaN(r6);
        Double.isNaN(r6);
        Double.isNaN(r6);
        this.f4701j.setStrokeWidth(this.f4703l);
        canvas.drawLine(width2, f2, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f4701j);
        canvas.drawCircle(width2, f2, this.f4700i, this.f4701j);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        b(this.f4704m, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.f4694c);
                int i3 = (int) (y - this.f4695d);
                this.f4696e = (i3 * i3) + (i2 * i2) > this.f4697f;
                z = this.f4705n;
                if (actionMasked == 1) {
                }
            } else {
                z = false;
            }
            z2 = false;
        } else {
            this.f4694c = x;
            this.f4695d = y;
            this.f4696e = true;
            this.f4705n = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.f4705n;
        float a2 = a(x, y);
        boolean z5 = this.f4704m != a2;
        if (!z2 || !z5) {
            if (z5 || z) {
                b(a2, false);
            }
            this.f4705n = z4 | z3;
            return true;
        }
        z3 = true;
        this.f4705n = z4 | z3;
        return true;
    }
}
