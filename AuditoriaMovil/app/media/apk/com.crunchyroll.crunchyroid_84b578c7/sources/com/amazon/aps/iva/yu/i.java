package com.amazon.aps.iva.yu;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemRequest;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomLists;
/* compiled from: AddToCrunchylistInteractor.kt */
/* loaded from: classes2.dex */
public final class i implements h {
    public final EtpContentService b;

    public i(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.yu.h
    public final Object getCustomLists(com.amazon.aps.iva.ob0.d<? super CustomLists> dVar) {
        return this.b.getCustomLists(dVar);
    }

    @Override // com.amazon.aps.iva.yu.h
    public final Object k(String str, String str2, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object addItemToCustomList = this.b.addItemToCustomList(str, new CustomListItemRequest(str2), dVar);
        if (addItemToCustomList == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return addItemToCustomList;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
