package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.oc0.y0;
/* compiled from: util.kt */
/* loaded from: classes4.dex */
public class d implements com.amazon.aps.iva.oc0.m<h<?>, com.amazon.aps.iva.kb0.q> {
    public final s a;

    public d(s sVar) {
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        this.a = sVar;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final h<?> a(com.amazon.aps.iva.oc0.o0 o0Var, com.amazon.aps.iva.kb0.q qVar) {
        return i(o0Var, qVar);
    }

    @Override // com.amazon.aps.iva.oc0.m
    public h<?> b(com.amazon.aps.iva.oc0.j jVar, com.amazon.aps.iva.kb0.q qVar) {
        return i(jVar, qVar);
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> c(com.amazon.aps.iva.oc0.q0 q0Var, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> d(com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> e(y0 y0Var, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final h<?> f(com.amazon.aps.iva.oc0.p0 p0Var, com.amazon.aps.iva.kb0.q qVar) {
        return i(p0Var, qVar);
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> g(com.amazon.aps.iva.oc0.j0 j0Var, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> h(c1 c1Var, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final h<?> i(com.amazon.aps.iva.oc0.v vVar, com.amazon.aps.iva.kb0.q qVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "descriptor");
        com.amazon.aps.iva.yb0.j.f(qVar, "data");
        return new w(this.a, vVar);
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final h<?> j(com.amazon.aps.iva.oc0.n0 n0Var, com.amazon.aps.iva.kb0.q qVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        com.amazon.aps.iva.yb0.j.f(qVar, "data");
        int i2 = 0;
        if (n0Var.J() != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (n0Var.M() != null) {
            i2 = 1;
        }
        int i3 = i + i2;
        boolean L = n0Var.L();
        s sVar = this.a;
        if (L) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new z(sVar, n0Var);
                    }
                } else {
                    return new y(sVar, n0Var);
                }
            } else {
                return new x(sVar, n0Var);
            }
        } else if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return new g0(sVar, n0Var);
                }
            } else {
                return new f0(sVar, n0Var);
            }
        } else {
            return new e0(sVar, n0Var);
        }
        throw new com.amazon.aps.iva.wb0.a("Unsupported property: " + n0Var);
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> k(com.amazon.aps.iva.oc0.f0 f0Var, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ h<?> l(x0 x0Var, com.amazon.aps.iva.kb0.q qVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.m
    public final /* bridge */ /* synthetic */ Object m(Object obj, com.amazon.aps.iva.oc0.c0 c0Var) {
        return null;
    }
}
