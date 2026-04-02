package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class j extends g<com.amazon.aps.iva.kb0.j<? extends com.amazon.aps.iva.nd0.b, ? extends com.amazon.aps.iva.nd0.f>> {
    public final com.amazon.aps.iva.nd0.b b;
    public final com.amazon.aps.iva.nd0.f c;

    public j(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.f fVar) {
        super(new com.amazon.aps.iva.kb0.j(bVar, fVar));
        this.b = bVar;
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.nd0.b bVar = this.b;
        com.amazon.aps.iva.oc0.e a = com.amazon.aps.iva.oc0.u.a(c0Var, bVar);
        m0 m0Var = null;
        if (a != null) {
            int i = com.amazon.aps.iva.qd0.i.a;
            if (!com.amazon.aps.iva.qd0.i.n(a, com.amazon.aps.iva.oc0.f.ENUM_CLASS)) {
                a = null;
            }
            if (a != null) {
                m0Var = a.m();
            }
        }
        if (m0Var == null) {
            com.amazon.aps.iva.ge0.j jVar = com.amazon.aps.iva.ge0.j.ERROR_ENUM_TYPE;
            String bVar2 = bVar.toString();
            com.amazon.aps.iva.yb0.j.e(bVar2, "enumClassId.toString()");
            String str = this.c.b;
            com.amazon.aps.iva.yb0.j.e(str, "enumEntryName.toString()");
            return com.amazon.aps.iva.ge0.k.c(jVar, bVar2, str);
        }
        return m0Var;
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.j());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
