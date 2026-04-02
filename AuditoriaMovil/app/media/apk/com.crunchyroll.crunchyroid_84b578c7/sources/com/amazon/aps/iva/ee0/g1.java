package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.de0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes4.dex */
public final class g1 {
    public final com.amazon.aps.iva.e.w a;
    public final f1 b;
    public final com.amazon.aps.iva.kb0.m c;
    public final c.k d;

    /* compiled from: TypeParameterUpperBoundEraser.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.oc0.y0 a;
        public final x b;

        public a(com.amazon.aps.iva.oc0.y0 y0Var, x xVar) {
            com.amazon.aps.iva.yb0.j.f(y0Var, "typeParameter");
            com.amazon.aps.iva.yb0.j.f(xVar, "typeAttr");
            this.a = y0Var;
            this.b = xVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!com.amazon.aps.iva.yb0.j.a(aVar.a, this.a) || !com.amazon.aps.iva.yb0.j.a(aVar.b, this.b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode();
            return this.b.hashCode() + (hashCode * 31) + hashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
        }
    }

    public g1(com.amazon.aps.iva.cd0.f fVar) {
        f1 f1Var = new f1();
        this.a = fVar;
        this.b = f1Var;
        com.amazon.aps.iva.de0.c cVar = new com.amazon.aps.iva.de0.c("Type parameter upper bound erasure results");
        this.c = com.amazon.aps.iva.kb0.f.b(new h1(this));
        this.d = cVar.f(new i1(this));
    }

    public final u1 a(x xVar) {
        u1 A;
        m0 a2 = xVar.a();
        if (a2 == null || (A = com.amazon.aps.iva.da0.a.A(a2)) == null) {
            return (com.amazon.aps.iva.ge0.h) this.c.getValue();
        }
        return A;
    }

    public final e0 b(com.amazon.aps.iva.oc0.y0 y0Var, x xVar) {
        com.amazon.aps.iva.yb0.j.f(y0Var, "typeParameter");
        com.amazon.aps.iva.yb0.j.f(xVar, "typeAttr");
        Object invoke = this.d.invoke(new a(y0Var, xVar));
        com.amazon.aps.iva.yb0.j.e(invoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return (e0) invoke;
    }

    public final com.amazon.aps.iva.mb0.f c(q1 q1Var, List list, x xVar) {
        boolean z;
        u1 u1Var;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        com.amazon.aps.iva.mb0.f fVar = new com.amazon.aps.iva.mb0.f();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            e0 e0Var = (e0) it2.next();
            com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
            boolean z5 = k instanceof com.amazon.aps.iva.oc0.e;
            f1 f1Var = this.b;
            if (z5) {
                Set<com.amazon.aps.iva.oc0.y0> c = xVar.c();
                f1Var.getClass();
                u1 L0 = e0Var.L0();
                if (L0 instanceof y) {
                    y yVar = (y) L0;
                    m0 m0Var = yVar.c;
                    if (!m0Var.I0().getParameters().isEmpty() && m0Var.I0().k() != null) {
                        List<com.amazon.aps.iva.oc0.y0> parameters = m0Var.I0().getParameters();
                        com.amazon.aps.iva.yb0.j.e(parameters, "constructor.parameters");
                        List<com.amazon.aps.iva.oc0.y0> list2 = parameters;
                        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            com.amazon.aps.iva.oc0.y0 y0Var = (com.amazon.aps.iva.oc0.y0) it3.next();
                            j1 j1Var = (j1) com.amazon.aps.iva.lb0.x.w0(y0Var.getIndex(), e0Var.G0());
                            if (c != null && c.contains(y0Var)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (j1Var != null && !z4) {
                                m1 g = q1Var.g();
                                it = it3;
                                e0 type = j1Var.getType();
                                com.amazon.aps.iva.yb0.j.e(type, "argument.type");
                                if (g.d(type) != null) {
                                    arrayList.add(j1Var);
                                    it3 = it;
                                }
                            } else {
                                it = it3;
                            }
                            j1Var = new s0(y0Var);
                            arrayList.add(j1Var);
                            it3 = it;
                        }
                        m0Var = o1.d(m0Var, arrayList, null, 2);
                    }
                    m0 m0Var2 = yVar.d;
                    if (!m0Var2.I0().getParameters().isEmpty() && m0Var2.I0().k() != null) {
                        List<com.amazon.aps.iva.oc0.y0> parameters2 = m0Var2.I0().getParameters();
                        com.amazon.aps.iva.yb0.j.e(parameters2, "constructor.parameters");
                        List<com.amazon.aps.iva.oc0.y0> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
                        for (com.amazon.aps.iva.oc0.y0 y0Var2 : list3) {
                            j1 j1Var2 = (j1) com.amazon.aps.iva.lb0.x.w0(y0Var2.getIndex(), e0Var.G0());
                            if (c != null && c.contains(y0Var2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (j1Var2 != null && !z3) {
                                m1 g2 = q1Var.g();
                                e0 type2 = j1Var2.getType();
                                com.amazon.aps.iva.yb0.j.e(type2, "argument.type");
                                if (g2.d(type2) != null) {
                                    arrayList2.add(j1Var2);
                                }
                            }
                            j1Var2 = new s0(y0Var2);
                            arrayList2.add(j1Var2);
                        }
                        m0Var2 = o1.d(m0Var2, arrayList2, null, 2);
                    }
                    u1Var = f0.c(m0Var, m0Var2);
                } else if (L0 instanceof m0) {
                    m0 m0Var3 = (m0) L0;
                    if (!m0Var3.I0().getParameters().isEmpty() && m0Var3.I0().k() != null) {
                        List<com.amazon.aps.iva.oc0.y0> parameters3 = m0Var3.I0().getParameters();
                        com.amazon.aps.iva.yb0.j.e(parameters3, "constructor.parameters");
                        List<com.amazon.aps.iva.oc0.y0> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list4));
                        for (com.amazon.aps.iva.oc0.y0 y0Var3 : list4) {
                            j1 j1Var3 = (j1) com.amazon.aps.iva.lb0.x.w0(y0Var3.getIndex(), e0Var.G0());
                            if (c != null && c.contains(y0Var3)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (j1Var3 != null && !z2) {
                                m1 g3 = q1Var.g();
                                e0 type3 = j1Var3.getType();
                                com.amazon.aps.iva.yb0.j.e(type3, "argument.type");
                                if (g3.d(type3) != null) {
                                    arrayList3.add(j1Var3);
                                }
                            }
                            j1Var3 = new s0(y0Var3);
                            arrayList3.add(j1Var3);
                        }
                        u1Var = o1.d(m0Var3, arrayList3, null, 2);
                    } else {
                        u1Var = m0Var3;
                    }
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
                e0 i = q1Var.i(com.amazon.aps.iva.dg.b.w(u1Var, L0), v1.OUT_VARIANCE);
                com.amazon.aps.iva.yb0.j.e(i, "substitutor.safeSubstitu…s, Variance.OUT_VARIANCE)");
                fVar.add(i);
            } else if (k instanceof com.amazon.aps.iva.oc0.y0) {
                Set<com.amazon.aps.iva.oc0.y0> c2 = xVar.c();
                if (c2 != null && c2.contains(k)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fVar.add(a(xVar));
                } else {
                    List<e0> upperBounds = ((com.amazon.aps.iva.oc0.y0) k).getUpperBounds();
                    com.amazon.aps.iva.yb0.j.e(upperBounds, "declaration.upperBounds");
                    fVar.addAll(c(q1Var, upperBounds, xVar));
                }
            }
            f1Var.getClass();
        }
        com.amazon.aps.iva.mb0.b<E, ?> bVar = fVar.b;
        bVar.c();
        bVar.m = true;
        if (bVar.i <= 0) {
            com.amazon.aps.iva.yb0.j.d(com.amazon.aps.iva.mb0.b.n, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        if (bVar.i <= 0) {
            return com.amazon.aps.iva.mb0.f.c;
        }
        return fVar;
    }
}
