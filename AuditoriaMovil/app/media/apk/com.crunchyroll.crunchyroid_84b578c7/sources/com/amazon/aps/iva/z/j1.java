package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.z.a1;
/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class j1 {
    public static final a1.a a(a1 a1Var, m1 m1Var, String str, com.amazon.aps.iva.o0.i iVar, int i) {
        a1.a.C0904a c0904a;
        com.amazon.aps.iva.yb0.j.f(a1Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(m1Var, "typeConverter");
        iVar.s(-1714122528);
        if ((i & 2) != 0) {
            str = "DeferredAnimation";
        }
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(1157296644);
        boolean H = iVar.H(a1Var);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new a1.a(a1Var, m1Var, str);
            iVar.n(t);
        }
        iVar.G();
        a1.a aVar = (a1.a) t;
        com.amazon.aps.iva.o0.x0.a(aVar, new e1(a1Var, aVar), iVar);
        if (a1Var.e() && (c0904a = (a1.a.C0904a) aVar.c.getValue()) != null) {
            com.amazon.aps.iva.xb0.l<? super S, ? extends T> lVar = c0904a.d;
            a1<S> a1Var2 = aVar.d;
            c0904a.b.k(lVar.invoke(a1Var2.c().c()), c0904a.d.invoke(a1Var2.c().a()), (z) c0904a.c.invoke(a1Var2.c()));
        }
        iVar.G();
        return aVar;
    }

    public static final a1.d b(a1 a1Var, Object obj, Object obj2, z zVar, l1 l1Var, String str, com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.yb0.j.f(zVar, "animationSpec");
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        com.amazon.aps.iva.yb0.j.f(str, "label");
        iVar.s(-304821198);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(1157296644);
        boolean H = iVar.H(a1Var);
        Object t = iVar.t();
        Object obj3 = i.a.a;
        if (H || t == obj3) {
            t = new a1.d(a1Var, obj, com.amazon.aps.iva.cq.b.J(l1Var, obj2), l1Var, str);
            iVar.n(t);
        }
        iVar.G();
        a1.d dVar = (a1.d) t;
        if (a1Var.e()) {
            dVar.k(obj, obj2, zVar);
        } else {
            dVar.n(obj2, zVar);
        }
        iVar.s(511388516);
        boolean H2 = iVar.H(a1Var) | iVar.H(dVar);
        Object t2 = iVar.t();
        if (H2 || t2 == obj3) {
            t2 = new g1(a1Var, dVar);
            iVar.n(t2);
        }
        iVar.G();
        com.amazon.aps.iva.o0.x0.a(dVar, (com.amazon.aps.iva.xb0.l) t2, iVar);
        iVar.G();
        return dVar;
    }

    public static final a1 c(Object obj, String str, com.amazon.aps.iva.o0.i iVar, int i) {
        iVar.s(2029166765);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        Object obj2 = i.a.a;
        if (t == obj2) {
            t = new a1(new n0(obj), str);
            iVar.n(t);
        }
        iVar.G();
        a1 a1Var = (a1) t;
        a1Var.a(obj, iVar, (i & 8) | 48 | (i & 14));
        iVar.s(1157296644);
        boolean H = iVar.H(a1Var);
        Object t2 = iVar.t();
        if (H || t2 == obj2) {
            t2 = new i1(a1Var);
            iVar.n(t2);
        }
        iVar.G();
        com.amazon.aps.iva.o0.x0.a(a1Var, (com.amazon.aps.iva.xb0.l) t2, iVar);
        iVar.G();
        return a1Var;
    }
}
