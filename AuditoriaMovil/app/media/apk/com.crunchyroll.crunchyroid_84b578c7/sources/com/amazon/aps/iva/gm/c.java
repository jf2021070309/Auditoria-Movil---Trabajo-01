package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.k5.a;
import com.amazon.aps.iva.o0.e0;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: AssetSelectionController.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ri.b<d> {
    public final /* synthetic */ a0 a;
    public final /* synthetic */ AssetType b;
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> c;

    public c(b0 b0Var, AssetType assetType, com.amazon.aps.iva.ui.c cVar) {
        this.a = b0Var;
        this.b = assetType;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.ri.b
    public final com.amazon.aps.iva.ri.a a(com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.k5.a aVar;
        iVar.s(2083780218);
        e0.b bVar = e0.a;
        b bVar2 = new b(this.a, this.b, this.c);
        iVar.s(419377738);
        h0 a = com.amazon.aps.iva.l5.a.a(iVar);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.fc0.d a2 = com.amazon.aps.iva.yb0.e0.a(h.class);
            com.amazon.aps.iva.yb0.j.f(a2, "clazz");
            arrayList.add(new com.amazon.aps.iva.k5.d(com.amazon.aps.iva.ab.t.o(a2), bVar2));
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
