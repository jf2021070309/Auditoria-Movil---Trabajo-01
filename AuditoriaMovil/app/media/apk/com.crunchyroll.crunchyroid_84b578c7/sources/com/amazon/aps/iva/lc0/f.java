package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.mc0.c;
import com.amazon.aps.iva.pc0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: functionTypes.kt */
/* loaded from: classes4.dex */
public final class f {
    public static final int a(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.pc0.c h = e0Var.getAnnotations().h(o.a.q);
        if (h == null) {
            return 0;
        }
        com.amazon.aps.iva.sd0.g gVar = (com.amazon.aps.iva.sd0.g) i0.S(o.d, h.a());
        com.amazon.aps.iva.yb0.j.d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((com.amazon.aps.iva.sd0.m) gVar).a).intValue();
    }

    public static final m0 b(k kVar, com.amazon.aps.iva.pc0.h hVar, e0 e0Var, List list, ArrayList arrayList, e0 e0Var2, boolean z) {
        int i;
        l1 l1Var;
        com.amazon.aps.iva.oc0.e k;
        int size = list.size() + arrayList.size();
        int i2 = 0;
        if (e0Var != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(size + i + 1);
        List<e0> list2 = list;
        ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (e0 e0Var3 : list2) {
            arrayList3.add(com.amazon.aps.iva.da0.a.j(e0Var3));
        }
        arrayList2.addAll(arrayList3);
        if (e0Var != null) {
            l1Var = com.amazon.aps.iva.da0.a.j(e0Var);
        } else {
            l1Var = null;
        }
        com.amazon.aps.iva.a60.b.i(arrayList2, l1Var);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.amazon.aps.iva.pc0.h hVar2 = h.a.a;
            if (hasNext) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    arrayList2.add(com.amazon.aps.iva.da0.a.j((e0) next));
                    i3 = i4;
                } else {
                    f1.S();
                    throw null;
                }
            } else {
                arrayList2.add(com.amazon.aps.iva.da0.a.j(e0Var2));
                int size2 = list.size() + arrayList.size();
                if (e0Var != null) {
                    i2 = 1;
                }
                int i5 = size2 + i2;
                if (z) {
                    k = kVar.w(i5);
                } else {
                    com.amazon.aps.iva.nd0.f fVar = o.a;
                    k = kVar.k("Function" + i5);
                }
                com.amazon.aps.iva.yb0.j.e(k, "if (isSuspendFunction) b…tFunction(parameterCount)");
                if (e0Var != null) {
                    com.amazon.aps.iva.nd0.c cVar = o.a.p;
                    if (!hVar.A(cVar)) {
                        ArrayList K0 = x.K0(hVar, new com.amazon.aps.iva.pc0.j(kVar, cVar, a0.b));
                        if (K0.isEmpty()) {
                            hVar = hVar2;
                        } else {
                            hVar = new com.amazon.aps.iva.pc0.i(K0);
                        }
                    }
                }
                if (!list.isEmpty()) {
                    int size3 = list.size();
                    com.amazon.aps.iva.nd0.c cVar2 = o.a.q;
                    if (hVar.A(cVar2)) {
                        hVar2 = hVar;
                    } else {
                        ArrayList K02 = x.K0(hVar, new com.amazon.aps.iva.pc0.j(kVar, cVar2, com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(o.d, new com.amazon.aps.iva.sd0.m(size3)))));
                        if (!K02.isEmpty()) {
                            hVar2 = new com.amazon.aps.iva.pc0.i(K02);
                        }
                    }
                    hVar = hVar2;
                }
                return f0.e(k0.m(hVar), k, arrayList2);
            }
        }
    }

    public static final com.amazon.aps.iva.nd0.f c(e0 e0Var) {
        com.amazon.aps.iva.sd0.x xVar;
        String str;
        com.amazon.aps.iva.pc0.c h = e0Var.getAnnotations().h(o.a.r);
        if (h == null) {
            return null;
        }
        Object Q0 = x.Q0(h.a().values());
        if (Q0 instanceof com.amazon.aps.iva.sd0.x) {
            xVar = (com.amazon.aps.iva.sd0.x) Q0;
        } else {
            xVar = null;
        }
        if (xVar != null && (str = (String) xVar.a) != null) {
            if (!com.amazon.aps.iva.nd0.f.i(str)) {
                str = null;
            }
            if (str != null) {
                return com.amazon.aps.iva.nd0.f.h(str);
            }
        }
        return null;
    }

    public static final List<e0> d(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        h(e0Var);
        int a = a(e0Var);
        if (a == 0) {
            return z.b;
        }
        List<j1> subList = e0Var.G0().subList(0, a);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(subList));
        for (j1 j1Var : subList) {
            e0 type = j1Var.getType();
            com.amazon.aps.iva.yb0.j.e(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final com.amazon.aps.iva.mc0.c e(com.amazon.aps.iva.oc0.h hVar) {
        if (!(hVar instanceof com.amazon.aps.iva.oc0.e) || !k.L(hVar)) {
            return null;
        }
        com.amazon.aps.iva.nd0.d h = com.amazon.aps.iva.ud0.b.h(hVar);
        if (!h.e() || h.d()) {
            return null;
        }
        c.a aVar = com.amazon.aps.iva.mc0.c.Companion;
        String b = h.g().b();
        com.amazon.aps.iva.yb0.j.e(b, "shortName().asString()");
        com.amazon.aps.iva.nd0.c e = h.h().e();
        com.amazon.aps.iva.yb0.j.e(e, "toSafe().parent()");
        aVar.getClass();
        c.a.C0511a a = c.a.a(b, e);
        if (a == null) {
            return null;
        }
        return a.a;
    }

    public static final e0 f(e0 e0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        h(e0Var);
        if (e0Var.getAnnotations().h(o.a.p) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return e0Var.G0().get(a(e0Var)).getType();
    }

    public static final List<j1> g(e0 e0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        h(e0Var);
        List<j1> G0 = e0Var.G0();
        int a = a(e0Var);
        int i = 0;
        if (h(e0Var)) {
            if (e0Var.getAnnotations().h(o.a.p) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 1;
            }
        }
        return G0.subList(i + a, G0.size() - 1);
    }

    public static final boolean h(e0 e0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k == null) {
            return false;
        }
        com.amazon.aps.iva.mc0.c e = e(k);
        if (e != com.amazon.aps.iva.mc0.c.Function && e != com.amazon.aps.iva.mc0.c.SuspendFunction) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public static final boolean i(e0 e0Var) {
        com.amazon.aps.iva.mc0.c cVar;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k != null) {
            cVar = e(k);
        } else {
            cVar = null;
        }
        if (cVar == com.amazon.aps.iva.mc0.c.SuspendFunction) {
            return true;
        }
        return false;
    }
}
