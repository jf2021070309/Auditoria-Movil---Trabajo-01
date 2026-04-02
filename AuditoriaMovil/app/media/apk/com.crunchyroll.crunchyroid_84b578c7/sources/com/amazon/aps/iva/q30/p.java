package com.amazon.aps.iva.q30;

import com.ellation.crunchyroll.presentation.search.recent.RecentSearchesLayout;
/* compiled from: RecentSearchesView.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
    public final /* synthetic */ RecentSearchesLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(RecentSearchesLayout recentSearchesLayout) {
        super(0);
        this.h = recentSearchesLayout;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final d invoke() {
        q presenter;
        presenter = this.h.getPresenter();
        return new d(presenter);
    }
}
