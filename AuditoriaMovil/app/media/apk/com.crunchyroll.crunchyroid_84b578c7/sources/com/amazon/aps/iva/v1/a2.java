package com.amazon.aps.iva.v1;

import android.graphics.Outline;
import android.os.Build;
import com.amazon.aps.iva.f1.k0;
/* compiled from: OutlineResolver.android.kt */
/* loaded from: classes.dex */
public final class a2 {
    public com.amazon.aps.iva.o2.c a;
    public boolean b;
    public final Outline c;
    public long d;
    public com.amazon.aps.iva.f1.u0 e;
    public com.amazon.aps.iva.f1.m f;
    public com.amazon.aps.iva.f1.m0 g;
    public boolean h;
    public boolean i;
    public com.amazon.aps.iva.f1.m0 j;
    public com.amazon.aps.iva.e1.f k;
    public float l;
    public long m;
    public long n;
    public boolean o;
    public com.amazon.aps.iva.o2.l p;
    public com.amazon.aps.iva.f1.k0 q;

    public a2(com.amazon.aps.iva.o2.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        this.a = cVar;
        this.b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        long j = com.amazon.aps.iva.e1.g.b;
        this.d = j;
        this.e = com.amazon.aps.iva.f1.p0.a;
        this.m = com.amazon.aps.iva.e1.c.b;
        this.n = j;
        this.p = com.amazon.aps.iva.o2.l.Ltr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
        if (r8 == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.f1.u r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.a2.a(com.amazon.aps.iva.f1.u):void");
    }

    public final Outline b() {
        e();
        if (this.o && this.b) {
            return this.c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(long r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.a2.c(long):boolean");
    }

    public final boolean d(com.amazon.aps.iva.f1.u0 u0Var, float f, boolean z, float f2, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar) {
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        this.c.setAlpha(f);
        boolean z3 = !com.amazon.aps.iva.yb0.j.a(this.e, u0Var);
        if (z3) {
            this.e = u0Var;
            this.h = true;
        }
        if (!z && f2 <= 0.0f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.o != z2) {
            this.o = z2;
            this.h = true;
        }
        if (this.p != lVar) {
            this.p = lVar;
            this.h = true;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.a, cVar)) {
            this.a = cVar;
            this.h = true;
        }
        return z3;
    }

    public final void e() {
        if (this.h) {
            this.m = com.amazon.aps.iva.e1.c.b;
            long j = this.d;
            this.n = j;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            boolean z = this.o;
            Outline outline = this.c;
            if (z && com.amazon.aps.iva.e1.g.d(j) > 0.0f && com.amazon.aps.iva.e1.g.b(this.d) > 0.0f) {
                this.b = true;
                com.amazon.aps.iva.f1.k0 a = this.e.a(this.d, this.p, this.a);
                this.q = a;
                if (a instanceof k0.b) {
                    com.amazon.aps.iva.e1.e eVar = ((k0.b) a).a;
                    float f = eVar.a;
                    float f2 = eVar.b;
                    this.m = com.amazon.aps.iva.e1.d.d(f, f2);
                    float f3 = eVar.c;
                    float f4 = eVar.a;
                    float f5 = eVar.d;
                    this.n = com.amazon.aps.iva.ab.r.d(f3 - f4, f5 - f2);
                    outline.setRect(com.amazon.aps.iva.ob0.f.a(f4), com.amazon.aps.iva.ob0.f.a(f2), com.amazon.aps.iva.ob0.f.a(f3), com.amazon.aps.iva.ob0.f.a(f5));
                    return;
                } else if (a instanceof k0.c) {
                    com.amazon.aps.iva.e1.f fVar = ((k0.c) a).a;
                    float b = com.amazon.aps.iva.e1.a.b(fVar.e);
                    float f6 = fVar.a;
                    float f7 = fVar.b;
                    this.m = com.amazon.aps.iva.e1.d.d(f6, f7);
                    float f8 = fVar.c;
                    float f9 = fVar.d;
                    this.n = com.amazon.aps.iva.ab.r.d(f8 - f6, f9 - f7);
                    if (com.amazon.aps.iva.dg.b.z(fVar)) {
                        this.c.setRoundRect(com.amazon.aps.iva.ob0.f.a(f6), com.amazon.aps.iva.ob0.f.a(f7), com.amazon.aps.iva.ob0.f.a(f8), com.amazon.aps.iva.ob0.f.a(f9), b);
                        this.l = b;
                        return;
                    }
                    com.amazon.aps.iva.f1.m mVar = this.f;
                    if (mVar == null) {
                        mVar = com.amazon.aps.iva.cq.b.j();
                        this.f = mVar;
                    }
                    mVar.reset();
                    mVar.h(fVar);
                    f(mVar);
                    return;
                } else if (a instanceof k0.a) {
                    ((k0.a) a).getClass();
                    f(null);
                    return;
                } else {
                    return;
                }
            }
            outline.setEmpty();
        }
    }

    public final void f(com.amazon.aps.iva.f1.m0 m0Var) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.c;
        if (i <= 28 && !m0Var.a()) {
            this.b = false;
            outline.setEmpty();
            this.i = true;
        } else if (m0Var instanceof com.amazon.aps.iva.f1.m) {
            outline.setConvexPath(((com.amazon.aps.iva.f1.m) m0Var).a);
            this.i = !outline.canClip();
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.g = m0Var;
    }
}
