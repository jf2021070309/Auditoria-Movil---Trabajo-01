package com.amazon.aps.iva.p40;

import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: SimilarShowsLayout.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, o> {
    public final /* synthetic */ com.amazon.aps.iva.i60.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.i60.b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final o invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        return new o(new c(etpContentService), this.h.getResources().getInteger(R.integer.empty_similar_cards_count));
    }
}
