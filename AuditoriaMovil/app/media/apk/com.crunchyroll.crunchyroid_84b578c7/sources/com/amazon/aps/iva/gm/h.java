package com.amazon.aps.iva.gm;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.gm.z;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import com.ellation.crunchyroll.api.etp.assets.model.AvatarAsset;
import com.ellation.crunchyroll.api.etp.assets.model.AvatarCollection;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AssetSelectionController.kt */
/* loaded from: classes2.dex */
public final class h extends f0 implements d {
    public final a0 b;
    public final AssetType c;
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> d;
    public final com.amazon.aps.iva.hm.b e;
    public final v0 f;
    public com.amazon.aps.iva.hm.d g;

    public h(a0 a0Var, AssetType assetType, com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "assetsInteractor");
        com.amazon.aps.iva.yb0.j.f(assetType, "assetType");
        com.amazon.aps.iva.yb0.j.f(bVar, "navigator");
        this.b = a0Var;
        this.c = assetType;
        this.d = bVar;
        com.amazon.aps.iva.hm.b bVar2 = (com.amazon.aps.iva.hm.b) bVar.T5();
        this.e = bVar2;
        v0 e = com.amazon.aps.iva.ab.x.e(new y(new g.b(null), new com.amazon.aps.iva.dn.e(bVar2.b, bVar2.c, bVar2.d, com.amazon.aps.iva.dn.d.VIEW_ONLY), false));
        this.f = e;
        com.amazon.aps.iva.gr.n.A(e, e.h);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new f(this, null), 3);
    }

    public static final com.amazon.aps.iva.pe0.b N8(h hVar, List list, String str) {
        hVar.getClass();
        List<AvatarCollection> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (AvatarCollection avatarCollection : list2) {
            String title = avatarCollection.getTitle();
            List<AvatarAsset> assets = avatarCollection.getAssets();
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(assets));
            for (AvatarAsset avatarAsset : assets) {
                arrayList2.add(new com.amazon.aps.iva.hm.d(avatarAsset.getId(), com.amazon.aps.iva.yb0.j.a(str, avatarAsset.getId()), false));
            }
            arrayList.add(new com.amazon.aps.iva.hm.e(title, com.amazon.aps.iva.ab.x.p0(arrayList2)));
        }
        return com.amazon.aps.iva.ab.x.p0(arrayList);
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(z zVar) {
        com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e> aVar;
        z zVar2 = zVar;
        com.amazon.aps.iva.yb0.j.f(zVar2, "event");
        boolean a = com.amazon.aps.iva.yb0.j.a(zVar2, z.c.a);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar = this.d;
        if (a) {
            com.amazon.aps.iva.hm.d dVar = this.g;
            if (dVar != null) {
                bVar.w7(new com.amazon.aps.iva.hm.c(dVar.a, this.c));
                return;
            }
            return;
        }
        boolean a2 = com.amazon.aps.iva.yb0.j.a(zVar2, z.d.a);
        v0 v0Var = this.f;
        if (a2) {
            com.amazon.aps.iva.gr.n.A(v0Var, e.h);
            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new f(this, null), 3);
        } else if (zVar2 instanceof z.a) {
            z.a aVar2 = (z.a) zVar2;
            g.c<com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e>> a3 = ((y) v0Var.getValue()).a.a();
            if (a3 != null && (aVar = a3.a) != null) {
                com.amazon.aps.iva.hm.d dVar2 = aVar2.a;
                com.amazon.aps.iva.gr.n.A(v0Var, new g(aVar, this, dVar2));
                this.g = dVar2;
            }
        } else if (com.amazon.aps.iva.yb0.j.a(zVar2, z.b.a)) {
            bVar.w7(null);
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<y> getState() {
        return this.f;
    }
}
