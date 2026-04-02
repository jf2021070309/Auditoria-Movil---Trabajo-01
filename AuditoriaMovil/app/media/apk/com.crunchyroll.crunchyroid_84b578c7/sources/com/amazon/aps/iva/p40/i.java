package com.amazon.aps.iva.p40;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.similar.SimilarShowsLayout;
/* compiled from: SimilarShowsLayout.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Panel, Integer, q> {
    public final /* synthetic */ SimilarShowsLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SimilarShowsLayout similarShowsLayout) {
        super(2);
        this.h = similarShowsLayout;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(Panel panel, Integer num) {
        d presenter;
        Panel panel2 = panel;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        presenter = this.h.getPresenter();
        presenter.i(panel2, intValue);
        return q.a;
    }
}
