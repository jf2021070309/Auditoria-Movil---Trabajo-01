package com.amazon.aps.iva.fo;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: WatchDataNotificationMonitor.kt */
/* loaded from: classes2.dex */
public final class j extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends WatchDataStatus>, q> {
    public final /* synthetic */ com.amazon.aps.iva.u70.j h;
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.u70.j jVar, h hVar) {
        super(1);
        this.h = jVar;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.ez.d<? extends WatchDataStatus> dVar) {
        WatchDataStatus a = dVar.a();
        if (a == WatchDataStatus.MERGE || a == WatchDataStatus.OVERWRITE) {
            this.h.showSnackbar(b.b);
            this.i.a.b(com.amazon.aps.iva.ls.a.HOME);
        }
        return q.a;
    }
}
