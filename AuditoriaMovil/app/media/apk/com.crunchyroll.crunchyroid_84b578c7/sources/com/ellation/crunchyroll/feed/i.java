package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
/* compiled from: HomeFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ HomeFeedPresenterImpl h;
    public final /* synthetic */ com.amazon.aps.iva.oh.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(HomeFeedPresenterImpl homeFeedPresenterImpl, com.amazon.aps.iva.oh.a aVar) {
        super(0);
        this.h = homeFeedPresenterImpl;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.g.H8(this.i);
        return q.a;
    }
}
