package com.amazon.aps.iva.hv;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import com.ellation.crunchyroll.model.search.SearchResponse;
/* compiled from: CrunchylistSearchInteractor.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final EtpContentService b;

    public d(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    @Override // com.amazon.aps.iva.hv.c
    public final Object G(String str, int i, int i2, com.amazon.aps.iva.ob0.d<? super SearchResponse> dVar) {
        return this.b.search(str, i, i2, SearchItemsContainerType.SERIES.getKey(), dVar);
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }
}
