package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.be0.c;
import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.f1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes4.dex */
public abstract class b implements com.amazon.aps.iva.oc0.i0 {
    public final com.amazon.aps.iva.de0.l a;
    public final v b;
    public final com.amazon.aps.iva.oc0.c0 c;
    public l d;
    public final com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.oc0.f0> e;

    public b(com.amazon.aps.iva.de0.c cVar, com.amazon.aps.iva.tc0.f fVar, com.amazon.aps.iva.rc0.g0 g0Var) {
        this.a = cVar;
        this.b = fVar;
        this.c = g0Var;
        this.e = cVar.h(new a(this));
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final void a(com.amazon.aps.iva.nd0.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.a60.b.i(arrayList, this.e.invoke(cVar));
    }

    @Override // com.amazon.aps.iva.oc0.i0
    public final boolean b(com.amazon.aps.iva.nd0.c cVar) {
        boolean z;
        com.amazon.aps.iva.pc0.a aVar;
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.de0.h<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.oc0.f0> hVar = this.e;
        Object obj = ((c.j) hVar).c.get(cVar);
        if (obj != null && obj != c.l.COMPUTING) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar = (com.amazon.aps.iva.oc0.f0) hVar.invoke(cVar);
        } else {
            com.amazon.aps.iva.nc0.t tVar = (com.amazon.aps.iva.nc0.t) this;
            InputStream c = tVar.b.c(cVar);
            if (c != null) {
                aVar = c.a.a(cVar, tVar.a, tVar.c, c, false);
            } else {
                aVar = null;
            }
        }
        if (aVar == null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final List<com.amazon.aps.iva.oc0.f0> c(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        return f1.L(this.e.invoke(cVar));
    }

    @Override // com.amazon.aps.iva.oc0.g0
    public final Collection<com.amazon.aps.iva.nd0.c> r(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return com.amazon.aps.iva.lb0.b0.b;
    }
}
