package com.amazon.aps.iva.v1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.node.o;
import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.f1.p0;
/* compiled from: RenderNodeLayer.android.kt */
/* loaded from: classes.dex */
public final class e2 implements com.amazon.aps.iva.u1.u0 {
    public static final a n = a.h;
    public final AndroidComposeView b;
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.f1.u, com.amazon.aps.iva.kb0.q> c;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> d;
    public boolean e;
    public final a2 f;
    public boolean g;
    public boolean h;
    public com.amazon.aps.iva.f1.k i;
    public final x1<f1> j;
    public final com.amazon.aps.iva.p0.e k;
    public long l;
    public final f1 m;

    /* compiled from: RenderNodeLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<f1, Matrix, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(f1 f1Var, Matrix matrix) {
            f1 f1Var2 = f1Var;
            Matrix matrix2 = matrix;
            com.amazon.aps.iva.yb0.j.f(f1Var2, "rn");
            com.amazon.aps.iva.yb0.j.f(matrix2, "matrix");
            f1Var2.x(matrix2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e2(AndroidComposeView androidComposeView, com.amazon.aps.iva.xb0.l lVar, o.h hVar) {
        f1 b2Var;
        com.amazon.aps.iva.yb0.j.f(androidComposeView, "ownerView");
        com.amazon.aps.iva.yb0.j.f(lVar, "drawBlock");
        com.amazon.aps.iva.yb0.j.f(hVar, "invalidateParentLayer");
        this.b = androidComposeView;
        this.c = lVar;
        this.d = hVar;
        this.f = new a2(androidComposeView.getDensity());
        this.j = new x1<>(n);
        this.k = new com.amazon.aps.iva.p0.e(1);
        this.l = com.amazon.aps.iva.f1.b1.b;
        if (Build.VERSION.SDK_INT >= 29) {
            b2Var = new c2(androidComposeView);
        } else {
            b2Var = new b2(androidComposeView);
        }
        b2Var.l();
        this.m = b2Var;
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void a(com.amazon.aps.iva.e1.b bVar, boolean z) {
        f1 f1Var = this.m;
        x1<f1> x1Var = this.j;
        if (z) {
            float[] a2 = x1Var.a(f1Var);
            if (a2 == null) {
                bVar.a = 0.0f;
                bVar.b = 0.0f;
                bVar.c = 0.0f;
                bVar.d = 0.0f;
                return;
            }
            com.amazon.aps.iva.aq.k.v(a2, bVar);
            return;
        }
        com.amazon.aps.iva.aq.k.v(x1Var.b(f1Var), bVar);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final long b(long j, boolean z) {
        f1 f1Var = this.m;
        x1<f1> x1Var = this.j;
        if (z) {
            float[] a2 = x1Var.a(f1Var);
            if (a2 != null) {
                return com.amazon.aps.iva.aq.k.u(a2, j);
            }
            int i = com.amazon.aps.iva.e1.c.e;
            return com.amazon.aps.iva.e1.c.c;
        }
        return com.amazon.aps.iva.aq.k.u(x1Var.b(f1Var), j);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void c(long j) {
        int i = (int) (j >> 32);
        int b = com.amazon.aps.iva.o2.j.b(j);
        long j2 = this.l;
        int i2 = com.amazon.aps.iva.f1.b1.c;
        float f = i;
        f1 f1Var = this.m;
        f1Var.B(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        float f2 = b;
        f1Var.C(com.amazon.aps.iva.f1.b1.a(this.l) * f2);
        if (f1Var.e(f1Var.c(), f1Var.v(), f1Var.c() + i, f1Var.v() + b)) {
            long d = com.amazon.aps.iva.ab.r.d(f, f2);
            a2 a2Var = this.f;
            if (!com.amazon.aps.iva.e1.g.a(a2Var.d, d)) {
                a2Var.d = d;
                a2Var.h = true;
            }
            f1Var.D(a2Var.b());
            if (!this.e && !this.g) {
                this.b.invalidate();
                j(true);
            }
            this.j.c();
        }
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void d(o.h hVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "drawBlock");
        com.amazon.aps.iva.yb0.j.f(hVar, "invalidateParentLayer");
        j(false);
        this.g = false;
        this.h = false;
        this.l = com.amazon.aps.iva.f1.b1.b;
        this.c = lVar;
        this.d = hVar;
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void destroy() {
        f1 f1Var = this.m;
        if (f1Var.j()) {
            f1Var.f();
        }
        this.c = null;
        this.d = null;
        this.g = true;
        j(false);
        AndroidComposeView androidComposeView = this.b;
        androidComposeView.w = true;
        androidComposeView.F(this);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, com.amazon.aps.iva.f1.u0 u0Var, boolean z, long j2, long j3, int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar) {
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar;
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        this.l = j;
        f1 f1Var = this.m;
        boolean w = f1Var.w();
        a2 a2Var = this.f;
        boolean z2 = false;
        boolean z3 = w && !(a2Var.i ^ true);
        f1Var.o(f);
        f1Var.u(f2);
        f1Var.g(f3);
        f1Var.y(f4);
        f1Var.k(f5);
        f1Var.h(f6);
        f1Var.E(defpackage.i.G(j2));
        f1Var.H(defpackage.i.G(j3));
        f1Var.t(f9);
        f1Var.q(f7);
        f1Var.r(f8);
        f1Var.p(f10);
        int i2 = com.amazon.aps.iva.f1.b1.c;
        f1Var.B(Float.intBitsToFloat((int) (j >> 32)) * f1Var.getWidth());
        f1Var.C(com.amazon.aps.iva.f1.b1.a(j) * f1Var.getHeight());
        p0.a aVar2 = com.amazon.aps.iva.f1.p0.a;
        f1Var.G(z && u0Var != aVar2);
        f1Var.d(z && u0Var == aVar2);
        f1Var.s();
        f1Var.n(i);
        boolean d = this.f.d(u0Var, f1Var.a(), f1Var.w(), f1Var.J(), lVar, cVar);
        f1Var.D(a2Var.b());
        if (f1Var.w() && !(!a2Var.i)) {
            z2 = true;
        }
        AndroidComposeView androidComposeView = this.b;
        if (z3 == z2 && (!z2 || !d)) {
            k3.a.a(androidComposeView);
        } else if (!this.e && !this.g) {
            androidComposeView.invalidate();
            j(true);
        }
        if (!this.h && f1Var.J() > 0.0f && (aVar = this.d) != null) {
            aVar.invoke();
        }
        this.j.c();
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void f(com.amazon.aps.iva.f1.u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        Canvas canvas = com.amazon.aps.iva.f1.h.a;
        Canvas canvas2 = ((com.amazon.aps.iva.f1.g) uVar).a;
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        boolean z = false;
        f1 f1Var = this.m;
        if (isHardwareAccelerated) {
            i();
            if (f1Var.J() > 0.0f) {
                z = true;
            }
            this.h = z;
            if (z) {
                uVar.j();
            }
            f1Var.b(canvas2);
            if (this.h) {
                uVar.o();
                return;
            }
            return;
        }
        float c = f1Var.c();
        float v = f1Var.v();
        float F = f1Var.F();
        float A = f1Var.A();
        if (f1Var.a() < 1.0f) {
            com.amazon.aps.iva.f1.k kVar = this.i;
            if (kVar == null) {
                kVar = com.amazon.aps.iva.f1.l.a();
                this.i = kVar;
            }
            kVar.g(f1Var.a());
            canvas2.saveLayer(c, v, F, A, kVar.a);
        } else {
            uVar.n();
        }
        uVar.f(c, v);
        uVar.q(this.j.b(f1Var));
        if (f1Var.w() || f1Var.m()) {
            this.f.a(uVar);
        }
        com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.f1.u, com.amazon.aps.iva.kb0.q> lVar = this.c;
        if (lVar != null) {
            lVar.invoke(uVar);
        }
        uVar.g();
        j(false);
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final boolean g(long j) {
        float c = com.amazon.aps.iva.e1.c.c(j);
        float d = com.amazon.aps.iva.e1.c.d(j);
        f1 f1Var = this.m;
        if (f1Var.m()) {
            if (0.0f <= c && c < f1Var.getWidth() && 0.0f <= d && d < f1Var.getHeight()) {
                return true;
            }
            return false;
        } else if (!f1Var.w()) {
            return true;
        } else {
            return this.f.c(j);
        }
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void h(long j) {
        f1 f1Var = this.m;
        int c = f1Var.c();
        int v = f1Var.v();
        int i = (int) (j >> 32);
        int b = com.amazon.aps.iva.o2.h.b(j);
        if (c != i || v != b) {
            if (c != i) {
                f1Var.z(i - c);
            }
            if (v != b) {
                f1Var.i(b - v);
            }
            k3.a.a(this.b);
            this.j.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.u1.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r4 = this;
            boolean r0 = r4.e
            com.amazon.aps.iva.v1.f1 r1 = r4.m
            if (r0 != 0) goto Lc
            boolean r0 = r1.j()
            if (r0 != 0) goto L2e
        Lc:
            r0 = 0
            r4.j(r0)
            boolean r0 = r1.w()
            if (r0 == 0) goto L24
            com.amazon.aps.iva.v1.a2 r0 = r4.f
            boolean r2 = r0.i
            r2 = r2 ^ 1
            if (r2 != 0) goto L24
            r0.e()
            com.amazon.aps.iva.f1.m0 r0 = r0.g
            goto L25
        L24:
            r0 = 0
        L25:
            com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.f1.u, com.amazon.aps.iva.kb0.q> r2 = r4.c
            if (r2 == 0) goto L2e
            com.amazon.aps.iva.p0.e r3 = r4.k
            r1.I(r3, r0, r2)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.e2.i():void");
    }

    @Override // com.amazon.aps.iva.u1.u0
    public final void invalidate() {
        if (!this.e && !this.g) {
            this.b.invalidate();
            j(true);
        }
    }

    public final void j(boolean z) {
        if (z != this.e) {
            this.e = z;
            this.b.D(this, z);
        }
    }
}
