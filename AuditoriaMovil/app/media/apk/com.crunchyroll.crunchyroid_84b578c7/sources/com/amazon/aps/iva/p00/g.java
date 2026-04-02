package com.amazon.aps.iva.p00;

import com.amazon.aps.iva.r00.k;
import com.amazon.aps.iva.r00.q;
import com.amazon.aps.iva.sv.g2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class g extends l implements p<PlayableAsset, q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset, q qVar) {
        PlayableAsset playableAsset2 = playableAsset;
        q qVar2 = qVar;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "asset");
        com.amazon.aps.iva.yb0.j.f(qVar2, "action");
        com.amazon.aps.iva.r00.i iVar = this.h.f;
        iVar.getClass();
        boolean z = qVar2 instanceof q.d;
        g2 g2Var = iVar.b;
        if (z) {
            g2Var.g(playableAsset2.getId());
        } else if (qVar2 instanceof q.a) {
            g2Var.b1(playableAsset2.getId());
        } else {
            boolean z2 = qVar2 instanceof q.g;
            com.amazon.aps.iva.og.a aVar = iVar.d;
            if (z2) {
                aVar.j2(playableAsset2, new k(iVar, playableAsset2));
            } else if (qVar2 instanceof q.f) {
                aVar.j2(playableAsset2, new com.amazon.aps.iva.r00.l(iVar, playableAsset2));
            } else if (qVar2 instanceof q.e) {
                g2Var.h(playableAsset2.getId());
            } else if (qVar2 instanceof q.b) {
                iVar.getView().Ib(playableAsset2, playableAsset2.getAudioLocale());
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
