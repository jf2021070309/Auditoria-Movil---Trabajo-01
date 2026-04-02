package com.ellation.crunchyroll.feed;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: HomeFeedView.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, q> {
    public final /* synthetic */ HomeFeedScreenView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(HomeFeedScreenView homeFeedScreenView) {
        super(1);
        this.h = homeFeedScreenView;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        a aVar = this.h.i;
        if (aVar != null) {
            HomeFeedPresenter homeFeedPresenter = aVar.n;
            com.amazon.aps.iva.oh.a B = w.B(panel2);
            String title = panel2.getTitle();
            HomeFeedPresenterImpl homeFeedPresenterImpl = (HomeFeedPresenterImpl) homeFeedPresenter;
            homeFeedPresenterImpl.getClass();
            com.amazon.aps.iva.yb0.j.f(title, "title");
            homeFeedPresenterImpl.h.e(title, new i(homeFeedPresenterImpl, B), com.amazon.aps.iva.bh.b.h);
            return q.a;
        }
        com.amazon.aps.iva.yb0.j.m("feedModule");
        throw null;
    }
}
