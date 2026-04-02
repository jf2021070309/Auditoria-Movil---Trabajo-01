package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, PlayableAsset playableAsset, com.amazon.aps.iva.xb0.a<q> aVar) {
        super(0);
        this.h = hVar;
        this.i = playableAsset;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.getClass();
        PlayableAsset playableAsset = this.i;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.xb0.a<q> aVar = this.j;
        com.amazon.aps.iva.yb0.j.f(aVar, FirebaseAnalytics.Param.SUCCESS);
        com.amazon.aps.iva.mf0.a.a.f(com.amazon.aps.iva.c.b.a("Saved ", playableAsset.getId(), " for ", playableAsset.getTitle()), new Object[0]);
        aVar.invoke();
        return q.a;
    }
}
