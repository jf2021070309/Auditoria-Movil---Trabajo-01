package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vx.w;
import java.util.List;
/* compiled from: HomeFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.xx.l>, q> {
    public final /* synthetic */ HomeFeedPresenterImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HomeFeedPresenterImpl homeFeedPresenterImpl) {
        super(1);
        this.h = homeFeedPresenterImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.xx.l> list) {
        HomeFeedPresenterImpl homeFeedPresenterImpl = this.h;
        homeFeedPresenterImpl.k = true;
        homeFeedPresenterImpl.getView().m();
        homeFeedPresenterImpl.getView().reset();
        w view = homeFeedPresenterImpl.getView();
        view.Q5();
        view.zd();
        view.a();
        return q.a;
    }
}
