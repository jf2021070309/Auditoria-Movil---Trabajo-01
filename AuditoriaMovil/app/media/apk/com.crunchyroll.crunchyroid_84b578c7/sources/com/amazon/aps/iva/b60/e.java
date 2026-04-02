package com.amazon.aps.iva.b60;

import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WatchlistCarouselPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e60.b, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ g h;
    public final /* synthetic */ List<s> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ArrayList arrayList) {
        super(1);
        this.h = gVar;
        this.i = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e60.b bVar) {
        com.amazon.aps.iva.e60.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "it");
        h view = this.h.getView();
        List<s> list = this.i;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (PaginationAdapterItem paginationAdapterItem : list) {
            if (paginationAdapterItem instanceof k) {
                k kVar = (k) paginationAdapterItem;
                paginationAdapterItem = k.a(kVar, bVar2.a(kVar));
            }
            arrayList.add(paginationAdapterItem);
        }
        view.setContent(arrayList);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
