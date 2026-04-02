package com.amazon.aps.iva.n0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.n0.w;
import com.amazon.aps.iva.q.i1;
/* compiled from: RippleHostView.android.kt */
/* loaded from: classes.dex */
public final class o extends View {
    public static final int[] g = {16842919, 16842910};
    public static final int[] h = new int[0];
    public w b;
    public Boolean c;
    public Long d;
    public i1 e;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> f;

    public static /* synthetic */ void a(o oVar) {
        setRippleState$lambda$2(oVar);
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.e;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.d;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            i1 i1Var = new i1(this, 1);
            this.e = i1Var;
            postDelayed(i1Var, 50L);
        } else {
            if (z) {
                iArr = g;
            } else {
                iArr = h;
            }
            w wVar = this.b;
            if (wVar != null) {
                wVar.setState(iArr);
            }
        }
        this.d = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "this$0");
        w wVar = oVar.b;
        if (wVar != null) {
            wVar.setState(h);
        }
        oVar.e = null;
    }

    public final void b(com.amazon.aps.iva.c0.o oVar, boolean z, long j, int i, long j2, float f, a aVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "interaction");
        com.amazon.aps.iva.yb0.j.f(aVar, "onInvalidateRipple");
        if (this.b == null || !com.amazon.aps.iva.yb0.j.a(Boolean.valueOf(z), this.c)) {
            w wVar = new w(z);
            setBackground(wVar);
            this.b = wVar;
            this.c = Boolean.valueOf(z);
        }
        w wVar2 = this.b;
        com.amazon.aps.iva.yb0.j.c(wVar2);
        this.f = aVar;
        e(f, i, j, j2);
        if (z) {
            long j3 = oVar.a;
            wVar2.setHotspot(com.amazon.aps.iva.e1.c.c(j3), com.amazon.aps.iva.e1.c.d(j3));
        } else {
            wVar2.setHotspot(wVar2.getBounds().centerX(), wVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f = null;
        i1 i1Var = this.e;
        if (i1Var != null) {
            removeCallbacks(i1Var);
            i1 i1Var2 = this.e;
            com.amazon.aps.iva.yb0.j.c(i1Var2);
            i1Var2.run();
        } else {
            w wVar = this.b;
            if (wVar != null) {
                wVar.setState(h);
            }
        }
        w wVar2 = this.b;
        if (wVar2 == null) {
            return;
        }
        wVar2.setVisible(false, false);
        unscheduleDrawable(wVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f, int i, long j, long j2) {
        boolean c;
        w wVar = this.b;
        if (wVar == null) {
            return;
        }
        Integer num = wVar.d;
        if (num == null || num.intValue() != i) {
            wVar.d = Integer.valueOf(i);
            w.a.a.a(wVar, i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long b = x.b(j2, f);
        x xVar = wVar.c;
        if (xVar == null) {
            c = false;
        } else {
            c = x.c(xVar.a, b);
        }
        if (!c) {
            wVar.c = new x(b);
            wVar.setColor(ColorStateList.valueOf(defpackage.i.G(b)));
        }
        Rect rect = new Rect(0, 0, com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(j)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        wVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        com.amazon.aps.iva.yb0.j.f(drawable, "who");
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
