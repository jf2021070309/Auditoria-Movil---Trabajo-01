package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayheadTimeProviderKt;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.f00.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.e00.a h;
    public final /* synthetic */ v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.amazon.aps.iva.e00.a aVar, v vVar) {
        super(1);
        this.h = aVar;
        this.i = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.f00.q qVar) {
        long j;
        boolean z;
        com.amazon.aps.iva.f00.q qVar2 = qVar;
        com.amazon.aps.iva.yb0.j.f(qVar2, "assetUiModel");
        String str = qVar2.b;
        com.amazon.aps.iva.e00.a aVar = this.h;
        PlayableAsset b = aVar.b(str);
        if (b != null) {
            Playhead playhead = aVar.b.get(b.getId());
            com.amazon.aps.iva.i50.b bVar = this.i.e;
            if (playhead != null) {
                j = PlayheadTimeProviderKt.getPlayheadMs(playhead);
            } else {
                j = 0;
            }
            if (playhead != null) {
                z = playhead.isCompleted();
            } else {
                z = false;
            }
            bVar.b(b, j, z, com.amazon.aps.iva.no.a.SHOW_ITEM);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
