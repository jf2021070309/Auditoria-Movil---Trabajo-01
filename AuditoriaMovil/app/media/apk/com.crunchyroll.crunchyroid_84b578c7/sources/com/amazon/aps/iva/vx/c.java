package com.amazon.aps.iva.vx;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: FeedSubscriptionButtonAnalytics.kt */
/* loaded from: classes2.dex */
public final class c implements b, com.amazon.aps.iva.us.u {
    public final /* synthetic */ com.amazon.aps.iva.us.v a;

    public c(com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.HOME;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
        this.a = new com.amazon.aps.iva.us.v(cVar, aVar2, aVar);
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.a.onUpsellFlowEntryPointClick(bVar, aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.a.onUpsellFlowEntryPointClick(bVar, playableAsset, aVar);
    }
}
