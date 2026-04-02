package com.amazon.aps.iva.b10;

import com.amazon.aps.iva.yb0.d0;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: SummaryNotificationHandler.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends PlayableAsset>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ d0<List<PlayableAsset>> h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Episode j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d0 d0Var, boolean z, Episode episode, t tVar) {
        super(1);
        this.h = d0Var;
        this.i = z;
        this.j = episode;
        this.k = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends PlayableAsset> list) {
        List<? extends PlayableAsset> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "assets");
        T t = list2;
        if (this.i) {
            t = com.amazon.aps.iva.lb0.x.G0(list2, this.j);
        }
        this.h.b = t;
        this.k.invoke();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
