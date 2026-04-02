package com.amazon.aps.iva.x30;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.search.result.summary.c;
/* compiled from: SearchResultSummaryFragment.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.ellation.crunchyroll.presentation.search.result.summary.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.ellation.crunchyroll.presentation.search.result.summary.c cVar) {
        super(1);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        c.a aVar = com.ellation.crunchyroll.presentation.search.result.summary.c.u;
        this.h.di().n(com.amazon.aps.iva.e.w.B(panel2), panel2.getTitle());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
