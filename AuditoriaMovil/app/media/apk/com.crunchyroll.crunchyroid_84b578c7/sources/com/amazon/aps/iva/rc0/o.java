package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/* compiled from: CompositePackageFragmentProvider.kt */
/* loaded from: classes4.dex */
public final class o implements com.amazon.aps.iva.oc0.i0 {
    public final List<com.amazon.aps.iva.oc0.g0> a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(List<? extends com.amazon.aps.iva.oc0.g0> list, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "debugName");
        this.a = list;
        this.b = str;
        list.size();
        com.amazon.aps.iva.lb0.x.c1(list).size();
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final void a(com.amazon.aps.iva.nd0.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        for (com.amazon.aps.iva.oc0.g0 g0Var : this.a) {
            f1.r(g0Var, cVar, arrayList);
        }
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final boolean b(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        List<com.amazon.aps.iva.oc0.g0> list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (com.amazon.aps.iva.oc0.g0 g0Var : list) {
            if (!f1.F(g0Var, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final List<com.amazon.aps.iva.oc0.f0> c(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (com.amazon.aps.iva.oc0.g0 g0Var : this.a) {
            f1.r(g0Var, cVar, arrayList);
        }
        return com.amazon.aps.iva.lb0.x.X0(arrayList);
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final Collection<com.amazon.aps.iva.nd0.c> r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (com.amazon.aps.iva.oc0.g0 g0Var : this.a) {
            hashSet.addAll(g0Var.r(cVar, lVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
