package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: AssetSelectionController.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<y, y> {
    public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e> h;
    public final /* synthetic */ h i;
    public final /* synthetic */ com.amazon.aps.iva.hm.d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e> aVar, h hVar, com.amazon.aps.iva.hm.d dVar) {
        super(1);
        this.h = aVar;
        this.i = hVar;
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final y invoke(y yVar) {
        com.amazon.aps.iva.hm.d dVar;
        com.amazon.aps.iva.dn.e a;
        boolean z;
        y yVar2 = yVar;
        com.amazon.aps.iva.yb0.j.f(yVar2, "$this$set");
        com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e> aVar = this.h;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(aVar));
        Iterator<com.amazon.aps.iva.hm.e> it = aVar.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = this.j;
            if (!hasNext) {
                break;
            }
            com.amazon.aps.iva.hm.e next = it.next();
            com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.d> aVar2 = next.b;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(aVar2));
            for (com.amazon.aps.iva.hm.d dVar2 : aVar2) {
                boolean a2 = com.amazon.aps.iva.yb0.j.a(dVar.a, dVar2.a);
                String str = dVar2.a;
                com.amazon.aps.iva.yb0.j.f(str, "id");
                arrayList2.add(new com.amazon.aps.iva.hm.d(str, a2, dVar2.c));
            }
            com.amazon.aps.iva.pe0.b p0 = com.amazon.aps.iva.ab.x.p0(arrayList2);
            com.amazon.aps.iva.yb0.j.f(p0, "assets");
            arrayList.add(new com.amazon.aps.iva.hm.e(next.a, p0));
        }
        g.c cVar = new g.c(com.amazon.aps.iva.ab.x.p0(arrayList), null);
        h hVar = this.i;
        AssetType assetType = hVar.c;
        AssetType assetType2 = AssetType.AVATAR;
        com.amazon.aps.iva.dn.e eVar = yVar2.b;
        if (assetType == assetType2) {
            a = com.amazon.aps.iva.dn.e.a(eVar, dVar.a, null, 13);
        } else {
            a = com.amazon.aps.iva.dn.e.a(eVar, null, dVar.a, 11);
        }
        AssetType assetType3 = hVar.c;
        com.amazon.aps.iva.hm.b bVar = hVar.e;
        if (assetType3 != assetType2 ? !com.amazon.aps.iva.yb0.j.a(bVar.d, dVar.a) : !com.amazon.aps.iva.yb0.j.a(bVar.c, dVar.a)) {
            z = true;
        } else {
            z = false;
        }
        return new y(cVar, a, z);
    }
}
