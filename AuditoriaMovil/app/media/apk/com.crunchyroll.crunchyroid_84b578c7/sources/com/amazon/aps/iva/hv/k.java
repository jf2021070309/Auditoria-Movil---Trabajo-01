package com.amazon.aps.iva.hv;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistSearchPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        j.q6(this.h).showLoadingOverlay();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
