package com.facebook.ads.internal.view.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.internal.q.a.i;
/* loaded from: classes2.dex */
public class b extends LinearLayout {
    private final ImageView a;
    private final ImageView b;
    private final ImageView c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private double n;
    private double o;

    public b(Context context) {
        super(context);
        this.a = new ImageView(context);
        this.b = new ImageView(context);
        this.c = new ImageView(context);
        a();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ImageView(context, attributeSet);
        this.b = new ImageView(context, attributeSet);
        this.c = new ImageView(context, attributeSet);
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ImageView(context, attributeSet, i);
        this.b = new ImageView(context, attributeSet, i);
        this.c = new ImageView(context, attributeSet, i);
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ImageView(context, attributeSet, i, i2);
        this.b = new ImageView(context, attributeSet, i, i2);
        this.c = new ImageView(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        setOrientation(1);
        this.a.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.a);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.b.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.b);
        this.c.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.c);
        i.a(this.a, i.INTERNAL_AD_MEDIA);
        i.a(this.b, i.INTERNAL_AD_MEDIA);
        i.a(this.c, i.INTERNAL_AD_MEDIA);
    }

    private void b() {
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        this.o = getMeasuredWidth() / getMeasuredHeight();
        this.n = this.d.getWidth() / this.d.getHeight();
        if (this.n > this.o) {
            c();
        } else {
            d();
        }
    }

    private void c() {
        this.j = (int) Math.round(getWidth() / this.n);
        this.k = getWidth();
        this.h = (int) Math.ceil((getHeight() - this.j) / 2.0f);
        if (this.e == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        this.i = (int) Math.floor((getHeight() - this.j) / 2.0f);
        float height = this.d.getHeight() / this.j;
        int min = Math.min(Math.round(this.h * height), this.e.getHeight());
        if (min > 0) {
            this.f = Bitmap.createBitmap(this.e, 0, 0, this.e.getWidth(), min, matrix, true);
            this.a.setImageBitmap(this.f);
        }
        int min2 = Math.min(Math.round(this.i * height), this.e.getHeight());
        if (min2 > 0) {
            this.g = Bitmap.createBitmap(this.e, 0, this.e.getHeight() - min2, this.e.getWidth(), min2, matrix, true);
            this.c.setImageBitmap(this.g);
        }
    }

    private void d() {
        this.k = (int) Math.round(getHeight() * this.n);
        this.j = getHeight();
        this.l = (int) Math.ceil((getWidth() - this.k) / 2.0f);
        if (this.e == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        this.m = (int) Math.floor((getWidth() - this.k) / 2.0f);
        float width = this.d.getWidth() / this.k;
        int min = Math.min(Math.round(this.l * width), this.e.getWidth());
        if (min > 0) {
            this.f = Bitmap.createBitmap(this.e, 0, 0, min, this.e.getHeight(), matrix, true);
            this.a.setImageBitmap(this.f);
        }
        int min2 = Math.min(Math.round(this.m * width), this.e.getWidth());
        if (min2 > 0) {
            this.g = Bitmap.createBitmap(this.e, this.e.getWidth() - min2, 0, min2, this.e.getHeight(), matrix, true);
            this.c.setImageBitmap(this.g);
        }
    }

    private boolean e() {
        return ((this.h + this.j) + this.i == getMeasuredHeight() && (this.l + this.k) + this.m == getMeasuredWidth()) ? false : true;
    }

    public void a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 == null) {
            this.a.setImageDrawable(null);
            this.c.setImageDrawable(null);
        }
        if (bitmap == null) {
            this.b.setImageDrawable(null);
            return;
        }
        this.b.setImageBitmap(Bitmap.createBitmap(bitmap));
        this.d = bitmap;
        this.e = bitmap2;
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        if (this.f == null || e()) {
            b();
        }
        if (this.n > this.o) {
            this.a.layout(i, i2, i3, this.h);
            this.b.layout(i, this.h + i2, i3, this.h + this.j);
            this.c.layout(i, this.h + i2 + this.j, i3, i4);
            return;
        }
        this.a.layout(i, i2, this.l, i4);
        this.b.layout(this.l + i, i2, this.l + this.k, i4);
        this.c.layout(this.l + i + this.k, i2, i3, i4);
    }
}
