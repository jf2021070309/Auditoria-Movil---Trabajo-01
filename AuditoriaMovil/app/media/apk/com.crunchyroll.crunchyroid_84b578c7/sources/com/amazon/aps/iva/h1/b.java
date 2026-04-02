package com.amazon.aps.iva.h1;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.f1.m;
import com.amazon.aps.iva.f1.u;
/* compiled from: CanvasDrawScope.kt */
/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void a(m mVar, int i) {
        this.a.a().h(mVar, i);
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.a().e(f, f2, f3, f4, i);
    }

    public final void c(float f, float f2, float f3, float f4) {
        boolean z;
        d dVar = this.a;
        u a = dVar.a();
        long d = r.d(com.amazon.aps.iva.e1.g.d(dVar.h()) - (f3 + f), com.amazon.aps.iva.e1.g.b(dVar.h()) - (f4 + f2));
        if (com.amazon.aps.iva.e1.g.d(d) >= 0.0f && com.amazon.aps.iva.e1.g.b(d) >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dVar.b(d);
            a.f(f, f2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    public final void d(long j) {
        u a = this.a.a();
        a.f(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
        a.s();
        a.f(-com.amazon.aps.iva.e1.c.c(j), -com.amazon.aps.iva.e1.c.d(j));
    }

    public final void e(long j) {
        u a = this.a.a();
        a.f(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
        a.d();
        a.f(-com.amazon.aps.iva.e1.c.c(j), -com.amazon.aps.iva.e1.c.d(j));
    }

    public final void f(float[] fArr) {
        this.a.a().q(fArr);
    }

    public final void g(float f, float f2) {
        this.a.a().f(f, f2);
    }
}
