package com.amazon.aps.iva.us;

import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.ks.a;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: UpsellFlowEnteredAnalytics.kt */
/* loaded from: classes2.dex */
public final class v implements u {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;

    public v(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ls.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        com.amazon.aps.iva.yb0.j.f(aVar, "analytics");
        com.amazon.aps.iva.yb0.j.f(aVar3, "hasPremiumBenefit");
        this.a = aVar2;
        this.b = aVar;
        this.c = aVar3;
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        l0 l0Var;
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        if (this.c.invoke().booleanValue()) {
            l0Var = l0.UPGRADE;
        } else {
            l0Var = l0.SUBSCRIPTION;
        }
        this.b.e(new com.amazon.aps.iva.es.z(c, new com.amazon.aps.iva.ks.u(l0Var), aVar2 != null ? aVar2.y() : null, com.amazon.aps.iva.js.i.CR_VOD_ACQUISITION, 8));
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar) {
        l0 l0Var;
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, bVar);
        if (this.c.invoke().booleanValue()) {
            l0Var = l0.UPGRADE;
        } else {
            l0Var = l0.SUBSCRIPTION;
        }
        this.b.e(new com.amazon.aps.iva.es.z(c, new com.amazon.aps.iva.ks.u(l0Var), aVar != null ? aVar.y() : null, playableAsset != null ? com.amazon.aps.iva.e.w.d.b(playableAsset) : null, com.amazon.aps.iva.js.i.CR_VOD_ACQUISITION));
    }
}
