package com.amazon.aps.iva.q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public final class p {
    public final ImageView a;
    public b1 b;
    public int c = 0;

    public p(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        b1 b1Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j0.a(drawable);
        }
        if (drawable != null && (b1Var = this.b) != null) {
            j.e(drawable, b1Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int i2;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = com.amazon.aps.iva.j.a.f;
        d1 m = d1.m(context, attributeSet, iArr, i);
        com.amazon.aps.iva.p3.g0.m(imageView, imageView.getContext(), iArr, attributeSet, m.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i2 = m.i(1, -1)) != -1 && (drawable = com.amazon.aps.iva.l.a.a(imageView.getContext(), i2)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j0.a(drawable);
            }
            if (m.l(2)) {
                com.amazon.aps.iva.t3.e.c(imageView, m.b(2));
            }
            if (m.l(3)) {
                com.amazon.aps.iva.t3.e.d(imageView, j0.c(m.h(3, -1), null));
            }
        } finally {
            m.n();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable a = com.amazon.aps.iva.l.a.a(imageView.getContext(), i);
            if (a != null) {
                j0.a(a);
            }
            imageView.setImageDrawable(a);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
