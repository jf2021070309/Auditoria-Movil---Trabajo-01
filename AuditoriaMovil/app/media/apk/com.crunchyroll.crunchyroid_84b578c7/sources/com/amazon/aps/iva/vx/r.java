package com.amazon.aps.iva.vx;

import com.ellation.crunchyroll.feed.HomeFeedScreenView;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oh.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ HomeFeedScreenView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(HomeFeedScreenView homeFeedScreenView) {
        super(1);
        this.h = homeFeedScreenView;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.oh.a aVar) {
        com.amazon.aps.iva.oh.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "it");
        com.ellation.crunchyroll.feed.a aVar3 = this.h.i;
        if (aVar3 != null) {
            aVar3.a().U4(aVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("feedModule");
        throw null;
    }
}
