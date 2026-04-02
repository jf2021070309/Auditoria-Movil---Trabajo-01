package com.amazon.aps.iva.fo;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: WatchDataNotificationMonitor.kt */
/* loaded from: classes2.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends WatchDataStatus>, q> {
    public final /* synthetic */ com.amazon.aps.iva.u70.j h;
    public final /* synthetic */ h i;
    public final /* synthetic */ com.amazon.aps.iva.ls.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.u70.j jVar, h hVar, com.amazon.aps.iva.ls.a aVar) {
        super(1);
        this.h = jVar;
        this.i = hVar;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.ez.d<? extends WatchDataStatus> dVar) {
        this.h.showSnackbar(a.b);
        this.i.a.a(this.j);
        return q.a;
    }
}
