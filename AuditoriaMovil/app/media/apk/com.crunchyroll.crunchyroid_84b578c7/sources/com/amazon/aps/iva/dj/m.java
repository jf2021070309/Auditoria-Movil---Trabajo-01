package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: PlayerUpsellFlowEnteredAnalytics.kt */
/* loaded from: classes.dex */
public final class m implements u, l {
    public final d a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final /* synthetic */ v c;

    public m(com.amazon.aps.iva.ml.e eVar, g.k kVar, com.amazon.aps.iva.ds.a aVar) {
        this.a = eVar;
        this.b = kVar;
        com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.EPISODE;
        com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
        this.c = new v(aVar, aVar2, kVar);
    }

    @Override // com.amazon.aps.iva.dj.l
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.ls.a aVar;
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        if (this.a.a().c() == p.MOVIE) {
            aVar = com.amazon.aps.iva.ls.a.VIDEO_PLAYER_MOVIE;
        } else {
            aVar = com.amazon.aps.iva.ls.a.VIDEO_PLAYER_EPISODE;
        }
        onUpsellFlowEntryPointClick(bVar, aVar, (com.amazon.aps.iva.vw.a) null);
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.c.onUpsellFlowEntryPointClick(bVar, aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.c.onUpsellFlowEntryPointClick(bVar, playableAsset, aVar);
    }
}
