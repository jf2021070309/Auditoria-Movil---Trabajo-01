package com.amazon.aps.iva.ko;

import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: UserMigrationWelcomePresenter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<WatchDataStatus, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(WatchDataStatus watchDataStatus) {
        s view;
        s view2;
        WatchDataStatus watchDataStatus2 = watchDataStatus;
        com.amazon.aps.iva.yb0.j.f(watchDataStatus2, "status");
        o oVar = this.h;
        view = oVar.getView();
        view.b();
        oVar.f.d(watchDataStatus2);
        view2 = oVar.getView();
        view2.closeScreen();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
