package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: WelcomeScreenController.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.ri.b<e> {
    public final /* synthetic */ com.amazon.aps.iva.dm.a a;
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> b;

    public d(com.amazon.aps.iva.ui.c cVar, com.amazon.aps.iva.dm.a aVar) {
        this.a = aVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.ri.b
    public final com.amazon.aps.iva.ri.a a(com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.k5.a aVar;
        iVar.s(-287028300);
        e0.b bVar = e0.a;
        c cVar = new c(this.b, this.a);
        iVar.s(419377738);
        h0 a = com.amazon.aps.iva.l5.a.a(iVar);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(i.class);
            j.f(a2, "clazz");
            arrayList.add(new com.amazon.aps.iva.k5.d(t.o(a2), cVar));
            com.amazon.aps.iva.k5.d[] dVarArr = (com.amazon.aps.iva.k5.d[]) arrayList.toArray(new com.amazon.aps.iva.k5.d[0]);
            com.amazon.aps.iva.k5.b bVar2 = new com.amazon.aps.iva.k5.b((com.amazon.aps.iva.k5.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
            if (a instanceof androidx.lifecycle.e) {
                aVar = ((androidx.lifecycle.e) a).getDefaultViewModelCreationExtras();
            } else {
                aVar = a.C0433a.b;
            }
            f0 a3 = com.amazon.aps.iva.l5.b.a(i.class, a, bVar2, aVar, iVar);
            iVar.G();
            i iVar2 = (i) a3;
            iVar.G();
            return iVar2;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
