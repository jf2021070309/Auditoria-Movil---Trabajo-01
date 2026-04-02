package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vx.w;
/* compiled from: HomeFeedPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ HomeFeedPresenterImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HomeFeedPresenterImpl homeFeedPresenterImpl) {
        super(1);
        this.h = homeFeedPresenterImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        HomeFeedPresenterImpl homeFeedPresenterImpl = this.h;
        homeFeedPresenterImpl.c.f(th2);
        w view = homeFeedPresenterImpl.getView();
        view.b();
        view.c();
        return q.a;
    }
}
