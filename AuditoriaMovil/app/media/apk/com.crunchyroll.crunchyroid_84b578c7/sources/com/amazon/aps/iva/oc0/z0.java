package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.ee0.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: typeParameterUtils.kt */
/* loaded from: classes4.dex */
public final class z0 {

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(k kVar) {
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "it");
            return Boolean.valueOf(kVar2 instanceof com.amazon.aps.iva.oc0.a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, Boolean> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(k kVar) {
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "it");
            return Boolean.valueOf(!(kVar2 instanceof j));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, com.amazon.aps.iva.ne0.h<? extends y0>> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ne0.h<? extends y0> invoke(k kVar) {
            k kVar2 = kVar;
            com.amazon.aps.iva.yb0.j.f(kVar2, "it");
            List<y0> typeParameters = ((com.amazon.aps.iva.oc0.a) kVar2).getTypeParameters();
            com.amazon.aps.iva.yb0.j.e(typeParameters, "it as CallableDescriptor).typeParameters");
            return com.amazon.aps.iva.lb0.x.k0(typeParameters);
        }
    }

    public static final l0 a(com.amazon.aps.iva.ee0.m0 m0Var, i iVar, int i) {
        i iVar2 = null;
        if (iVar == null || com.amazon.aps.iva.ge0.k.f(iVar)) {
            return null;
        }
        int size = iVar.n().size() + i;
        if (!iVar.z()) {
            if (size != m0Var.G0().size()) {
                com.amazon.aps.iva.qd0.i.o(iVar);
            }
            return new l0(iVar, m0Var.G0().subList(i, m0Var.G0().size()), null);
        }
        List<j1> subList = m0Var.G0().subList(i, size);
        k d = iVar.d();
        if (d instanceof i) {
            iVar2 = (i) d;
        }
        return new l0(iVar, subList, a(m0Var, iVar2, size));
    }

    public static final List<y0> b(i iVar) {
        List<y0> list;
        Object obj;
        com.amazon.aps.iva.ee0.c1 h;
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        List<y0> n = iVar.n();
        com.amazon.aps.iva.yb0.j.e(n, "declaredTypeParameters");
        if (!iVar.z() && !(iVar.d() instanceof com.amazon.aps.iva.oc0.a)) {
            return n;
        }
        int i = com.amazon.aps.iva.ud0.b.a;
        com.amazon.aps.iva.ud0.d dVar = com.amazon.aps.iva.ud0.d.h;
        com.amazon.aps.iva.ne0.h U = com.amazon.aps.iva.ne0.s.U(com.amazon.aps.iva.ne0.k.R(iVar, dVar), 1);
        a aVar = a.h;
        com.amazon.aps.iva.yb0.j.f(U, "<this>");
        com.amazon.aps.iva.yb0.j.f(aVar, "predicate");
        List f0 = com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.Y(com.amazon.aps.iva.ne0.s.V(new com.amazon.aps.iva.ne0.t(U, aVar), b.h), c.h));
        Iterator it = com.amazon.aps.iva.ne0.s.U(com.amazon.aps.iva.ne0.k.R(iVar, dVar), 1).iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e eVar = (e) obj;
        if (eVar != null && (h = eVar.h()) != null) {
            list = h.getParameters();
        }
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        if (f0.isEmpty() && list.isEmpty()) {
            List<y0> n2 = iVar.n();
            com.amazon.aps.iva.yb0.j.e(n2, "declaredTypeParameters");
            return n2;
        }
        ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(list, f0);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(L0));
        Iterator it2 = L0.iterator();
        while (it2.hasNext()) {
            y0 y0Var = (y0) it2.next();
            com.amazon.aps.iva.yb0.j.e(y0Var, "it");
            arrayList.add(new com.amazon.aps.iva.oc0.c(y0Var, iVar, n.size()));
        }
        return com.amazon.aps.iva.lb0.x.L0(arrayList, n);
    }
}
