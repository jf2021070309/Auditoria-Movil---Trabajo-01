package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: HomeFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.xx.e, Integer, q> {
    public final /* synthetic */ HomeFeedPresenterImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HomeFeedPresenterImpl homeFeedPresenterImpl) {
        super(2);
        this.h = homeFeedPresenterImpl;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.xx.e eVar, Integer num) {
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(eVar, "<anonymous parameter 0>");
        this.h.getView().scrollToPosition(intValue);
        return q.a;
    }
}
