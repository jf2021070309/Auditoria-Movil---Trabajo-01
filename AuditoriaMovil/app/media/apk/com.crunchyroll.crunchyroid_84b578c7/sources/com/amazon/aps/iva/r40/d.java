package com.amazon.aps.iva.r40;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.showpage.summary.ShowSummaryLayout;
/* compiled from: ShowSummaryPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<f> implements c {
    public d(ShowSummaryLayout showSummaryLayout) {
        super(showSummaryLayout, new j[0]);
    }

    @Override // com.amazon.aps.iva.r40.c
    public final void a2(a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "showSummary");
        getView().setTitle(aVar.a);
        String str = aVar.b;
        if (m.b0(str)) {
            getView().g();
        } else {
            getView().setDescription(str);
            getView().r();
        }
        getView().setCtaButtonTitle(aVar.d);
        getView().V1();
    }
}
