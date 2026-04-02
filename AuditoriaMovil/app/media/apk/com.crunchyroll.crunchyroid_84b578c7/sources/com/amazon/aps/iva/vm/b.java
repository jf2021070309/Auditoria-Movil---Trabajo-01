package com.amazon.aps.iva.vm;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: SwitchProfileScreenController.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ri.b<c> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> a;
    public final /* synthetic */ com.amazon.aps.iva.dm.a b;

    public b(com.amazon.aps.iva.ui.c cVar, com.amazon.aps.iva.dm.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.ri.b
    public final com.amazon.aps.iva.ri.a a(i iVar) {
        com.amazon.aps.iva.k5.a aVar;
        iVar.s(-1751828604);
        e0.b bVar = e0.a;
        a aVar2 = new a(this.a, this.b);
        iVar.s(419377738);
        h0 a = com.amazon.aps.iva.l5.a.a(iVar);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(e.class);
            j.f(a2, "clazz");
            arrayList.add(new com.amazon.aps.iva.k5.d(t.o(a2), aVar2));
            com.amazon.aps.iva.k5.d[] dVarArr = (com.amazon.aps.iva.k5.d[]) arrayList.toArray(new com.amazon.aps.iva.k5.d[0]);
            com.amazon.aps.iva.k5.b bVar2 = new com.amazon.aps.iva.k5.b((com.amazon.aps.iva.k5.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
            if (a instanceof androidx.lifecycle.e) {
                aVar = ((androidx.lifecycle.e) a).getDefaultViewModelCreationExtras();
            } else {
                aVar = a.C0433a.b;
            }
            f0 a3 = com.amazon.aps.iva.l5.b.a(e.class, a, bVar2, aVar, iVar);
            iVar.G();
            e eVar = (e) a3;
            iVar.G();
            return eVar;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
