package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.be0.c;
import java.io.InputStream;
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* loaded from: classes4.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.oc0.f0> {
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.oc0.f0 invoke(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.be0.c cVar2;
        com.amazon.aps.iva.nd0.c cVar3 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar3, "fqName");
        b bVar = this.h;
        com.amazon.aps.iva.nc0.t tVar = (com.amazon.aps.iva.nc0.t) bVar;
        tVar.getClass();
        InputStream c = tVar.b.c(cVar3);
        if (c != null) {
            cVar2 = c.a.a(cVar3, tVar.a, tVar.c, c, false);
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return null;
        }
        l lVar = bVar.d;
        if (lVar != null) {
            cVar2.G0(lVar);
            return cVar2;
        }
        com.amazon.aps.iva.yb0.j.m("components");
        throw null;
    }
}
