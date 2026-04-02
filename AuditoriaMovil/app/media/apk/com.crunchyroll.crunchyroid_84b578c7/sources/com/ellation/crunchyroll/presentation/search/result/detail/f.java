package com.ellation.crunchyroll.presentation.search.result.detail;

import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultDetailActivity.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<Panel, q> {
    public final /* synthetic */ SearchResultDetailActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SearchResultDetailActivity searchResultDetailActivity) {
        super(1);
        this.h = searchResultDetailActivity;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        j.f(panel2, "panel");
        SearchResultDetailActivity searchResultDetailActivity = this.h;
        j.f(searchResultDetailActivity, "context");
        b.a.a(new com.amazon.aps.iva.i50.c(searchResultDetailActivity, new com.amazon.aps.iva.i50.a(searchResultDetailActivity, true)), panel2, com.amazon.aps.iva.no.a.OVERFLOW_WATCH_NOW, null, 12);
        return q.a;
    }
}
