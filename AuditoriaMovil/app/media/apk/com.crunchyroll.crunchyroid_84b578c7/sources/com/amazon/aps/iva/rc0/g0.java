package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.j0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes4.dex */
public final class g0 extends p implements com.amazon.aps.iva.oc0.c0 {
    public final com.amazon.aps.iva.de0.l d;
    public final com.amazon.aps.iva.lc0.k e;
    public final Map<com.amazon.aps.iva.a9.w, Object> f;
    public final j0 g;
    public c0 h;
    public com.amazon.aps.iva.oc0.g0 i;
    public final boolean j;
    public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.oc0.j0> k;
    public final com.amazon.aps.iva.kb0.m l;

    public g0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.lc0.k kVar, int i) {
        super(h.a.a, fVar);
        com.amazon.aps.iva.lb0.a0 a0Var = (i & 16) != 0 ? com.amazon.aps.iva.lb0.a0.b : null;
        com.amazon.aps.iva.yb0.j.f(a0Var, "capabilities");
        this.d = lVar;
        this.e = kVar;
        if (fVar.c) {
            this.f = a0Var;
            j0.a.getClass();
            j0 j0Var = (j0) A(j0.a.b);
            this.g = j0Var == null ? j0.b.b : j0Var;
            this.j = true;
            this.k = lVar.f(new f0(this));
            this.l = com.amazon.aps.iva.kb0.f.b(new e0(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final <T> T A(com.amazon.aps.iva.a9.w wVar) {
        com.amazon.aps.iva.yb0.j.f(wVar, "capability");
        T t = (T) this.f.get(wVar);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final void A0() {
        com.amazon.aps.iva.kb0.q qVar;
        if (!this.j) {
            com.amazon.aps.iva.oc0.z zVar = (com.amazon.aps.iva.oc0.z) A(com.amazon.aps.iva.oc0.y.a);
            if (zVar != null) {
                zVar.a();
                qVar = com.amazon.aps.iva.kb0.q.a;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                throw new com.amazon.aps.iva.oc0.x("Accessing invalid module descriptor " + this);
            }
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return (R) mVar.m(d, this);
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final com.amazon.aps.iva.lc0.k j() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final Collection<com.amazon.aps.iva.nd0.c> r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        A0();
        A0();
        return ((o) this.l.getValue()).r(cVar, lVar);
    }

    @Override // com.amazon.aps.iva.rc0.p
    public final String toString() {
        String s0 = p.s0(this);
        com.amazon.aps.iva.yb0.j.e(s0, "super.toString()");
        if (!this.j) {
            return s0.concat(" !isValid");
        }
        return s0;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final boolean v(com.amazon.aps.iva.oc0.c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "targetModule");
        if (com.amazon.aps.iva.yb0.j.a(this, c0Var)) {
            return true;
        }
        c0 c0Var2 = this.h;
        com.amazon.aps.iva.yb0.j.c(c0Var2);
        if (com.amazon.aps.iva.lb0.x.m0(c0Var2.c(), c0Var) || v0().contains(c0Var) || c0Var.v0().contains(this)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final List<com.amazon.aps.iva.oc0.c0> v0() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            return c0Var.b();
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().b;
        com.amazon.aps.iva.yb0.j.e(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // com.amazon.aps.iva.oc0.c0
    public final com.amazon.aps.iva.oc0.j0 y(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        A0();
        return (com.amazon.aps.iva.oc0.j0) ((c.k) this.k).invoke(cVar);
    }
}
