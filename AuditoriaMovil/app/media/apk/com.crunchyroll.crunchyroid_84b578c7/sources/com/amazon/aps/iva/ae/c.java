package com.amazon.aps.iva.ae;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: LogInScreenController.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.ri.b<d> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> a;

    public c(com.amazon.aps.iva.ui.c cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.ri.b
    public final com.amazon.aps.iva.ri.a a(com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.k5.a aVar;
        iVar.s(222585798);
        e0.b bVar = e0.a;
        iVar.s(1157296644);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar2 = this.a;
        boolean H = iVar.H(bVar2);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new b(bVar2);
            iVar.n(t);
        }
        iVar.G();
        l lVar = (l) t;
        iVar.s(419377738);
        h0 a = com.amazon.aps.iva.l5.a.a(iVar);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(f.class);
            j.f(a2, "clazz");
            j.f(lVar, "initializer");
            arrayList.add(new com.amazon.aps.iva.k5.d(t.o(a2), lVar));
            com.amazon.aps.iva.k5.d[] dVarArr = (com.amazon.aps.iva.k5.d[]) arrayList.toArray(new com.amazon.aps.iva.k5.d[0]);
            com.amazon.aps.iva.k5.b bVar3 = new com.amazon.aps.iva.k5.b((com.amazon.aps.iva.k5.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
            if (a instanceof androidx.lifecycle.e) {
                aVar = ((androidx.lifecycle.e) a).getDefaultViewModelCreationExtras();
            } else {
                aVar = a.C0433a.b;
            }
            f0 a3 = com.amazon.aps.iva.l5.b.a(f.class, a, bVar3, aVar, iVar);
            iVar.G();
            f fVar = (f) a3;
            iVar.G();
            return fVar;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
