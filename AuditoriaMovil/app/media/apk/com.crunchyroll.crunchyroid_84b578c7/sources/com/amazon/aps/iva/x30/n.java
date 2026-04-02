package com.amazon.aps.iva.x30;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultSummaryInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class n extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.s30.h> {
    public static final n b = new n();

    public n() {
        super(1, com.amazon.aps.iva.s30.i.class, "toSearchResultAdapterItem", "toSearchResultAdapterItem(Lcom/ellation/crunchyroll/model/Panel;)Lcom/ellation/crunchyroll/presentation/search/result/adapter/SearchResultAdapterItem;", 1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.s30.h invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "p0");
        return com.amazon.aps.iva.s30.i.b(panel2);
    }
}
