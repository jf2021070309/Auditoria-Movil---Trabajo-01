package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.h2.k;
/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class n implements k.a {
    public final c0 a;
    public final d0 b;
    public final p0 c;
    public final s d;
    public final b0 e;
    public final l f;

    public n(b bVar, d dVar) {
        p0 p0Var = o.a;
        s sVar = new s(o.b);
        b0 b0Var = new b0();
        com.amazon.aps.iva.yb0.j.f(p0Var, "typefaceRequestCache");
        this.a = bVar;
        this.b = dVar;
        this.c = p0Var;
        this.d = sVar;
        this.e = b0Var;
        this.f = new l(this);
    }

    @Override // com.amazon.aps.iva.h2.k.a
    public final q0 a(k kVar, y yVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        d0 d0Var = this.b;
        d0Var.getClass();
        int i3 = d0.a;
        y a = d0Var.a(yVar);
        this.a.b();
        return b(new n0(kVar, a, i, i2, null));
    }

    public final q0 b(n0 n0Var) {
        q0 a;
        p0 p0Var = this.c;
        m mVar = new m(this, n0Var);
        p0Var.getClass();
        synchronized (p0Var.a) {
            a = p0Var.b.a(n0Var);
            if (a != null) {
                if (!a.c()) {
                    p0Var.b.c(n0Var);
                }
            }
            try {
                a = (q0) mVar.invoke(new o0(p0Var, n0Var));
                synchronized (p0Var.a) {
                    if (p0Var.b.a(n0Var) == null && a.c()) {
                        p0Var.b.b(n0Var, a);
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return a;
    }
}
