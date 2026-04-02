package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<PlayableAsset, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(PlayableAsset playableAsset) {
        PlayableAsset playableAsset2 = playableAsset;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "refreshedAsset");
        i iVar = this.h;
        iVar.getView().N();
        com.amazon.aps.iva.xb0.l<? super PlayableAsset, q> lVar = iVar.f;
        if (lVar != null) {
            lVar.invoke(playableAsset2);
        }
        iVar.f = null;
        com.amazon.aps.iva.pg.b bVar = iVar.g;
        com.amazon.aps.iva.pg.b bVar2 = com.amazon.aps.iva.pg.b.SYNC;
        com.amazon.aps.iva.o30.c cVar = iVar.d;
        if (bVar != bVar2) {
            cVar.e();
        }
        cVar.b(iVar);
        return q.a;
    }
}
