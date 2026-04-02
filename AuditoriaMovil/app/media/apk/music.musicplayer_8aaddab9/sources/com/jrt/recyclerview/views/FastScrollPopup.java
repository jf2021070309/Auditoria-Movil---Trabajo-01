package com.jrt.recyclerview.views;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.Keep;
import e.d.b.d.a;
/* loaded from: classes2.dex */
public class FastScrollPopup {

    /* renamed from: b  reason: collision with root package name */
    public ObjectAnimator f4844b;

    /* renamed from: g  reason: collision with root package name */
    public int f4849g;

    /* renamed from: i  reason: collision with root package name */
    public int f4851i;

    /* renamed from: k  reason: collision with root package name */
    public int f4853k;

    /* renamed from: l  reason: collision with root package name */
    public FastScrollRecyclerView f4854l;

    /* renamed from: m  reason: collision with root package name */
    public Resources f4855m;

    /* renamed from: n  reason: collision with root package name */
    public String f4856n;
    public Paint p;
    public boolean r;
    public float a = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public int f4845c = -16777216;

    /* renamed from: e  reason: collision with root package name */
    public Path f4847e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public RectF f4848f = new RectF();

    /* renamed from: h  reason: collision with root package name */
    public Rect f4850h = new Rect();

    /* renamed from: j  reason: collision with root package name */
    public Rect f4852j = new Rect();
    public Rect o = new Rect();
    public Rect q = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public Paint f4846d = new Paint(1);

    public FastScrollPopup(Resources resources, FastScrollRecyclerView fastScrollRecyclerView) {
        this.f4855m = resources;
        this.f4854l = fastScrollRecyclerView;
        Paint paint = new Paint(1);
        this.p = paint;
        paint.setAlpha(0);
        c((int) TypedValue.applyDimension(2, 44.0f, this.f4855m.getDisplayMetrics()));
        int h0 = a.h0(this.f4855m, 88.0f);
        this.f4849g = h0;
        this.f4851i = h0 / 2;
        this.f4854l.invalidate(this.f4850h);
    }

    public void a(boolean z) {
        if (this.r != z) {
            this.r = z;
            ObjectAnimator objectAnimator = this.f4844b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
            this.f4844b = ofFloat;
            ofFloat.setDuration(z ? 200L : 150L);
            this.f4844b.start();
        }
    }

    public boolean b() {
        return this.a > 0.0f && !TextUtils.isEmpty(this.f4856n);
    }

    public void c(int i2) {
        this.p.setTextSize(i2);
        this.f4854l.invalidate(this.f4850h);
    }

    @Keep
    public float getAlpha() {
        return this.a;
    }

    @Keep
    public void setAlpha(float f2) {
        this.a = f2;
        this.f4854l.invalidate(this.f4850h);
    }
}
