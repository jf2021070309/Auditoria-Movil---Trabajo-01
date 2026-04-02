package com.amazon.aps.iva.i1;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.f1.k;
import com.amazon.aps.iva.f1.l0;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.h1.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Painter.kt */
/* loaded from: classes.dex */
public abstract class c {
    private y colorFilter;
    private l0 layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private l layoutDirection = l.Ltr;
    private final com.amazon.aps.iva.xb0.l<e, q> drawLambda = new a();

    /* compiled from: Painter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e eVar) {
            e eVar2 = eVar;
            j.f(eVar2, "$this$null");
            c.this.onDraw(eVar2);
            return q.a;
        }
    }

    private final void configureAlpha(float f) {
        boolean z;
        boolean z2;
        if (this.alpha == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!applyAlpha(f)) {
                if (f == 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    l0 l0Var = this.layerPaint;
                    if (l0Var != null) {
                        l0Var.g(f);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().g(f);
                    this.useLayer = true;
                }
            }
            this.alpha = f;
        }
    }

    private final void configureColorFilter(y yVar) {
        if (!j.a(this.colorFilter, yVar)) {
            if (!applyColorFilter(yVar)) {
                if (yVar == null) {
                    l0 l0Var = this.layerPaint;
                    if (l0Var != null) {
                        l0Var.l(null);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().l(yVar);
                    this.useLayer = true;
                }
            }
            this.colorFilter = yVar;
        }
    }

    private final void configureLayoutDirection(l lVar) {
        if (this.layoutDirection != lVar) {
            applyLayoutDirection(lVar);
            this.layoutDirection = lVar;
        }
    }

    /* renamed from: draw-x_KDEd0$default  reason: not valid java name */
    public static /* synthetic */ void m17drawx_KDEd0$default(c cVar, e eVar, long j, float f, y yVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                yVar = null;
            }
            cVar.m18drawx_KDEd0(eVar, j, f2, yVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    private final l0 obtainPaint() {
        l0 l0Var = this.layerPaint;
        if (l0Var == null) {
            k a2 = com.amazon.aps.iva.f1.l.a();
            this.layerPaint = a2;
            return a2;
        }
        return l0Var;
    }

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(y yVar) {
        return false;
    }

    public boolean applyLayoutDirection(l lVar) {
        j.f(lVar, "layoutDirection");
        return false;
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m18drawx_KDEd0(e eVar, long j, float f, y yVar) {
        j.f(eVar, "$this$draw");
        configureAlpha(f);
        configureColorFilter(yVar);
        configureLayoutDirection(eVar.getLayoutDirection());
        float d = g.d(eVar.h()) - g.d(j);
        float b = g.b(eVar.h()) - g.b(j);
        eVar.R0().a.c(0.0f, 0.0f, d, b);
        if (f > 0.0f && g.d(j) > 0.0f && g.b(j) > 0.0f) {
            if (this.useLayer) {
                com.amazon.aps.iva.e1.e h = com.amazon.aps.iva.ff0.b.h(com.amazon.aps.iva.e1.c.b, r.d(g.d(j), g.b(j)));
                u a2 = eVar.R0().a();
                try {
                    a2.l(h, obtainPaint());
                    onDraw(eVar);
                } finally {
                    a2.g();
                }
            } else {
                onDraw(eVar);
            }
        }
        eVar.R0().a.c(-0.0f, -0.0f, -d, -b);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo16getIntrinsicSizeNHjbRc();

    public abstract void onDraw(e eVar);
}
