package com.amazon.aps.iva.zd;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.l;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: EnterPasswordScreenController.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.ri.b<e> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> a;

    public d(com.amazon.aps.iva.ui.c cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.ri.b
    public final com.amazon.aps.iva.ri.a a(com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.k5.a aVar;
        iVar.s(-2032892346);
        e0.b bVar = e0.a;
        iVar.s(1157296644);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar2 = this.a;
        boolean H = iVar.H(bVar2);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new c(bVar2);
            iVar.n(t);
        }
        iVar.G();
        l lVar = (l) t;
        iVar.s(419377738);
        h0 a = com.amazon.aps.iva.l5.a.a(iVar);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(h.class);
            com.amazon.aps.iva.yb0.j.f(a2, "clazz");
            com.amazon.aps.iva.yb0.j.f(lVar, "initializer");
            arrayList.add(new com.amazon.aps.iva.k5.d(t.o(a2), lVar));
            com.amazon.aps.iva.k5.d[] dVarArr = (com.amazon.aps.iva.k5.d[]) arrayList.toArray(new com.amazon.aps.iva.k5.d[0]);
            com.amazon.aps.iva.k5.b bVar3 = new com.amazon.aps.iva.k5.b((com.amazon.aps.iva.k5.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
            if (a instanceof androidx.lifecycle.e) {
                aVar = ((androidx.lifecycle.e) a).getDefaultViewModelCreationExtras();
            } else {
                aVar = a.C0433a.b;
            }
            f0 a3 = com.amazon.aps.iva.l5.b.a(h.class, a, bVar3, aVar, iVar);
            iVar.G();
            h hVar = (h) a3;
            iVar.G();
            return hVar;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
