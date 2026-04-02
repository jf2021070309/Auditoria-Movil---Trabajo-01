package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
/* compiled from: HomeFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ HomeFeedPresenterImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HomeFeedPresenterImpl homeFeedPresenterImpl) {
        super(0);
        this.h = homeFeedPresenterImpl;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.notify(d.h);
        return q.a;
    }
}
