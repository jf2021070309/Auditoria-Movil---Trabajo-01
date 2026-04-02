package com.amazon.aps.iva.ad0;

import com.amazon.aps.iva.ad0.j;
import com.amazon.aps.iva.bd0.m;
import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ed0.t;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.i0;
import com.amazon.aps.iva.uc0.b0;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* loaded from: classes4.dex */
public final class f implements i0 {
    public final com.amazon.aps.iva.la0.c a;
    public final com.amazon.aps.iva.de0.a<com.amazon.aps.iva.nd0.c, m> b;

    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<m> {
        public final /* synthetic */ t i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar) {
            super(0);
            this.i = tVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final m invoke() {
            return new m(f.this.a, this.i);
        }
    }

    public f(c cVar) {
        com.amazon.aps.iva.la0.c cVar2 = new com.amazon.aps.iva.la0.c(cVar, j.a.a, new com.amazon.aps.iva.kb0.b());
        this.a = cVar2;
        this.b = cVar2.b().a();
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final void a(com.amazon.aps.iva.nd0.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.a60.b.i(arrayList, d(cVar));
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final boolean b(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        if (((c) this.a.a).b.b(cVar) == null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final List<m> c(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        return f1.L(d(cVar));
    }

    public final m d(com.amazon.aps.iva.nd0.c cVar) {
        b0 b = ((c) this.a.a).b.b(cVar);
        if (b == null) {
            return null;
        }
        return (m) ((c.b) this.b).c(cVar, new a(b));
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final Collection r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.xb0.l lVar) {
        List<com.amazon.aps.iva.nd0.c> list;
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        m d = d(cVar);
        if (d != null) {
            list = d.m.invoke();
        } else {
            list = null;
        }
        if (list == null) {
            list = z.b;
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((c) this.a.a).o;
    }
}
