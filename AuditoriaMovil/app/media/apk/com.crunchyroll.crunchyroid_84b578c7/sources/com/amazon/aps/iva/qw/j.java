package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qw.g;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends g.a>, q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Exception, q> i;
    public final /* synthetic */ PlayableAsset j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(h hVar, com.amazon.aps.iva.xb0.l<? super Exception, q> lVar, PlayableAsset playableAsset, com.amazon.aps.iva.xb0.a<q> aVar) {
        super(1);
        this.h = hVar;
        this.i = lVar;
        this.j = playableAsset;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends g.a> list) {
        List<? extends g.a> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        PlayableAsset playableAsset = this.j;
        com.amazon.aps.iva.xb0.a<q> aVar = this.k;
        h hVar = this.h;
        i iVar = new i(hVar, playableAsset, aVar);
        hVar.getClass();
        com.amazon.aps.iva.xb0.l<Exception, q> lVar = this.i;
        com.amazon.aps.iva.yb0.j.f(lVar, "failure");
        if (!list2.isEmpty()) {
            com.amazon.aps.iva.se0.i.d(hVar.f, hVar.g, null, new l(hVar, list2, null), 2).s0(new m(iVar));
        } else {
            lVar.invoke(new n());
        }
        return q.a;
    }
}
