package com.amazon.aps.iva.cd0;

import com.amazon.aps.iva.ad0.j;
import com.amazon.aps.iva.ae0.l;
import com.amazon.aps.iva.ed0.a0;
import com.amazon.aps.iva.ed0.u;
import com.amazon.aps.iva.ed0.w;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.g1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.pc0.k;
import com.amazon.aps.iva.uc0.e0;
/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes4.dex */
public final class d {
    public final com.amazon.aps.iva.la0.c a;
    public final j b;
    public final f c;
    public final g1 d;

    public d(com.amazon.aps.iva.la0.c cVar, j jVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.yb0.j.f(jVar, "typeParameterResolver");
        this.a = cVar;
        this.b = jVar;
        f fVar = new f();
        this.c = fVar;
        this.d = new g1(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d8, code lost:
        if ((!r0.isEmpty()) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:
        if (r2 == false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ee0.m0 a(com.amazon.aps.iva.ed0.j r18, com.amazon.aps.iva.cd0.a r19, com.amazon.aps.iva.ee0.m0 r20) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cd0.d.a(com.amazon.aps.iva.ed0.j, com.amazon.aps.iva.cd0.a, com.amazon.aps.iva.ee0.m0):com.amazon.aps.iva.ee0.m0");
    }

    public final c1 b(com.amazon.aps.iva.ed0.j jVar) {
        com.amazon.aps.iva.nd0.b l = com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(jVar.H()));
        l c = ((com.amazon.aps.iva.ad0.c) this.a.a).d.c();
        c1 h = c.l.a(l, f1.J(0)).h();
        com.amazon.aps.iva.yb0.j.e(h, "c.components.deserialize…istOf(0)).typeConstructor");
        return h;
    }

    public final u1 c(com.amazon.aps.iva.ed0.f fVar, a aVar, boolean z) {
        u uVar;
        com.amazon.aps.iva.lc0.l lVar;
        v1 v1Var;
        com.amazon.aps.iva.yb0.j.f(fVar, "arrayType");
        e0 z2 = fVar.z();
        if (z2 instanceof u) {
            uVar = (u) z2;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            lVar = uVar.getType();
        } else {
            lVar = null;
        }
        com.amazon.aps.iva.la0.c cVar = this.a;
        com.amazon.aps.iva.ad0.e eVar = new com.amazon.aps.iva.ad0.e(cVar, fVar, true);
        boolean z3 = aVar.e;
        if (lVar != null) {
            m0 r = cVar.a().j().r(lVar);
            com.amazon.aps.iva.yb0.j.e(r, "it");
            com.amazon.aps.iva.ee0.e0 z4 = com.amazon.aps.iva.da0.a.z(r, new k(r.getAnnotations(), eVar));
            com.amazon.aps.iva.yb0.j.d(z4, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            m0 m0Var = (m0) z4;
            if (!z3) {
                return f0.c(m0Var, m0Var.M0(true));
            }
            return m0Var;
        }
        com.amazon.aps.iva.ee0.e0 d = d(z2, com.amazon.aps.iva.a60.b.w(r1.COMMON, z3, false, null, 6));
        if (z3) {
            if (z) {
                v1Var = v1.OUT_VARIANCE;
            } else {
                v1Var = v1.INVARIANT;
            }
            return cVar.a().j().i(v1Var, d, eVar);
        }
        return f0.c(cVar.a().j().i(v1.INVARIANT, d, eVar), cVar.a().j().i(v1.OUT_VARIANCE, d, eVar).M0(true));
    }

    public final com.amazon.aps.iva.ee0.e0 d(w wVar, a aVar) {
        m0 x;
        boolean z = wVar instanceof u;
        com.amazon.aps.iva.la0.c cVar = this.a;
        if (z) {
            com.amazon.aps.iva.lc0.l type = ((u) wVar).getType();
            if (type != null) {
                x = cVar.a().j().t(type);
            } else {
                x = cVar.a().j().x();
            }
            com.amazon.aps.iva.yb0.j.e(x, "{\n                val pr…ns.unitType\n            }");
            return x;
        }
        boolean z2 = false;
        if (wVar instanceof com.amazon.aps.iva.ed0.j) {
            com.amazon.aps.iva.ed0.j jVar = (com.amazon.aps.iva.ed0.j) wVar;
            if (!aVar.e) {
                if (aVar.b != r1.SUPERTYPE) {
                    z2 = true;
                }
            }
            boolean s = jVar.s();
            if (!s && !z2) {
                m0 a = a(jVar, aVar, null);
                if (a != null) {
                    return a;
                }
                return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNRESOLVED_JAVA_CLASS, jVar.E());
            }
            m0 a2 = a(jVar, aVar.f(b.FLEXIBLE_LOWER_BOUND), null);
            if (a2 == null) {
                return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNRESOLVED_JAVA_CLASS, jVar.E());
            }
            m0 a3 = a(jVar, aVar.f(b.FLEXIBLE_UPPER_BOUND), a2);
            if (a3 == null) {
                return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNRESOLVED_JAVA_CLASS, jVar.E());
            }
            if (s) {
                return new h(a2, a3);
            }
            return f0.c(a2, a3);
        } else if (wVar instanceof com.amazon.aps.iva.ed0.f) {
            return c((com.amazon.aps.iva.ed0.f) wVar, aVar, false);
        } else {
            if (wVar instanceof a0) {
                e0 q = ((a0) wVar).q();
                if (q != null) {
                    return d(q, aVar);
                }
                return cVar.a().j().n();
            } else if (wVar == null) {
                return cVar.a().j().n();
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + wVar);
            }
        }
    }
}
