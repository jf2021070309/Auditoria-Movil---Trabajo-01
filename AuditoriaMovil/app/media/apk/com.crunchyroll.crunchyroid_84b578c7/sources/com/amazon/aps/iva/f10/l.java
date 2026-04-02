package com.amazon.aps.iva.f10;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nt.m;
import com.amazon.aps.iva.nt.n;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: DownloadsCardOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.n70.d<com.amazon.aps.iva.d10.i> {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.d10.i, q> a;
    public final com.amazon.aps.iva.xb0.l<Panel, q> b;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.d10.i, q> c;

    public l(com.amazon.aps.iva.i10.b bVar, com.amazon.aps.iva.i10.c cVar, com.amazon.aps.iva.i10.d dVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(com.amazon.aps.iva.d10.i iVar) {
        com.amazon.aps.iva.a70.b bVar;
        com.amazon.aps.iva.d10.i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, "data");
        com.amazon.aps.iva.n70.b[] bVarArr = new com.amazon.aps.iva.n70.b[3];
        bVarArr[0] = new com.amazon.aps.iva.n70.b(n.e, new i(this, iVar2));
        bVarArr[1] = new com.amazon.aps.iva.n70.b(m.e, new j(this, iVar2));
        t resourceType = iVar2.a.getResourceType();
        com.amazon.aps.iva.yb0.j.f(resourceType, "<this>");
        int i = com.amazon.aps.iva.nt.h.a[resourceType.ordinal()];
        if (i != 1 && i != 2) {
            bVar = com.amazon.aps.iva.nt.k.e;
        } else {
            bVar = com.amazon.aps.iva.nt.j.e;
        }
        bVarArr[2] = new com.amazon.aps.iva.n70.b(bVar, new k(this, iVar2));
        return f1.K(bVarArr);
    }
}
