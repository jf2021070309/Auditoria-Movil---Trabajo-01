package com.amazon.aps.iva.x30;

import com.amazon.aps.iva.s30.i;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultSummaryInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class m extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.s30.h> {
    public static final m b = new m();

    public m() {
        super(1, com.amazon.aps.iva.s30.i.class, "toTopSearchResultAdapterItem", "toTopSearchResultAdapterItem(Lcom/ellation/crunchyroll/model/Panel;)Lcom/ellation/crunchyroll/presentation/search/result/adapter/SearchResultAdapterItem;", 1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.s30.h invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "p0");
        int i = i.a.a[panel2.getResourceType().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                com.amazon.aps.iva.x50.t resourceType = panel2.getResourceType();
                throw new IllegalArgumentException("Top result of " + resourceType + " is not supported");
            }
            return new com.amazon.aps.iva.s30.l(panel2);
        }
        return new com.amazon.aps.iva.s30.m(panel2);
    }
}
