package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.o1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: IntegerLiteralTypeConstructor.kt */
/* loaded from: classes4.dex */
public final class p implements c1 {
    public final long a;
    public final com.amazon.aps.iva.oc0.c0 b;
    public final Set<e0> c;
    public final m0 d;
    public final com.amazon.aps.iva.kb0.m e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<m0>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<m0> invoke() {
            boolean z = true;
            p pVar = p.this;
            m0 m = pVar.j().k("Comparable").m();
            com.amazon.aps.iva.yb0.j.e(m, "builtIns.comparable.defaultType");
            ArrayList M = f1.M(o1.d(m, f1.J(new l1(pVar.d, v1.IN_VARIANCE)), null, 2));
            com.amazon.aps.iva.oc0.c0 c0Var = pVar.b;
            com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
            m0[] m0VarArr = new m0[4];
            com.amazon.aps.iva.lc0.k j = c0Var.j();
            j.getClass();
            m0 t = j.t(com.amazon.aps.iva.lc0.l.INT);
            if (t != null) {
                m0VarArr[0] = t;
                com.amazon.aps.iva.lc0.k j2 = c0Var.j();
                j2.getClass();
                m0 t2 = j2.t(com.amazon.aps.iva.lc0.l.LONG);
                if (t2 != null) {
                    m0VarArr[1] = t2;
                    com.amazon.aps.iva.lc0.k j3 = c0Var.j();
                    j3.getClass();
                    m0 t3 = j3.t(com.amazon.aps.iva.lc0.l.BYTE);
                    if (t3 != null) {
                        m0VarArr[2] = t3;
                        com.amazon.aps.iva.lc0.k j4 = c0Var.j();
                        j4.getClass();
                        m0 t4 = j4.t(com.amazon.aps.iva.lc0.l.SHORT);
                        if (t4 != null) {
                            m0VarArr[3] = t4;
                            List K = f1.K(m0VarArr);
                            if (!(K instanceof Collection) || !K.isEmpty()) {
                                Iterator it = K.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (!(!pVar.c.contains((e0) it.next()))) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                m0 m2 = pVar.j().k("Number").m();
                                if (m2 != null) {
                                    M.add(m2);
                                } else {
                                    com.amazon.aps.iva.lc0.k.a(55);
                                    throw null;
                                }
                            }
                            return M;
                        }
                        com.amazon.aps.iva.lc0.k.a(57);
                        throw null;
                    }
                    com.amazon.aps.iva.lc0.k.a(56);
                    throw null;
                }
                com.amazon.aps.iva.lc0.k.a(59);
                throw null;
            }
            com.amazon.aps.iva.lc0.k.a(58);
            throw null;
        }
    }

    public p() {
        throw null;
    }

    public p(long j, com.amazon.aps.iva.oc0.c0 c0Var, Set set) {
        a1.c.getClass();
        this.d = f0.d(a1.d, this);
        this.e = com.amazon.aps.iva.kb0.f.b(new a());
        this.a = j;
        this.b = c0Var;
        this.c = set;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final Collection<e0> g() {
        return (List) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final List<y0> getParameters() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.lc0.k j() {
        return this.b.j();
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final com.amazon.aps.iva.oc0.h k() {
        return null;
    }

    @Override // com.amazon.aps.iva.ee0.c1
    public final boolean l() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + com.amazon.aps.iva.lb0.x.B0(this.c, ",", null, null, q.h, 30) + ']');
        return sb.toString();
    }
}
