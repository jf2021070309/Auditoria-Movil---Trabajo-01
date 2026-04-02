package com.ellation.crunchyroll.presentation.search.result.detail;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailActivity;
/* compiled from: SearchResultDetailActivity.kt */
/* loaded from: classes2.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<Panel, q> {
    public final /* synthetic */ SearchResultDetailActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SearchResultDetailActivity searchResultDetailActivity) {
        super(1);
        this.h = searchResultDetailActivity;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        j.f(panel2, "panel");
        SearchResultDetailActivity.a aVar = SearchResultDetailActivity.D;
        this.h.ni().n(w.B(panel2), panel2.getTitle());
        return q.a;
    }
}
