package com.amazon.aps.iva.k2;

import android.text.TextPaint;
import com.amazon.aps.iva.f1.t0;
/* compiled from: AndroidTextPaint.android.kt */
/* loaded from: classes.dex */
public final class f extends TextPaint {
    public final com.amazon.aps.iva.f1.k a;
    public com.amazon.aps.iva.n2.i b;
    public t0 c;
    public com.amazon.aps.iva.h1.f d;

    public f(float f) {
        super(1);
        ((TextPaint) this).density = f;
        this.a = new com.amazon.aps.iva.f1.k(this);
        this.b = com.amazon.aps.iva.n2.i.b;
        this.c = t0.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (java.lang.Float.isNaN(r12) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        r12 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        r12 = com.amazon.aps.iva.aq.j.i(r12, 0.0f, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        r9.a(r12, r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.f1.s r9, long r10, float r12) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.f1.x0
            r1 = 1
            r2 = 0
            com.amazon.aps.iva.f1.k r3 = r8.a
            if (r0 == 0) goto L18
            r0 = r9
            com.amazon.aps.iva.f1.x0 r0 = (com.amazon.aps.iva.f1.x0) r0
            long r4 = r0.a
            long r6 = com.amazon.aps.iva.f1.x.g
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 != 0) goto L26
        L18:
            boolean r0 = r9 instanceof com.amazon.aps.iva.f1.s0
            if (r0 == 0) goto L3c
            long r4 = com.amazon.aps.iva.e1.g.c
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L3c
        L26:
            boolean r0 = java.lang.Float.isNaN(r12)
            if (r0 == 0) goto L31
            float r12 = r3.a()
            goto L38
        L31:
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r12 = com.amazon.aps.iva.aq.j.i(r12, r0, r1)
        L38:
            r9.a(r12, r10, r3)
            goto L42
        L3c:
            if (r9 != 0) goto L42
            r9 = 0
            r3.j(r9)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k2.f.a(com.amazon.aps.iva.f1.s, long, float):void");
    }

    public final void b(com.amazon.aps.iva.h1.f fVar) {
        if (fVar != null && !com.amazon.aps.iva.yb0.j.a(this.d, fVar)) {
            this.d = fVar;
            boolean a = com.amazon.aps.iva.yb0.j.a(fVar, com.amazon.aps.iva.h1.h.a);
            com.amazon.aps.iva.f1.k kVar = this.a;
            if (a) {
                kVar.w(0);
            } else if (fVar instanceof com.amazon.aps.iva.h1.i) {
                kVar.w(1);
                com.amazon.aps.iva.h1.i iVar = (com.amazon.aps.iva.h1.i) fVar;
                kVar.v(iVar.a);
                kVar.u(iVar.b);
                kVar.t(iVar.d);
                kVar.s(iVar.c);
                iVar.getClass();
                kVar.r(null);
            }
        }
    }

    public final void c(t0 t0Var) {
        boolean z;
        if (t0Var != null && !com.amazon.aps.iva.yb0.j.a(this.c, t0Var)) {
            this.c = t0Var;
            if (com.amazon.aps.iva.yb0.j.a(t0Var, t0.d)) {
                clearShadowLayer();
                return;
            }
            t0 t0Var2 = this.c;
            float f = t0Var2.c;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, com.amazon.aps.iva.e1.c.c(t0Var2.b), com.amazon.aps.iva.e1.c.d(this.c.b), defpackage.i.G(this.c.a));
        }
    }

    public final void d(com.amazon.aps.iva.n2.i iVar) {
        if (iVar != null && !com.amazon.aps.iva.yb0.j.a(this.b, iVar)) {
            this.b = iVar;
            setUnderlineText(iVar.a(com.amazon.aps.iva.n2.i.c));
            setStrikeThruText(this.b.a(com.amazon.aps.iva.n2.i.d));
        }
    }
}
