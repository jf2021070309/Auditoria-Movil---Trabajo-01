package com.amazon.aps.iva.ko;

import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: UserMigrationWelcomePresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<WatchDataStatus, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(WatchDataStatus watchDataStatus) {
        s view;
        view = this.h.getView();
        view.a();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
