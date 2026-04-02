package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.se0.j1;
import java.util.Arrays;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class x0 {
    public static final v0 a = new v0();

    public static final void a(Object obj, com.amazon.aps.iva.xb0.l lVar, i iVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "effect");
        iVar.s(-1371986847);
        e0.b bVar = e0.a;
        iVar.s(1157296644);
        boolean H = iVar.H(obj);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            iVar.n(new t0(lVar));
        }
        iVar.G();
        iVar.G();
    }

    public static final void b(Object obj, Object obj2, com.amazon.aps.iva.xb0.l lVar, i iVar) {
        iVar.s(1429097729);
        e0.b bVar = e0.a;
        iVar.s(511388516);
        boolean H = iVar.H(obj) | iVar.H(obj2);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            iVar.n(new t0(lVar));
        }
        iVar.G();
        iVar.G();
    }

    public static final void c(Object obj, com.amazon.aps.iva.xb0.p pVar, i iVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "block");
        iVar.s(1179185413);
        e0.b bVar = e0.a;
        com.amazon.aps.iva.ob0.g k = iVar.k();
        iVar.s(1157296644);
        boolean H = iVar.H(obj);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            iVar.n(new g1(k, pVar));
        }
        iVar.G();
        iVar.G();
    }

    public static final void d(Object obj, Object obj2, com.amazon.aps.iva.xb0.p pVar, i iVar) {
        iVar.s(590241125);
        e0.b bVar = e0.a;
        com.amazon.aps.iva.ob0.g k = iVar.k();
        iVar.s(511388516);
        boolean H = iVar.H(obj) | iVar.H(obj2);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            iVar.n(new g1(k, pVar));
        }
        iVar.G();
        iVar.G();
    }

    public static final void e(Object[] objArr, com.amazon.aps.iva.xb0.p pVar, i iVar) {
        com.amazon.aps.iva.yb0.j.f(objArr, "keys");
        iVar.s(-139560008);
        e0.b bVar = e0.a;
        com.amazon.aps.iva.ob0.g k = iVar.k();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        iVar.s(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= iVar.H(obj);
        }
        Object t = iVar.t();
        if (z || t == i.a.a) {
            iVar.n(new g1(k, pVar));
        }
        iVar.G();
        e0.b bVar2 = e0.a;
        iVar.G();
    }

    public static final void f(com.amazon.aps.iva.xb0.a aVar, i iVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "effect");
        iVar.s(-1288466761);
        e0.b bVar = e0.a;
        iVar.I(aVar);
        iVar.G();
    }

    public static final com.amazon.aps.iva.xe0.d g(i iVar) {
        com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
        com.amazon.aps.iva.yb0.j.f(iVar, "composer");
        j1.b bVar = j1.b.b;
        com.amazon.aps.iva.ob0.g k = iVar.k();
        return com.amazon.aps.iva.e.z.i(k.plus(new com.amazon.aps.iva.se0.m1((com.amazon.aps.iva.se0.j1) k.get(bVar))).plus(hVar));
    }
}
