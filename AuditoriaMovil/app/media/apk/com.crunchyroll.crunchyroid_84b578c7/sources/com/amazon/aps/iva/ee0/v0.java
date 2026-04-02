package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.w0;
import com.amazon.aps.iva.ee0.x0;
import com.amazon.aps.iva.xd0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: TypeAliasExpander.kt */
/* loaded from: classes4.dex */
public final class v0 {
    public final x0 a = x0.a.a;
    public final boolean b = false;

    public static a1 b(e0 e0Var, a1 a1Var) {
        k a;
        if (com.amazon.aps.iva.e4.l1.D(e0Var)) {
            return e0Var.H0();
        }
        a1 H0 = e0Var.H0();
        a1Var.getClass();
        com.amazon.aps.iva.yb0.j.f(H0, "other");
        if (!a1Var.isEmpty() || !H0.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Collection<Integer> values = a1.c.a.values();
            com.amazon.aps.iva.yb0.j.e(values, "idPerType.values");
            for (Integer num : values) {
                int intValue = num.intValue();
                y0 y0Var = (y0) a1Var.b.get(intValue);
                y0 y0Var2 = (y0) H0.b.get(intValue);
                if (y0Var == null) {
                    if (y0Var2 != null) {
                        a = y0Var2.a(y0Var);
                    } else {
                        a = null;
                    }
                } else {
                    a = y0Var.a(y0Var2);
                }
                com.amazon.aps.iva.a60.b.i(arrayList, a);
            }
            return a1.a.c(arrayList);
        }
        return a1Var;
    }

    public final void a(com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.pc0.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator<com.amazon.aps.iva.pc0.c> it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        for (com.amazon.aps.iva.pc0.c cVar : hVar2) {
            if (hashSet.contains(cVar.c())) {
                this.a.a(cVar);
            }
        }
    }

    public final m0 c(w0 w0Var, a1 a1Var, boolean z, int i, boolean z2) {
        v1 v1Var = v1.INVARIANT;
        com.amazon.aps.iva.oc0.x0 x0Var = w0Var.b;
        j1 d = d(new l1(x0Var.o0(), v1Var), w0Var, null, i);
        e0 type = d.getType();
        com.amazon.aps.iva.yb0.j.e(type, "expandedProjection.type");
        m0 a = o1.a(type);
        if (com.amazon.aps.iva.e4.l1.D(a)) {
            return a;
        }
        d.c();
        a(a.getAnnotations(), l.a(a1Var));
        if (!com.amazon.aps.iva.e4.l1.D(a)) {
            a = o1.d(a, null, b(a, a1Var), 1);
        }
        m0 l = s1.l(a, z);
        com.amazon.aps.iva.yb0.j.e(l, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z2) {
            c1 h = x0Var.h();
            com.amazon.aps.iva.yb0.j.e(h, "descriptor.typeConstructor");
            return q0.d(l, f0.h(w0Var.c, i.b.b, a1Var, h, z));
        }
        return l;
    }

    public final j1 d(j1 j1Var, w0 w0Var, com.amazon.aps.iva.oc0.y0 y0Var, int i) {
        v1 v1Var;
        e0 d;
        v1 v1Var2;
        v1 v1Var3;
        com.amazon.aps.iva.oc0.x0 x0Var = w0Var.b;
        if (i <= 100) {
            if (j1Var.b()) {
                com.amazon.aps.iva.yb0.j.c(y0Var);
                return s1.m(y0Var);
            }
            e0 type = j1Var.getType();
            com.amazon.aps.iva.yb0.j.e(type, "underlyingProjection.type");
            c1 I0 = type.I0();
            com.amazon.aps.iva.yb0.j.f(I0, "constructor");
            com.amazon.aps.iva.oc0.h k = I0.k();
            j1 j1Var2 = k instanceof com.amazon.aps.iva.oc0.y0 ? w0Var.d.get(k) : null;
            x0 x0Var2 = this.a;
            if (j1Var2 == null) {
                u1 L0 = j1Var.getType().L0();
                if (!w.a(L0)) {
                    m0 a = o1.a(L0);
                    if (!com.amazon.aps.iva.e4.l1.D(a)) {
                        com.amazon.aps.iva.ie0.b bVar = com.amazon.aps.iva.ie0.b.h;
                        com.amazon.aps.iva.yb0.j.f(bVar, "predicate");
                        if (s1.c(a, bVar)) {
                            c1 I02 = a.I0();
                            com.amazon.aps.iva.oc0.h k2 = I02.k();
                            I02.getParameters().size();
                            a.G0().size();
                            if (!(k2 instanceof com.amazon.aps.iva.oc0.y0)) {
                                int i2 = 0;
                                if (k2 instanceof com.amazon.aps.iva.oc0.x0) {
                                    com.amazon.aps.iva.oc0.x0 x0Var3 = (com.amazon.aps.iva.oc0.x0) k2;
                                    if (w0Var.a(x0Var3)) {
                                        x0Var2.d(x0Var3);
                                        v1 v1Var4 = v1.INVARIANT;
                                        com.amazon.aps.iva.ge0.j jVar = com.amazon.aps.iva.ge0.j.RECURSIVE_TYPE_ALIAS;
                                        String str = x0Var3.getName().b;
                                        com.amazon.aps.iva.yb0.j.e(str, "typeDescriptor.name.toString()");
                                        return new l1(com.amazon.aps.iva.ge0.k.c(jVar, str), v1Var4);
                                    }
                                    List<j1> G0 = a.G0();
                                    ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(G0));
                                    for (Object obj : G0) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            f1.S();
                                            throw null;
                                        }
                                        arrayList.add(d((j1) obj, w0Var, I02.getParameters().get(i2), i + 1));
                                        i2 = i3;
                                    }
                                    m0 c = c(w0.a.a(w0Var, x0Var3, arrayList), a.H0(), a.J0(), i + 1, false);
                                    m0 e = e(a, w0Var, i);
                                    if (!w.a(c)) {
                                        c = q0.d(c, e);
                                    }
                                    return new l1(c, j1Var.c());
                                }
                                m0 e2 = e(a, w0Var, i);
                                q1 d2 = q1.d(e2);
                                for (Object obj2 : e2.G0()) {
                                    int i4 = i2 + 1;
                                    if (i2 >= 0) {
                                        j1 j1Var3 = (j1) obj2;
                                        if (!j1Var3.b()) {
                                            e0 type2 = j1Var3.getType();
                                            com.amazon.aps.iva.yb0.j.e(type2, "substitutedArgument.type");
                                            com.amazon.aps.iva.ie0.a aVar = com.amazon.aps.iva.ie0.a.h;
                                            com.amazon.aps.iva.yb0.j.f(aVar, "predicate");
                                            if (!s1.c(type2, aVar)) {
                                                j1 j1Var4 = a.G0().get(i2);
                                                com.amazon.aps.iva.oc0.y0 y0Var2 = a.I0().getParameters().get(i2);
                                                if (this.b) {
                                                    e0 type3 = j1Var4.getType();
                                                    com.amazon.aps.iva.yb0.j.e(type3, "unsubstitutedArgument.type");
                                                    e0 type4 = j1Var3.getType();
                                                    com.amazon.aps.iva.yb0.j.e(type4, "substitutedArgument.type");
                                                    com.amazon.aps.iva.yb0.j.e(y0Var2, "typeParameter");
                                                    x0Var2.c(d2, type3, type4, y0Var2);
                                                }
                                            }
                                        }
                                        i2 = i4;
                                    } else {
                                        f1.S();
                                        throw null;
                                    }
                                }
                                return new l1(e2, j1Var.c());
                            }
                        }
                    }
                }
                return j1Var;
            } else if (j1Var2.b()) {
                com.amazon.aps.iva.yb0.j.c(y0Var);
                return s1.m(y0Var);
            } else {
                u1 L02 = j1Var2.getType().L0();
                v1 c2 = j1Var2.c();
                com.amazon.aps.iva.yb0.j.e(c2, "argument.projectionKind");
                v1 c3 = j1Var.c();
                com.amazon.aps.iva.yb0.j.e(c3, "underlyingProjection.projectionKind");
                if (c3 != c2 && c3 != (v1Var3 = v1.INVARIANT)) {
                    if (c2 == v1Var3) {
                        c2 = c3;
                    } else {
                        x0Var2.b(x0Var, L02);
                    }
                }
                if (y0Var == null || (v1Var = y0Var.i()) == null) {
                    v1Var = v1.INVARIANT;
                }
                com.amazon.aps.iva.yb0.j.e(v1Var, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
                if (v1Var != c2 && v1Var != (v1Var2 = v1.INVARIANT)) {
                    if (c2 == v1Var2) {
                        c2 = v1Var2;
                    } else {
                        x0Var2.b(x0Var, L02);
                    }
                }
                a(type.getAnnotations(), L02.getAnnotations());
                if (L02 instanceof v) {
                    v vVar = (v) L02;
                    a1 b = b(vVar, type.H0());
                    com.amazon.aps.iva.yb0.j.f(b, "newAttributes");
                    d = new v(com.amazon.aps.iva.da0.a.n(vVar.d), b);
                } else {
                    m0 l = s1.l(o1.a(L02), type.J0());
                    com.amazon.aps.iva.yb0.j.e(l, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
                    a1 H0 = type.H0();
                    boolean D = com.amazon.aps.iva.e4.l1.D(l);
                    d = l;
                    if (!D) {
                        d = o1.d(l, null, b(l, H0), 1);
                    }
                }
                return new l1(d, c2);
            }
        }
        throw new AssertionError("Too deep recursion while expanding type alias " + x0Var.getName());
    }

    public final m0 e(m0 m0Var, w0 w0Var, int i) {
        c1 I0 = m0Var.I0();
        List<j1> G0 = m0Var.G0();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(G0));
        int i2 = 0;
        for (Object obj : G0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                j1 j1Var = (j1) obj;
                j1 d = d(j1Var, w0Var, I0.getParameters().get(i2), i + 1);
                if (!d.b()) {
                    d = new l1(s1.k(d.getType(), j1Var.getType().J0()), d.c());
                }
                arrayList.add(d);
                i2 = i3;
            } else {
                f1.S();
                throw null;
            }
        }
        return o1.d(m0Var, arrayList, null, 2);
    }
}
