package com.amazon.aps.iva.oc0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PackageFragmentProviderImpl.kt */
/* loaded from: classes4.dex */
public final class h0 implements i0 {
    public final Collection<f0> a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f0, com.amazon.aps.iva.nd0.c> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nd0.c invoke(f0 f0Var) {
            f0 f0Var2 = f0Var;
            com.amazon.aps.iva.yb0.j.f(f0Var2, "it");
            return f0Var2.c();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, Boolean> {
        public final /* synthetic */ com.amazon.aps.iva.nd0.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.nd0.c cVar) {
            super(1);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(com.amazon.aps.iva.nd0.c cVar) {
            boolean z;
            com.amazon.aps.iva.nd0.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "it");
            if (!cVar2.d() && com.amazon.aps.iva.yb0.j.a(cVar2.e(), this.h)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public h0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final void a(com.amazon.aps.iva.nd0.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        for (Object obj : this.a) {
            if (com.amazon.aps.iva.yb0.j.a(((f0) obj).c(), cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final boolean b(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        Collection<f0> collection = this.a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (f0 f0Var : collection) {
            if (com.amazon.aps.iva.yb0.j.a(f0Var.c(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final List<f0> c(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (com.amazon.aps.iva.yb0.j.a(((f0) obj).c(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final Collection<com.amazon.aps.iva.nd0.c> r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.s.V(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(this.a), a.h), new b(cVar)));
    }
}
