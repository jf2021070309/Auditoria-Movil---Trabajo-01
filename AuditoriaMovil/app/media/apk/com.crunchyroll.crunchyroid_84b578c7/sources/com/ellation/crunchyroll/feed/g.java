package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vx.w;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: HomeFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.xx.l>, q> {
    public final /* synthetic */ HomeFeedPresenterImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HomeFeedPresenterImpl homeFeedPresenterImpl) {
        super(1);
        this.h = homeFeedPresenterImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.xx.l> list) {
        List<? extends com.amazon.aps.iva.xx.l> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, FirebaseAnalytics.Param.ITEMS);
        HomeFeedPresenterImpl homeFeedPresenterImpl = this.h;
        if (homeFeedPresenterImpl.k) {
            homeFeedPresenterImpl.k = false;
            e eVar = new e(homeFeedPresenterImpl);
            w view = homeFeedPresenterImpl.getView();
            view.b();
            view.j7(list2, eVar);
            homeFeedPresenterImpl.getView().Ag();
            homeFeedPresenterImpl.c.c();
        } else {
            w view2 = homeFeedPresenterImpl.getView();
            view2.b();
            view2.j7(list2, f.h);
        }
        return q.a;
    }
}
