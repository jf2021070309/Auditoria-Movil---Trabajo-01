package com.amazon.aps.iva.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.p3.g0;
import java.util.WeakHashMap;
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public final class d {
    public final View a;
    public b1 d;
    public b1 e;
    public b1 f;
    public int c = -1;
    public final j b = j.a();

    public d(View view) {
        this.a = view;
    }

    public final void a() {
        boolean z;
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z2 = false;
            if (this.d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f == null) {
                    this.f = new b1();
                }
                b1 b1Var = this.f;
                b1Var.a = null;
                b1Var.d = false;
                b1Var.b = null;
                b1Var.c = false;
                WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                ColorStateList g = g0.i.g(view);
                if (g != null) {
                    b1Var.d = true;
                    b1Var.a = g;
                }
                PorterDuff.Mode h = g0.i.h(view);
                if (h != null) {
                    b1Var.c = true;
                    b1Var.b = h;
                }
                if (b1Var.d || b1Var.c) {
                    j.e(background, b1Var, view.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            b1 b1Var2 = this.e;
            if (b1Var2 != null) {
                j.e(background, b1Var2, view.getDrawableState());
                return;
            }
            b1 b1Var3 = this.d;
            if (b1Var3 != null) {
                j.e(background, b1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        b1 b1Var = this.e;
        if (b1Var != null) {
            return b1Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        b1 b1Var = this.e;
        if (b1Var != null) {
            return b1Var.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList h;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = com.amazon.aps.iva.j.a.B;
        d1 m = d1.m(context, attributeSet, iArr, i);
        View view2 = this.a;
        com.amazon.aps.iva.p3.g0.m(view2, view2.getContext(), iArr, attributeSet, m.b, i);
        try {
            if (m.l(0)) {
                this.c = m.i(0, -1);
                j jVar = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (jVar) {
                    h = jVar.a.h(i2, context2);
                }
                if (h != null) {
                    g(h);
                }
            }
            if (m.l(1)) {
                g0.i.q(view, m.b(1));
            }
            if (m.l(2)) {
                g0.i.r(view, j0.c(m.h(2, -1), null));
            }
        } finally {
            m.n();
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        j jVar = this.b;
        if (jVar != null) {
            Context context = this.a.getContext();
            synchronized (jVar) {
                colorStateList = jVar.a.h(i, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new b1();
            }
            b1 b1Var = this.d;
            b1Var.a = colorStateList;
            b1Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new b1();
        }
        b1 b1Var = this.e;
        b1Var.a = colorStateList;
        b1Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new b1();
        }
        b1 b1Var = this.e;
        b1Var.b = mode;
        b1Var.c = true;
        a();
    }
}
